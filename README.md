# Forage Midas Project

## Overview
The Forage Midas project is a Spring Boot application designed to handle transaction processing and balance management. It provides a RESTful API for clients to interact with transaction data and retrieve balance information.

## Project Structure
The project is organized as follows:

```
forage-midas
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── jpmc
│   │   │           └── midascore
│   │   │               ├── ForageMidasApplication.java
│   │   │               ├── controller
│   │   │               │   └── TransactionController.java
│   │   │               ├── service
│   │   │               │   └── TransactionService.java
│   │   │               ├── repository
│   │   │               │   └── TransactionRepository.java
│   │   │               └── model
│   │   │                   └── Balance.java
│   │   └── resources
│   │       ├── application.yml
│   │       └── test_data
│   │           └── rueiwoqp.tyruei
│   └── test
│       └── java
│           └── com
│               └── jpmc
│                   └── midascore
│                       ├── TaskOneTests.java
│                       └── TaskFiveTests.java
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .mvn
├── .github
│   └── workflows
│       └── maven.yml
└── README.md
```

## Getting Started

### Prerequisites
- Java 17
- Maven

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/vagabond-systems/forage-midas.git
   ```
2. Navigate to the project directory:
   ```
   cd forage-midas
   ```
3. Build the project using Maven:
   ```
   ./mvnw clean install
   ```

### Running the Application
To run the application, use the following command:
```
./mvnw spring-boot:run
```

### Testing
The project includes unit tests located in the `src/test/java/com/jpmc/midascore` directory. You can run the tests using:
```
./mvnw test
```

## Usage
The application exposes a REST API for transaction management. Refer to the `TransactionController` for available endpoints and their usage.

## Contributing
Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.

## License
This project is licensed under the MIT License. See the LICENSE file for details.