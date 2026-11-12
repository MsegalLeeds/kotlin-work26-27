# Task 6.6

This demonstrates how to query a database using the DAO API, from within
a Ktor application.

IMPORTANT: before you start, copy the file `music.mv.db` from your Task 6.5
solution into the `task6_6` directory!

Start by running the application with

    ./run

(or use the provided batch file on a Window system)

Visit `http://0.0.0.0:8080` in a browser to see the application home page.
This should show the numbers of artists and albums currently in the database.
(These details should match up with what you created in Task 6.5.)

The home page links to two pages that are supposed to display details of the
artists and the albums in the database, but these pages are currently blank.

Your task is to modify the application so that the required information is
displayed on those pages. See the comments in the code, and the instructions
in the Ktor Web Development Guide, for more details.
