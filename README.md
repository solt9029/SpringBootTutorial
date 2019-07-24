# Tutorial: SpringBoot with Docker

## Environment
- IntelliJ (Follow this step: https://casualdevelopers.com/tech-tips/how-to-setup-springboot-with-devtools-on-intellij-ide/ & Install lombok plugin)
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

## Check
### Insert Data into Book Table
```bash
curl http://localhost:8080/books -X POST -H "Content-Type: application/json" -d '{"name": "book name"}'
```