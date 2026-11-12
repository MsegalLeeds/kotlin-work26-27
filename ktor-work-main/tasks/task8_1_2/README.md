# Task 8.1.2

This task uses a dice rolling application similar to that of Task 4.6.2. The
only real difference is that this application uses a DSL to generate HTML
responses, whereas Task 4.6.2 used Pebble templates.

1. Study the code of the application. Focus on the main things that are
   different from Task 4.6.2. These differences can be found in `Templates.kt`
   and `Routing.kt`. Compare the DSL code in these two files with the
   Pebble templates in your solution to Task 4.6.2.

2. Run the application with

       ./run

   (Adjust the command as necessary if running on Windows.)

3. Visit `http://0.0.0.0:8080` in your browser and explore the behaviour
   of the application. Use the browser's 'View Page Source' option to display
   the HTML that was received from the server. Compare this carefully with
   the DSL code in `Templates.kt` and `Routing.kt`.

   Shut down the server with `Ctrl+C` after you've done this.

4. Try making a change to the entire application by altering the
   `LayoutTemplate` class. For example, you could change the colour scheme by
   replacing `pico.min.jade.css` with `pico.red.min.css` in the `link` element.

   Rerun the server to verify that a single edit has changed both pages of
   the application.

5. Try making other changes, either to the home page or the roll results page.
   After making a change, attempt to rebuild the application, e.g., with

       ./kotlin build

   The build will fail if you've used the DSL in such a way that invalid
   HTML would be produced.

   (If you are using IntelliJ, it will highlight these build errors
   immediately, without you having to run an explicit command.)

6. When you've finished experimenting, shut down the server with `Ctrl+C`
   and then clean up with

       ./kotlin clean
