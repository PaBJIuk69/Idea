<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>
<#import "parts/common.ftl" as c>
<@c.common "300">
<fieldset>
    <legend> Customer Information</legend>
</fieldset>
<@sf.form action="/saveOrder" method="post" modelAttribute = "order">

<div class="form-group row">
    <label path="customerName"  class="col-sm-2 col-form-label">customerName</label>
    <div class="col-sm-6">
        <input type="text" name="customerName" class="form-control" placeholder="customerName"/>
        <@sf.errors path="customerName"/>
    </div>
</div>

<div class="form-group row">
    <label path="customerAddress"  class="col-sm-2 col-form-label">customerAddress</label>
    <div class="col-sm-6">
        <input type="text" name="customerAddress" class="form-control" placeholder="customerAddress"/>
        <@sf.errors path="customerAddress"/>
    </div>
</div>

<div class="form-group row">
    <label path="phone"  class="col-sm-2 col-form-label">phone</label>
    <div class="col-sm-6">
        <input type="text" name="phone" class="form-control" placeholder="phone"/>
        <@sf.errors path="phone"/>
    </div>
</div>

<button type="submit" class="btn btn-primary">Submit</button>
</@sf.form>
</@c.common>

