CREATE TABLE CUSTOMER_FOLLOWS (
    CUSTOMER_ID VARCHAR(20) NOT NULL,
    FOLLOWING_ID VARCHAR(20) NOT NULL
);

ALTER TABLE CUSTOMER_FOLLOWS ADD CONSTRAINT CUSTOMER_FOLLOWS_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID);
ALTER TABLE CUSTOMER_FOLLOWS ADD CONSTRAINT CUSTOMER_FOLLOWS_FOLLOWING_ID_FK FOREIGN KEY (FOLLOWING_ID) REFERENCES FOLLOW(FOLLOWING_ID);