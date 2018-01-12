__Instructions could be__
```
1. Arthemectic & Logical
2. Tranfer of data (memory procedure)
3. I/O tranfer
4. Process Sequencing
```

<b>Basically Two types of notations</b>

```
1.Register Tranfer Notation
2.Assembly Language Notation
```

R<sub>0</sub> <-- [Location 1] + [Location 2] 

where,

 R<sub>0</sub> is Address to be stored

 [Loc] is Actual location in memory
 
  
 <b>Types of Instruction</b>
 1. Three address instruction
   ```
   Operation source1,source2,destination
   Eg: ADD A,B,C
   [C] <-- [B] + [A]
   ```

2. Two address Instruction
```
Operation Source Destination
ADD A,B
B <- [A] + [B]

MOVE A,B
B <- A
```
3. One address Instruction

Accumulator <sup> *</sup> (Found during stone age)
```
Eg: Load A, Store A

```
(A+B)*(C+D)

**3 address Input**
```
ADD A,B,X
ADD C,D,Y
MUL X,Y,Z
```

**2 address Input**
```
ADD A,B
ADD C,D
MUL B,D
```
**1 address input**
```
LOAD A
ADD B
STORE X
LOAD C
ADD D
STORE Y
LOAD X
MUL Y
STORE Z
```
