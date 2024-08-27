# ecomDemo
ecomDemo api intergation 

-------------------------------------------------
# How to run project locally
1. go inside sub directory
    cd ecomDemo
2. run command
   mvn spring-boot:run
    
# How to test project locally

## pre-requisite 
1. ecomDemo project will start on  port(8083)
2. there is dependency to run paymentdemo,so need to start project 

## Test Steps
1.	Call submit API from CURL :

Request :

curl --location 'http://localhost:8083/order/submit' \
--header 'Content-Type: application/json' \
--data '{
"customerId":"3434",
"customerName":"Deepak",
"quoteItems":"123",
"amount":"34.456"
}'


Response :

{
"customerId": "3434",
"paymentId": "1765e0a7-e8f5-4842-a74f-a75cd0a2f588",
"paymentStatus": "CREATED"
}

2. Do polling to check payment status

Request:

 curl --location 'http://localhost:8083/order/status?paymentId=1765e0a7-e8f5-4842-a74f-a75cd0a2f588'
 
Response :

 {
 "customerId": "3434",
 "paymentId": "1765e0a7-e8f5-4842-a74f-a75cd0a2f588",
 "paymentStatus": "FAILED"
 }
