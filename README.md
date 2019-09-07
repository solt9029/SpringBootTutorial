# Tutorial: SpringBoot

## Environment
- IntelliJ (Follow this step: https://casualdevelopers.com/tech-tips/how-to-setup-springboot-with-devtools-on-intellij-ide/ & Install lombok plugin)
- Java: "1.8.0_192"

## Docker
```sh
docker-compose up mysql
cd app
./gradlew build
cd ../
docker-compose up -d
```

## Check
```sh
curl http://localhost:8080/posts -X POST -H "Content-Type: application/json" -d '{"title": "post title"}'
curl http://localhost:8080/posts/1/comments -X POST -H "Content-Type: application/json" -d '{"content": "comment content"}'
```

## Tech
- redis cacheable
- aop
- jpa repository
- transactional
- validation
- db relationship
- lombok
- flyway
