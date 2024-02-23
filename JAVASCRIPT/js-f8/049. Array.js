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

// hàm được truyền dưới một tham số được gọi là callback

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

// duyệt qua từng element trong mảng
// courses.forEach(function(course, index) {
//     console.log(index, course);
// });



// kiểm tra tất cả các phần tử của mảng phải thỏa mảng một điều kiện gì đó và return boolean 
// var isFree = courses.every(function(course, index) {
//     return course.coin === 0;
// });

// // console.log(isFree)


// chỉ cần 1 ông trong mảng trả về điều điện đó thì ngừng vòng lặp
// var isFree = courses.some(function(course, index) {
//     return course.coin === 0;
// });
// console.log(isFree)


// trả về cho ta một đối tượng nếu phần tử đó thỏa mãn điều điện 
// var course = courses.find(function(course, index) {
//     return course.name === 'PHP'
// });
// console.log(course)

// var lstCourse = courses.filter(function(course, index) {
//     return course.name === 'PHP'
// });

// console.log(lstCourse)

// map: sẽ duyệt qua từng phần tử của mảng, mỗi khi .map() duyệt qua tới phần tử nào
// thì nó sẽ call lại function mà chúng ta đã truyền 

// tham số, đối số của .map() có thể là declaration func or expression func

// cái func truyền vào cho thèn map mà return về cái gì thì nó sẽ lấy cái đó làm element


// được sử dụng nếu muốn thay đổi các element của một array
function courseHandler(course, index, originArray) {
    // console.log(course)
    
    return {
        id: course.id,
        name: `Khoa hoc: ${course.name}`,
        coin: course.coin,
        coinText: `Gia: ${course.coin}`,
        index: index,
        originArray: originArray
    };
}

var newCourses = courses.map(courseHandler);

console.log(newCourses);

// console.log(newCourses.slice(1, 3));

// reduce
// 1. Dễ hiểu
// 2. Ngắn gọn
// 3. Hiệu năng



// var totalCoin = 0;

// for (var course of courses) {
//     totalCoin += course.coin;
// }
// console.log(totalCoin)

// var i = 0;

// function coinHandler(accumulator, currentValue, currentIndex, originArray) {
//     i++;
//     console.log(i);
// }


// var totalCoin = courses.reduce(coinHandler, 0);






