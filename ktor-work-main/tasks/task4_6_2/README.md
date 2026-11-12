# Task 4.6.2

This task is based on a more sophisticated version of the earlier die rolling
application, with a dice selection form and a separate results page.

1. Study the code of the application, and the Pebble templates in
   `resources/templates`. These currently don't make use of template
   inheritance.

2. Run the application with

       ./run

   (Adjust the command as necessary if running on Windows.)

3. Visit `http://localhost:8080` in your browser and explore the behaviour
   of the application, then shut down the server with `Ctrl+C`.

4. Refactor the templates so that they use inheritance to remove unnecessary
   duplication of HTML.

5. Rerun the application and check that behaviour is unchanged.

6. Shut down the server, then try making a change to the entire application
   by editing the base template. For example, you could change the colour
   scheme by replacing `pico.min.css` with `pico.pumpkin.min.css` in the
   `link` element.

   Rerun the server to verify that a single edit has changed both pages of
   the application.

7. Shut down the server and clean up with

       ./kotlin clean
