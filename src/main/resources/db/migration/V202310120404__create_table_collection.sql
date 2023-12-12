CREATE TABLE COLLECTION (
	ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT,
    CUSTOMER_ID VARCHAR(20) NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    DESCRIPTION VARCHAR(255)
);

ALTER TABLE COLLECTION ADD PRIMARY KEY (ID);
ALTER TABLE COLLECTION ADD CONSTRAINT COLLECTION_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID);