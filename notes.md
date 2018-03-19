# TODO
- Section Introduction to Web Services
  --- If you already did our course on spring web services, you can directly jump to section on Microservices
- Monolith Applications!
- Updates to Step 29 - Overview of Connecting RESTful Service to JPA

## Introduction to the Course
0001 - Microservices and RESTful APIs with Spring Boot and Spring Cloud - Preview
0002 - Microservices and RESTful APIs with Spring Boot and Spring Cloud - Course Overview
0003 - Microservices and RESTful APIs with Spring Boot and Spring Cloud - Git Repository
0004 - Microservices and RESTful APIs with Spring Boot and Spring Cloud - Installing Basic Tools

## Introduction to Web Services
What is a Web Service?
Important How Questions related to Web Services
Web Services - Key Terminology
Introduction to SOAP Web Services
Introduction to RESTful Web Services
SOAP vs RESTful Web Services

## Restful Web Services with Spring Boot
0005 - Section Introduction 02 - RESTful Web Services
Step 01 - Initializing a RESTful Services Project with Spring Boot
Step 02 - Understanding the RESTful Services we would create in this course
Step 03 - Creating a Hello World Service
Step 04 - Enhancing the Hello World Service to return a Bean
Step 05 - Quick Review of Spring Boot Auto Configuration and Dispatcher Servlet
Step 06 - Enhancing the Hello World Service with a Path Variable
Step 07 - Creating User Bean and User Service
Step 08 - Implementing GET Methods for User Resource
Step 09 - Implementing POST Method to create User Resource
Step 10 - Enhancing POST Method to return correct HTTP Status Code and Location
Step 11 - Implementing Exception Handling - 404 Resource Not Found
Step 12 - Implementing Generic Exception Handling for all Resources
Step 13 - Exercise : User Post Resource and Exception Handling
Step 14 - Implementing DELETE Method to delete a User Resource
Step 15 - Implementing Validations for RESTful Services
Step 16 - Implementing HATEOAS for RESTful Services
Step 17 - Overview of Advanced RESTful Service Features
Step 18 - Internationalization for RESTful Services
Step 19 - Content Negotiation - Implementing Support for XML
Step 20 - Configuring Auto Generation of Swagger Documentation
Step 21 - Introduction to Swagger Documentation Format
Step 22 - Enhancing Swagger Documentation with Custom Annotations
Step 23 - Monitoring APIs with Spring Boot Actuator
Step 24 - Implementing Static Filtering for RESTful Service
Step 25 - Implementing Dynamic Filtering for RESTful Service
Step 26 - Versioning RESTful Services - Basic Approach with URIs
Step 27 - Versioning RESTful Services - Header and Content Negotiation Approach
Step 28 - Implementing Basic Authentication with Spring Security
Step 29 - Overview of Connecting RESTful Service to JPA
Step 30 - Creating User Entity and some test data
Step 31 - Updating GET methods on User Resource to use JPA
Step 32 - Updating POST and DELETE methods on User Resource to use JPA
Step 33 - Creating Post Entity and Many to One Relationship with User Entity
Step 34 - Implementing a GET service to retrieve all Posts of a User
Step 35 - Implementing a POST service to create a Post for a User
Step 36 - Richardson Maturity Model
Step 37 - RESTful Web Services - Best Practices

