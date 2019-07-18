<#import "parts/common.ftl" as c>
<@c.common "300">
<h1>Welcome Flower Shop</h1>
<form action="/login/process" method="post">
    <div class="form-group row">
        <label  class="col-sm-2 col-form-label">User Name :</label>
        <div class="col-sm-10">
        <input type="text" name="username" class="form-control" placeholder="User name"/>
        </div>
    </div>

        <div class="form-group row">
            <label  class="col-sm-2 col-form-label">Password :</label>
            <div class="col-sm-10">
                <input type="password" name="password" class="form-control" placeholder="Password"/>
            </div>
        </div>
            <button type="submit" class="btn btn-primary">Sign in</button>
</form>
<#if error??>
    <p>Bad credentials</p>
</#if>

<a href="/registration">Add new user</a>
</@c.common>