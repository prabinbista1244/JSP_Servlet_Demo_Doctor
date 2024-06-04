<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Details</title>
</head>
<body>
	<form action="DoctorServlet" method = "post"> 
		Name : <input type = "text" name = "name" ><br><br>
		Email : <input type = "email" name = "email" ><br><br>
		Specialization : <select name = "doctors" id = "doctors" >
		<option value = "Allergist/immunologist" >Allergist/immunologist</option>
		<option value = "Geneticist" >Geneticist</option>
		<option value = "Anesthesiologist" >Anesthesiologist</option>
		<option value = "Cardiologist" >Cardiologist</option>
		<option value = "Dermatologist" >Dermatologist</option>
		<option value = "Endocrinologist" >Endocrinologist</option>
		<option value = "Family physician" >Family physician</option>
		<option value = "Gastroenterologist" >Gastroenterologist</option>
		</select><br><br>
		Address : <input type = "text" name = "address"><br><br>
		Mobile : <input type = "number" name = "phone"><br><br>
		Gender : <input type = "radio" name = "gender">Male
				<input type = "radio" name = "gender">Female<br><br>
		Note :<input type = "title" name = "note" ><br><br>
		
			<input type = "submit" value = "create">	
	</form>
</body>
</html>