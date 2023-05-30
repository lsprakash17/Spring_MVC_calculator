<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
 <style type="text/css">
 .container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
}

input[type="text"] {
  margin-bottom: 10px;
  padding: 5px;
}

button {
  margin-bottom: 5px;
  padding: 10px 20px;
}
 </style>
</head>
<body>
<form>
  <div class="container">
    <input type="text" id="textbox1" placeholder="First Number" name="num1">
    <input type="text" id="textbox2" placeholder="Second Number" name="num2">
    <button id="button1" formaction="add">Add</button>
    <button id="button2" formaction="sub">Sub</button>
    <button id="button3" formaction="mul">Mul</button>
    <button id="button4" formaction="div">Div</button>
  </div>
</form>
</body>
</html>