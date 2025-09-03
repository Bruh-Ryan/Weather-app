# Weather App

A Java desktop application demonstrating REST API consumption, JSON parsing, and JavaFX UI development. This project serves as a learning tool for understanding API integration and desktop GUI development in Java.

## 🌟 Features

- **REST API Integration**: HTTP client calls to weather API endpoints
- **JSON Processing**: Parse responses using both `org.json` and `Gson` libraries
- **JavaFX Desktop UI**: Clean, responsive interface with FXML support
- **Environment Configuration**: Secure API key management via `.env` files
- **Maven Build System**: Standard project structure and dependency management

## 🛠️ Tech Stack

- **Java 21** - Target runtime environment
- **JavaFX 21.0.4** - Desktop UI framework
- **Maven** - Build automation and dependency management
- **org.json 20240303** - JSON parsing library
- **Gson 2.10.1** - Alternative JSON processing
- **dotenv-java 3.0.0** - Environment variable management
- **JUnit 3.8.1** - Unit testing framework

## 📋 Prerequisites

Before running this project, ensure you have:

- **Java 21** or later installed
- **Maven 3.6+** installed and available on PATH
- An IDE with Maven support (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd weather-app
   ```

2. **Set up environment variables**
   
   Create a `.env` file in the project root directory:
   ```bash
   API_KEY=your_weather_api_key_here
   BASE_URL=https://api.openweathermap.org/data/2.5
   ```

3. **Install dependencies**
   ```bash
   mvn clean install
   ```

## 🏃‍♂️ Running the Application

### Command Line
```bash
mvn clean javafx:run
```

### IDE
Run the main JavaFX application class directly from your IDE once Maven dependencies are resolved.

## 🧪 Testing

Run the test suite using Maven:
```bash
mvn test
```

Tests are written using JUnit 3 style (`TestCase` extension).

## 📖 How It Works

1. **User Input**: Enter a city name in the JavaFX interface
2. **API Call**: Application sends HTTP request to weather API
3. **JSON Parsing**: Response data is parsed using org.json/Gson
4. **Display Results**: Weather information (temperature, humidity, etc.) is displayed in the UI

## 🎯 Learning Objectives

This project demonstrates:

- **API Consumption**: Making HTTP requests and handling responses in Java
- **JSON Processing**: Working with JSON data using multiple parsing approaches
- **Desktop UI Development**: Building responsive interfaces with JavaFX
- **Configuration Management**: Handling sensitive data with environment variables
- **Maven Project Structure**: Standard Java project organization and build lifecycle

## 📁 Project Structure

```
weather-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ryan/apis/
│   │   └── resources/
│   └── test/
│       └── java/
├── pom.xml
├── .env
└── README.md
```

## 🔧 Maven Configuration

- **Group ID**: `com.ryan.apis`
- **Artifact ID**: `java-apis`
- **Version**: `1.0.0`
- **Packaging**: `jar`

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Weather data provided by your chosen weather API service
- JavaFX community for excellent documentation and examples
- Maven and Java ecosystem contributors
