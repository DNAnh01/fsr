```
- Bài 1 (15đ): Viết hàm kiểm tra một số có phải là lũy thừa của một số khác không
    - VD: (8, 2)(true), (2, 8)(true), (6, 2)(false), (20, 4)(false), (64, 4)(true)
    - Method signature: boolean isPowerOf(int a, int b)

- Bài 2 (15đ): Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
    - VD1: n = 6, Ak = [3, 2, 1, 6, 5]
    - Phần tử cần tìm có giá trị: 4
    - VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
    - Phần tử cần tìm có giá trị: 8
    - Method signature: int getMissingNumber(...)

- Bài 3 (20đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [1, 10]
Tìm bội chung nhỏ nhất của các phần tử trong mảng
    -  VD1: Ak = [2, 3] >> BCNN = 6
    -  VD2: Ak = [2, 3, 4] >> BCNN = 12
    - Method signature: int getLeastCommonMultiple(....)

- Bài 4 (20đ): Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết quả
trả về được sắp xếp tăng dần.
    - Input: 3, 15, 21, 0, 15, 17, 21
    - Output: 0, 3, 17
    - Method signature: int[] getUniqueNumbers(....)

- Bài 5 (30đ): Viết chương trình mô phỏng việc mua bán sách giữa khách hàng và
nhân viên trong cửa hàng A.
    - Thông tin về các loại sách và khách hàng được mô tả như sau:
        - Khách hàng: Mã khách hàng, họ tên, số điện thoại, địa chỉ
        - Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
        - Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.
        - Biết rằng:
            - Sách giáo khoa sẽ có mã sách bắt đầu là SGK
            - Sách tham khảo sẽ có mã sách bắt đầu là STK
    - Thực hiện các yêu cầu sau:
        - Viết hàm tạo dữ liệu sách cho cửa hàng.
            - Tạo 3 đối tượng Sách Giáo Khoa
            - Tạo 2 đối tượng Sách Tham Khảo
            - Lưu danh sách các đối tượng vào mảng một chiều duy nhất
        - Viết hàm thực hiện lần lượt các chức năng sau đây:
        - Tìm toàn bộ sách thuộc nhà xuất bản Nhi Đồng
        - Tìm toàn bộ sách có đơn giá nhỏ hơn 50
        - Tìm toàn bộ sách giáo khoa có đơn giá từ 100 đến 200
        - Thực hiện giải lập. Khách hàng mua 1 cuốn sách giáo khoa, 1 cuốn sách tham khảo. Viết hàm tính tổng tiền mà khách hàng phải thanh toán. Biết rằng:
            - Sách giáo khoa - TextBook: Giảm 30% với sách cũ
            - Sách tham khảo - ReferBook: Thành tiền = đơn giá * (1 + % thuế)
```
