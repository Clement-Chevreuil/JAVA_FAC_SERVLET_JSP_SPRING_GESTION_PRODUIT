<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Catalogue de produits</title>
</head>
<body>
<f:form modelAttribute="produit" method="post" action="saveProduit">
    <table>
        <tr>
            <td>R?f?rence:</td>
            <td><f:input path="reference"/></td>

        </tr>
        <tr>
            <td>D?signation:</td>
            <td><f:input path="designation"/></td>

        </tr>
        <tr>
            <td>Prix:</td>
            <td><f:input path="prix"/></td>

        </tr>
        <tr>
            <td>Quantit?:</td>
            <td><f:input path="quantite"/></td>

        </tr>
        <tr>

            <td><input type="submit" value="Save"/></td>

        </tr>
    </table>
</f:form>
<table>
    <tr>
        <th>Ref</th><th>Designation</th>
        <th>Prix</th><th>Quantite</th>
    </tr>
    <c:forEach items="${produits}" var="p">
        <tr>
            <td>${p.reference}</td>
            <td>${p.designation}</td>
            <td>${p.prix}</td>
            <td>${p.quantite}</td>
            <td><a href="deleteProduit?ref=${p.reference}">Delete</a></td>
            <td><a href="editProduit?ref=${p.reference}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>