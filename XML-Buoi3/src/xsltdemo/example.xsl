<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html>
<head>
	<title>Trang Web Thu Vien</title>
</head>
<body>
	<h1>List Book</h1>
	<xsl:apply-templates select="library/book"/>
</body>
</html>
</xsl:template>
<xsl:template match="book">
<h2>Title: <xsl:value-of select="title"/></h2>
<h3>Author: <xsl:value-of select="author"/></h3>
<h4>Year: <xsl:value-of select="year"/></h4>
</xsl:template>
</xsl:stylesheet>