/**

    Array methods
        forEach()
        every()
        some()
        find() return 1 obj
        filter() trả về tất cả phần tử thỏa mãn
        map()
        reduce()
 */

var courses = [
    {
        id: 1,
        name: 'Javascript',
        coin: 250
    },
    {
        id: 2,
        name: 'HTML, CSS',
        coin: 0
    },
    {
        id: 3,
        name: 'Ruby',
        coin: 0
    },
    {
        id: 4,
        name: 'PHP',
        coin: 400
    },
    {
        id: 5,
        name: 'ReactJS',
        coin: 500
    },
    {
        id: 6,
        name: 'PHP',
        coin: 0
    }
]

// courses.forEach(function(course, index) {
//     console.log(index, course);
// });

// var isFree = courses.every(function(course, index) {
//     return course.coin === 0;
// });

// console.log(isFree)

// var isFree = courses.some(function(course, index) {
//     return course.coin === 0;
// });
// console.log(isFree)

// var course = courses.find(function(course, index) {
//     return course.name === 'PHP'
// });
// console.log(course)

// var lstCourse = courses.filter(function(course, index) {
//     return course.name === 'PHP'
// });

// console.log(lstCourse)

// map

// function courseHandler(course, index, originArray) {
//     // console.log(course)
//     return {
//         id: course.id,
//         name: `Khoa hoc: ${course.name}`,
//         coin: course.coin,
//         coinText: `Gia: ${course.coin}`,
//         index: index,
//         originArray: originArray
//     };
// }

// var newCourses = courses.map(courseHandler);

// console.log(newCourses)

// reduce
// 1. Dễ hiểu
// 2. Ngắn gọn
// 3. Hiệu năng



// var totalCoin = 0;

// for (var course of courses) {
//     totalCoin += course.coin;
// }
// console.log(totalCoin)

var i = 0;

function coinHandler(accumulator, currentValue, currentIndex, originArray) {
    i++;
    console.log(i);
}


var totalCoin = courses.reduce(coinHandler, 0);






