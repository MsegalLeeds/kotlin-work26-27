# Task 6.4

This demonstrates how database tables can be represented and created using
Exposed. See the Ktor Web Development Guide for further details.

Run the application with

    ./kotlin run

(Adjust this command as necessary if using a Windows system.)

You should see messages logged to the terminal showing the SQL statements
that are executed to create the database tables.

You should also see a database file named `music.mv.db` appearing in this
directory.

The contents of this database file can be probed using any database client
that supports H2:

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
