CREATE TABLE `orders` (
  `oid` varchar(255) NOT NULL,
  `order_date` varchar(45) DEFAULT NULL,
  `order_items` varchar(45) DEFAULT NULL,
  `cust_name` varchar(45) DEFAULT NULL,
  `cust_no` varchar(45) DEFAULT NULL,
  `cust_add` varchar(45) DEFAULT NULL,
  `prod_name` varchar(45) DEFAULT NULL,
  `prod_color` varchar(45) DEFAULT NULL,
  `orderstatus` varchar(255) DEFAULT NULL,
  `paymentmethod` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  UNIQUE KEY `oid_UNIQUE` (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci