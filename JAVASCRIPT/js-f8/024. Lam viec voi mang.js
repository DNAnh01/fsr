/*
Làm việc với Array

1. To string
2. Join 
3. Pop          | xóa đi phần tử cuối mảng và trả về chính phần tử đã xóa
4. Push         | thêm một hoặc nhiều phần tử vào cuối mảng và trả về độ dài của mảng sau đó
5. Shift        | xóa đi phần tử ở đầu mảng và trả là phần tử đã xóa
6. Unshift      | thêm một hoặc nhiều phần tử vào đầu mảng và trả về độ dài của mảng sau đó
7. Splicing     | thêm, xóa một phần tử bất kỳ nằm trong mảng
8. Concat       | giúp ta có thể nối được array
9. Slicing
*/

var languages = [
    'Javascript',
    'PHP',
    'Ruby'
];




console.log(languages.splice(1, 2)); // (2) ['PHP', 'Ruby']
console.log(languages); // ['Javascript']

console.log(languages.splice(1, 0, 'PHP', 'Ruby'));
console.log(languages); // ['Javascript', 'PHP', 'Ruby']

console.log(languages.toString()); //Javascript,PHP,Ruby
console.log(typeof languages.toString()); //string

console.log(languages.join('')); //JavascriptPHPRuby

console.log(languages.pop()); // Ruby

console.log([].pop()); //undefined

console.log(languages.push('Dart', 'Java')); // 4

console.log(languages.shift()); //Javascript

console.log([].shift()); //undefined

console.log(['1', '2', '3'].unshift('unshift'));






