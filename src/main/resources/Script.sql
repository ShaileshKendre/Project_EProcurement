Shailesh Script:

DROP TABLE IF EXISTS Vehicles;
CREATE TABLE Vehicles (
 vehicle_no VARCHAR(10) NOT NULL,
 loaded_wt INT,
 max_load INT,
 PRIMARY KEY (vehicle_no));
