# DB Languages

**DDL**  - Data defenition Languages 
**Data Description** is called Schema.

**Schema Diagram** is the pictorial representation of schema.

Normally in DBS three levels of hierarchy exists:
1. View Level
2. Conceptual Level
3. Internal Level

This helps in implementing Database abstraction.
<img src="Schema_Mapping.jpg"></img>
#### If there is no seperation between conceptual and internal level ,DDL is used to define both these levels.

**SDL** - Storage Defenition Level
If there is seperation between conceptual and internal level,  **SDL will be used for Internal Level, DDL will be used for Conceptual Level, DML for View level.**

DDL and SDL will be used by database admins and designers.
DML is used by Database end users.
```sql
DDL Example - CREATE, UPDATE statements
DML Example - SELECT,PRODUCT
```
##### DBA- Database Administrators 

  1. Manages the resources
  2. Schema Defenition
  3. Storage structure and access method
  4. Granting of authorisation
  5. Routine maintanence and backsup
  6. Acquiring Software and Hardware
  7. Breach of security
  8. Handles poor system response

##### Database Users Types

1. **Casual end Users**  - Regular DB user. Mostly likely to interact via GUI.
2. **Name or parametric end Users**  Uses form based GUI
3. **Application programmers**  - Database developers. Mostly likely don't interact via GUI
4. **Sophisticated Users** - Database for a specific purpose
5. **Stand Alone Users** 

**DB State** - Data in the database at a particular moment.

### Schema Architecture
 It describes a structure of whole database for a community of users.

 **Mapping** is a process of transforming request and results between the levels.
  The capacity to change internal scheme without affecting conceptual schema.

 ### Data Independence
  The capacity to change the schema without affecting a higher level schema.

    1. **Logical Data Independence**

   The capacity to change conceptual scheme without affecting external schema.

    2. **Physical Data Independence**

 The capacity to change internal scheme without affecting conceptual schema. ( and thus not affecting external schema).

## DBMS Architecture
1. Centralized DBMS architecture
2. Basic Client/Server
3. Two-tier client/server
4. Three tier and n-tier architecture for web application



