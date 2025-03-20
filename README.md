# Microservices Architecture Project

## 📌 Project Overview

This project is an E-Commerce Microservices Architecture designed to simulate a real-world online shopping platform. The system is built using modern software architecture principles and consists of 8 different microservices, each responsible for a specific business domain.

The architecture demonstrates the seamless integration of both synchronous (REST) and asynchronous (Kafka) communication between services, ensuring scalability, flexibility, and fault tolerance.

---

## 🧩 Technologies & Tools Used

- **Java / Spring Boot**
- **Spring Cloud Config Server** - Centralized configuration management
- **Eureka Discovery Server** - Service registration and discovery
- **PostgreSQL** - Relational database
- **MongoDB** - NoSQL database
- **REST API** - Synchronous communication between services
- **Apache Kafka** - Event-driven communication
- **Docker** (Optional but recommended for local deployment)
- **Zipkin** - Distributed tracing system
- **MailDev** - Mail server for development and testing

---

## ⚙️ Architectural Highlights

- **🧩 Microservices Architecture:** 8 independent services handle core e-commerce functionalities.
- **🧠 Domain-Driven Design (DDD):** Microservices are designed around specific business domains with clear boundaries.
- **⚡ Event-Driven Architecture:** Kafka enables event-based communication and loose coupling.
- **🌐 RESTful Communication:** REST APIs are used for synchronous interactions between services.
- **🔄 Hybrid Communication:** REST for synchronous, Kafka for asynchronous communication.
- **🗄️ Hybrid Databases:** PostgreSQL for relational, MongoDB for document-based data.
- **⚙️ Centralized Configuration:** Spring Cloud Config Server manages all service configs.
- **🔎 Service Discovery:** Eureka enables service registration and load balancing.
- **📈 Distributed Tracing** Zipkin provides end-to-end request tracking across services.
- **📬 Email Service::** MailDev captures outgoing emails for testing.
---

## 📈 System Architecture Diagram

Below is the high-level system architecture of the project, illustrating the interaction between microservices, databases, Kafka, and infrastructure components:


![System Architecture Diagram](/resources/diagrams/Architecture%20Diagram/E-Commerce%20App%20Architecture%20Diagram.png)

---

## 🧠 Domain-Driven Design (DDD)

The following diagram demonstrates the communication flow, including both REST and Kafka-based message-driven interactions between services:

![Communication Flow Diagram](/resources/diagrams/Domain%20Driven%20Design/E-Commerce%20App%20Domain%20Driven%20Design_DDD.png)

