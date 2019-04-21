# Tutorial: SpringBoot with Docker

## Environment
- IntelliJ (Follow this step: https://casualdevelopers.com/tech-tips/how-to-setup-springboot-with-devtools-on-intellij-ide/ )
- Java: "1.8.0_192"

## Setup
### For Local Development
```bash
cd app/src/main/resources/
cp application-dev-local.properties.example application-dev-local.properties
vi application-dev-local.properties # edit config here.
```
- Just open IntelliJ and run application class!

### For Docker Development
```bash
cd app
./gradlew build
cd ../
docker-compose up -d
```