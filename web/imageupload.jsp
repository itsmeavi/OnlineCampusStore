<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
<h1>Struts 2 &lt;s:file&gt; file upload example</h1>

<form action="resultAction" namespace="/" method="POST" enctype="multipart/form-data">

<s:file name="imageUpload" label="Select a image to upload" size="40" />

<s:submit value="submit" name="submit" />
	
</form>

</body>
</html>