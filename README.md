# SpringBoot
Spring Boot项目。配置了druid+mybatis+redis。同时项目中使用了pagehelper的分页插件
## 打成jar包
```bash
cd 项目跟目录（和pom.xml同级）
mvn clean package
## 或者执行下面的命令
## 排除测试代码后进行打包
mvn clean package  -Dmaven.test.skip=true
```
## 启动jar
```bash
java -jar  target/项目名称-版本号.jar
```
## RabbitMq
项目整合了RabbitMq。代码在rabbitmq分支上面
## redis
项目整合了Redis，其中version分支上是springboot2.0.1的Redis配置。springboot2.0之后Redis配置和之前的有点区别。
## docker
docker部署代码在docker分支上面。