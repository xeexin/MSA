CREATE USER smile IDENTIFIED BY oracle;


GRANT connect, resource TO smile;

GRANT
    CREATE SESSION,
    CREATE TABLE,
    CREATE VIEW,
    CREATE SEQUENCE,
    CREATE PROCEDURE
TO smile;

select * from smile.tt;

select * from heejin.emp2;


