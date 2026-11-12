# Task 6.5

This demonstrates how database tables can be populated and queried using
Exposed's SQL DSL. See the Ktor Web Development Guide for further details.

Create and populate the database with

    ./kotlin run -m create

Run some queries with

    ./kotlin run -m query

(Adjust these commands as necessary if using a Windows system.)

Remember that you can independently probe the database using any database
client that supports H2:

- [H2 client][h2]
- [DBeaver][dbv]
- [SQuirreL][sqr]
- [Intellij's Database tool][ijdb]
- [DBCode extension][dbc] for VS Code


[h2]: https://h2database.com
[dbv]: https://github.com/dbeaver/dbeaver
[sqr]: https://squirrel-sql.sourceforge.io/
[ijdb]: https://www.jetbrains.com/help/idea/quick-start-with-database-functionality.html
[dbc]: https://dbcode.io
