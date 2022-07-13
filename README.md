Multi module maven project

Create Multi module maven project Spring Boot

•	The parent project will work as a container for base maven configurations.

•	The child modules will be actual spring boot projects – inheriting the maven properties from the parent project.


Parent Spring Boot Project
The parent project is single point to trigger build process for all the modules and optionally generate a deployable package (e.g., ear, war, etc.). 

The pom.xml file consists of the list of all modules and common dependencies and properties inherited by child projects.

As we are creating a spring boot project, we need to add spring-boot-starter-parent dependency. It is the parent POM providing dependency and plugin management for Spring Boot-based applications.

It contains the default versions of Java to use, the default versions of dependencies that Spring Boot uses, and the default configuration of the Maven plugins.

 

Parent pom.xml - UserManagementMultiModuleApp
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.dpworld</groupId>
    <artifactId>UserManagementMultiModuleApp</artifactId>
    <version>1.0.0</version>
    <name>UserManagementMultiModuleApp</name>
    <packaging>pom</packaging>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.8</version>
        <relativePath /> <!-- lookup parent from repository -->
    </parent>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>11</java.version>
        <spring-cloud.version>Greenwich.SR2</spring-cloud.version>
    </properties>
    <modules>
        <module>User-ManagementService</module>
        <module>User-PersonalDetailsService</module>
        <module>User-MiscDetailsService</module>
    </modules>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>

In our parent project don't contains source code so, just add this to your parent pom.xml:
<packaging>pom</packaging>

Child Projects
Now we can remove properties in child poms, which are already defined in parent pom.xml like – spring-parent-version, java version 
•	Place UserManagementMultiModuleApp as parent project in all child module poms
•	Remove child module specific versions
<?xml version="1.0" encoding="UTF-8"?>
<project>
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>com.dpworld</groupId>
        <artifactId>UserManagementMultiModuleApp</artifactId>
        <version>1.0.0</version>
    </parent>

    <groupId>com.dpworld</groupId>
    <artifactId>User-ManagementService</artifactId>
    <name>User-ManagementService</name>
    <description>Spring Boot ManagementService POC</description>

    <dependencies>
        <dependency>
		-- All Dependencies ---
        </dependency>
    </dependencies>
</project>


Build and Run Root Project
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for UserManagementMultiModuleApp 1.0.0:
[INFO] 
[INFO] UserManagementMultiModuleApp ....................... SUCCESS [  0.908 s]
[INFO] User-ManagementService ............................. SUCCESS [ 18.811 s]
[INFO] User-PersonalDetailsService ........................ SUCCESS [  9.056 s]
[INFO] User-MiscDetailsService ............................ SUCCESS [  0.495 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  29.505 s



Ref.
https://www.codejava.net/frameworks/spring-boot/create-multi-module-maven-project
https://howtodoinjava.com/spring-boot2/sb-multi-module-maven-project/

![image](https://user-images.githubusercontent.com/20472904/178669468-bbcb282e-00b4-4b8f-bbf6-e0b1266c4739.png)