## Microservices with Spring Cloud
0005 - Section Introduction 03 - Microservices with Spring Cloud
Step 00 - 01 - Introduction to Microservices
Step 00 - 02 - Challenges with Microservices
Step 00 - 03 - Introduction to Spring Cloud
Step 00 - 04 - Advantages of Microservices Architectures
Step 00 - 05 - Microservice Components - Standardizing Ports and URL
Step 01 - Part 1 - Introduction to Limits Microservice and Spring Cloud Config Server
Step 01 - Part 2 - Setting up Limits Microservice
Step 02 - Creating a hard coded limits service
Step 03 - Enhance limits service to pick up configuration from application properties
Step 04 - Setting up Spring Cloud Config Server
Step 05 - Installing Git
Step 06 - Creating Local Git Repository
Step 07 - Connect Spring Cloud Config Server to Local Git Repository
Step 08 - Configuration for Multiple Environments in Git Repository
Step 09 - Connect Limits Service to Spring Cloud Config Server
Step 10 - Configuring Profiles for Limits Service
Step 11 - A review of Spring Cloud Config Server
Step 12 - Introduction to Currency Conversion and Currency Exchange Microservices
Step 13 - Setting up Currency Exchange Microservice
Step 14 - Create a simple hard coded currency exchange service
Step 15 - Setting up Dynamic Port in the the Response
Step 16 - Configure JPA and Initialized Data
Step 17 - Create a JPA Repository
Step 18 - Setting up Currency Conversion Microservice
Step 19 - Creating a service for currency conversion
Step 20 - Invoking Currency Exchange Microservice from Currency Conversion Microservice
Step 21 - Using Feign REST Client for Service Invocation
Step 22 - Setting up client side load balancing with Ribbon
Step 23 - Running client side load balancing with Ribbon
Step 24 - Understand the need for a Naming Server
Step 25 - Setting up Eureka Naming Server
Step 26 - Connecting Currency Conversion Microservice to Eureka
Step 27 - Connecting Currency Exchange Microservice to Eureka
Step 28 - Distributing calls using Eureka and Ribbon
Step 29 - A review of implementing Eureka, Ribbon and Feign
Step 30 - Introduction to API Gateways
Step 31 - Setting up Zuul API Gateway
Step 32 - Implementing Zuul Logging Filter
Step 33 - Executing a request through Zuul API Gateway
Step 34 - Setting up Zuul API Gateway between microservice invocations
Step 35 - Introduction to Distributed Tracing
Step 36 - Implementing Spring Cloud Sleuth
Step 37 - Introduction to Distributed Tracing with Zipkin
Step 38 - Installing Rabbit MQ
Step 39 - Setting up Distributed Tracing with Zipkin
Step 40 - Connecting microservices to Zipkin
Step 41 - Using Zipkin UI Dashboard to trace requests
Step 42 - Understanding the need for Spring Cloud Bus
Step 43 - Implementing Spring Cloud Bus
Step 44 - Fault Tolerance with Hystrix
Step 99 - FAQ 01 - Microservices Characteristics
Step 99 - FAQ 02 - What do you do next?

9999 - Microservices and RESTful APIs with Spring Boot and Spring Cloud - Conclusion

## Appendix - Introduction to Spring Boot in 10 Steps
0005 - Section Introduction 04 - Introduction to Spring Boot in 10 Steps
Step 1 : Introduction to Spring Boot - Goals and Important Features
Step 2 : Developing Spring Applications before Spring Boot
Step 3 : Using Spring Initializr to create
Step 4 : Creating a Simple REST Controller
Step 5 : What is Spring Boot Auto Configuration?
Step 6 : Spring Boot vs Spring vs Spring MVC
Step 7 : Spring Boot Starter Projects - Starter Web and Starter JPA
Step 8 : Overview of different Spring Boot Starter Projects
Step 9 : Spring Boot Actuator
Step 10 : Spring Boot Developer Tools

## Appendix - Introduction to JPA in 10 Steps
0005 - Section Introduction 05 - Introduction to JPA in 10 Steps
Introduction to JPA - An Overview
Step 1 : Object Relational Impedence Mismatch
Step 2 : World before JPA - JDBC, Spring JDBC and myBatis
Step 3 : Introduction to JPA
Step 4 : Creating a JPA Project using Spring Initializr
Step 5 : Defining a JPA Entity - User
Step 6 : Defining a Service to manage the Entity - UserService and EntityManager
Step 7 : Using a Command Line Runner to save the User to database.
Step 8 : Magic of Spring Boot and In Memory Database H2
Step 9 : Introduction to Spring Data JPA
Step 10 : More JPA Repository : findById and findAll

## Versions
- 2.0.0.RELEASE
- Finchley.M8

## URLs

|     Application       |     URL          |
| ------------- | ------------- |
| Limits Service | http://localhost:8080/limits|
|Spring Cloud Config Server| http://localhost:8888/limits-service/default http://localhost:8888/limits-service/dev|
|  Currency Converter Service - Direct Call| http://localhost:8100/currency-converter/from/USD/to/INR//usr/local/var/log/rabbitmq/rabbit@localhost.log/usr/local/var/log/rabbitmq/rabbit@localhost.logquantity/10|
|  Currency Converter Service - Feign| http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000|
| Currency Exchange Service | http://localhost:8000/currency-exchange/from/EUR/to/INR http://localhost:8001/currency-exchange/from/USD/to/INR|
| Eureka | http://localhost:8761/|
| Zuul - Currency Exchange & Exchange Services | http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/10|

## VM Argument

-Dserver.port=8001

## Commands
- mkdir git-configuration-repo
- cd git-configuration-repo/
- git init
- git add -A
- git commit -m "first commit"

## Ports

|     Application       |     Port          |
| ------------- | ------------- |
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
|  |  |
| Currency Exchange Service | 8000, 8001, 8002, ..  |
| Currency Conversion Service | 8100, 8101, 8102, ... |
| Netflix Eureka Naming Server | 8761 |
| Netflix Zuul API Gateway Server | 8765 |
| Zipkin Distributed Tracing Server | 9411 |

