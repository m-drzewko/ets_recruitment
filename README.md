# Prime numbers generator application

## Description
This is a simple web application you can use to generate a list of prime numbers that's restricted by the boundary you provide. The boundary is inclusive, meaning if the boundary number you've provided is itself a prime number, it will also be displayed in the list.

## Prerequisites
The following tools need to be installed on you machine in order for the application to be run successfully:
- Java 11 or higher
- [Maven](https://maven.apache.org) (version 3.9.3)

Please also remember to correctly set up environment variables for the above tools!

## Running the application
To run the application, follow the below steps:
1. Download the source code locally, unzip the package and save it in the desired location.
2. Open your preferred terminal.
3. In the terminal, open the directory were the package has been saved (e.g. `C:\your\Path\To\Code\ets_recruitment`).
4. Run the following command to start the application: `mvn spring-boot:run`.
5. To access the application, open your preferred web browser, put `localhost:8080` in the address bar, then hit `Enter`.
6. The application is ready to use!

To close the application:
1. Bring your terminal window into focus.
2. Press `ctrl + c` (or `Command + .` on Mac). A question will appear, `Terminate batch job (Y/N)?`.
3. Input `y` in the terminal and click `Enter`.
4. The application is now stopped.

## Details
The application uses the following technologies:
- Java 11
- Spring Boot 2.7.14
- Maven 3.9.3
- Thymeleaf 3.0.15
- JUnit 5.9.3

The application uses Maven 3.9.3 as the build automation tool.
