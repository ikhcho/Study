<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mine Sweeper</title>
<script type="text/javascript" src="MineMap.js"></script>
<script type="text/javascript" src="Event.js"></script>
<script type="text/javascript" src="DefaultFieldShape.js"></script>

<style>
button {
	background: #ffffff;
    border: none;
    color: black;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 20px;
    width: 50px;
	height: 50px;
}

button:disabled {
	background: rgb(225, 225, 225);
    color: black;
	border: none;
	width: 50px;
	height: 50px;
}

table, tr, td {
    border: 2px solid gray;
    border-collapse: collapse;
}

select{
	width: 100px;
	height: 50px;
	font-size: 20px;
	text-align: center;
}
</style>


</head>

<body oncontextmenu='return false'>
<br/>
<div align="center">
	<table>
		<tr>
			
			<td>
				<select id="shape">
				    <option selected value="rect">사각형</option>
				    <option value="star">별</option>
				    <option value="pyramid">피라미드</option>
				    <option value="bomb">폭탄</option>
				</select>
				
			</td>
			<td>
				<select id="level">
				    <option selected value="beginner">초급</option>
				    <option value="intermediate">중급</option>
				    <option value="advanced">고급</option>
				</select>
				<button onclick="playGame()">OK</button>
			</td>
			<tr>
			<td>
				남은 빈칸
			</td>
			<td>
				<div id="leftSweeper" style="text-align:center"></div>
			</td>
		</tr>
		<tr>
			<td>
				남은 폭탄
			</td>
			<td>
			<div id="leftMine" style="text-align:center"></div>
			</td>
		</tr>
		</tr>
		
	</div>
	</table>

</div>

<br/>
<div align="center" id="field"></div>
	




</body>
</html>