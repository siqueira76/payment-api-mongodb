# payment-api-mongodb
# Payment Sample Web Service RESTful with Spring Boot
 The payment-api-mongodb API to process payments, using Maven and make a CRUD based REST service.
 
For this project was used following tools and technologies.

Java 1.8

STS 2.1.2.RELEASE

Maven 4.0.0

POSTMan (optional)

## Services:


##### REST Endpoint `/transactions/{id}` HTTP Method `POST` Description `Send the payment information`
##### REST Endpoint `/transactions` HTTP Method `GET` Description `Returns a List with all transactions`
##### REST Endpoint `/clients` HTTP Method `POST` Description `Returns a list with all clients on the database`


## JSON for the REST Endpoint `/transactions/{id}` HTTP Method `POST`:

* ##### Sample

      `{
 
    "buyer": {
        "id": null,
        "name": "teste2",
        "email": "llllllllllllllllllll@gmail.com",
        "cpf": "9817366464"
    },
    "payment": {
        "id": null,
        "amount": 1000,
        "type": "CARTAO"
    },
    "card": {
        "id": null,
        "holderName": "Junior",
        "expiiration": "2018-03-21T00:00:00.000+0000",
        "cvv": "143"
    }
}`
