# Task 3.1

**Note: Python 3 must be available on the system you are using to carry
out this task.**

1. In the directory `tasks/task3_1` of your repository, create a file
   `test.html` containing the following HTML document:

   ```html
   <!DOCTYPE html>
   <html lang="en">
     <head>
       <title>Test Document</title>
     </head>
     <body>
       <h1>Test Document</h1>
       <p>Hello World!</p>
     </body>
   </html>
   ```

2. Open a terminal, move to the directory containing `test.html`, and run
   the web server provided in the Python standard library, like this:

       python -m http.server

   (Depending on how Python has been installed, you might need to use the
   command `python3` instead of `python` here.)

3. In a browser, try visiting this URL:

       http://0.0.0.0:8000/test.html

   You should see the test document rendered in the browser window.

4. Look at the message log displayed in the terminal window. You should see
   a GET request logged for `test.html`.

5. Terminate the server using `Ctrl+C`.
