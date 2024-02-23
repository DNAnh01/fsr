# LESSON 18: Hibernate (ORM Framework)

## Java Persistence API & Hibernate

### ORM:

##### Define:

- Object Relational Mapping is the programming technique to map application objects to relational database tables. (Object Relational Mapping là kỹ thuật lập trình để ánh xạ các đối tượng ứng dụng vào các bảng cơ sở dữ liệu quan hệ.)

- ORM is concerned with helping your application to achieve persistence. (ORM liên quan đến việc giúp ứng dụng của bạn đạt được tính liên tục (persistence).)

- Persistence simply means that we would like our application's data to outlive the applications process. (Persistence đơn giản chỉ đồng nghĩa với việc chúng ta muốn dữ liệu của ứng dụng của chúng ta tồn tại sau khi tiến trình ứng dụng kết thúc.)

- ORM is a task-one that developers have good reason to avoid doing manually. (ORM là một nhiệm vụ mà các nhà phát triển có lý do tốt để tránh làm thủ công.)

- Finally, application can focus on objects. (Cuối cùng, ứng dụng có thể tập trung vào các đối tượng.)

##### Example:

```java
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    // Constructors, getters, setters
}
```

##### Question:

1. Bạn có thể giải thích ORM là gì không?

   Trả lời: ORM là viết tắt của Object Relational Mapping, là một kỹ thuật lập trình để ánh xạ các đối tượng của ứng dụng vào các bảng trong cơ sở dữ liệu quan hệ. Nó giúp chúng ta làm việc với dữ liệu từ cơ sở dữ liệu một cách thuận tiện bằng cách sử dụng các đối tượng trong ứng dụng thay vì truy vấn trực tiếp đến csdl.

2. Tại sao chúng ta cần sử dụng ORM?

   Trả lời: Sử dụng ORM giúp giảm thiểu sự phụ thuộc vào cú pháp và cấu trúc của cơ sở dữ liệu, giúp cho mã của chúng ta dễ đọc và dễ bảo trì hơn. Ngoài ra, nó cũng giúp tăng tính liên tục của ứng dụng, vì dữ liệu không phụ thuộc vào quá trình thực thi của ứng dụng.

### JPA (Java Persistence API):

##### Define:

- Java Persistence is java based ORM tool that provides framework for mapping application domain objects to relational database tables and vice versa. (Java Persistence là một công cụ ORM dựa trên Java cung cấp framework để ánh xạ các đối tượng domain của ứng dụng vào các bảng cơ sở dữ liệu quan hệ và ngược lại.)

- JPA is a specification, it defines a set of concepts that can be implemented by any tool or framework --> javax.persistence.\* --> mapping (JPA là một đặc tả (specification), nó xác định một tập hợp các khái niệm có thể được thực hiện bởi bất kỳ công cụ hoặc framework nào --> javax.persistence.\* --> ánh xạ.)

- Several implementations(class implement interface) are available such as Hibernate, EclipseLink
  --> org.hibernate.\* --> query
  (Có một số cài đặt (implementation) có sẵn như Hibernate, EclipseLink --> org.hibernate.\* --> truy vấn.)

- JPA specifications are defined with annotation java.persistence package. Using JPA annotation helps us in writing implementation independent code (Đặc tả của JPA được xác định với các chú thích (annotation) trong gói java.persistence. Sử dụng các chú thích JPA giúp chúng ta viết mã không phụ thuộc vào cài đặt cụ thể.)

##### Question:

1. JPA là gì và tại sao chúng ta nên sử dụng nó?

   Trả lời: JPA là viết tắt của Java Persistence API, là một công cụ ORM dựa trên Java cung cấp framework để ánh xạ các đối tượng domain của ứng dụng vào các bảng trong cơ sở dữ liệu quan hệ và ngược lại. Chúng ta nên sử dụng JPA vì nó giúp giảm thiểu sự phụ thuộc vào cú pháp và cấu trúc của cơ sở dữ liệu, đồng thời cung cấp tính linh hoạt và tính di động cho mã của chúng ta. Nó cũng giúp chúng ta viết mã không phụ thuộc vào cài đặt cụ thể, điều này rất hữu ích khi chúng ta muốn thay đổi cơ sở dữ liệu hoặc framework ORM mà không cần sửa đổi nhiều mã nguồn.

