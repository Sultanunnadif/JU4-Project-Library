# JU4-Project-Library
Project Based on JUnit4
plugins 
    id 'java'


group = 'org.example'
version = '1.0-SNAPSHOT'

repositories 
    mavenCentral


dependencies
    testImplementation group: 'junit', name: 'junit', version: '4.13.2'
    testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.20.1'
    implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.20.1'
    testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.5.0'
    implementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.5.0'
    implementation group: 'io.cucumber', name: 'cucumber-java8', version: '7.20.1'
    testImplementation 'org.seleniumhq.selenium:selenium-java:4.16.1'
    testImplementation("io.github.bonigarcia:webdrivermanager:5.9.0")
