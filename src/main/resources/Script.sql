Shailesh Script:

DROP TABLE IF EXISTS Vehicles;
CREATE TABLE Vehicles (
 vehicle_no VARCHAR(10) NOT NULL,
 loaded_wt INT,
 max_load INT,
 PRIMARY KEY (vehicle_no));

 
 
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
