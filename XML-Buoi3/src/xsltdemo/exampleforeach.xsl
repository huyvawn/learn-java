<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>
<xsl:template match="library">
<h1>List Book</h1>
<table border="1">
<tr>
<th>title</th>
<th>author</th>
<th>year</th>
</tr>
<xsl:for-each select="book">
<tr>
<td>
<xsl:value-of select="title"/>
</td>
<td>
<xsl:value-of select="author"/>
</td>
<td>
<xsl:value-of select="year"/>
</td>
</tr>
</xsl:for-each>
</table>
</xsl:template>
</xsl:stylesheet>
