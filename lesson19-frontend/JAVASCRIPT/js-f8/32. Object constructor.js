
// Object constructor


// có thể sử dụng declaration function or expression function để tạo ra object constructor 

function User(firstName, lastName, avatar) {
    // từ khóa this bên ngoài sẽ mô tả những thuộc tính
    // phương thức sẽ có cho đối tượng khi đc khởi tạo từ Object constructor User
    this.firstName = firstName;
    this.lastName = lastName;
    this.avatar = avatar;

    this.getName = function() {
        // tuừ khóa this trong này nó thuộc func getName
        // nó sẽ được gọi khi lấy đối tượng gọi đến 
        return `${this.firstName} ${this.lastName}`
        // lấy đối tượng nào gọi thì nó sẽ được gọi từ đối tượng đó (*)
    }
}

var author = new User('Ánh', 'Nguyên', 'Avatar');
var user = new User('Sơn', 'Đặng', 'Avatar');
// tuy hai đối tượng cùng đc khởi tạo từ cùng một bản thiết kế
// nhưng thêm thuộc tính thì nó không bị ảnh hưởng đến nhau
author.title = 'Chia sẻ dạo tại F8';
user.comment = 'liệu có khóa asp.net ko ad';

console.log(author);
console.log(user);



