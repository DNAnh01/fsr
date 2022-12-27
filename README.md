# **LESSON 18: ORM Framework**
## **Java Persistence API & Hibernate**

### **ORM:**
*   Object Relational Mapping is the programing technique to map application
	objects to relational database tables.

*	ORM is concerned with helping your application to achieve persistence.  

*    Persistence simply means that we would like our application's data to outlive the
    applications process.

*	ORM is a task-one that developers have good reason to avoid doing manually.

*	Finally, application can focus on objects.


### **JPA:** 
*	Java Persistence is java based ORM tool that provides framework for mapping
	application domain objects to relational database tables and vice versa.

*	JPA is a specification, it defines a set of concepts that can be implemented by any tool
	or framework --> javax.presistence.* --> mapping

*	Several implementations(class implement interface) are avaiable such as Hibernate, EclipseLink
	--> org.hibernate.* --> query

*    JPA specifications are defined with annotation java.persistence package. Using JPA annotation helps us in writing implementation independent code

### **Hibernate:**
*    Hibernate ORM is one of the most mature JPA implementations, and still a popular
	option for ORM in Java.

*	Additonally, Hibernate's family of tools has expanded to include popular tools like	Hibernate Search, Hibernate Validator and Hibernate OGM, which supports domain-model persistence for NoSQL.

*	Because of their intertwined history, Hibernate and JPA are frequently conflated.

#### ***Hibernate Architecture***

<img src="image\Hibernate Architecture.gif" width="700" height="360">

#### ***Note:***
| JDBC | Hibernate |
| :-: | :-: |
| Configuration | Configuration |
| Connection | Session, Factory |
| Statement/PrepareStatement | Query |
| ResultSet | | 
| Native Query | | 



#### ***Comparing JPA to Native Hibernate Methods***

<img src="image\Comparing JPA to Native Hibernate Methods.gif" width="700" height="360">

### **Hibernate Architecture:**

*   Session Factory responsible for the creation of Session objects
*   Session provides an interface between the application and data stored in the
database. It is a short-lived object and wraps the JDBC connection.
*   It is factory of Transaction, Query and Criteria. It holds a first-level cache (mandatory)
of data.
*   Session interface provides methods to insert, update and delete the object. It also
provides factory methods for Transaction, Query and Criteria
*   Query could be Native Query or Hibernate Query Language
*   Transaction manages a transaction of Sessions with dataset








