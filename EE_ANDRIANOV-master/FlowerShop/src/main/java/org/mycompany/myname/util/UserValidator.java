package org.mycompany.myname.util;

import org.mycompany.myname.entity.User;
import org.mycompany.myname.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        if (userService.getUsername(user.getUsername()) !=null){
            errors.rejectValue("user", "This name is already is use ");

        }

    }
}
