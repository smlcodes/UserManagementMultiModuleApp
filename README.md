# Multi module maven project

Create Multi module maven project Spring Boot

•	The parent project will work as a container for base maven configurations.

•	The child modules will be actual spring boot projects – inheriting the maven properties from the parent project.

## Parent Spring Boot Project

The parent project is single point to trigger build process for all the modules and optionally generate a deployable package (e.g., ear, war, etc.).

The pom.xml file consists of the list of all modules and common dependencies and properties inherited by child projects.

As we are creating a spring boot project, we need to add spring-boot-starter-parent dependency. It is the parent POM providing dependency and plugin management for Spring Boot-based applications.

It contains the default versions of Java to use, the default versions of dependencies that Spring Boot uses, and the default configuration of the Maven plugins.

Parent pom.xml - UserManagementMultiModuleApp
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

```modelversion4.0.0
groupidcom.dpworld
artifactidUserManagementMultiModuleApp
version1.0.0
<name>UserManagementMultiModuleApp</name>


packagingpomparent
    groupidorg.springframework.boot
    artifactidspring-boot-starter-parent
    version2.6.8
    relativepath  lookup parent from repository 


properties
    project.build.sourceencodingUTF-8
    project.reporting.outputencodingUTF-8
    java.version11
    spring-cloud.versionGreenwich.SR2

modules
    moduleUser-ManagementService
    moduleUser-PersonalDetailsService
    moduleUser-MiscDetailsService


dependencies
    dependency
        groupidorg.springframework.boot
        artifactidspring-boot-starter-test
  
<scope>test</scope>
```

</project>

In our parent project don't contains source code so, just add this to your parent pom.xml:
<packaging>pom</packaging>

### Child Projects

Now we can remove properties in child poms, which are already defined in parent pom.xml like – spring-parent-version, java version
•	Place UserManagementMultiModuleApp as pareznt project in all child module poms
•	Remove child module specific versions

```?xml
modelversion4.0.0
    parent
        groupidcom.dpworld
        artifactidUserManagementMultiModuleApp
        version1.0.0
  
    4.0.0
  
        com.dpworld
        UserManagementMultiModuleApp
        1.0.0
    groupidcom.dpworld
artifactidUser-ManagementService
<name>User-ManagementService</name>


descriptionSpring Boot ManagementService POCdependencies
    dependency
	-- All Dependencies ---
  


  
	-- All Dependencies ---
```

```Build
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
```

Ref.
https://www.codejava.net/frameworks/spring-boot/create-multi-module-maven-project
https://howtodoinjava.com/spring-boot2/sb-multi-module-maven-project/

