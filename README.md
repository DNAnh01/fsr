### Database connection

##### connection

- Đại diện cho kết nối với cơ sở dữ liệu.
- Được sử dụng để thực thi các câu lệnh SQL và truy vấn dữ liệu.
- Kết nối được lấy từ lớp DbConnection trong constructor.

##### statement

- Đại diện cho một câu lệnh SQL không tham số.
- Được sử dụng để thực thi các câu lệnh SQL đơn giản không có biến.

##### preparedStatement

- Đại diện cho một câu lệnh SQL tham số hóa.
- Được sử dụng để thực thi các câu lệnh SQL có biến, giúp chống lại tấn công SQL injection.

##### resultSet

- Đại diện cho tập hợp các kết quả thu được sau khi thực thi một câu lệnh SQL truy vấn.
- Cho phép duyệt qua các dòng kết quả và lấy ra các giá trị dữ liệu.

###### Tip: [làm sao để sử dụng MySQL trong vscode](https://www.youtube.com/watch?v=wzdCpJY6Y4c)

##### Injection SQL

- Xảy ra khi dữ liệu người dùng được kết hợp trực tiếp vào câu lệnh SQL mà không được xử lý đúng cách, dẫn đến việc mà người dùng có thể thực thi các lệnh SQL không mong muốn hoặc có hại đến cơ sở dữ liệu. Trong trường hợp của bạn, việc sử dụng câu lệnh SQL như sau có thể dẫn đến injection:

```java
String sql = "SELECT * FROM LoaiHang WHERE TenLH = '" + name + "'";
```

- Trong trường hợp này, biến name được kết hợp trực tiếp vào câu lệnh SQL thông qua phép nối chuỗi (+). Điều này mở ra cơ hội cho các tấn công injection SQL, vì nếu giá trị của name được điều khiển bởi kẻ tấn công, họ có thể chèn các lệnh SQL độc hại vào biến name, gây ra thay đổi hoặc truy vấn dữ liệu không mong muốn.

Để ngăn chặn injection SQL, thay vì sử dụng cách trên, bạn nên sử dụng các truy vấn được chuẩn bị trước và sử dụng tham số. Trong trường hợp này, bạn đã sử dụng PreparedStatement với một tham số, giống như sau:

```java
String sql = "SELECT * FROM LoaiHang WHERE TenLH LIKE ?";
preparedStatement = connection.prepareStatement(sql);
preparedStatement.setString(1, "%" + name + "%");
```

- Trong truy vấn này, giá trị của name được thêm vào truy vấn thông qua phương thức setString(), điều này giúp ngăn chặn injection SQL bằng cách xử lý giá trị của người dùng một cách an toàn, không cho phép chèn các lệnh SQL không mong muốn vào câu lệnh truy vấn.
