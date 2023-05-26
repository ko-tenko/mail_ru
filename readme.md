- Tools: Java, Selenium, TestNG, Maven.
- Pattern: Page Object Model.
- Run: add full username (ex.: ivan.petrov@mail.ru) and password to credentials.json

Test case:

|     | Step                           | Check                    |
|-----|--------------------------------|--------------------------|
| 1   | Open mail.ru page              | mail.ru page is opened   |
| 2   | Open user login form and login | User logged in           |
| 3   | Open the email composing form  | The form is opened       |
| 4   | Write an email and send it     | Email successfully sent  |
