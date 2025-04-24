<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
  <html>
  <head>
  <style>
    th{
    background-color:blue;
    }
     td,th{
     padding:12px;
     }
     table{
     width:80%;
     border-collapse: collapse;
     text-align:center;
     margin-left:10%;
     margin-right:10%;
     }
     #gola{
     display:flex;
     justify-content:center;
     }
     
     </style>  
  </head>
      <body>
        <h1 id="gola">Participantes en el concurso</h1>
        <table border="1">
          <tr>
            <th>Nombre</th>
            <th>Deuda</th>
            <th>Número de clases Clases</th>
          </tr>
          <xsl:for-each select="academia/alumnos/alumno">
            <tr>
              <td>
                <xsl:value-of select="nombre"/>
              </td>
              <td>
                <xsl:value-of select="deuda"/>
              </td>
              <td>
                <xsl:value-of select="count(clase)"/>
              </td>
            </tr>
          </xsl:for-each>
        </table>
        <h1>Alumnos con deuda</h1>
        <ul>
            <xsl:for-each select="academia/alumnos/alumno[deuda != 0]">
              <li><xsl:value-of select="nombre[../deuda != 0]"/></li>
            </xsl:for-each>
        </ul>
        <h1 id="gola">Participantes en el concurso</h1>
        <table border="1">
          <tr>
            <th>Nombre</th>
            <th>Clases</th>
          </tr>
          <xsl:for-each select="//alumno]">
            <xsl:for-each select="clase]">
            <tr>
             <td>
              <xsl:value-of select="../nombre"/>
             </td>
             <td>
              <xsl:value-of select="//clase[@codigo = current()]/nombre"/>
             </td>
            </tr>
            </xsl:for-each>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