2. Bạn có thể đưa ra một số ví dụ về cài đặt JPA phổ biến không?

   Trả lời: Các cài đặt phổ biến của JPA bao gồm Hibernate và EclipseLink. Hai thư viện này cung cấp một loạt các tính năng và công cụ để quản lý và tương tác với cơ sở dữ liệu một cách hiệu quả.

### Hibernate:

##### Define:

- Hibernate ORM is one of the most mature JPA implementations, and still a popular option for ORM in Java. (Hibernate ORM là một trong những cài đặt JPA mạnh mẽ nhất và vẫn là một lựa chọn phổ biến cho ORM trong Java.)

- Additonally, Hibernate's family of tools has expanded to include popular tools like Hibernate Search, Hibernate Validator and Hibernate OGM, which supports domain-model persistence for NoSQL. (Ngoài ra, gia đình công cụ của Hibernate đã mở rộng để bao gồm các công cụ phổ biến như Hibernate Search, Hibernate Validator và Hibernate OGM, hỗ trợ bảo toàn domain-model cho NoSQL.)

- Because of their intertwined history, Hibernate and JPA are frequently conflated. (Do lịch sử liên kết của họ, Hibernate và JPA thường được nhầm lẫn với nhau.)

##### Question:

1. Hibernate là gì và tại sao nó lại quan trọng trong phát triển Java?

   Trả lời: Hibernate là một framework ORM trong Java, giúp ánh xạ các đối tượng của ứng dụng vào cơ sở dữ liệu quan hệ và ngược lại. Nó là một trong những cài đặt JPA mạnh mẽ nhất, cung cấp nhiều tính năng và công cụ hữu ích cho việc quản lý và tương tác với cơ sở dữ liệu. Hibernate được sử dụng rộng rãi trong cộng đồng Java vì tính mạnh mẽ, linh hoạt và dễ sử dụng của nó.

2. Tại sao Hibernate và JPA thường bị nhầm lẫn với nhau?

   Trả lời: Hibernate và JPA thường được nhầm lẫn với nhau vì Hibernate là một trong những cài đặt JPA phổ biến nhất. JPA là một đặc tả (specification) trong Java Persistence API, trong khi Hibernate là một trong số các framework thực hiện đặc tả này. Do đó, mặc dù Hibernate triển khai JPA, nhưng chúng vẫn có những điểm khác biệt và tính năng riêng của mình.

#### Hibernate Architecture

<img src="image\Hibernate Architecture.gif" width="700" height="360">

#### Note:

|            JDBC            |    Hibernate     |
| :------------------------: | :--------------: |
|       Configuration        |  Configuration   |
|         Connection         | Session, Factory |
| Statement/PrepareStatement |      Query       |
|         ResultSet          |                  |
|        Native Query        |                  |

#### Comparing JPA to Native Hibernate Methods

<img src="image\Comparing JPA to Native Hibernate Methods.gif" width="700" height="360">

### Hibernate Architecture:

- Session Factory responsible for the creation of Session objects (Session Factory có trách nhiệm tạo ra các đối tượng Session.)

- Session provides an interface between the application and data stored in the
  database. It is a short-lived object and wraps the JDBC connection. (Session cung cấp một giao diện giữa ứng dụng và dữ liệu được lưu trữ trong cơ sở dữ liệu. Nó là một đối tượng ngắn hạn và bọc kín kết nối JDBC.)

- It is factory of Transaction, Query and Criteria. It holds a first-level cache (mandatory) of data. (Session là một nhà máy của Transaction, Query và Criteria. Nó giữ một bộ nhớ cache cấp độ một (bắt buộc) của dữ liệu.)

- Session interface provides methods to insert, update and delete the object. It also
  provides factory methods for Transaction, Query and Criteria (Giao diện Session cung cấp các phương thức để chèn, cập nhật và xóa đối tượng. Nó cũng cung cấp các phương thức nhà máy cho Transaction, Query và Criteria.)

