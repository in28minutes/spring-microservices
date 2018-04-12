## Migration to Spring Boot 2.0.0.RELEASE

### Previous Versions
- Spring Boot - 2.0.0.M3
- Spring Cloud - Finchley.M2

### Current Versions
- Spring Boot - 2.0.0.RELEASE
- Spring Cloud - Finchley.M8

## How are releases versioned?

Take a look at https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.-0.0-RC2-Release-Notes
- v2.0.0 M1 - May 16,2017 - First Milestone
- v2.0.0 M2
- v2.0.0 M3 - July 2017 - Most of our courses
- v2.0.0 M4
- v2.0.0 M5
- v2.0.0 M6
- v2.0.0 M7
- v2.0.0 RC1 - Jan 31 2018 - First Release Candidate
- v2.0.0 RC2 - Feb 21 2018
- v2.0.0 RELEASE - March 01 2018

## New Videos Created/Updated

- 01.IntroductionToSpringFramework-Step01-SettingUpASpringProjectUsingSpringInitializr
- 02.RestfulWebServices-Step-08---Implementing-GET-Methods-for-User-Resource
- 02.RestfulWebServices-Step-18---Internationalization-for-RESTful-Services
- 02.RestfulWebServices-Step-18---Internationalization-for-RESTful-Services-Improvements-Part2
- 02.RestfulWebServices-Step-23---Monitoring-APIs-with-Spring-Boot-Actuator
- 02.RestfulWebServices-Step-28---Implementing-Basic-Authentication-with-Spring-Security
- 02.RestfulWebServices-Step-30---Creating-User-Entity-and-some-test-data
- 02.SpringCoreInDepth-Step-15---Complex-scenarios-with-Scope-of-a-Spring-Bean---Mix-of-Prototype-and-Singleton
- 03.MicroservicesWithSpringCloud-Step-16---Configure-JPA-and-Initialized-Data
- 03.MicroservicesWithSpringCloud-Step-21---Using-Feign-REST-Client-for-Service-Invocation
- 03.MicroservicesWithSpringCloud-Step-22---Setting-up-client-side-load-balancing-with-Ribbon
- 03.MicroservicesWithSpringCloud-Step-26---Connecting-Currency-Conversion-Microservice-to-Eureka
- 03.MicroservicesWithSpringCloud-Step-27---Connecting-Currency-Exchange-Microservice-to-Eureka
- 03.MicroservicesWithSpringCloud-Step-36---Implementing-Spring-Cloud-Sleuth
- 03.MicroservicesWithSpringCloud-Step-39---Setting-up-Distributed-Tracing-with-Zipkin
- 03.MicroservicesWithSpringCloud-Step-41---Using-Zipkin-UI-Dashboard-to-trace-requests
- 03.MicroservicesWithSpringCloud-Step-42---Understanding-the-need-for-Spring-Cloud-Bus-20180412.mp4
- 03.MicroservicesWithSpringCloud-Step-43---Implementing-Spring-Cloud-Bus-20180412.mp4

- 04.JPA-In-Depth-Step-59---Transaction-Management---ACID-Properties
- 05.Spring-Boot-Advanced-Step-13-Spring-Boot-Actuator-Monitor-your-Spring-Boot-applications!
- 05.Spring-Boot-Advanced-Step-27-Configure-Spring-Security-user-roles-for-survey-and-other-services-Part1
- 06.IntroductionToSpringBootFramework-Step09-UsingSpringBootActuatorToMonitorYourApplications
- 07.Connecting-Spring-Boot-Web-Application-To-JPA-Step-27---Configuring-H2-Console
- 08.Spring-JDBC-And-Upgrade-To-JPA-Step-02---Launching-up-H2-Console
- Step03-UsingSpringInitializrToCreateASpringBootApplication-20170924

# Course Sections to be Updated

- 35.SpringWebServices-July2017
  - 02.IntroductionToSpringFramework
  - 03.IntroductionToSpringBootFramework
  - 05.BasicsOfRestfulWebServices
  - 06.AdvancedFeatures-RestfulWebServices
  - 08.ConnectingRestfulServiceToJPA
