<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>New Art</h1>

<%--@elvariable id="newArt" type="java"--%>
<form:form action="/create" method="post" modelAttribute="newArt">
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors class="text-danger" path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="url">Url</form:label>
        <form:errors class="text-danger" path="url"/>
        <form:input path="url"/>
    </p>
    <p>
        <form:select path="owner">
            <c:forEach var="owner" items="${allOwners}">
                <option value="${owner.id}">${owner.firstName}</option>

            </c:forEach>
        </form:select>
    </p>
    <button>Create Art</button>
</form:form>
</body>
</html>