/**
Math object

- Math.PI
- Math.round() // làm tròn
- Math.abs()
- Math.ceil() // làm tròn trên
- Math.floor() // làm tròn dưới
- Math.random()
- Math.min()
- Math.max()

 */
console.log("🚀 ~ file: 54. Math object.js:15 ~ Math.PI:", Math.PI); // 3.141592653589793

console.log("🚀 ~ file: 54. Math object.js:6 ~ Math.round():", Math.round(3.141592653589793)); // 3


var random = Math.floor(Math.random() * 100); // 0-99 
 
if (random < 50) {
    console.log('No hu mau binh');
}

// var bonus = [
//     '10 coin',
//     '20 coin',
//     '30 coin',
//     '40 coin',
//     '50 coin',
//     '60 coin',
// ];
// console.log(bonus[random]);


console.log(Math.min(1, 40, -5, -10, 199));
