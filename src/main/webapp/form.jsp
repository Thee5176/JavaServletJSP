<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>User Form</title>
    </head>
    <body>
        <form action="FormServlet" method="get">
            <fieldset>
                <legend>名前：</legend>
                <input type="text" name="name">
            </fieldset>
            <fieldset>
                <legend>性別：</legend>
                <input name="gender" type="radio" value="1">
                <label>男</label>
                <input name="gender" type="radio" value="2">
                <label>女</label>
            </fieldset>
            <fieldset>
                <legend>趣味：</legend>
                <input type="checkbox" name="hobby" value="登山">
                <label>登山</label>
                <input type="checkbox" name="hobby" value="釣り">
                <label>釣り</label>
                <input type="checkbox" name="hobby" value="ゲーム">
                <label>ゲーム</label>
                <input type="checkbox" name="hobby" value="読書">
                <label>読書</label>
            </fieldset>
            <input type="submit" value="送信">
        </form>
    </body>
</html>
