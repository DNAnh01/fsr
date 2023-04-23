/**
    Object prototype - Basic 

        1. Prototype là gì?
        2. Sử dụng khi nào?

 */
function User(firstName, lastName, avatar) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.avatar = avatar;
    this.getName = function() {
        return `${this.firstName} ${this.lastName}`
    }
}

// giúp thêm thuộc tính ở bên ngoài hàm constructor
// và nó sẽ nằm trong __proto__
User.prototype.className = 'F8';
User.prototype.getClassName = function () {  
    return this.className;
}

var author = new User('Ánh', 'Nguyên', 'Avatar');
var user = new User('Sơn', 'Đặng', 'Avatar');

author.title = 'Chia sẻ dạo tại F8';
user.comment = 'liệu có khóa asp.net ko ad';

console.log(author.className);
console.log(user);



