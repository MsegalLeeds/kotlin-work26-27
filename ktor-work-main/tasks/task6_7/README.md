# Task 6.7

This demonstrates how to test a database-driven Ktor application.

The code is equivalent to that provided for Task 6.6, but with a test database
and some tests added. 

Run the tests with

    ./kotlin test

You should find that 2 tests pass and 1 fails.

To make the failed test pass, you will need to update the application so that
the artists page behaves like your solution to Task 6.6 does. You can copy
code from `ArtistsPage.kt` and `artists.peb` in your Task 6.6 solution to help
you achieve this.

Once you have that test passing, try writing a fourth test in
`ApplicationTest.kt`. This should test that the albums page has the expected
format and content. If you rerun the tests, this new test should fail.

The final step is to copy the code from `AlbumsPage.kt` and `albums.peb` in
your Task 6.6 solution into this application, adjusting it as necessary so
that all four tests now pass.
