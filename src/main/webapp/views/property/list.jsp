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

<display:table pagesize="10" class="displaytag" name="properties"
 requestURI="${requestURI}" id="row">
	
	<!-- Attributes -->

	<spring:message code="property.name" var="cname" />
	<display:column property="name" title="${cname}"/>

	<spring:message code="property.rate" var="crate" />
	<display:column property="rate" title="${crate}"/>

	<spring:message code="property.description" var="cdescription" />
	<display:column property="description" title="${cdescription}"/>
	
	<spring:message code="property.address" var="caddress" />
	<display:column property="address" title="${caddress}"/>
		
</display:table>