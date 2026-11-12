# Task 4.8

This application should be familiar to you from earlier tasks, but if you
need a reminder of what it does, start by running it with

    ./run

(Adjust this command as necessary if you are using Windows.)

Visit `http://localhost:8080` in a browser and experiment with the application.
Stop the server with `Ctrl+C` when you are done.

Refactor the application so that it defines request handling code in
separate extension functions, as discussed in the Ktor Web Development Guide.
If you wish, move these functions into separate files.

After refactoring, check that the application still builds, with

    ./kotlin build

If all is well, rerun the server and check that its behaviour is unchanged.

When you've finished, stop the server with `Ctrl+C`, then clean up with

    ./kotlin clean
