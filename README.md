# JU4-Project-Library
Project Based on JUnit4
Tujuan Project : 
- Test login dengan valid account & invalid acccount
- Pengecekan hasil data apakah sekiranya sesuai dengan database
- Pencarian Bugs dalam proses pengecekan

konfigurasi depedencies yang digunakan :

testImplementation group: 'junit', name: 'junit', version: '4.13.2'
testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.20.1'
implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.20.1'
testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.5.0'
implementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.5.0'
implementation group: 'io.cucumber', name: 'cucumber-java8', version: '7.20.1'
testImplementation 'org.seleniumhq.selenium:selenium-java:4.16.1'
testImplementation("io.github.bonigarcia:webdrivermanager:5.9.0")

task pada build menggunakan cucumber runner :
task cucumber(){
    description("Running Cucumber Test")
    dependsOn assemble, compileTestJava
    doLast {
        javaexec {
            mainClass.set("io.cucumber.core.cli.Main") // Gunakan mainClass.set
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = [
                    '--plugin', 'html:reports/test-report.html',
                    '--plugin', 'pretty',
                    '--glue', 'com.nadif',
                    '--tags', System.getProperty("tags", ""), // Properti tags
                    'src/test/resources'
            ]
        }
    }
}

Cara Pengujian :

Positive Test :
1. user dalam login page
2. user input email
3. user input password
4. user click login
5. user berada dalam halaman utama

Negative Test :
1. user dalam login page
2. user input email
3. user input password
4. user click login
5. user gagal masuk ke halaman utama
6. user melihat error message pada halaman login

Boundary Test :
1. user berada dalam halaman utama
2. user memasukkan link website utam login (refresh)
3. user berada di halaman utama login
4. user tidak dapat masuk halaman utama karena user di anggap log out

Lokasi Tujuan Project :
1. Step Definition : src/test/java/com/nadif/stepdefinition
2. pages website tujuan test : src/test/java/com/nadif/pages
3. Lokasi CucumberRunner : src/test/java/com/nadif/runner
4. Feature Gherkin : src/test/resource/features

test menggunakan Cucumber runner untuk mejalankan step defitinion test secara menyeluruh dengan option :
glue = "com.nadif.stepdefinition",
features = "src/test/resources/features",
plugin = {"pretty","html:reports/StepDefinitionReport.html","json:reports/StepDefinitionReport.json"}
