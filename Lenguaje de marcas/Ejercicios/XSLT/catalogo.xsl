<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html>
    <head>
     <style>
     td{
     width=50px;
     height =20px;
     }
     table{
     border-collapse: collapse;
     }
     </style>
    </head>
      <body>
        <h1>Lista de libros</h1>
        <table border="1"/>
        <tr bgcolor="gray">
          <th>Título</th>
          <th>Autor</th>
          <th>Precio(€)</th>
          <tr>
            <xsl:for-each select="catalogo/libro">
              <tr>
                <td>
                  <xsl:value-of select="titulo"/>
                </td>
                <td>
                  <xsl:value-of select="autor"/>
                </td>
                <td>
                  <xsl:value-of select="precio"/>
                </td>
              </tr>
            </xsl:for-each>
          </tr>
        </tr>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
