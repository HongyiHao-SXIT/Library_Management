# README for Spring Boot Library Management System

## I. Project Overview
This library management system is developed based on the Spring Boot framework, aiming to provide an efficient and convenient solution for the daily management of libraries. The system covers core functions such as book management, user management, and borrowing management, helping library staff manage library resources more effectively and improve service quality. At the same time, it provides readers with convenient borrowing and query services.

## II. Functional Features
1. **Book Management**: Supports operations such as adding, editing, deleting, and querying books. Administrators can enter detailed information of new books, including the title, author, publisher, ISBN, publication date, etc. They can also modify or delete existing book information. The system also provides flexible query functions, allowing readers and administrators to search for books based on conditions such as book title, author, and keywords.
2. **User Management**: Implements information management for readers and administrators, including user registration, login, information modification, and permission control. Administrators have the highest permissions and can manage all book and user information, while ordinary readers can only perform operations such as borrowing, returning, and querying their own borrowing records.
3. **Borrowing Management**: Handles the borrowing and returning processes of books. Readers can query available books in the system and perform borrowing operations. The system will record the borrowing time, expected return time, etc. When returning a book, the system will check whether it is overdue and calculate the overdue fine (if any). At the same time, the system will automatically update the inventory status of the book.
4. **Overdue Management**: Automatically tracks the return time of borrowed books. For books that are not returned on time, the system will send reminder messages to readers and calculate overdue fines. Administrators can view the list of overdue books and handle overdue situations.

## III. Technology Stack
1. **Backend**: Spring Boot, Spring MVC, Spring Data JPA, MySQL
    - Spring Boot: Provides a rapid development framework, simplifies project configuration, and improves development efficiency.
    - Spring MVC: Responsible for handling Web requests, implementing the MVC architectural pattern, and separating business logic, data presentation, and user interaction.
    - Spring Data JPA: Used for database access. Through simple interface definitions and annotations, it realizes CRUD operations on the database, reducing a large amount of repetitive code.
    - MySQL: As a relational database, it stores various data in the system, including book information, user information, borrowing records, etc.
2. **Frontend**: HTML, CSS, JavaScript, Thymeleaf
    - HTML, CSS, JavaScript: Build the user interface and implement page layout, styling, and interactive functions.
    - Thymeleaf: As a template engine, it integrates backend data with frontend pages to generate dynamic pages.

## IV. Installation and Deployment
1. **Environment Requirements**
    - JDK 1.8 or higher
    - MySQL 5.7 or higher
    - Maven 3.3 or higher
2. **Download the Project**: Download the project source code from the GitHub repository or other code hosting platforms.
3. **Configure the Database**: In the `src/main/resources/application.properties` file, configure the connection information of the MySQL database, including the database address, port, username, and password.
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/library_management?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.database-platform=org.hibernate.dialect.MySQL57Dialect
```
4. **Initialize the Database**: Run the SQL script of the project to create the database table structure and insert initial data. The SQL script is usually located in the `src/main/resources/sql` directory of the project.
5. **Build the Project**: In the project root directory, execute the `mvn clean install` command to build the project and generate an executable JAR package.
6. **Run the Project**: Execute the `java -jar target/library - management - 1.0.0.jar` command to start the project. After the project is started, access `http://localhost:8080` in the browser to enter the library management system.

## V. Usage Instructions
1. **Administrator Login**: On the system login page, enter the administrator account and password, and click the "Login" button. The administrator account and password are set when initializing the database and can be modified in the database.
2. **Book Management**: After logging in, click the "Book Management" menu to perform operations such as adding, editing, deleting, and querying books.
3. **User Management**: Click the "User Management" menu to manage the information of readers and administrators, including adding new users, modifying user information, and deleting users.
4. **Borrowing Management**: After readers log in, click the "Borrowing Management" menu to query available books and perform borrowing and returning operations. Administrators can also view all borrowing records and handle overdue books under this menu.

## VI. Contribution Guidelines
1. Developers interested in this project are welcome to contribute. If you find a problem or have an improvement suggestion, please submit an Issue in the GitHub repository.
2. If you want to submit code changes, please fork this repository first and then develop on your branch. After completing the development, submit a Pull Request and describe the content and purpose of your changes.
3. When submitting code, please follow the project's code specifications and development process to ensure the quality and maintainability of the code.

## VII. Contact Information
If you encounter problems or have any questions during use, please feel free to contact us in the following ways:
- Email: [Lanyi_adict@outlook.com](mailto:Lanyi_adict@outlook.com)
- GitHub Repository: [https://github.com/HongyiHao-SXIT/Library_Management.git](https://github.com/HongyiHao-SXIT/Library_Management.git)