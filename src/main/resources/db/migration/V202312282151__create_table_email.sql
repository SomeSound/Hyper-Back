CREATE TABLE EMAIL (
    ID BIGINT NOT NULL,
    CUSTOMER_ID VARCHAR(20) NOT NULL,
    OWNER VARCHAR(20) NOT NULL,
    EMAIL_FROM VARCHAR(50) NOT NULL,
    EMAIL_TO VARCHAR(50) NOT NULL,
    TEXT VARCHAR(200) NOT NULL,
    SEND_DATE TIMESTAMP,
    STATUS VARCHAR(20),
    CREATED_DATE TIMESTAMP,
    LAST_MODIFIED_DATE TIMESTAMP
);

CREATE SEQUENCE EMAIL_SEQ START WITH 1;

ALTER TABLE LEADS ADD CONSTRAINT EMAIL_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID);