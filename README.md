# Tutorial: SpringBoot with Docker

## Environment
- IntelliJ (Follow this step: https://casualdevelopers.com/tech-tips/how-to-setup-springboot-with-devtools-on-intellij-ide/ )
- Java: "1.8.0_192"

## Setup
### For Local Development
- Just open IntelliJ and run application class!

### For Docker Development
```
cd app
./gradlew build
cd ../
docker-compose up -d
```