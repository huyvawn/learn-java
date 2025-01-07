<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html"/>
<xsl:template match="statedata">
<h1>State</h1>
<table border="1">
<tr>
<th>Name</th>
<th>Population</th>
<th>Capital</th>
<th>Bird</th>
<th>Flower</th>
</tr>
<xsl:for-each select="state">
<tr>
<td>
<xsl:value-of select="name"/>
</td>
<td>
<xsl:value-of select="population"/>
</td>
<td>
<xsl:value-of select="capital"/>
</td>
<td>
<xsl:value-of select="bird"/>
</td>
<td>
<xsl:value-of select="flower"/>
</td>
</tr>
</xsl:for-each>
</table>
</xsl:template>
</xsl:stylesheet>