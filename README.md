# Maven Project

A sample Maven project demonstrating the standard directory structure and configuration for building Java applications using Maven.



## Project Structure

```
maven-project/
├── pom.xml                           # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── App.java      # Main application class
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── AppTest.java  # Unit tests
└── README.md                         # This file
```

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6.0 or higher

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/nandanks070/maven-project.git
cd maven-project
```

### Build the Project

```bash
mvn clean install
```

This command will:
- Clean any previous build artifacts
- Compile the source code
- Run the unit tests
- Package the application

### Run the Application

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

Or compile and run directly:

```bash
mvn clean compile
java -cp target/classes com.example.App
```

### Run Tests

```bash
mvn test
```

### Generate JAR

```bash
mvn package
```

This creates a JAR file in the `target/` directory.

## Dependencies

The project includes the following dependencies:

- **JUnit 4.13.2** - Unit testing framework (test scope)

## Configuration

The project is configured with:

- **Java Version**: 11
- **Encoding**: UTF-8
- **Source Encoding**: UTF-8

Edit the `pom.xml` file to modify dependencies, plugins, or project properties.

## Maven Commands

| Command | Description |
|---------|-------------|
| `mvn clean` | Removes the target directory |
| `mvn compile` | Compiles source code |
| `mvn test` | Runs unit tests |
| `mvn package` | Creates a JAR file |
| `mvn clean install` | Cleans, builds, tests, and installs the package |
| `mvn clean deploy` | Builds and deploys to repository |

## License

This project is open source and available under the MIT License.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## Support

For issues or questions, please create an issue on the GitHub repository.
