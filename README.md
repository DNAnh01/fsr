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

#### ***Note:***
*	Option 1: Using native query -> createNativeQuery
*	Option 2: Java Persistence Query Language (JPQL)

#### ***Knowledge:***
When performing data queries with Hibernate there are the following ways:

	Option 1: Using native query -> createNativeQuery
	-> private static final String NQ_SELECT_ALL_ITEM_GROUPS = "SELECT * FROM LoaiHang";

	Option 2: Java Persistence Query Language (JPQL, HQL) --> createQuery
	-> private static final String Q_SELECT_ITEM_GROUPS = "SELECT ig FROM ItemGroup ig";
	-> 2.1 Using createQuery
	-> 2.1 Using NamedQueries, @NamedQuery --> createNamedQuery

Mapping JPA + Database

	@Entity
	@Table(name = "...")
	@Id
	@Column(name = "...")

Relationship

	@ManyToOne -> Item <-> ItemGroup -> @JoinColumn
	@OneToMany                       -> MappedBy
	@ManyToMany -> In case table N-N has no extra columns -> using @ManyToMany and @JoinTable
	Else -> Create another entity for N-N table
	
	@ManyToOne(fetch = FetchType.EAGER) -> default -> Hibernate select n + 1 problem
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLH", referencedColumnName = "MaLH")

Thao tác cơ bản:

	Create Read(All|One) Update Delete -> save(Entity), select, get(id) save/saveOrUpdate(Entity), remove(id)

### **First Level Cache:** 

<img src="image\First Level Cache.gif" width="700" height="360">

*	Caching is a facility provided by ORM frameworks which help users to get fast running
web application, while help framework itself to reduce number of queries made to
database in a single transaction.
*	Hibernate achieves the second goal by implementing first level cache
*	Fist level cache is enabled by default and you do not need to do anything to get this
functionality working. In fact, you can not disable it even forcefully.
*	First level cache is associated with “session” object and other session objects in
application can not see it.
*	The scope of cache objects is of session. Once session is closed, cached objects are
gone forever.
*	First level cache is enabled by default and you can not disable it.
*	When we query an entity first time, it is retrieved from database and stored in first
level cache associated with hibernate session.
*	If we query same object again with same session object, it will be loaded from cache
and no sql query will be executed.
*	The loaded entity can be removed from session using evict() method. The next loading
of this entity will again make a database call if it has been removed using evict()
method.
*	The whole session cache can be removed using clear() method. It will remove all the
entities stored in cache
*	Fist level cache: This is enabled by default and works in session scope. Read more
about hibernate first level cache.
*	Second level cache: This is apart from first level cache which is available to be used
globally in session factory scope. Available for all sessions

-> Cấu hình: Auto enable by Hibernate

### **Second Level Cache:**

*	Trong một câu truy vấn thì mình tạo một session riêng lẻ để viết, bây giờ đôi lúc mình muốn những session đó share dữ liệu với nhau. Có nghĩa là bây một service mình gọi nhiều cái Dao, mỗi Dao thì mình open một session...
*	First level cache: This is enabled by default and works in session scope. Read more
about hibernate first level cache.
*	Second level cache: This is apart from first level cache which is available to be used
globally in session factory scope. Available for all sessions.


<img src="image\Second Level Cache 1.gif" width="700" height="360">

*	Hạn chế của First Level Cache là cache data chỉ lưu trữ trên một session, nhưng đôi khi mình muốn dữ liệu đó được chia sẽ giữa các session với nhau trong các Dao 
-> Trong thực tế khi mình thực hiện một câu QueryNative hay JPQL thì mặc định nó sẽ vào FLC để tìm nếu mà có thì nó lấy ra không thì nó truy vấn database. Tiếp theo nếu trong FLC không có mà mình có cấu hình SLC thì nó sẽ vào SLC lấy cho mk, nếu trong SLC hay session khác không có thì nó mới vào database và SLC này cần cấu hình trc chứ nó không tự default như FLC

->	Cấu hình: Enable manually

***b1:***	Add 2nd cache support dependencies.

***b2:***	Enable 2nd cache in hibernate.configuration.xml and link to support 2nd class.

***b3:***	Configure Entity cache with class, name, living time. -> ehcache.xml

***b4:*** Add @Cache(CacheRegionStrategy.READ_WRITE) to Entity used for 2nd cache.

### **DTO:**

*	Trong trường hợp dữ liệu trả về mà nó không thuộc trong một table hoặc là những dữ liệu trả về không phải là những column trong database, mà những dữ liệu trả về là công thức tính toán gì đó thì mình sẽ sử dụng DTO. Trong khi đó thì một Entity sẽ đại diện một table trong database. 

	









