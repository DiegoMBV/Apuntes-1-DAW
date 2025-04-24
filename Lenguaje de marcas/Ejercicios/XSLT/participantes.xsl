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
          </tr>
          <xsl:for-each select="participante">
            <tr>
              <td>
                <xsl:value-of select="nombre"/>
              </td>
              <td>
                <xsl:value-of select="puntos"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
