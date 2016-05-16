SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Module_Data_Collection;
DROP TABLE IF EXISTS Data_Collection;
DROP TABLE IF EXISTS Performance_Problems;
DROP TABLE IF EXISTS Problem_Comments;
DROP TABLE IF EXISTS Problems;
DROP TABLE IF EXISTS Sub_Module;
DROP TABLE IF EXISTS Module;
DROP TABLE IF EXISTS Version;
DROP TABLE IF EXISTS Product;




/* Create Tables */

CREATE TABLE Data_Collection
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Name varchar(200),
	STEPS text NOT NULL,
	PRODUCT_ID bigint NOT NULL,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Module
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Name varchar(200) NOT NULL,
	Description text,
	-- Data OnTap Suport
	DOT_Support varchar(100) COMMENT 'Data OnTap Suport',
	VERSION_ID bigint NOT NULL,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Module_Data_Collection
(
	Module_ID bigint NOT NULL,
	SET_ID bigint NOT NULL,
	PRIMARY KEY (Module_ID, SET_ID)
);


-- This is seperated to accomodate the multiple specific config
CREATE TABLE Performance_Problems
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Configuration text NOT NULL,
	Host_Configuration text,
	PRIMARY KEY (ID),
	UNIQUE (ID)
) COMMENT = 'This is seperated to accomodate the multiple specific config';


CREATE TABLE Problems
(
	ID bigint NOT NULL AUTO_INCREMENT,
	TITLE text NOT NULL,
	Log_Message text NOT NULL,
	Troubleshooting_Steps text NOT NULL,
	Additional_Data_Collection text,
	Burt_Numbers text,
	Case_Numbers text,
	submitter varchar(200) NOT NULL,
	Environment_Details text,
	DOT_Details varchar(100) NOT NULL,
	Rating bigint,
	Module_ID bigint NOT NULL,
	Sub_Module_ID bigint,
	PRODUCT_ID bigint NOT NULL,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Problem_Comments
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Comments text,
	Submitter varchar(200) NOT NULL,
	State varchar(100) NOT NULL,
	Problem_ID bigint NOT NULL,
	Date_of_submission date,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Product
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Name varchar(200) NOT NULL,
	dl varchar(200),
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Sub_Module
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Name varchar(200) NOT NULL,
	Description text,
	Module_ID bigint NOT NULL,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);


CREATE TABLE Version
(
	ID bigint NOT NULL AUTO_INCREMENT,
	Number varchar(200) NOT NULL,
	Name varchar(200),
	Release_Date date,
	PRODUCT_ID bigint NOT NULL,
	PRIMARY KEY (ID),
	UNIQUE (ID)
);



/* Create Foreign Keys */

ALTER TABLE Module_Data_Collection
	ADD FOREIGN KEY (SET_ID)
	REFERENCES Data_Collection (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Module_Data_Collection
	ADD FOREIGN KEY (Module_ID)
	REFERENCES Module (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Problems
	ADD FOREIGN KEY (Module_ID)
	REFERENCES Module (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Sub_Module
	ADD FOREIGN KEY (Module_ID)
	REFERENCES Module (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Performance_Problems
	ADD FOREIGN KEY (ID)
	REFERENCES Problems (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Problem_Comments
	ADD FOREIGN KEY (Problem_ID)
	REFERENCES Problems (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Data_Collection
	ADD FOREIGN KEY (PRODUCT_ID)
	REFERENCES Product (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Problems
	ADD FOREIGN KEY (PRODUCT_ID)
	REFERENCES Product (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Version
	ADD FOREIGN KEY (PRODUCT_ID)
	REFERENCES Product (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Problems
	ADD FOREIGN KEY (Sub_Module_ID)
	REFERENCES Sub_Module (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Module
	ADD FOREIGN KEY (VERSION_ID)
	REFERENCES Version (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