- Query could be Native Query or Hibernate Query Language (Query có thể là Native Query hoặc Hibernate Query Language.)

- Transaction manages a transaction of Sessions with dataset (Transaction quản lý một giao dịch của Sessions với tập dữ liệu.)

#### Note:

- Option 1: Using native query -> createNativeQuery
- Option 2: Java Persistence Query Language (JPQL)

#### Knowledge:

When performing data queries with Hibernate there are the following ways:

```java
// Option 1: Using native query -> createNativeQuery
    private static final String NQ_SELECT_ALL_ITEM_GROUPS = "SELECT * FROM LoaiHang";

// Option 2: Java Persistence Query Language (JPQL, HQL) --> createQuery
    -> private static final String Q_SELECT_ITEM_GROUPS = "SELECT ig FROM ItemGroup ig";

//    -> 2.1 Using createQuery
//    -> 2.1 Using NamedQueries, @NamedQuery --> createNamedQuery
```

##### Mapping JPA + Database

```java
    @Entity
    @Table(name = "...")
    @Id
    @Column(name = "...")
```

##### Relationship

    @ManyToOne -> Item <-> ItemGroup -> @JoinColumn
    @OneToMany                       -> MappedBy
    @ManyToMany -> In case table N-N has no extra columns -> using @ManyToMany and @JoinTable
    Else -> Create another entity for N-N table

    @ManyToOne(fetch = FetchType.EAGER) -> default -> Hibernate select n + 1 problem
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaLH", referencedColumnName = "MaLH")

###### Example:

- Trong Hibernate, mối quan hệ dữ các đối tượng được ánh xạ vào các bảng trong cơ sở dữ liệu bằng cách sử dụng các annotation như `@ManyToOne`, `@OneToMany`, `@ManyToMany`. Dưới đây là một số giải thích chi tiết về mỗi loại mối quan hệ và cách sử dụng chúng.

1. `@ManyToOne`: Được sử dụng khi một đối tượng thuộc về nhiều đối tượng khác. Ví dụ, một sản phẩm thuộc về một nhóm sản phẩm. Trong ví dụ này, mỗi sản phẩm thuộc về một nhóm sản phẩm duy nhất.

```java
@Entity
public class Product {
    // ...
    @ManyToOne
    @JoinColumn(name = "group_id")
    private ProductGroup group;
    // ...
}
```

2. `@OneToMany`: Được sử dụng khi một đối tượng chứa nhiều đối tượng khác. Ví dụ, một nhóm sản phẩm có nhiều sản phẩm. Trong ví dụ này, mỗi nhóm sản phẩm có thể chứa nhiều sản phẩm.

```java
@Entity
@Entity
public class ProductGroup {
    // ...
    @OneToMany(mappedBy = "group")
    private List<Product> products;
    // ...
}
```

3. `@ManyToMany`: Được sử dụng khi có mối quan hệ n-n giữa hai đối tượng. Ví dụ, một sinh viên có thể đăng ký nhiều môn học và một môn học có thể được đăng ký bởi nhiều sinh viên. Trong ví dụ này, mỗi sinh viên có thể đăng ký nhiều môn học và mỗi môn học có thể được đăng ký bởi nhiều sinh viên.

```java
@Entity
public class Student {
    // ...
    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;
    // ...
}
```

```java
@Entity
public class Course {
    // ...
    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
    // ...
}
```

4. `FetchType EAGER và LAZY`: FetchType chỉ định cách Hibernate nên lấy dữ liệu từ cơ sở dữ liệu khi truy cập mối quan hệ.

- `EAGER`: Khi sử dụng FetchType.EAGER, Hibernate sẽ tức thời lấy dữ liệu liên quan từ cơ sở dữ liệu khi truy cập đối tượng gốc. Điều này có thể dẫn đến vấn đề "select n + 1" khi một đối tượng có nhiều mối quan hệ và mỗi mối quan hệ lại được tải một cách độc lập.

- `LAZY`: Khi sử dụng FetchType.LAZY, Hibernate sẽ chỉ tải dữ liệu liên quan khi nào thực sự cần thiết. Điều này giúp tránh vấn đề "select n + 1" bằng cách chỉ tải dữ liệu khi thực sự cần thiết, giảm thiểu việc truy vấn dư thừa và tăng hiệu suất.