- 36.SpringBootMasterClass-Aug2017-Redesign (TODO)
  - 05.Spring-Boot-Advanced
  - 07.Connecting-Spring-Boot-Web-Application-To-JPA
  - 09.Appendix.Spring-Introduction-In-10-Steps
- 37.SpringMasterClass-Aug2017-Redesign
  - 01.IntroductionToSpringFramework
  - 02.SpringCoreInDepth
  - 06.IntroductionToSpringBootFramework
  - 08.Spring-JDBC-And-Upgrade-To-JPA
- 39.HibernateWithJPAandSpringBoot
  - 01.IntroductionToSpringBootFramework
  - 02.JourneyFromSpringJDBCToJPA
  - 04.JPA-In-Depth
  - 09.Appendix.IntroductionToSpringFramework
- 40.SpringMicroservices
  - 02.RestfulWebServices
  - 03.MicroservicesWithSpringCloud
  - 99.01.APPENDIX.IntroductionToSpringBootFramework
- Spring Complete Career Path
  - All Sections

# Master List of Resources
- All Spring Courses
  - Updating spring-complete-career-path	
- Update all websites
	- SBT.com
	- in28minutes.com
- Updating Course Guides
- Updating Github Repos
  - Updating ZIP FILES
- No SNAPSHOT VERSIONS in Zip Files
- Important Things to do
  - What if we have to revert back to older versions?
  - Communicating to Packt

# Release Notes Extracts

6 Releases - All links available at
- https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0.0-RC2-Release-Notes

Details
- Actuator Upgrade - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0.0-M4-Release-Notes#build
```
Actuator
Already covered at large in the migration part, Actuator now runs natively on Spring MVC, Spring WebFlux and Jersey. Adding the dependency and enabling web endpoints (using for instance endpoints.default.web.enabled) is all that’s required.
```
- Security Upgrade - https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0.0-M4-Release-Notes#security
```
Another important change is that there is no longer a separate security auto-configuration for the Actuator:(management.security.enabled) no longer exists and web endpoints are disabled by default (endpoints.default.web.enabled) to prevent exposing sensitive information by default. The sensitive flag of each endpoint is also gone to make things more explicit in the security configuration. To restore the previous behaviour:

Enable Actuator web endpoints: endpoints.default.web.enabled=true in your configuration

Create or adapt your security configuration to secure endpoints with the role of your choice (see the Security section below)

M5
Management Server-related properties have been moved from management.* to management.server.*. We also fixed the meaning of management.server.context-path: it is now the endpoint management equivalent of server.context-path (only active when management.server.port is set). Additionally, you can also set the base path for the management endpoints with a new, separate property: management.endpoints.web.base-path.

For example, if you’ve set management.server.context-path=/management and management.endpoints.web.base-path=/application, you’ll be able to reach the health endpoint at the following path: /management/application/health.

M6
After some feedback from the community, the default management.endpoints.web.base-path has been changed from "/application" to "/actuator" to avoid collision with user-defined mappings (see #10970).

The endpoints. keys have moved to management.endpoints.


RC1
Spring Security default user
We’ve restored the ability to auto-configure a single user via configuration keys. These can be found at spring.security.user.
```
- OAuth 2.0 Support
Functionality from the Spring Security OAuth project is being migrated to core Spring Security. OAuth 2.0 client support has already been added and additional features will be migrated in due course.
```
If you depend on Spring Security OAuth features that have not yet been migrated you will need to add org.springframework.security.oauth:spring-security-oauth2 and configure things manually. If you only need OAuth 2.0 client support you can use the auto-configuration provided by Spring Boot 2.0. We’re also continuing to support Spring Boot 1.5 so older applications can continue to use that until an upgrade path is provided.
```

- Jackson serialization

