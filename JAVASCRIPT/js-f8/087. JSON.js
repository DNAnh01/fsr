

// JSON 

// 1. Là một định dạng dữ liệu (chuỗi)
// 2. Javascript Object Notation
// 3. JSON: Number, String, Boolean, Null, Array
// Object 


// Mã hóa / Giải mã 
// Encode / Decode
// Stringify: Từ Javascript types -> JSON 
// Parse: Từ JSON -> Javascript types

// var json = 'true';
// var json = '["Javascript","Java"]';

// var json = '{"name":"Ngyuen Anh", "age":18}';


var a = '["Javascript","Java"]';
console.log(JSON.parse(a));

console.log(JSON.stringify({fullName: 'Nguyen Anh'}));
