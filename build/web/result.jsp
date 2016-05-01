<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>

<body>
<h1>Struts 2 &lt;s:file&gt; file upload example</h1>

<h4>
   File Name : <s:property value="imageUploadFileName"/> 
</h4> 

<h4>
   Content Type : <s:property value="imageUploadContentType"/> 
</h4> 

<h4>
   File : <s:property value="imageUpload"/> 
</h4>
   <img src="userimages/<s:property value="imageUploadFileName"/>"/>



</body>
</html>