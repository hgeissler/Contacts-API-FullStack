# Contacts-API-FullStack
Fullstack API built with Java Spring Boot, React.js and Materializecss

# GIT CLONE:
  - git clone --recursive https://github.com/hgeissler/Contacts-API-FullStack.git
  - // --recursive needed, because client is a submodule 
  


# Development Process:
### Required: VS Code, JDK 1.8, Spring Boot, Spring initializr
- // correct "java.home" in vscode settings.json ! 

### SETUP
  - https://spring.io > projects > spring boot > quick start > spring initializr
  - Select: > Maven Project > Java > 2.2.2 > Group: com.crm > Artifact: crm
  - Dependencies: rest repositories, jpa, h2, lombok
  - Generate Project

  - npx create-react-app client


- crm>src>main>java>com>crm>crm> new Folder: model > new File: Contact.java
- // Define first model class

- crm>src>main>java>com>crm>crm>model> new File ContactRepository.java
- //JPA repository (database sql)

- crm>src>main>java>com>crm>crm>model> new File DemoLoader.java
- // test model connected to database with this demo

- crm>src>main>java>com>crm>crm>model> new File ReactAndSpringDataRestApplication.java
- // Finalize API Endpoints for Frontend and Backend

- crm>src>main>resources edit File: application.properties
- // set URL for the API

### START SERVER
  - now run/debug to start server (chose ReactAndSpringDataRestApplication), then:

### START CLIENT
  - open terminal in client folder and > npm start

### Materializecss
  - // A modern responsive front-end framework based on Material Design
  - go to http://materializecss.com > Get started > Copy CDN > Paste into public/index.html

### After Frontend is finished:
  - Add RepositoryRestResource to ContactRepository and create ContactsController
  - // for CORS !
