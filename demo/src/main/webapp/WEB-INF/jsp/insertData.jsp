<!--회원가입 페이지-->
<!--signup.html-->
<!DOCTYPE html>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<html xmlns:th="http://www.thymeleaf.org" lang="en">
<head>
	<title>test</title>
    <meta charset="UTF-8">
</head>
<body>
<form method="post" action="/">
    <div class="container">
        <h1>주소록</h1>
        <div class="form-group">
            <label for="inputEmail4">이름</label>
            <input type="text" class="form-control" id="inputEmail4" name="name" placeholder="이름">
        </div>
        <div class="form-group">
            <label for="inputAddress">주소</label>
            <input type="text" class="form-control" id="inputAddress" name="address" placeholder="주소">
        </div>
        <div class="form-group">
            <label for="inputPassword4">휴대폰 번호 </label>
            <input type="text" class="form-control" id="inputPassword4" name="hpno" placeholder="휴대폰 번호 ">
        </div>
        
        <div class="form-group">
            <label for="inputPassword4">이메일 </label>
            <input type="text" class="form-control" id="inputPassword4" name="email" placeholder="이메일 ">
        </div>
        
        <button type="submit" class="btn btn-primary">저장</button>
    </div>
</form>
</body>
</html>