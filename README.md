### 使用Spring RestTemplate简单实现服务之间的restful调用


### 项目结构:
```
  ├─micro-service-provider    服务提供者模块
  ├─micro-service-consumer    消费者端模块
  ├─.gitignore                .gitignore文件
  ├─README.md                 README.md文件
  └─pom.xml                   父模块pom文件
 ```

### 如何运行:
  1. 进入micro-service-provider模块下启动服务提供者;
  
  2. 进入micro-service-consumer模块下启动消费者;
  
  3. 浏览器访问 `http:localhost:8900/user/1001` 测试服务间的调用;
  
  