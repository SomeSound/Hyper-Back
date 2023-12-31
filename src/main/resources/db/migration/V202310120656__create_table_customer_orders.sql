CREATE TABLE CUSTOMER_ORDERS (
	CUSTOMER_ID VARCHAR(20) NOT NULL,
    ORDER_ID BIGINT NOT NULL
);

ALTER TABLE CUSTOMER_ORDERS ADD CONSTRAINT CUSTOMER_ORDERS_CUSTOMER_ID_FK FOREIGN KEY (CUSTOMER_ID) REFERENCES CART(CUSTOMER_ID);
ALTER TABLE CUSTOMER_ORDERS ADD CONSTRAINT CUSTOMER_ORDERS_ORDER_ID_FK FOREIGN KEY (ORDER_ID) REFERENCES _ORDER(ID);
