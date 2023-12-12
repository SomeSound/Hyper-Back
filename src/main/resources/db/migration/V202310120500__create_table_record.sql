CREATE TABLE RECORD (
	ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT,
    NAME VARCHAR(50) NOT NULL,
    COUNTRY VARCHAR(20) NOT NULL,
    DESCRIPTION VARCHAR(255)
);

ALTER TABLE RECORD ADD PRIMARY KEY (ID);