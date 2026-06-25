# Homework

## 1. List of Spring Annotations Learned So Far

### Stereotype Annotations

* `@Component` – Generic Spring-managed bean.

### Dependency Injection Annotations

* `@Autowired` – Automatically injects dependencies.
* `@Qualifier` – Specifies which bean to inject when multiple implementations exist.
* `@Primary` – Marks a bean as the default choice.
* `@Value` – Injects values from properties files.

### Configuration Annotations

* `@Configuration` – Defines a configuration class.
* `@Bean` – Creates and manages a bean manually.
* `@ComponentScan` – Scans packages for Spring components.
* `@PropertySource` – Loads external property files.

### Spring Boot Annotations

* `@SpringBootApplication` – Main Spring Boot annotation.
* `@EnableAutoConfiguration` – Enables auto-configuration.
* `@ConfigurationProperties` – Maps configuration properties to Java objects.

### Lifecycle Annotations

* `@PostConstruct`
* `@PreDestroy`

### Testing Annotations

* `@SpringBootTest`
* `@MockBean`
* `@Test`

---

## 2. Scenarios Where Spring Framework Is More Useful Than NodeJS

Spring Framework is particularly useful for large-scale enterprise applications that require strong security, complex business logic, transaction management, and long-term maintainability. Industries such as banking, insurance, healthcare, railway reservation systems, and ERP solutions commonly use Spring because Java provides strong type safety, better code organization, and a mature ecosystem. Features such as Dependency Injection, Aspect-Oriented Programming (AOP), Spring Security, and robust transaction management make it easier to build reliable and scalable applications. Spring is also well-suited for large development teams because it encourages structured architecture and compile-time error checking. While NodeJS is excellent for real-time applications, lightweight APIs, and rapid prototyping, Spring Framework is often preferred for complex enterprise systems that require stability and long-term support.

---

## 3. Scenarios Where Spring Boot Is More Useful Than Spring Framework

Spring Boot is useful when developers want to build and deploy applications quickly without spending time on extensive configuration. It provides auto-configuration, starter dependencies, and embedded servers such as Tomcat, Jetty, and Undertow, which significantly reduce setup effort. Spring Boot is especially beneficial for developing REST APIs, microservices, and cloud-native applications because it offers production-ready features like health monitoring, metrics, and application management through Spring Boot Actuator. It also simplifies dependency management and improves developer productivity through tools such as Spring DevTools. Since Spring Boot includes all the capabilities of the Spring Framework while reducing boilerplate configuration, it is generally the preferred choice for modern Java application development.
