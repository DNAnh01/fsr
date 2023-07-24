// REDUCE: 
/**
 * khi muốn nhận về một giá trị duy nhất sau khi handle gì đó các element trong một array
 * 
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
];
// // biến lưu trữ
// var totalCoin = 0
// // lặp qua các phần tử 
// for (var course of courses) {
//     // thực hiện việc lưu trữ
//     totalCoin += course.coin;
// }
// console.log("🚀 ~ file: 51. Array reduce() method.js:37 ~ totalCoin:", totalCoin)

// reduce
var i = 0;
function coinHandler(accumulator, currentValue, currentIndex, originArray) {
    i++;
    var total = accumulator + currentValue.coin;

    console.table({
        'Lượt chạy: ': i,
        'Biến tích trữ: ': accumulator,
        'Giá khóa học: ': currentValue.coin,
        'Tích trữ được: ': total
    });
    console.log(currentValue);
    return total;
}
// originArray va course cùng trỏ về một v
var totalCoinUsingReduce = courses.reduce(coinHandler, 0); // initial value = 0
console.log("🚀 ~ file: 51. Array reduce() method.js:61 ~ totalCoinUsingReduce:", totalCoinUsingReduce)

// initial value = 0 sẽ được gán cho accumulator trong lần chạy đầu tiên

// reduce sẽ return lại giá trị sau cùng tích trữ đc

