<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>

<!-- Listing property -->

<display:table pagesize="10" class="displaytag" name="books"
 requestURI="${requestURI}" id="row">
	
	<!-- Attributes -->

	<spring:message code="book.checkIn" var="ccheckIn" />
	<display:column property="checkIn" title="${ccheckIn}"/>

	<spring:message code="book.checkOut" var="ccheckOut" />
	<display:column property="checkOut" title="${ccheckOut}"/>

	<spring:message code="book.isSmoker" var="cisSmoker" />
	<display:column property="isSmoker" title="${cisSmoker}"/>
	
	<spring:message code="book.creditCard" var="ccreditCard" />
	<display:column property="creditCard" title="${ccreditCard}"/>
	
	<spring:message code="book.request" var="crequest" />
	<display:column property="request" title="${crequest}"/>
		
</display:table>