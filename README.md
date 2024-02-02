### File

##### - Interview questions

###### 1. Bạn có thể giải thích cách đọc và ghi dữ liệu từ một tệp văn bản trong Java không?

- Để đọc dữ liệu từ một tệp văn bản trong Java, chúng ta có thể sử dụng lớp FileReader và BufferedReader như sau:

```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("path/to/file.txt"));
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
    reader.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

- Để ghi dữ liệu vào một tệp văn bản, chúng ta có thể sử dụng lớp FileWriter và BufferedWriter:

```java
try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("path/to/file.txt"));
    writer.write("Hello, World!");
    writer.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

###### 2. Làm thế nào để xử lý ngoại lệ khi đọc một tệp trong Java?

- Khi đọc một tệp trong Java, chúng ta cần xử lý ngoại lệ IOException. Đây là một ví dụ về cách xử lý ngoại lệ khi đọc một tệp:

```java
try {
    BufferedReader reader = new BufferedReader(new FileReader("path/to/file.txt"));
    // Đọc dữ liệu từ tệp
    reader.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

- Trong trường hợp xảy ra lỗi khi đọc tệp, ngoại lệ IOException sẽ được bắt và xử lý.

###### 3. Bạn đã sử dụng các thư viện nào để xử lý tệp trong dự án Java của mình trước đây không?

- Ví dụ như Apache Commons IO, Java NIO, etc. Đây là một cơ hội để bạn chia sẻ kinh nghiệm của mình với các thư viện xử lý tệp như Apache Commons IO, Java NIO, etc. Nếu bạn đã sử dụng chúng, hãy cung cấp ví dụ cụ thể về cách bạn đã áp dụng chúng trong dự án của mình.

###### 4. Làm thế nào để đọc và ghi dữ liệu từ một tệp nhị phân trong Java?

- Để đọc và ghi dữ liệu từ một tệp nhị phân trong Java, chúng ta có thể sử dụng lớp FileInputStream và FileOutputStream như sau:

```java
// Đọc dữ liệu từ tệp nhị phân:
try {
    FileInputStream fis = new FileInputStream("path/to/file.bin");
    int data;
    while ((data = fis.read()) != -1) {
        System.out.print((char) data);
    }
    fis.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

```java
// Ghi dữ liệu vào tệp nhị phân:
try {
    FileOutputStream fos = new FileOutputStream("path/to/file.bin");
    fos.write("Hello, World!".getBytes());
    fos.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

- Trong cả hai trường hợp, chúng ta cần xử lý ngoại lệ IOException.

###### 5. Bạn có thể giải thích cách sử dụng Java 8 Stream để đọc và xử lý dữ liệu từ một tệp không?

- Trong Java 8, chúng ta có thể sử dụng Stream API để đọc và xử lý dữ liệu từ một tệp. Ví dụ sau đây minh họa cách sử dụng Stream để đọc dữ liệu từ một tệp văn bản và in ra màn hình:

```java
try {
    Stream<String> lines = Files.lines(Paths.get("path/to/file.txt"));
    lines.forEach(System.out::println);
    lines.close();
} catch (IOException e) {
    e.printStackTrace();
}
```

- Trong ví dụ trên, chúng ta sử dụng Files.lines() để tạo một Stream từ các dòng trong tệp và sau đó sử dụng forEach để in từng dòng ra màn hình.

###### 6. Làm thế nào để kiểm tra xem một tệp có tồn tại hay không trong Java?

- Để kiểm tra xem một tệp có tồn tại hay không trong Java, chúng ta có thể sử dụng phương thức exists() của lớp File như sau:

```java
File file = new File("path/to/file.txt");
if (file.exists()) {
    System.out.println("File exists");
} else {
    System.out.println("File does not exist");
}
```

###### 7. Bạn đã từng làm việc với các định dạng tệp như JSON, XML trong Java chưa? Làm thế nào để đọc và ghi dữ liệu từ các định dạng này?

- Nếu bạn đã làm việc với các định dạng tệp như JSON, XML trong Java, hãy chia sẻ cách bạn đã đọc và ghi dữ liệu từ các định dạng này. Ví dụ, để đọc dữ liệu từ một tệp JSON, chúng ta có thể sử dụng thư viện Gson như sau:

```java
Gson gson = new Gson();
try (Reader reader = new FileReader("path/to/file.json")) {
    // Convert JSON to Java Object
    MyObject obj = gson.fromJson(reader, MyObject.class);
    System.out.println(obj);
} catch (IOException e) {
    e.printStackTrace();
}
```

- Đối với việc ghi dữ liệu vào tệp JSON, chúng ta có thể sử dụng thư viện Gson như sau:

```java
Gson gson = new Gson();
MyObject obj = new MyObject();
try (Writer writer = new FileWriter("path/to/file.json")) {
    // Convert Java Object to JSON and write to file
    gson.toJson(obj, writer);
} catch (IOException e) {
    e.printStackTrace();
}
```

- Đối với việc đọc và ghi dữ liệu từ tệp XML, chúng ta có thể sử dụng thư viện JAXB hoặc DOM Parser.
