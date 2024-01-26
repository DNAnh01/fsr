```

Bài 1(30đ): Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
Với sinh viên có học lực loại F bắt buộc phải đăng ký học lại.

Student[] students
{
new Student(102, "Nam", C),
new Student(103, "Bảo", F),
new Student(104, "Hoàng", D),
new Student(105, "Nguyên", B),
new Student(107, "Vũ", F),
new Student(109, "Lan", A),
new Student(202, "Đạt", C),
new Student(103, "Bảo", F),
new Student(107, "Vũ", C),
new Student(104, "Hoàng", B)
}


 Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
 Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.

Method signature: getStudents(...) >> Student[]


Bài 2(30đ): Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
Ví dụ: với n = 1 : xâu 01a2b3456cde478 : Kết quả: 3456
với n = 2 : xâu aa6b546c6e22h, aa6b326c6e22h: Kết quả: 326, 546
Method signature: getLargestNumbers(String ...ss) >> String[]


Bài 3(20đ): Cho dãy kí tự chứa các kí tự thường và khoảng trắng.
Viết chương trình loại bỏ khoảng trắng thừa và đảo chuỗi như sau:
Example: input: Welcome to JAVA10 class
output: emocleW ot 01AVAJ ssalc
Method signature: revert(String s) >> String


Bài 4(20đ): Viết chương trình thực hiện chức năng đăng ký tài khoản
B1. Nhập tên tài khoản ví dụ byztkhx256
B2. Nhập mật khẩu admin123
Yêu cầu mật khẩu như sau:
1. Độ dài mật khẩu: >= 8
2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
```
