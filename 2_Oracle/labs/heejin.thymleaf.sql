drop table sales;
--------------------------------------------------------
create table Sales 
(
    id number not null enable, 
    item VARCHAR2(50) not null enable, 
    quantity  number(38, 0) not null enable, 
    amount  FLOAT(126),
    CONSTRAINT sales_pk PRIMARY key(id)
);

---------------------------------------------------
drop SEQUENCE sale_sequence;
--------------------------------------------------
CREATE SEQUENCE SALE_SEQUENCE
    MINVALUE 1 
    MAXVALUE 100000 
    INCREMENT BY 1 
    START WITH 1;

select * from sales;
---------------------------------------------------------
CREATE OR REPLACE TRIGGER SALE_PRIMARY_KEY_TRG
    BEFORE INSERT ON Sales
    FOR EACH ROW
        BEGIN
           IF :NEW.ID IS NULL THEN
              SELECT SALE_SEQUENCE.NEXTVAL INTO :NEW.ID FROM dual;
           END IF;
        END;
--    end loop;


select SALE_SEQUENCE.nextval from dual;

ALTER TRIGGER SALE_PRIMARY_KEY_TRG COMPILE;
SHOW ERRORS TRIGGER SALE_PRIMARY_KEY_TRG;

drop trigger SALE_PRIMARY_KEY_TRG;
----------------------------------------------
commit;

desc sales;

SELECT trigger_name, status
    FROM user_triggers
    WHERE trigger_name = 'SALE_PRIMARY_KEY_TRG';
    
SHOW ERRORS TRIGGER SALE_PRIMARY_KEY_TRG;

SELECT * 
FROM user_errors 
WHERE name = 'SALE_PRIMARY_KEY_TRG' AND type = 'TRIGGER';