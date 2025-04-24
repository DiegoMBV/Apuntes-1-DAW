<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/concurso">
    <html>
      <body>
        <h1>Participantes en el concurso</h1>
        <table border="1">
          <tr>
            <th>Nombre</th>
            <th>Puntos</th>
            <th>Código</th>
          </tr>
          <xsl:for-each select="participante[puntos > 20]">
            <tr>
              <td>
                <xsl:value-of select="nombre"/>
              </td>
              <td>
                <xsl:value-of select="puntos"/>
              </td>
              <td>
                <xsl:value-of select="@codigo"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
        <h2>Número de participantes</h2>
        <xsl:value-of select="count(participante)"/>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
