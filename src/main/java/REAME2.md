Login and password for authentication

Role	    PUBLISHER		USER
login:	    publisher		user
password:   publisher1234	user1234
You can see database diagram here

https://docs.google.com/presentation/d/1t1pdqtyW8Wtdm-tc4JrDwY8BhmcTP30x_VM0QUH871w/edit#slide=id.g122680b1d86_1_24

Info about this books you can see in this link or in liquibase files

PUT http://127.0.0.1:8085/v1/books/{bookId}/publishers/{publisherId} success case (1-1, 2-2, 35-9)
Update specific books (PUBLISHER) { "genre": "PROGRAMMING",
"name": "bookName", "pageCount": 150,
"publishingYear": 2002 }
name (NotBlank, NotNull, Size(min=4)) Unique
publishingYear (min = 1940, max=2022) , pageCount(min = 100, max = 800),
genre (NotNull, NotBlank)

GET example
http://127.0.0.1:8085/v1/books?count=10&name=Head First&page=0 get books by name (pagination support) (PUBLISHER, USER)

GET http://127.0.0.1:8085/v1/books?count=10&page=2 get all books (PUBLISHER,USER)

GET http://127.0.0.1:8085/v1/publishers/1 id (1- 13) As a USER to list all books published by specific publisher

POST http://127.0.0.1:8085/v1/publishers/1 id (1-13) As a PUBLISHER to add new book to the book list Request Body (BookDto){ "genre": "TRAVEL",
"name": "bookName", + "pageCount": 150, "publishingYear": 2002 } name (NotBlank, NotNull, Size(min=4)) Unique, publishingYear (min = 1940, max=2022) ,
pageCount(min = 100, max = 800),
genre (NotNull, NotBlank)

GET http://127.0.0.1:8085/v1/authors/{id} id (0 - 38) to see the details of book and author (PUBLISHER,USER)