There are three main types of constraints
1. Key Constraints
2. Entity Integrity Constraints
3. Refrential Integrity Constraints

```
Apart from the above , there is a 4th type of constraint ie Domain Constraint

```
### Entity Integrity
 The primary key should not be NULL

### Referential Integrity
The value in the foreign key column of the referncing relation can be either a value of an primary key of the refereced Relation or be NULL

### Semantic Constraints / Buisness constraints
Constraints explictly defined with the help of a programming language

# Update Operations on Relation

```sql
INSERT 
DELETE 
UPDATE 
``` 

``` sql
INSERT operation can violate all four constraints
DELETE operation can violate referential constraints
```

Dealing with DELETE violations

```sql
Restrict , Cascade , Setting a default or NULL value
```
