<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>UserRegistrationPage</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

 <script>
      function clearInputField() {
        document.getElementById("myInput").value = "";
      }

      function handleFormSubmit(event) {
        event.preventDefault(); // Prevent default form submission
        clearInputField(); // Clear the input field
        document.getElementById("myForm").submit(); // Submit the form programmatically
      }
    </script>
</head>
  <style>
    .login-container {
      width: 400px;
      padding: 20px;
      border-radius: 10px;
      background-color: #f8f9fa; /* Light background for form */
      box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1); /* Subtle shadow */
    }
  </style>
   <script type="text/javascript">
            function clearForm() {
                document.getElementById('myForm').reset();
            }
        </script>
  <body>
    <div class="container-fluid p-3 bg-primary text-white text-center">
      <h1>Register user</h1>
      
    </div>

    <div  id="myForm" class="d-flex justify-content-center align-items-center vh-100">
      <div class="login-container">
        <h2 class="text-center mb-4">Enter Your Details</h2>

        <form action="/admin/register" method="post" modelAttribute="reqRes"  >
          <div class="form-floating mb-3">
            <input
              type="text"
              class="form-control form-control-sm"
              id="name"
              placeholder="Enter Name"
              name="UserName"
              required
            />
            <label for="email">Name</label>
          </div>

          <div class="form-floating mb-3">
            <input
              type="email"
              class="form-control form-control-sm"
              id="email"
              placeholder="Enter email"
              name="email"
              required
            />
            <label for="email">Email</label>
          </div>
          <div class="form-floating mb-3">
            <select
              class="form-control form-control-sm"
              id="role"
              name="role"
              required
            >
              <option value="ADMIN">Admin</option>
              <option value="client">User</option>
            </select>
            <label for="role">User type</label>
          </div>

          <div class="form-floating mb-3">
            <input
              type="password"
              class="form-control form-control-sm"
              id="pwd"
              placeholder="Enter password"
              name="Password"
              required
            />
            <label for="Password">Password</label>
          </div>

          <button type="submit" class="btn btn-primary w-100">Login</button>
        </form>
      </div>
    </div>
    
    
 

  </body>
</html>



