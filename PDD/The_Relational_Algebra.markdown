## Relational Algebra Operators
 ### Unary 
  ```sql
  SELECT (σ)
  PROJECT (π)
  RENAME (ρ)
  ```
  ### From Set Theory
  ```sql
  UNION ( U )
  INTERSECTION ( ∩ )
  CARTESIAN PRODUCT ( or / -)
  ```
  ### Binary Realtional Operation
  ```sql
  JOIN

  ```


  #### SELECT operation
  ```sql
  SELECT employee  FROM company WHERE salary > 30000
```
The Algebra equivalent is

 σ<sub>salary  >  30000 </sub> (employee)

#### PROJECT operation
```sql

PROJECT fname ,lname FROM employee
```
The Algebra equivalent is

π<sub>fname,lname</sub>(EMPLOYEE)

**Q1.**  Retrieve the first name last name and salary of all employees who work in dept number 5

π<sub>fname,lname,salary</sub>(σ<sub>Dept.No = 5</sub>(EMPLOYEE))

**Q2.** Retrieve the SSN of employees whose salary > 60000 and Dept = 6

π<sub>SSN</sub>(σ<sub>Dept.No = 6 AND Salary > 60000</sub>(EMPLOYEE))

#### RENAME operation
**ρ<sub>S</sub>(R)** -Renames the Relation R to S

**ρ<sub>(b1,b2,b3...,bn)</sub>(R)**- Renames the attributes of R to b1,b2,...bn

ρ<sub>First_name,Last_name,Salary</sub>(π<sub>Fname,Lname,Salary</sub>)
