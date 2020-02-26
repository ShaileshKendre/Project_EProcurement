Shailesh Script:

DROP TABLE IF EXISTS Vehicles;
CREATE TABLE Vehicles (
 vehicle_no VARCHAR(10) NOT NULL,
 loaded_wt INT,
 max_load INT,
 PRIMARY KEY (vehicle_no));

 
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