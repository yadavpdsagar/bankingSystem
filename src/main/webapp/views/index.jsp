<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>this is index</title>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"> 

</head>
 <style>
      .login-container {
        width: 400px;
        padding: 20px;
        border-radius: 10px;
        background-color: #f8f9fa;
        box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
      }
      .navbar-custom {
        background-color: #007bff; /* Primary blue color */
      }

      .navbar-nav .nav-link {
        color: #fff !important; /* Ensure links are white */
        padding: 10px 15px; /* Add padding for better spacing */
        font-weight: 500; /* Slightly bolder text */
      }

      .navbar-nav .nav-link:hover {
        background-color: #0056b3; /* Darken on hover */
        border-radius: 5px; /* Rounded corners on hover */
      }
    </style>
 <body>
    <nav class="navbar navbar-expand-sm navbar-custom">
      <div class="container-fluid">
        <h1>Account Detials</h1>
        <button
          class="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto">
            <li class="nav-item">
              <a class="nav-link" href="/accountRegistration.html"
                >craete new account</a>

      
            </li>
          
          </ul>
        </div>
      </div>
    </nav>

    <div class="container mt-3">
      <h2 class="text-center">Account List</h2>

      <table class="table table-bordered">
        <thead class="table-primary">
          <tr>
            <th>Account Number</th>
            <th>Name</th>
            <th>Address</th>
            <th>created date</th>
            <th>account type</th>
            <th>Balance</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>July</td>
            <td>Dooley</td>
            <td>july@example.com</td>
            <td>july@example.com</td>
            <td>july@example.com</td>
            <td>july@example.com</td>
          </tr>
         
        </tbody>
      </table>
    </div>
  </body>
</html>