```
The default value for spring.jackson.serialization.write-dates-as-timestamps is now set to false, meaning all JSR310 date types will be serialized as ISO-8601 strings instead of array-like types.

RC1

Jackson
SerializationFeature.WRITE_DATES_AS_TIMESTAMPS is now disabled by default.

Date conversion
It is possible to control the date format for date types from well-known packages (java.util, org.joda.time and java.time) using a single property.
```

- Renamed

```
==========================
CONDITION EVALUATION DELTA
==========================

```

### Spring Cloud 

https://github.com/spring-projects/spring-cloud/wiki/Spring-Cloud-Finchley-Release-Notes

- Remove the Zipkin Stream server
https://github.com/spring-cloud/spring-cloud-sleuth/issues/727
- All of Feign code from Spring Cloud Netflix has been moved to a new project, Spring Cloud OpenFeign
- spring-cloud-starter-eureka is deprecated. It is now called spring-cloud-starter-netflix-eureka-client

## Java 9 vs Java 8
```
<properties>
    <!-- Generic properties -->
    <java.version>9</java.version>
</properties>
```
java.lang.NoClassDefFoundError: javax/xml/bind/JAXBException

> Affects all modules using JPA

Hibernate typically requires JAXB that’s no longer provided by default. You either need to add a dependency to your project:

```
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
</dependency>
```

# Project Updates

## REST Web Services

### Actuator

Replace old url - http://localhost:8080/application
New URL - http://localhost:8080/actuator

application.properties

```
management.endpoints.web.exposure.include=*
```

In HAL Browser, enter the actuator URL to browse.

### Spring Security

```
#security.user.name=username
#security.user.password=password
spring.security.user.name=username
spring.security.user.password=password
```

```
+        auth.inMemoryAuthentication()
+            .passwordEncoder(NoOpPasswordEncoder.getInstance())
+           .withUser("in28Minutes").password("dummy")
```

### Internationalization!

```java
    @GetMapping("/hello")
    public String helloWorld() {
        return msgSource.getMessage("msg.hello", null, "Whoops!", LocaleContextHolder.getLocale());
    }
```

```java
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }
```

```properties
spring.jackson.serialization.write-dates-as-timestamps=false
spring.messages.basename=messages

```
## Spring Cloud Microservices

### Artifact/Code Changes
```xml
-     <artifactId>spring-cloud-starter-zuul</artifactId>
+     <artifactId>spring-cloud-starter-netflix-zuul</artifactId>

-     <artifactId>spring-cloud-starter-feign</artifactId>
+     <artifactId>spring-cloud-starter-openfeign</artifactId>

-     <artifactId>spring-cloud-starter-eureka</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>

-     <artifactId>spring-cloud-starter-eureka-server</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-server</

-     <artifactId>spring-cloud-starter-ribbon</artifactId>
+     <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>

-     <artifactId>spring-cloud-starter-hystrix</artifactId>
+     <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
```

```java
- public AlwaysSampler defaultSampler() {
-   return new AlwaysSampler();
+ public Sampler defaultSampler() {
+   return Sampler.ALWAYS_SAMPLE;
```

### ZipkinUi, ZipkinStream, StreamRabbit Not Available

Not available on spring.io for current version of spring boot.

#### New Installation Approach for Zipkin

Quick Start Page
- https://zipkin.io/pages/quickstart

Downloading Zipkin Jar
- https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec

Command to run

```
RABBIT_URI=amqp://localhost java -jar zipkin-server-2.5.2-exec.jar
```


# PATCH

