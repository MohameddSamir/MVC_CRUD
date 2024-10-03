CREATE DATABASE products;

USE products;

CREATE TABLE product(
	id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) DEFAULT NULL,
    price DOUBLE DEFAULT NULL,
    quantity int DEFAULT NULL,
    PRIMARY KEY(id)
    );

INSERT INTO product VALUES
(1,"laptop",5000,6),
(2,"smart phone",3000,9),
(3,"tablet",3550,11),
(4,"smart watch",1200,5);
