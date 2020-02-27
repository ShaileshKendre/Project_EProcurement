Shailesh Script:

DROP TABLE IF EXISTS Vehicles;
CREATE TABLE Vehicles (
 vehicle_no VARCHAR(10) NOT NULL,
 loaded_wt INT,
 max_load INT,
 PRIMARY KEY (vehicle_no));

  shankar:
 
 shankar Script
 DROP TABLE IF EXISTS trucks_list;
CREATE TABLE trucks_list (
 id INT,
 Truck_No VARCHAR(40) NOT NULL,
 Truck_Name VARCHAR(40) NOT NULL,
 Truck_Company VARCHAR(40) NOT NULL,
 Truck_Owner VARCHAR(40) NOT NULL,
 DriverMoNo VARCHAR(40) NOT NULL,
 PRIMARY KEY (id));
 
 Bhagyashree Script:
 
 DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(45) DEFAULT NULL,
  `sphone` bigint(12) DEFAULT NULL,
  `saddress` varchar(45) DEFAULT NULL,
  `semailid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sid`)
);
 
Shashikant Script:
 
 DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `phone`varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);