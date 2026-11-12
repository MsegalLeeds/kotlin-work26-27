# Task 4.9

## Default Error Responses

Run the application with

    ./run

(Adjust this command as necessary if you are using Windows.)

Visit `http://localhost:8080` and verify that the application behaves in the
manner you've seen before.

Trigger a 404 Not Found error by entering the following URL in the browser
address bar:

    http://localhost:8080/bad

You should see your browser's default response to this error.

Next, try to crash the request handling code. Use the application to display
a valid dice roll result, then edit the URL in the browser address bar,
changing the value of `die_sides` to an unsupported value (e.g., 7).

If you press Enter, you should see exception details in the server log,
plus the exception's error message as a plain text response in the browser
window.

## Custom Error Responses

Edit `Application.kt` and uncomment the line that configures error handling.
Then rerun the server.

Repeat your earlier efforts to trigger errors. This time, you should see a
custom error page displayed in each case.

Experiment with the error handling a bit more - e.g., try changing templates
`not-found.peb` or `error.peb` to report on the errors in a different way.

When you've finished, stop the server and clean up with

    ./kotlin clean
