# Lab_10
Singleton &amp; Adapter

Check the information about Singleton on Refactoring Guru and Wikipedia.

Install SQLite CLI via the package manager or from official website.

Use CLI, Intellij IDEA professional, DBViewer, or SQLite Browser to connect to DB and create a simple table.

Install lib sqlite-jdbc.

Check sqlite tutorial.

Complete Task 1.

Check the information about Adapters on Refactoring Guru and Wikipedia.

What is the difference between Object Adapter and Class Adapter?

Complete Task 2 using Adapter pattern

Complete Task 3 using Adapter pattern

Check the information about Adapters on Refactoring Guru and Wikipedia.

Submit a link to GitHub with tests and a GitHub Action file.

-------------------------------------------------------------------------------------------------------

Task 1

Implement User and Database classes. User should have Database attribute that would be Singleton that represents the Database connection and would be called on save method.

--------------------------------------------------------------------------------------------------------

Task 2

You have TwitterUser (getUserMail, getCountry, getLastActiveTime); FacebookUser (getEmail, getUserCountry, getUserActiveTime) from Twitter and Meta libs, respectively. Depending on the authentication method, an object of the corresponding class will be created. Fix login method in Login class. Propose the solution for the MessageSender class and the send(text, user, country) method, which will allow, regardless of the authentication method, to send text messages to users from Ukraine, who were active during the last hour.

---------------------------------------------------------------------------------------------------------

Task 3

Resolve an issue with Ukrainian legacy code. You can change Main and ReportBuilder. Get rid of the Ukrainian methods.
