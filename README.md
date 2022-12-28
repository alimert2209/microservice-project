
# Basic Microservice Project

In this project, a simple currency conversion project was made using microservices.

Two different spring boot projects were created that convert currency from `USD to TRY`(currency-conversion-1) and from `TRY to USD`(currency-conversion-2).

## Creating Back-end Projects with Spring Initializr

These two back-end projects were created with spring initializr (https://start.spring.io/) and it is sufficient to use only Spring Web as a dependency.

Spring Cloud Gateway was used to connect these two backend projects to a single client. For this binding process, spring initialzr is used again, and it is sufficient to use only Spring Cloud Gateway as a dependency. A completely RESTful architecture is used on the backend of the project.

## Front-end Side
On the frontend side of the project, simple html, css and javascript are used, and css and javascript codes are included internally.

## What does API Gateway do?
The server port of the backend project using API Gateway is set to '8080' by default. The ports of the backend projects that do currency conversion are '8081' and '8082', respectively. A request is made by the client to port 8080, that is, API Gateway. API Gateway distributes it according to the URL of the incoming request and performs the requested operation.

<hr>

![Image](https://user-images.githubusercontent.com/74821442/209805721-5a6dbb0a-01f5-4663-9be2-ef46448262c0.png)
