<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Art Details </h1>
<a href="/">Dashboard</a>
<h2>${art.title}</h2>
<h3>${art.description}</h3>
<img src="${art.url}" alt="">
<h3>Assigned Designers</h3>
<<c:forEach items="${art.designers}" var="designer">
    <p>
        Name: ${designer.name}
        Skill: ${designer.skill}
    </p>
</c:forEach>

<%--how can i get all the arts under this designer?--%>
<%--<h3>Arts Designed by ${designer.name} </h3>
<c:forEach items="${designer.arts}" var="art">
    <p>${art.name}</p>

</c:forEach>--%>

<form action="/assign/${art.id}" method="post">
    <select name="trainerId" id="trainerId">
        <c:forEach items="${allDesigners}" var="designer">
            <option value="${designer.id}">

                ${designer.name}
            </option>
        </c:forEach>

    </select>
    <button>Assign Trainer</button>
</form>

</body>
</html>