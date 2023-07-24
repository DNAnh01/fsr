// forEach
/**
    khi định nghĩa ra một phương thức mới cho constructor Array
    

    đặc tính của thèn for in nó không chỉ duyệt qua các element hiện hữu
    nằm trong mảng mà còn duyệt qua cả các elements nằm trong thèn __proto__
 
 
    1. Object prototype 
    2. For in
    3. hasOwnProperty
    */
// Array.prototype.textMethod1 = 1;

// Array.prototype.textMethod2 = function() {

// };

Array.prototype.forEach2 = function (callback) {

    for (var index in this) {
        // kiểm tra các elements có phải là các thuộc tính, phương thức gần nhất
        if (this.hasOwnProperty(index)) {
            callback(this[index], index, this);
        }
    }
};

var courses = new Array(100);
courses.push(
    'Javascript',
    'Java',
    'PHP',
    'Python',
    'Ruby');

// var courses = [
//     'Javascript',
//     'Java',
//     'PHP',
//     'Python',
//     'Ruby'
// ];



var output = courses.forEach2(function (course, index, array) {
    console.log(course, index, array);
});
// console.log("🚀 ~ file: 58. My forEach() method.js:14 ~ output ~ output:", output);// undefined




