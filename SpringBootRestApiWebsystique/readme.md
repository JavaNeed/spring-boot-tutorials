SpringBootRestApiWebsystique
---------------------------------


curl -vvv http://localhost:8080/SpringBootRestApi/api/user

curl -vvv http://localhost:8080/SpringBootRestApi/api/user/1

curl -vvv http://localhost:8080/SpringBootRestApi/api/user/45

curl -H "Content-Type: application/x-www-form-urlencoded;charset=UTF-8" -X POST -d '{"name":"sarah", "age": 51, "salary": 40000}' http://localhost:8080/SpringBootRestApi/api/user/


curl -X POST -d '{"name":"sarah", "age": 51, "salary": 40000}' http://localhost:8080/SpringBootRestApi/api/user/