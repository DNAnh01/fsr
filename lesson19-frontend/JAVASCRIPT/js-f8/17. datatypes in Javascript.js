/*
Kiểu dữ liệu trong Javascript

1. Dữ liệu nguyên thủy - Primitive Data
    - Number
    - String
    - Boolean
    - Undefine
    - Null
    - Symbol




2. Kiểu dữ liệu phức tạp -Complex Data
    - Function
    - Object
*/

var a = 1; // giá trị này sẽ được lưu vào một vùng nhớ
a = 2; // vùng nhớ khác sẽ dc tạo ra và gán giá trị 2 vào
// không có cách nào để gán lại vùng nhớ đó 


// Number type
var b = 2;
let c = 4;

// String type
var fullName = 'Nguyen A\'nh';

// Boolean type
var isSuccess = true;

// Undefine type
// khi định nghĩa ra một biến mà không gán giá trị cho nó

let age; // typeof undefine

// null
var isNull = null;
console.log(typeof isNull); // object

// Symbol
// được ra đời 2015 trong phiên bản ES6
var id = Symbol('id'); // unique
var id2 = Symbol('id');

console.log(id === id2); // false
console.log(typeof id); // Symbol

var myFunction = function () {
    alert('Hi xin chao cac ban');
}

myFunction();

// Object types

var myObject = {
    name: 'Nguyen Anh',
    age: 22,
    address: 'Quang Nam' ,
    myFunction: function () {

    }
};

console.log('myObject: ', myObject);


// Array
// Array vẫn thuộc Object type

var myArray = [
    'Java',
    'Javascript',
    'PHP'
];

console.log(typeof myArray);
