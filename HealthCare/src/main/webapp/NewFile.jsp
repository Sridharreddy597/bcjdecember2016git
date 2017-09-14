<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="allocateCmd" action="allocate.htm" method="post">
    <form:errors path="*">
        <div class="msg error">
        <h4>ATTENTION!</h4>
        <p>Please make the following correction(s) before proceeding.</p>
        </div>
    </form:errors>

    <fieldset><legend>Allocate Information</legend>

    <div class="help icon astrisk">required</div>

    <div id="dl_list_0">
    <c:forEach varStatus="vs" items="${allocateCmd.allocateList}">
        <div class="dl_item_<c:out value='${vs.index}' />">
        <div class="field">
        <div class="label required"><form:label
            path="allocateList[${vs.index}].name" cssErrorClass="invalid">Name</form:label></div>

        <div class="input"><form:input
            path="allocateList[${vs.index}].name" cssErrorClass="invalid " /><form:label
            path="allocateList[${vs.index}].name" cssErrorClass="icon invalid" /><form:errors
            path="allocateList[${vs.index}].name" cssClass="inline_invalid" /></div>
        </div>

        <div class="field">
        <div class="label required"><form:label
            path="allocateList[${vs.index}].gender" cssErrorClass="invalid">Gender</form:label></div>
        <div class="input"><form:radiobuttons items="${genderList}"
            path="allocateList[${vs.index}].gender" cssErrorClass="invalid"
            itemLabel="name" itemValue="id" /><form:label
            path="allocateList[${vs.index}].gender" cssErrorClass="icon invalid" /><form:errors
            path="allocateList[${vs.index}].gender" cssClass="inline_invalid" /></div>
        </div>

        <div class="field">
        <div class="label required"><form:label
            path="allocateList[${vs.index}].college" cssErrorClass="invalid">College</form:label></div>
        <div class="input"><form:select
            path="allocateList[${vs.index}].college" cssErrorClass="invalid ">
            <form:options items="${collegeList}" itemLabel="name" itemValue="id" />
        </form:select><form:label path="allocateList[${vs.index}].college"
            cssErrorClass="icon invalid" /><form:errors
            path="allocateList[${vs.index}].college" cssClass="inline_invalid" /></div>
        </div>

        <div class="field">
        <div class="label required"><form:label
            path="allocateList[${vs.index}].comment" cssErrorClass="invalid">Comment</form:label></div>
        <div class="input"><form:textarea
            path="allocateList[${vs.index}].comment" cssErrorClass="invalid " /><form:label
            path="allocateList[${vs.index}].comment" cssErrorClass="icon invalid" />
        <a href="#" class="remove_item icon minus">remove</a> <form:errors
            path="allocateList[${vs.index}].comment" cssClass="invalid" /></div>
        </div>

        <hr />

        </div>
    </c:forEach>

    <div class="field">
    <div class="label"><li><a href="" class="icon_plus">add</a></li></div>
    </div>
    </div>

    <div class="field">
    <div class="input"><input type="submit" class="button primary"
        value="Save" /></div>
    </div>

    </fieldset>

</form:form>
</body>
</html>