# DATABASE FUNDAMENTALS

## What is Data?
Data is a collection of information that is organized, stored, and analyzed to uncover patterns, support decision-making, and solve problems.

## What is DBMS?
A DBMS (Database Management System) is general-purpose software used to create, manage, and manipulate data in a structured and efficient way.

## 1. What is a Database?
A database is a logically coherent collection of data with some inherent meaning. It represents some aspect of the real world and is designed, built, and populated with data for a specific purpose.

## 2. What is DBMS (Database Management System)?
A DBMS is a collection of programs that enables users to create, maintain, and manipulate a database. It allows for defining, constructing, and controlling access to the database.

## 3. What is a Database System?
A Database System consists of: (i) The Database (data), (ii) The DBMS software. Together, they form a full system used to manage and interact with the data.

## 4. Advantages of DBMS:
- Redundancy is controlled (Avoids duplicate data)
- Unauthorized access is restricted (Security features ensure only valid users access data)
- Multiple user interfaces (Supports different views and interaction modes)
- Integrity constraints enforced (Maintains data correctness)
- Backup and recovery (Ensures data is safe from failure)

## 5. Disadvantages of File Processing System:
- Data redundancy and inconsistency
- Difficulty in accessing data
- Data isolation
- Integrity problems
- No concurrent access
- Security problems

## 13. What is a Data Model?
A data model is a collection of conceptual tools for describing data, relationships among data, and constraints that apply to the data.

## 14. What is the E-R Model?
The E-R (Entity-Relationship) model represents data as entities (objects) and relationships among those entities. Entities are described by a set of attributes.

## 15. What is the Object-Oriented Model?
The Object-Oriented Model is based on a collection of objects. An object contains both data (fields/attributes) and code (methods/procedures). Objects with the same characteristics are grouped into classes.

## 16. What is an Entity?
An entity is a “thing” or object in the real world that has an independent existence and can be uniquely identified.

## 17. What is an Entity Type?
An entity type is a collection of entities that share the same attributes. Example: All employees form the "Employee" entity type.

## 18. What is an Entity Set?
An entity set is the collection of all entities of a particular entity type stored in the database.

## 19. What is an Extension of an Entity Type?
An extension of an entity type is the set of all instances (records) of that type present at a given time. Entity type = template; Extension = actual data.

## 20. What is a Weak Entity Set?
A weak entity set does not have sufficient attributes to form a primary key. It depends on a strong entity and uses a combination of its partial key and the primary key of the strong entity for identification. Always related via total participation.

## 21. What is an Attribute?
An attribute is a property that describes an entity. Example: For Student → Student_ID, Name, Age, Course.

## 22. What is a Relation Schema and a Relation?
Relation Schema: Blueprint of a table (e.g., Student(Student_ID, Name, Age)). Relation: Actual data rows in that table.

## 23. What is the Degree of a Relation?
The number of attributes in a relation schema. Example: Student(Student_ID, Name, Age, Course) → Degree = 4.

## 24. What is a Relationship?
A relationship is an association among two or more entities. In the E-R model, represented as diamonds connecting entity sets. May also have attributes.

## TYPES OF KEYS IN DBMS

### 1. Candidate Key
Uniquely identifies tuples. Multiple candidate keys possible. One becomes primary key. Example: CustomerID, PanNumber.

### 2. Super Key
Any set of attributes that uniquely identify tuples. Includes candidate keys and more. Example: {CustomerID}, {CustomerID, Name}.

### 3. Primary Key
Chosen candidate key that uniquely identifies each tuple. No NULLs. One per table. Example: CustomerID.

### 4. Unique Key
Like primary key but allows one NULL value. Ensures uniqueness. Example: PanNumber.

### 5. Alternate Key
Candidate keys not chosen as the primary key. Example: PanNumber (if CustomerID is primary).

### 6. Foreign Key
An attribute in one table that refers to the primary key in another. Enforces referential integrity. Example: CustomerID in Payments table refers to Customer table.

### 7. Composite Key
Combination of two or more columns used together to uniquely identify a row. Example: (CustomerID, Date_of_Payment)

## TYPES OF ATTRIBUTES IN DBMS

### 1. Simple (Atomic) Attribute
Cannot be divided further. Example: Age, Salary

### 2. Composite Attribute
Can be split into sub-parts. Example: FullName → FirstName, LastName

### 3. Derived Attribute
Not stored directly; derived from stored values. Example: Age from DateOfBirth

### 4. Multivalued Attribute
Can hold multiple values. Example: PhoneNumbers

### 5. Single-Valued Attribute
Holds a single value. Example: Email

### 6. Key Attribute
Uniquely identifies an entity. Example: StudentID

### 7. Stored Attribute
Actually stored in DB. Example: DateOfBirth

### 8. Null-Valued Attribute
May have no value. Example: MiddleName

# SQL
~~~mermaid
    graph TD;
    SQL-->IBM;
    SQL-->MySQL;
    SQL-->Oracle;
    SQL-->PostgreSQL;
~~~
- MangoDB
  - It stores values in form of keys and values.
# Structured Query Language (SQL)

## SQL Commands Flowchart

~~~mermaid
    graph TD
    A[SQL Commands]

    A --> B[DDL\nData Definition Language]
    A --> C[DML\nData Manipulation Language]
    A --> D[DCL\nData Control Language]
    A --> E[TCL\nTransaction Control Language]
    A --> F[DQL\nData Query Language]

    B --> B1[CREATE]
    B --> B2[DROP]
    B --> B3[ALTER]
    B --> B4[TRUNCATE]

    C --> C1[INSERT]
    C --> C2[UPDATE]
    C --> C3[DELETE]

    D --> D1[GRANT]
    D --> D2[REVOKE]

    E --> E1[COMMIT]
    E --> E2[ROLLBACK]

    F --> F1[SELECT]
~~~