```
diff --git a/01.web-application-with-spring-and-spring-boot/pom.xml b/01.web-application-with-spring-and-spring-boot/pom.xml
index 51b9d7e..f92f5ca 100644
--- a/01.web-application-with-spring-and-spring-boot/pom.xml
+++ b/01.web-application-with-spring-and-spring-boot/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version> <!-- Step 33 -->
diff --git a/01.web-application-with-spring-and-spring-boot/src/main/java/com/in28minutes/springboot/web/security/SecurityConfiguration.java b/01.web-application-with-spring-and-spring-boot/src/main/java/com/in28minutes/springboot/web/security/SecurityConfiguration.java
index 6669881..11f05a5 100644
--- a/01.web-application-with-spring-and-spring-boot/src/main/java/com/in28minutes/springboot/web/security/SecurityConfiguration.java
+++ b/01.web-application-with-spring-and-spring-boot/src/main/java/com/in28minutes/springboot/web/security/SecurityConfiguration.java
@@ -7,0 +8 @@ import org.springframework.security.config.annotation.web.configuration.WebSecur
+import org.springframework.security.crypto.password.NoOpPasswordEncoder;
@@ -15 +16,3 @@ public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
-        auth.inMemoryAuthentication().withUser("in28Minutes").password("dummy")
+        auth.inMemoryAuthentication()
+            .passwordEncoder(NoOpPasswordEncoder.getInstance())
+           .withUser("in28Minutes").password("dummy")
diff --git a/02.spring-in-depth/pom.xml b/02.spring-in-depth/pom.xml
index 8b7dcd4..1004ddd 100644
--- a/02.spring-in-depth/pom.xml
+++ b/02.spring-in-depth/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.BUILD-SNAPSHOT</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/03.spring-restful-web-services/pom.xml b/03.spring-restful-web-services/pom.xml
index d374e2a..0d4c98b 100644
--- a/03.spring-restful-web-services/pom.xml
+++ b/03.spring-restful-web-services/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M2</version>
+   <version>2.0.0.RELEASE</version>
@@ -38,0 +39 @@
+<!--  
@@ -42 +43 @@
-   </dependency>
+   </dependency>-->
@@ -64,0 +66,5 @@
+   <dependency> <!-- Needed for Java 9 --> <!-- Make sure you do Maven -> Update Project and Restart -->
+     <groupId>javax.xml.bind</groupId>
+     <artifactId>jaxb-api</artifactId>
+   </dependency>
+   
diff --git a/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java b/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java
index 2888d58..70c8201 100644
--- a/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java
+++ b/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/RestfulWebServicesApplication.java
@@ -8 +7,0 @@ import org.springframework.context.annotation.Bean;
-import org.springframework.context.support.ResourceBundleMessageSource;
@@ -10 +9 @@ import org.springframework.web.servlet.LocaleResolver;
-import org.springframework.web.servlet.i18n.SessionLocaleResolver;
+import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
@@ -21 +20 @@ public class RestfulWebServicesApplication {
-   SessionLocaleResolver localeResolver = new SessionLocaleResolver();
+   AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
@@ -25,7 +23,0 @@ public class RestfulWebServicesApplication {
- 
- @Bean
- public ResourceBundleMessageSource messageSource() {
-   ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
-   messageSource.setBasename("messages");
-   return messageSource;
- }
diff --git a/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/helloworld/HelloWorldController.java b/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/helloworld/HelloWorldController.java
index 2bfbdbe..d383dce 100644
--- a/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/helloworld/HelloWorldController.java
+++ b/03.spring-restful-web-services/src/main/java/com/in28minutes/rest/webservices/restfulwebservices/helloworld/HelloWorldController.java
@@ -6,0 +7 @@ import org.springframework.context.MessageSource;
+import org.springframework.context.i18n.LocaleContextHolder;
@@ -36,3 +37,3 @@ public class HelloWorldController {
- public String helloWorldInternationalized(
-     @RequestHeader(name="Accept-Language", required=false) Locale locale) {
-   return messageSource.getMessage("good.morning.message", null, locale);
+ public String helloWorldInternationalized() {
+   return messageSource.getMessage("good.morning.message", null, 
+                 LocaleContextHolder.getLocale());
diff --git a/03.spring-restful-web-services/src/main/resources/application.properties b/03.spring-restful-web-services/src/main/resources/application.properties
index 111f757..742c91a 100644
--- a/03.spring-restful-web-services/src/main/resources/application.properties
+++ b/03.spring-restful-web-services/src/main/resources/application.properties
@@ -3,4 +3,7 @@ spring.jackson.serialization.write-dates-as-timestamps=false
-management.security.enabled=false
-security.basic.enabled=false
-security.user.name=username
-security.user.password=password
+spring.messages.basename=messages
+management.endpoints.web.exposure.include=*
+# Disabled security by removing the Jar
+#security.user.name=username
+#security.user.password=password
+spring.security.user.name=username
+spring.security.user.password=password
diff --git a/04.spring-soap-web-services/pom.xml b/04.spring-soap-web-services/pom.xml
index 97b4637..e28c699 100644
--- a/04.spring-soap-web-services/pom.xml
+++ b/04.spring-soap-web-services/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M2</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/05.spring-microservices/.DS_Store b/05.spring-microservices/.DS_Store
index 6cc4116..c83e010 100644
Binary files a/05.spring-microservices/.DS_Store and b/05.spring-microservices/.DS_Store differ
diff --git a/05.spring-microservices/currency-conversion-service/pom.xml b/05.spring-microservices/currency-conversion-service/pom.xml
index d04f82d..a1d54f9 100644
--- a/05.spring-microservices/currency-conversion-service/pom.xml
+++ b/05.spring-microservices/currency-conversion-service/pom.xml
@@ -17,2 +17,2 @@
-   <version>2.0.0.M3</version>
-   <relativePath/> <!-- lookup parent from repository -->
+   <version>2.0.0.RELEASE</version>
+   <relativePath /> <!-- lookup parent from repository -->
@@ -25 +25 @@
-   <spring-cloud.version>Finchley.M2</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -36 +36 @@
-     <artifactId>spring-cloud-starter-feign</artifactId>
+     <artifactId>spring-cloud-starter-openfeign</artifactId>
@@ -38 +38 @@
-
+   
@@ -56 +56 @@
-     <artifactId>spring-cloud-starter-eureka</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
@@ -61 +61 @@
-     <artifactId>spring-cloud-starter-ribbon</artifactId>
+     <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
diff --git a/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyConversionServiceApplication.java b/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyConversionServiceApplication.java
index 1cac369..0088964 100644
--- a/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyConversionServiceApplication.java
+++ b/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyConversionServiceApplication.java
@@ -6,2 +6 @@ import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
-import org.springframework.cloud.netflix.feign.EnableFeignClients;
-import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
+import org.springframework.cloud.openfeign.EnableFeignClients;
@@ -9,0 +9,2 @@ import org.springframework.context.annotation.Bean;
+import brave.sampler.Sampler;
+
@@ -20,2 +21,2 @@ public class CurrencyConversionServiceApplication {
- public AlwaysSampler defaultSampler() {
-   return new AlwaysSampler();
+ public Sampler defaultSampler() {
+   return Sampler.ALWAYS_SAMPLE;
diff --git a/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyExchangeServiceProxy.java b/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyExchangeServiceProxy.java
index 8da0bbf..3e421b9 100644
--- a/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyExchangeServiceProxy.java
+++ b/05.spring-microservices/currency-conversion-service/src/main/java/com/in28minutes/microservices/currencyconversionservice/CurrencyExchangeServiceProxy.java
@@ -3 +2,0 @@ package com.in28minutes.microservices.currencyconversionservice;
-import org.springframework.cloud.netflix.feign.FeignClient;
@@ -4,0 +4 @@ import org.springframework.cloud.netflix.ribbon.RibbonClient;
+import org.springframework.cloud.openfeign.FeignClient;
diff --git a/05.spring-microservices/currency-exchange-service/pom.xml b/05.spring-microservices/currency-exchange-service/pom.xml
index 3b792bf..ea64cc6 100644
--- a/05.spring-microservices/currency-exchange-service/pom.xml
+++ b/05.spring-microservices/currency-exchange-service/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Finchley.M2</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -35 +35 @@
-     <artifactId>spring-cloud-starter-eureka</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
@@ -45 +44,0 @@
-
@@ -50 +48,0 @@
-
diff --git a/05.spring-microservices/currency-exchange-service/src/main/java/com/in28minutes/microservices/currencyexchangeservice/CurrencyExchangeServiceApplication.java b/05.spring-microservices/currency-exchange-service/src/main/java/com/in28minutes/microservices/currencyexchangeservice/CurrencyExchangeServiceApplication.java
index b13b9a2..1365699 100644
--- a/05.spring-microservices/currency-exchange-service/src/main/java/com/in28minutes/microservices/currencyexchangeservice/CurrencyExchangeServiceApplication.java
+++ b/05.spring-microservices/currency-exchange-service/src/main/java/com/in28minutes/microservices/currencyexchangeservice/CurrencyExchangeServiceApplication.java
@@ -6 +5,0 @@ import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
-import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
@@ -8,0 +8,2 @@ import org.springframework.context.annotation.Bean;
+import brave.sampler.Sampler;
+
@@ -18,2 +19,2 @@ public class CurrencyExchangeServiceApplication {
- public AlwaysSampler defaultSampler(){
-   return new AlwaysSampler();
+ public Sampler defaultSampler(){
+   return Sampler.ALWAYS_SAMPLE;
diff --git a/05.spring-microservices/git-localconfig-repo b/05.spring-microservices/git-localconfig-repo
--- a/05.spring-microservices/git-localconfig-repo
+++ b/05.spring-microservices/git-localconfig-repo
@@ -1 +1 @@
-Subproject commit d39e38f6ac2764b187de9edefad6fd93b3ee15d6
+Subproject commit d39e38f6ac2764b187de9edefad6fd93b3ee15d6-dirty
diff --git a/05.spring-microservices/limits-service/pom.xml b/05.spring-microservices/limits-service/pom.xml
index 87150fe..9a25127 100644
--- a/05.spring-microservices/limits-service/pom.xml
+++ b/05.spring-microservices/limits-service/pom.xml
@@ -17 +17 @@
-   <version>1.5.2.RELEASE</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Dalston.RC1</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -37 +37 @@
-     <artifactId>spring-cloud-starter-hystrix</artifactId>
+     <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
diff --git a/05.spring-microservices/netflix-eureka-naming-server/pom.xml b/05.spring-microservices/netflix-eureka-naming-server/pom.xml
index 7c23880..2409b12 100644
--- a/05.spring-microservices/netflix-eureka-naming-server/pom.xml
+++ b/05.spring-microservices/netflix-eureka-naming-server/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Finchley.M2</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -35 +35 @@
-     <artifactId>spring-cloud-starter-eureka-server</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
diff --git a/05.spring-microservices/netflix-zuul-api-gateway-server/pom.xml b/05.spring-microservices/netflix-zuul-api-gateway-server/pom.xml
index 93db496..90fff61 100644
--- a/05.spring-microservices/netflix-zuul-api-gateway-server/pom.xml
+++ b/05.spring-microservices/netflix-zuul-api-gateway-server/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Finchley.M2</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -31 +31 @@
-     <artifactId>spring-cloud-starter-eureka</artifactId>
+     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
@@ -36 +36 @@
-     <artifactId>spring-cloud-starter-zuul</artifactId>
+     <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
diff --git a/05.spring-microservices/netflix-zuul-api-gateway-server/src/main/java/com/in28minutes/microservices/netflixzuulapigatewayserver/NetflixZuulApiGatewayServerApplication.java b/05.spring-microservices/netflix-zuul-api-gateway-server/src/main/java/com/in28minutes/microservices/netflixzuulapigatewayserver/NetflixZuulApiGatewayServerApplication.java
index d76a485..df016ad 100644
--- a/05.spring-microservices/netflix-zuul-api-gateway-server/src/main/java/com/in28minutes/microservices/netflixzuulapigatewayserver/NetflixZuulApiGatewayServerApplication.java
+++ b/05.spring-microservices/netflix-zuul-api-gateway-server/src/main/java/com/in28minutes/microservices/netflixzuulapigatewayserver/NetflixZuulApiGatewayServerApplication.java
@@ -7 +6,0 @@ import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
-import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
@@ -9,0 +9,2 @@ import org.springframework.context.annotation.Bean;
+import brave.sampler.Sampler;
+
@@ -20,2 +21,2 @@ public class NetflixZuulApiGatewayServerApplication {
- public AlwaysSampler defaultSampler(){
-   return new AlwaysSampler();
+ public Sampler defaultSampler(){
+   return Sampler.ALWAYS_SAMPLE;
diff --git a/05.spring-microservices/readme.md b/05.spring-microservices/readme.md
index e7d0b93..f8fd6a4 100644
--- a/05.spring-microservices/readme.md
+++ b/05.spring-microservices/readme.md
@@ -106,0 +107,13 @@ You will learn
+## Zipkin Installation
+
+Quick Start Page
+- https://zipkin.io/pages/quickstart
+
+Downloading Zipkin Jar
+- https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec
+
+Command to run
+```
+RABBIT_URI=amqp://localhost java -jar zipkin-server-2.5.2-exec.jar
+```
+
diff --git a/05.spring-microservices/spring-cloud-config-server/pom.xml b/05.spring-microservices/spring-cloud-config-server/pom.xml
index 8f48175..137cf9c 100644
--- a/05.spring-microservices/spring-cloud-config-server/pom.xml
+++ b/05.spring-microservices/spring-cloud-config-server/pom.xml
@@ -17 +17 @@
-   <version>1.5.2.RELEASE</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Dalston.RC1</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
diff --git a/05.spring-microservices/zipkin-distributed-tracing-server/pom.xml b/05.spring-microservices/zipkin-distributed-tracing-server/pom.xml
index 16e1151..e275ad7 100644
--- a/05.spring-microservices/zipkin-distributed-tracing-server/pom.xml
+++ b/05.spring-microservices/zipkin-distributed-tracing-server/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
@@ -25 +25 @@
-   <spring-cloud.version>Finchley.M2</spring-cloud.version>
+   <spring-cloud.version>Finchley.M8</spring-cloud.version>
@@ -31,0 +32 @@
+     <version>2.0.0.M2</version>
diff --git a/07.spring-jdbc-to-jpa/pom.xml b/07.spring-jdbc-to-jpa/pom.xml
index 7dfc3c9..e16b2fd 100644
--- a/07.spring-jdbc-to-jpa/pom.xml
+++ b/07.spring-jdbc-to-jpa/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/08.spring-aop/pom.xml b/08.spring-aop/pom.xml
index 94fa650..9835466 100644
--- a/08.spring-aop/pom.xml
+++ b/08.spring-aop/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.M3</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/09.framework-introductions/02.Maven-Introduction-In-5-Steps/pom.xml b/09.framework-introductions/02.Maven-Introduction-In-5-Steps/pom.xml
index dc0a7b5..f19f35b 100644
--- a/09.framework-introductions/02.Maven-Introduction-In-5-Steps/pom.xml
+++ b/09.framework-introductions/02.Maven-Introduction-In-5-Steps/pom.xml
@@ -18 +18 @@
-   <version>2.0.0.BUILD-SNAPSHOT</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/09.framework-introductions/04.Mockito-Introduction-In-5-Steps/pom.xml b/09.framework-introductions/04.Mockito-Introduction-In-5-Steps/pom.xml
index a088b5b..7537205 100644
--- a/09.framework-introductions/04.Mockito-Introduction-In-5-Steps/pom.xml
+++ b/09.framework-introductions/04.Mockito-Introduction-In-5-Steps/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.BUILD-SNAPSHOT</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/pom.xml b/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/pom.xml
index ec0eb6d..3213cd1 100644
--- a/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/pom.xml
+++ b/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/pom.xml
@@ -17 +17 @@
-   <version>2.0.0.BUILD-SNAPSHOT</version>
+   <version>2.0.0.RELEASE</version>
diff --git a/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/src/main/resources/application.properties b/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/src/main/resources/application.properties
index 4b07b72..de5a277 100644
--- a/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/src/main/resources/application.properties
+++ b/09.framework-introductions/05.Spring-Boot-Introduction-In-10-Steps/src/main/resources/application.properties
@@ -2 +2,2 @@
-management.security.enabled=false
\ No newline at end of file
+#management.security.enabled=false
+management.endpoints.web.exposure.include=*
\ No newline at end of file

```

