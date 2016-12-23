spring-boot-jersey-demo-master
------------------------------
Ref: http://blog.codeleak.pl/2015/01/getting-started-with-jersey-and-spring.html

http://localhost:8080/customer

{"links":[{"rel":"self","href":"http://localhost:8080/customer"}],"content":[{"fullName":"Matthews,Dave","email":"dave@dmband.com","links":[{"rel":"self","href":"http://localhost:8080/customer/1"}]},{"fullName":"Beauford,Carter","email":"carter@dmband.com","links":[{"rel":"self","href":"http://localhost:8080/customer/2"}]},{"fullName":"Tinsley,Boyd","email":"boyd@dmband.com","links":[{"rel":"self","href":"http://localhost:8080/customer/3"}]}]}


http://localhost:8080/customer/1

{"id":1,"firstname":"Dave","lastname":"Matthews","emailAddress":{"value":"dave@dmband.com"},"links":[{"rel":"self","href":"http://localhost:8080/customer/1"}]}

