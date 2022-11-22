# web-automation

## Bdd Cucumber Test Automation Framework

- This is a Maven based framework
- `pom.xml`has everything you need to create and run the tests. All required dependencies was added

The following folder `src/test/java/resources/driver/features`

- `RunnerTest` - contains the CucumberOptions which runs the BDD's

## Steps to execute this project

- Pre-requisites
    - JAVA SDK 1.8 or higher
    - Maven Build tool

- Steps
    - Clone the project to local
    - Got on command line or any IDE that supports JAVA & Maven dependencies
    - We may need to import the Maven dependencies (Scope got set to Compile for Newly added dependencies in pom.xml)
    - Command to Execute : `mvn verify`
    - Alternatively, we can right click on future file and run the scenario
    - Result will be captured in `target folder` 

