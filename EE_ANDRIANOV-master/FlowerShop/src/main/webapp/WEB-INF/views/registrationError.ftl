<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#import "parts/common.ftl" as c>
<@c.common "300">
    <h3> Add new user</h3>

<@sf.form action="/registration" method="post" modelAttribute = "user">
    <div class="form-group row">
        <label path="username"  class="col-sm-2 col-form-label">username</label>
        <div class="col-sm-6">
            <input type="text" name="username" class="form-control" placeholder="User name"/> This user exists
            <@sf.errors path="username"/>
        </div>
    </div>

    <div class="form-group row">
        <label path="password"  class="col-sm-2 col-form-label">password</label>
        <div class="col-sm-6">
            <input type="text" name="password" class="form-control" placeholder="Password"/>
            <@sf.errors path="password"/>
        </div>
    </div>

    <div class="form-group row">
        <label path="full_name"  class="col-sm-2 col-form-label">full_name</label>
        <div class="col-sm-6">
            <input type="text" name="full_name" class="form-control" placeholder="full_name"/>
            <@sf.errors path="full_name"/>
        </div>
    </div>

    <div class="form-group row">
        <label path="address"  class="col-sm-2 col-form-label">address</label>
        <div class="col-sm-6">
            <input type="text" name="address" class="form-control" placeholder="address"/>
            <@sf.errors path="address"/>
        </div>
    </div>

    <div class="form-group row">
        <label path="phone"  class="col-sm-2 col-form-label">phone</label>
        <div class="col-sm-6">
            <input type="text" name="phone" class="form-control" placeholder="phone"/>
            <@sf.errors path="phone"/>
        </div>
    </div>

    <button type="submit" class="btn btn-primary">Sign in</button>
</@sf.form>
</@c.common>
