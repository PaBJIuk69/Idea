package org.mycompany.myname.config;

import org.mycompany.myname.dao.*;
import org.mycompany.myname.service.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration

public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl(getJdbcTemplate());
    }

    @Bean
    public FlowerDao getFlowerDao(){
        return new FlowerDaoImpl(getJdbcTemplate());
    }

    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }

    @Bean

    public FlowerService getFlowerService(){
        return new FlowerServiceImpl();
    }


    @Bean
    public OrderService getOrderService(){
        return new OrderServiceImpl();
    }

    @Bean
    public OrderDao getOrderDao(){
        return new OrderDaoImpl(getJdbcTemplate());
    }

    @Bean
    public OrderDetailService getOrderDetailService(){return new OrderDetailServiceImpl();}

    @Bean
    public OrderDetailDao getOrderDetailDao(){return  new OrderDetailDaoImpl(getJdbcTemplate());}



}
