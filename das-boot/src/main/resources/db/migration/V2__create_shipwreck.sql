/*CREATE TABLE SHIPWRECK(
	ID INT AUTO_INCREMENT,
	NAME VARCHAR(255),
	DESCRIPTION VARCHAR(2000),
	CONDITION VARCHAR(255),
	DEPTH INT,
	LATITUDE DOUBLE,
	LONGITUDE DOUBLE,
	YEAR_DISCOVERED INT
);
*/

CREATE TABLE `dasboot`.`shipwreck` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `SHIPWRECKNAME` VARCHAR(255) NULL,
  `DESCRIPTION` VARCHAR(2000) NULL,
  `CONDITIONS` VARCHAR(255) NULL,
  `DEPTH` INT NULL,
  `LATITUDE` DOUBLE NULL,
  `LONGITUDE` DOUBLE NULL,
  `YEAR_DISCOVERED` INT NULL,
  PRIMARY KEY (`ID`));
