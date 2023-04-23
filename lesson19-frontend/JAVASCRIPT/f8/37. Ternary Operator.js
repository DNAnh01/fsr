// Toán tử 3 ngôi - Ternary operator
var course = {
    name: 'Javascript',
    coin: 250
}

// if(course.coin > 0) {
//     console.log(`${course.coin} Coins`);
// } else {
//     console.log('Free');
// }

var result = course.coin > 0 ? `${course.coin} Coins` : 'Free';

console.log(result)