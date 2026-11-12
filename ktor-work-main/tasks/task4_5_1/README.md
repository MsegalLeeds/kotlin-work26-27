# Task 4.5.1

This directory is a Kotlin Toolchain project containing a variant on the
simple 'Hello World' application.

Only one of its two routes is currently tested. Your task here is to
add tests suitable for verifying that the other route functions correctly.

Think carefully about exactly what is needed here. For example, to verify
that a URL of `/hello/` followed by a name returns a greeting for the named
person, you will need to test with more than one name.

Another issue is what happens when no name is provided. You should test
that a 404 Not Found response is produced in this case.

(You can use the constant `HttpStatusCode.NotFound` to help with this.)
