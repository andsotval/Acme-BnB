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

<display:table pagesize="10" class="displaytag" name="lessors"
 requestURI="${requestURI}" id="row">
	
	<!-- Attributes -->

	<spring:message code="lessor.name" var="cname" />
	<display:column property="name" title="${cname}"/>

	<spring:message code="lessor.surname" var="csurname" />
	<display:column property="surname" title="${csurname}"/>

	<spring:message code="lessor.email" var="cemail" />
	<display:column property="email" title="${cemail}"/>
	
	<spring:message code="lessor.phone" var="cphone" />
	<display:column property="phone" title="${cphone}"/>
	
	<spring:message code="lessor.picture" var="cpicture" />
	<display:column property="picture" title="${cpicture}"/>
		
</display:table>