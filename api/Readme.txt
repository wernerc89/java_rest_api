mvn clean install

alt + F5 to update maven project

Build project

mvn spring-boot:run

open h2 to console : http://localhost:8080/h2-console

log in with password in application.properties file

run dbscript.sql to create table structure and insert player data

Get Balance : http://localhost:8080/casino/player/1/balance

GET /casino/player/1/balance HTTP/1.1
Host: localhost:8080


Update Balance : http://localhost:8080/casino/player/1/update

POST /casino/player/1/update HTTP/1.1
Content-Type: application/json
Host: localhost:8080
Content-Length: 48

{
	"transactionType": "WIN",
	"amount": 10.0
}


Last 10 Transactions : http://localhost:8080/casino/admin/player/transactions

POST /casino/admin/player/transactions HTTP/1.1
Content-Type: application/json
Host: localhost:8080
Content-Length: 5

TEST1