## More Changes
- Add Restart whereever a Restart is needed
- Spring Boot - Unable to find setter method for commandName
- Spring Tools Plugin - Simple Video
- Spring Boot Unit Tests

# Other Stuff

## OAuth 2, Transaction Management
- transaction management and Oauth 2 - how to achieve transaction management across micro service ? how to implement Oauth 2
Check out this article - great start for thinking about transaction management.  

https://www.nginx.com/blog/event-driven-data-management-microservices/

OAuth2 - This is a great guide to get started - https://spring.io/guides/tutorials/spring-boot-oauth2/
- Why Spring?

## Limits Service is Not Working
Hye ranga im also getting ouput as 0 and 0 ,and when i see in console it was able to fetch config from server at http://localhost:8888 and on the second line its saying 

Could not locate PropertySource: I/O error on GET request for "http://localhost:8888/limits-service/default": Connection refused: connect; nested exception is java.net.ConnectException: Connection refused: conn

Can you give this a try?
file:\\\C:/Users/SOME-FOLDER/git-localconfig-repo


## Answers to Questions
application.properties to bootstrap.properties
application.properties -> Typical Spring Boot Configuration file.

bootstrap.properties -> When we use Spring Cloud Config Server, the configuration is in the config server. In this case, we use bootstrap.properties to specify the location of config server.

