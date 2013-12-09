<?xml version="1.0" encoding="UTF-8"?><%@page import="java.text.SimpleDateFormat"%><%@page contentType="text/xml; charset=UTF-8"%><%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<feed xmlns="http://www.w3.org/2005/Atom" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xml:base="${atomFeedMetadata['xml.base']}" xml:lang="en" xsi:schemaLocation="KnowledgeResponse.xsd">
	<title type="text">${atomFeedMetadata['title']}</title><c:if test="${not empty atomFeedMetadata['author.name'] or not empty atomFeedMetadata['author.uri']}">
	<author>
		<c:if test="${not empty atomFeedMetadata['author.name']}">
			<name>${atomFeedMetadata['author.name']}</name></c:if><c:if test="${not empty atomFeedMetadata['author.uri']}">
			<uri>${atomFeedMetadata['author.uri']}</uri></c:if>
		</author>
	</c:if>
	<% SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"); String updateString = sdf.format(new java.util.Date()); %>
	<updated><%=updateString %></updated>
	<c:forEach items="${requestParameters}" var="parameter">
		<category scheme="${parameter.key}" term="${parameter.value}"/>
	</c:forEach>
	<id>${atomFeedMetadata['id.urn']}</id>
	<c:forEach items="${assets}" var="asset">
		<entry xml:lang="en">
			<title type="text">${asset.displayName}</title>
			<link href="${asset.assetUrl}" hreflang="en" rel="via" type="${asset.assetMimeType}" title="${asset.displayName}"/>
			<id>${atomFeedMetadata['entry.id.urnPrefix']}${asset.assetId}</id>
			<updated><fmt:formatDate value="${asset.lastUpdateDate}" pattern="yyyy-MM-dd'T'HH:mm:ss"/></updated><c:forEach items="${asset.assetProperties}" var="indexProperty"><c:set var="typeMap" value="${requestParameterTypeMap[indexProperty.propertyName]}"/><c:if test="${not empty typeMap['CODE'] and not empty indexProperty.code}">
			<category scheme="${typeMap['CODE']}" term="${indexProperty.code}"/></c:if><c:if test="${not empty typeMap['CODE_SYSTEM'] and not empty indexProperty.codeSystem}">
			<category scheme="${typeMap['CODE_SYSTEM']}" term="${indexProperty.codeSystem}"/></c:if><c:if test="${not empty typeMap['DISPLAY_NAME'] and not empty indexProperty.displayName}">
			<category scheme="${typeMap['DISPLAY_NAME']}" term="${indexProperty.displayName}"/></c:if></c:forEach>
		</entry>
	</c:forEach>
</feed>