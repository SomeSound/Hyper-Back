CREATE TABLE ARTIST (
	ID BIGINT NOT NULL,
    CUSTOMER_ID VARCHAR(20) NOT NULL,
    CREDITS DECIMAL NOT NULL
);

ALTER TABLE ARTIST ADD PRIMARY KEY (ID);
ALTER TABLE ARTIST ADD CONSTRAINT ARTIST_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID);