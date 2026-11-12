# Task 3.2

In the directory `tasks/task3_2` of your repository, create a file named
`form.html`, containing the following HTML document:

```html
<!DOCTYPE html>
<html lang="en">
<head>
 <title>Form Demo</title>
</head>
<body>
 <h1>Form Demo</h1>
 <form method="GET" action="https://httpbin.io/dump/request">
   <label for="email_id">Enter your email:</label>
   <input id="email_id" type="email" name="email">
   <input type="submit" value="Subscribe!">
 </form>
</body>
</html>
```

Then experiment with making GET and POST requests from this form, following
the instructions given in the [Ktor Web Development Guide][task].


[task]: https://comp2850.github.io/ktor-guide/http/requests#task-3-2
