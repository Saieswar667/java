<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CoustmerLogin Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: black;
           
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
        }
        .input-field {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        .login-btn {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .login-btn:hover {
            background-color: #45a049;
        }
        .form-footer {
            text-align: center;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<%@include file="home.jsp" %>
<div class="login-container">
    <h2>CoustmerLogin</h2>
    <form action="checklogin1" method="POST">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" class="input-field" required>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" class="input-field" required>
        
        <button type="submit" class="login-btn">Login</button>
    </form>
    <div class="form-footer">
        <a href="#">Forgot Password?</a>
    </div>
</div>

</body>
</html>
    