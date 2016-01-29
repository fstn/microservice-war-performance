# microservice-war-performance

Deploy all war on wildly 8

to build:
gradle.bat wars

to call:
POST: http://localhost:8080/api/rest/validateInvoice
{"invoice":{"batchName":"br42545","amount":12.2}}