```java
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "group_id")
private ProductGroup group;
```

##### Thao tác cơ bản:

- Create Read(All|One) Update Delete -> save(Entity), select, get(id) save/saveOrUpdate(Entity), remove(id)

- Trong Hibernate, các thao tác cơ bản với cơ sở dữ liệu được thực hiện thông qua các phương thức cung cấp bởi Session object. Dưới đây là các thao tác cơ bản và cách sử dụng phương thức tương ứng trong Hibernate:

1. `Create`: Tạo mới một bản ghi trong cơ sở dữ liệu.

   - Sử dụng phương thức `save()` hoặc `saveOrUpdate()` của `Session` để tạo mới hoặc cập nhật một đối tượng.

   ```java
   session.save(entity);
   ```

2. `Read (One)`: Đọc một bản ghi từ cơ sở dữ liệu dựa trên khóa chính.

   - Sử dụng phương thức `get()` của Session để lấy một đối tượng dựa trên khóa chính.

   ```java
   Entity entity = session.get(Entity.class, id);
   ```

3. `Read (All)`: Đọc tất cả các bản ghi từ một bảng cơ sở dữ liệu.

   - Sử dụng câu lệnh JPQL hoặc Criteria API để truy vấn tất cả các bản ghi từ bảng cơ sở dữ liệu.

   ```java
   List<Entity> entities = session.createQuery("FROM Entity", Entity.class).getResultList();
   ```

4. `Update`: Cập nhật một bản ghi đã tồn tại trong cơ sở dữ liệu.

   - Sử dụng phương thức `saveOrUpdate()` của Session để cập nhật một đối tượng.

   ```java
   session.saveOrUpdate(entity);
   ```

5. `Delete`: Xóa một bản ghi từ cơ sở dữ liệu.

   - Sử dụng phương thức `delete()` của Session để xóa một đối tượng.

   ```java
   session.delete(entity);
   ```

   - Hoặc sử dụng phương thức `remove()` của EntityManager trong JPA.

   ```java
   entityManager.remove(entity);
   ```

### First Level Cache:

<img src="image\First Level Cache.gif" width="700" height="360">

- Caching is a facility provided by ORM frameworks which help users to get fast running
  web application, while help framework itself to reduce number of queries made to
  database in a single transaction. (Caching là một cơ chế được các framework ORM cung cấp giúp người dùng có được ứng dụng web chạy nhanh, đồng thời giúp framework giảm số lượng truy vấn được thực hiện vào cơ sở dữ liệu trong một giao dịch.)

- Hibernate achieves the second goal by implementing first level cache. (Hibernate đạt được mục tiêu thứ hai này bằng cách triển khai cache cấp độ một.)

- Fist level cache is enabled by default and you do not need to do anything to get this
  functionality working. In fact, you can not disable it even forcefully. (Cache cấp độ một được kích hoạt mặc định và bạn không cần phải làm gì để có được chức năng này hoạt động. Trong thực tế, bạn không thể vô hiệu hóa nó ngay cả khi cố gắng.)

- First level cache is associated with “session” object and other session objects in
  application can not see it. (Cache cấp độ một được liên kết với đối tượng "session" và các đối tượng session khác trong ứng dụng không thể nhìn thấy nó.)

- The scope of cache objects is of session. Once session is closed, cached objects are
  gone forever. (Phạm vi của các đối tượng cache là của session. Một khi session đã được đóng, các đối tượng được cache sẽ mất mãi mãi.)

- First level cache is enabled by default and you can not disable it. (Cache cấp độ một được kích hoạt mặc định và bạn không thể vô hiệu hóa nó.)

- When we query an entity first time, it is retrieved from database and stored in first
  level cache associated with hibernate session. (Khi chúng ta truy vấn một đối tượng lần đầu tiên, nó được lấy từ cơ sở dữ liệu và được lưu trữ trong cache cấp độ một liên kết với session của Hibernate.)

