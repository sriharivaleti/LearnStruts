
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html>
    <head>
       <title><tiles:getAsString name="title" ignore="true" /></title>
    </head>
    <body>
        <table border="1" cellpadding="2" cellspacing="2" align="center">
            <tr>
                <td height="20%" colspan="2">
                    <tiles:insert attribute="header" ignore="true" />
                </td>
            </tr>
            <tr>
                <td width="20%" height="250">
                    <tiles:insert attribute="menu" />
                </td>
                <td>
                    <tiles:insert attribute="body" />
                </td>
            </tr>
            <tr>
                <td height="20%" colspan="2">
                    <tiles:insert attribute="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>
