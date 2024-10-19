README.md for Real-Time Weather Monitoring System

Project Title
Real-Time Data Processing System for Weather Monitoring

Introduction
This project implements a Real-Time Data Processing System that monitors weather conditions using the OpenWeatherMap API. It continuously retrieves weather data for major metros in India, calculates daily summaries, and provides alerts based on user-defined thresholds. The primary weather parameters tracked include temperature, perceived temperature, and main weather conditions.

Key Features
Continuous retrieval of real-time weather data for Delhi, Mumbai, Chennai, Bangalore, Kolkata, and Hyderabad.
Daily weather summaries including average, maximum, minimum temperatures, and dominant weather conditions.
User-configurable alert thresholds for temperature conditions.
Data storage in a MySQL database for further analysis and reporting.

Implementation Details
Project Structure

Weather-Monitoring-System/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── weather/
│   │   │   │       ├── WeatherApp.java
│   │   │   │       ├── service/
│   │   │   │       │   ├── WeatherService.java
│   │   │   │       │   ├── AlertService.java
│   │   │   │       │   └── DatabaseService.java
                            ScheduledWeatherfetcher.java
│   │   │   │       ├── model/
│   │   │   │       │   ├── WeatherData.java
│   │   │   │       │   └── DailySummary.java
│   │   │   │       └── repository/
│   │   │   │           └── DailySummaryRepository.java
│   │   │   └── resources/
│   │   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── weather/
│                   └── WeatherAppTest.java
├── pom.xml
└── README.md

Dependencies
To set up and run the application, the following dependencies are required. Ensure you have the following in your pom.xml:

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
    </dependency>
</dependencies>


Build Instructions

Clone the Repository:

git clone https://github.com/Premkumarm2002/Weather-Monitoring-System.git

cd WeatherMonitoringSystem

Set Up MySQL Database:

Create a MySQL database named weather_db.

Configure Application Properties:

Update src/main/resources/application.properties with your MySQL credentials and OpenWeatherMap API key.

spring.datasource.url=jdbc:mysql://localhost:3306/weather_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
openweathermap.api.key=your_api_key

Build the Application:

Use Maven to build the application:

mvn clean install

Run the Application:

Start the application using:

mvn spring-boot:run

Design Choices:
Modular Structure: The project is organized into model, service, and repository packages, which promotes separation of concerns and maintainability.
Database Integration: Used Spring Data JPA for seamless database interactions, enabling easy data storage and retrieval.
Weather Data Handling: Implemented a structured approach to retrieve and process weather data from the OpenWeatherMap API using a RESTful client.
Alert System: Designed to allow user-configurable thresholds, providing flexibility based on user requirements.

Testing
I implemented several tests to verify the functionality of the application, including:

System Setup: Ensured the application connects successfully to the OpenWeatherMap API using a valid API key.
Data Retrieval: Simulated API calls and validated that the weather data was retrieved and parsed correctly.
Temperature Conversion: Verified the conversion of temperature values from Kelvin to Celsius.
Daily Weather Summary: Confirmed that daily summaries were accurately calculated.
Alerting Thresholds: Tested the alerting mechanism to ensure alerts were triggered correctly when thresholds were breached.

GitHub Repository Link
GitHub Repository - https://github.com/Premkumarm2002/Weather-Monitoring-System.git

Conclusion
I successfully developed a Real-Time Data Processing System for Weather Monitoring, fulfilling the project requirements. The application provides real-time updates, daily summaries, and alerts based on user-defined thresholds. Its modular structure and thorough testing ensure clarity, maintainability, and reliability.
