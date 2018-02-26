### General constraints as Assertions

```mariadb
CREATE ASSERTION SAL_CONSTR CHECK(NOT EXIST(SELECT * FROM EMPLOYEE E,EMPLOYEE M,DEPARTMENT D WHERE E.Salary > M.Salary AND E.DNO = D.NUMBER AND D.Mgr.SSN = M.SSN));
```

- Creates a general constraint named SAL_CONSTR that ensures that there DOES NOT EXIST a employee (EMPLOYEE E) such that his SALARY is greater than the Manager ( EMPLOYEE M) SALARY.

###Triggers

```mariadb
CREATE TRIGGER SAL_VIOLATION BEFORE INSERT OR UPDATE OF SALARY,SUPERVISOR_SSN ON EMPLOYEE FOR EACH ROW WHEN (NEW.SALARY >(SELECT SALARY FROM EMPLOYEE WHERE SSN = NEW.SUPERVISOR_SSN) INFORM_SUPERVISOR(NEW.SUPERVISOR_SSN);
```

A **trigger** consists of **3 parts.**

1. Event

2. Condition

3. Action

   > In the given example, Insertion or updation of salary or supervisor's SSN is the event. The salary of the employee being more than the supervisor's salary is the condition, and informing the supervisor is the action.

### Creating Views

```mariadb
CREATE VIEW WORKS_ON AS SELECT Fname,Lname,Dname,Hours FROM EMPLOYEE,PROJECT,WORKS_ON, WHERE Ssn = Essn AND Pno = ProjectNo;
```



> The above statements creates a view as shown 

| Fname | Lname | Pname | Hours |
| ----- | ----- | ----- | ----- |
|       |       |       |       |

```mariadb
CREATE VIEW DEPT_INFO(Dept.name,No. of employees,Total Salary) AS SELECT Dname,COUNT(*),SUM(Salary) FROM
DEPARTMENT, EMPLOYEE WHERE Dnumber = Dno GROUP BY Dnumber;
```

### Droping View

```mariadb
DROP VIEW WORKS_ON
```

#### About Views

- Views should always be up-to date
- View is not realized or materialized at the time of View definition , but when we specify a query 
- View implementation 
  1. Query Modification
  2. View Materialization
  3. Incremental Update - Automatically updating the view when the base tables are updated
- A view with a single defining table is updatable if the view attributes contain the primary key of the base relation as well as all other attributes with NULL constraints
- View defined on multiple tables using JOINS are not updatable
- Views defined using GROUPING and AGGREGATE functions are not updatable