The current code event works with @ControllerAdvice annotation alone. What is benefit that we get by adding the @RestController annotation.
@RestControllerAdvice
https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestControllerAdvice.html
@RestController (because of @ResponseBody) indicates that return value of method will be the response returned for the request. However, since Java object cannot be part of a HTTP response, the object is transformed to the request response format using format converters. 

A better option is to use @RestControllerAdvice instead of both @RestController and @ControllerAdvice.
Here’s the Java Doc - https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/bind/annotation/RestControllerAdvice.html

RestControllerAdvice = ControllerAdvice + ResponseBody

Could not locate PropertySource: I/O error on GET request for "http://localhost:8888/limits-service/default": Connection refused: connect; nested exception is 

java.net.ConnectException: Connection refused: connect


### Scope of a microservice

I have one very basic doubt on how to decide if this is the scope of microservice.

For example If I have to create microservices for Employee Software,

So  1. Will Insert, update, Delete Employee should be part of microservice? 

2. Department information in which Employee belongs should be part of another Service?

Could you please help me with some pointer, details, ref ... so that I can understand how to break requirement into microservices? Because just mentioning that it should serve one specific business need, should be  deployable seprately doent helping much in practical scenario,

The scope of the microservice is the most difficult choice you have to make. There is no one good answer to it.

One thing I can confirm is that all operations (insert, update, delete) should be part of the same micro service.

However, should Employee be a micro service on its own? Can I combine with Department? These are things that we will not be able to answer unless we know the business domain, how they would evolve, how dependent these are and what are the relative sizes?

A good starting point is to understand Bounded Context. https://martinfowler.com/bliki/BoundedContext.html

Use that as the starting point but be flexible to allow evolution of it.

I think the thought process about transaction management should be a little different with micro services. As you can read here - https://softwareengineering.stackexchange.com/questions/290917/what-is-the-most-accepted-transaction-strategy-for-microservices - it is a very complex topic.

Here’s a good description of an event driven solution - https://www.nginx.com/blog/event-driven-data-management-microservices/

## Deployment of Microservices
I’ve seen a number of installations of micro services using embedded tomcat!

Docker is an awesome containerisation tool. You can check out how to use it in combination with spring boot here - https://spring.io/guides/gs/spring-boot-docker/
