SQL> CREATE TABLE EMP(
  2  EID VARCHAR (10) NOT NULL PRIMARY KEY ,
  3  ENAME VARCHAR(20) NOT NULL ,
  4  EMOBILE_NO NUMBER (10) NOT NULL,
  5  ADDRESS VARCHAR(20) NOT NULL,
  6  SALARY NUMBER(10) NOT NULL );



SQL> INSERT INTO EMP VALUES ('E101','AMAR',9876543244,'MUMBAI',60000);

1 row created.

SQL> INSERT INTO EMP VALUES('E102','NEHARIKA',8765432133,'HYD',70000);

1 row created.

SQL> INSERT INTO EMP VALUES('E103','RAJESHWARI',7654321055,'PUNE',50000);

1 row created.

SQL> INSERT INTO EMP VALUES('E104','POOJASHRI',6543210966,'DELHI',40000);

1 row created.

SQL> INSERT INTO EMP VALUES('E105','VINAYAK',5432109888,'BANGALORE',90000);

1 row created.

SQL> SELECT * FROM EMP ;

EID        ENAME                EMOBILE_NO ADDRESS                  SALARY
---------- -------------------- ---------- -------------------- ----------
E101       AMAR                 9876543244 MUMBAI                    60000
E102       NEHARIKA             8765432133 HYD                       70000
E103       RAJESHWARI           7654321055 PUNE                      50000
E104       POOJASHRI            6543210966 DELHI                     40000
E105       VINAYAK              5432109888 BANGALORE                 90000




SQL> DELETE FROM EMP WHERE EID='E105';

1 row deleted.

SQL> SELECT * FROM EMP ;

EID        ENAME                EMOBILE_NO ADDRESS                  SALARY
---------- -------------------- ---------- -------------------- ----------
E101       AMAR                 9876543244 MUMBAI                    60000
E102       NEHARIKA             8765432133 HYD                       70000
E103       RAJESHWARI           7654321055 PUNE                      50000
E104       POOJASHRI            6543210966 DELHI                     40000




SQL> UPDATE EMP SET ENAME='VINAYAK' WHERE EID ='E104';

1 row updated.

SQL> SELECT * FROM EMP ;

EID        ENAME                EMOBILE_NO ADDRESS                  SALARY
---------- -------------------- ---------- -------------------- ----------
E101       AMAR                 9876543244 MUMBAI                    60000
E102       NEHARIKA             8765432133 HYD                       70000
E103       RAJESHWARI           7654321055 PUNE                      50000
E104       VINAYAK              6543210966 DELHI                     40000



SQL> SELECT * FROM EMP WHERE ENAME LIKE'N%';

EID        ENAME                EMOBILE_NO ADDRESS                  SALARY
---------- -------------------- ---------- -------------------- ----------
E102       NEHARIKA            8765432133 HYD                       70000