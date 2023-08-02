

// Enhance object literals

// 1. Định nghĩa key: value cho object 
// 2. Định nghĩa method cho object
// 3. Định nghĩa key cho object dưới dạng biến

var name = 'Javascript';
var price = 1000;

var course = {
    name,
    price,
    getName() {  
        return name;
    }
};
console.log(course.getName());


