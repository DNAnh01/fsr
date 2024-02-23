// Callback?

// Là hàm (function) được truyền qua đối số
// khi gọi hàm khác

// 1. Là hàm
// 2. Được truyền qua đối số

function myFunction(param) {
    if (typeof param === "function") {
        param(123);
    }
}

function myCallback(value) {
    console.log("Value: ", value);
}

// myCallback(123);

myFunction(myCallback);

// callback lesson 2

console.log("callback lesson 2\n-------------------------------");
// 1. Là hàm
// 2. Truyền qua đối số
// 3. Đc gọi lại (trong hàm nhận đối số)

var courses = ["Javascript", "Java", "PHP", "C++"];

Array.prototype.map2 = function (callback) {
    // this chính là cái thèn gọi tới phương thức map2
    var output = [];
    var arrLength = this.length;
    for (var i = 0; i < arrLength; ++i) {
        var result = callback(this[i], i);
        output.push(result);
    }
    return output;
};

var htmls = courses.map2(function (course) {

    return `<h2>${courses}</h2>`;
});
console.log("🚀 ~ file: 55. Callback in Javascript.js:47 ~ htmls ~ htmls:", htmls)

// console.log(courses.map(function (courses) {
//     return `<h2>${courses}</h2>`;
// }).join(''));
