# Task 1.3

1. Create a file `form.html` in the `tasks/task1_3` directory of your
   repository, containing the basic structure of an HTML document. Give
   your document the title "Task 1.3".

2. Add a `form` element to the document, containing

   - Input fields that allow for input of the users's name & email
   - An input field that allows for input of the users's date of birth
   - A colour picker that supports selection of the users's favourite colour
   - A pair of radiobuttons that allow the user to identify themselves
     as a staff member or student
   - A submit button

   Use a `label` element to label each form field, and enclose the field
   and its label within a `p` element, so that form fields are stacked
   vertically when the document is displayed in a browser.

3. To make the form functional, set its `action` attribute to
   `https://httpbin.io/dump/request` and its `method` attribute to `POST`.

4. Test your form in a web browser. Try clicking the submit button. You
   should see an HTTP response containing the values entered into the form.
   You'll see that these have been encoded into a single string.
