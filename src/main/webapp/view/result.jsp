<%@ page import="curency.converter.Converter" %>


<form action="/converter" method="post">
    <fieldset>
        <legend>Result</legend>
        <input type="hidden" name="id" value="">
        <table>
            <tr>
                <td>result</td>
                <td>
                    ${converter.getResult()} VND
                </td>
        </table>
    </fieldset>
</form>
<a href="/converter">Back to converter</a>.