- If we query same object again with same session object, it will be loaded from cache
  and no sql query will be executed. (Nếu chúng ta truy vấn cùng một đối tượng lại với cùng một đối tượng session, nó sẽ được tải từ cache và không có truy vấn SQL nào được thực thi.)

- The loaded entity can be removed from session using evict() method. The next loading
  of this entity will again make a database call if it has been removed using evict()
  method. (Đối tượng đã được tải có thể được loại bỏ khỏi session bằng cách sử dụng phương thức evict(). Việc tải lại của đối tượng này sẽ tiếp tục khiến một cuộc gọi cơ sở dữ liệu nếu nó đã được loại bỏ bằng phương thức evict().)

- The whole session cache can be removed using clear() method. It will remove all the
  entities stored in cache (Toàn bộ cache của session có thể được loại bỏ bằng cách sử dụng phương thức clear(). Nó sẽ loại bỏ tất cả các đối tượng được lưu trữ trong cache.)

- Fist level cache: This is enabled by default and works in session scope. Read more
  about hibernate first level cache.

- Second level cache: This is apart from first level cache which is available to be used
  globally in session factory scope. Available for all sessions

-> Cấu hình: Auto enable by Hibernate

```java
// Load an entity into first level cache
Entity entity = session.get(Entity.class, id);

// Query the same entity again with the same session object
// It will be loaded from cache, no SQL query will be executed
Entity entityAgain = session.get(Entity.class, id);

// Remove entity from session cache
session.evict(entity);

// Load the entity again, a database call will be made
// as it has been removed from cache using evict() method
Entity entityReloaded = session.get(Entity.class, id);

// Clear the entire session cache
session.clear();
```

### **Second Level Cache:**

- Trong một câu truy vấn thì mình tạo một session riêng lẻ để viết, bây giờ đôi lúc mình muốn những session đó share dữ liệu với nhau. Có nghĩa là bây một service mình gọi nhiều cái Dao, mỗi Dao thì mình open một session...
- First level cache: This is enabled by default and works in session scope. Read more
  about hibernate first level cache.
- Second level cache: This is apart from first level cache which is available to be used
  globally in session factory scope. Available for all sessions.

<img src="image\Second Level Cache 1.gif" width="700" height="360">

- Hạn chế của First Level Cache là cache data chỉ lưu trữ trên một session, nhưng đôi khi mình muốn dữ liệu đó được chia sẽ giữa các session với nhau trong các Dao

  -> Trong thực tế khi mình thực hiện một câu QueryNative hay JPQL thì mặc định nó sẽ vào FLC để tìm nếu mà có thì nó lấy ra không thì nó truy vấn database. Tiếp theo nếu trong FLC không có mà mình có cấu hình SLC thì nó sẽ vào SLC lấy cho mk, nếu trong SLC hay session khác không có thì nó mới vào database và SLC này cần cấu hình trc chứ nó không tự default như FLC

-> Cấu hình: Enable manually

**_b1:_** Add 2nd cache support dependencies.

**_b2:_** Enable 2nd cache in hibernate.configuration.xml and link to support 2nd class.

**_b3:_** Configure Entity cache with class, name, living time. -> ehcache.xml

**_b4:_** Add @Cache(CacheRegionStrategy.READ_WRITE) to Entity used for 2nd cache.

```xml
<!-- File cấu hình Hibernate -->
<property name="hibernate.cache.use_second_level_cache">true</property>
<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>

```

```xml
<!-- File cấu hình Ehcache -->
<cache name="com.example.Entity" maxEntriesLocalHeap="1000" timeToLiveSeconds="3600" />
```

```java
// Đánh dấu Entity cần lưu trữ trong Second Level Cache
@Entity
@Cache(region = "com.example.Entity", usage = CacheConcurrencyStrategy.READ_WRITE)
public class Entity {
    // ...
}
```

### DTO:

- Trong trường hợp dữ liệu trả về mà nó không thuộc trong một table hoặc là những dữ liệu trả về không phải là những column trong database, mà những dữ liệu trả về là công thức tính toán gì đó thì mình sẽ sử dụng DTO. Trong khi đó thì một Entity sẽ đại diện một table trong database.
