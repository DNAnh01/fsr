
// Đối tượng Date

var date1 = new Date();
console.log(date1); // Thu Mar 02 2023 01:14:07 GMT+0700 (Indochina Time)
console.log(typeof date1); // object

var date2 = Date();
console.log(date2); // Thu Mar 02 2023 01:14:07 GMT+0700 (Indochina Time)
console.log(typeof date2); // string

var year = date1.getFullYear();
var month = date1.getMonth() + 1; // 1 -> 12
var day = date1.getDate();

console.log(`${day}/${month}/${year}`);





// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date
