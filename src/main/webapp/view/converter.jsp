<%@ page import="curency.converter.Converter" %>

<%
    Converter converter = new Converter();
%>
<form action="/result" method="get" >
    <fieldset>
        <legend>Curency converter</legend>
        <table>
            <tr>
                <td>usd</td>
                <td>
                    <input type="text" name="usd" value="">
                </td>
            </tr>
            <tr>
                <td>rate</td>
                <td>
                    <input type="text" name="rate" value="">
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="convert">
                </td>
            </tr>
        </table>
    </fieldset>
</form>