### Diagrams

- http://viz-js.com/
- http://dreampuf.github.io/GraphvizOnline/

```


MicroserviceCommunication
~~~~~~~~~~~~~~~~~~~~~~~~~
digraph architecture {
  rankdir=TB;
{rank=same; MovieService, CustomerService, ReviewService, BookingService, FareCalculationService};
DB1,DB2,DB3,DB4,DB5[shape=cylinder]
MovieService, CustomerService, ReviewService, BookingService, FareCalculationService[shape=component]

  MovieService->DB1;
  CustomerService->DB2;
ReviewService->DB3;
BookingService ->DB4;
FareCalculationService ->DB5;


}

digraph architecture {
  rankdir=TB;
{rank=same; MovieApplication};
LARGEDB[shape=cylinder];
  MovieApplication->LARGEDB;

}

digraph architecture {
  rankdir=TB;
{rank=same; CurrencyCalculationService, CurrencyExchangeService, LimitsService};
Configuration[shape=cylinder]
Database[shape=cylinder]
LimitsService, CurrencyCalculationService, CurrencyExchangeService[shape=component]

  CurrencyCalculationService -> CurrencyExchangeService -> LimitsService;
  
  CurrencyExchangeService->Database;
  LimitsService->Configuration;

}

Microservices-Environments
~~~~~~~~~~~~~~~~~~~~~~~~~~~`
digraph architecture {
  rankdir=LR;

node[shape=record]
LimitsService, CurrencyCalculationService, CurrencyExchangeService[shape=component]

  CurrencyCalculationService -> CurrencyExchangeService -> LimitsService

  subgraph CurrencyCalculationService {
      {rank=same; CurrencyCalculationService,CCDEV,CCQA,CCSTAGE, CCPROD};
  }
 
  subgraph CurrencyExchangeService {
      CurrencyExchangeService;
      {rank=same; CurrencyExchangeService,CEDEV,CEQA, CESTAGE, CEPROD};
  }
  
  subgraph LimitsService {
      CurrencyExchangeService;
      {rank=same; LimitsService,LSDEV,LSQA, LSSTAGE, LSPROD};
  }
 
}


SpringCloudConfigServer
#######################
digraph architecture {
rankdir = TB;
node[shape=component]
Git[shape=cylinder]
{rank=same; CurrencyCalculationService, CurrencyExchangeService, LimitsService};
CurrencyExchangeService -> SpringCloudConfigServer;
CurrencyCalculationService -> SpringCloudConfigServer;
LimitsService -> SpringCloudConfigServer
SpringCloudConfigServer -> Git

}

EUREKANAMINGSERVER
#######################
digraph architecture {
rankdir = TB;
node[shape=component]
{rank=same; CurrencyCalculationService, CurrencyExchangeService, LimitsService};
CurrencyExchangeService -> EurekaNamingServer;
CurrencyCalculationService -> EurekaNamingServer;
LimitsService -> EurekaNamingServer
}

RibbonClientSideLoadBalancing
#######################
digraph architecture {
rankdir = TB;
node[shape=component]
Ribbon[shape=underline]

{rank=same; CurrencyExchangeService1, CurrencyExchangeService2, CurrencyExchangeService3};
{rank=same; Ribbon, NamingServer };
Ribbon -> CurrencyExchangeService1
Ribbon -> CurrencyExchangeService2
Ribbon -> CurrencyExchangeService3
CurrencyCalculationService -> Ribbon
Ribbon -> NamingServer

}

ZipkinDistributedTracingServer
###############################
digraph architecture {
rankdir = TB;
node[shape=component]
Database[shape=cylinder]
RabbitMQ[shape=underline]
{rank=same; CurrencyCalculationService, CurrencyExchangeService, LimitsService};
CurrencyExchangeService -> RabbitMQ
CurrencyCalculationService -> RabbitMQ;
LimitsService -> RabbitMQ
RabbitMQ -> ZipkinDistributedTracingServer
ZipkinDistributedTracingServer -> Database

}

CurrencyExchangeMicroserviceDeployment
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``
digraph architecture {
rankdir = TB;
node[shape=record]
{rank=same; DEV, QA, STAGE, PROD};

DEV -> DEV1

QA -> QA1
QA -> QA2

STAGE -> STAGE1

PROD -> PROD1
PROD -> PROD2
PROD -> PROD3
PROD -> PROD4

}

CurrencyConversionMicroserviceDeployment
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~``
digraph architecture {
rankdir = TB;
node[shape=record]
{rank=same; DEV, QA, STAGE, PROD};

DEV -> DEV1

QA -> QA1
QA -> QA2

STAGE -> STAGE1

PROD -> PROD1

}


```