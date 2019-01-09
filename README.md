# Spring Cloud

## Server list
1. gateway-service: Zuul
2. discovery-service: Eureka Server
3. greeting-service, board-service, unstable-service: Eureka Client
 * board-service implements FeignClient and Hystrix Circuit break feature

## TEST
1. Zuul Routing
```
http://localhost:8080/greeting-service/hello
http://localhost:8080/unstable-service/hello
```

2. FeignClient
board-service call greeting-service's hello api)
```
http://localhost:8080/board-service/greeting/hello
```
 
3. Hystrix Circuit Breaker
  - shutdown unstable-service
```
  http://localhost:8080/board-service/unstable/hello
```