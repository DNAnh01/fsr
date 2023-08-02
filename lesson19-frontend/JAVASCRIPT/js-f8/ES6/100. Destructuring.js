

// Destructuring


// var array = ['Javascript', 'PHP', 'Java'];

// var [a, ...rest] = array;
// console.log(a);
// console.log(rest);

// `...` là toán tử rest nếu nó sử dụng trong destructuring

// var object = {
//     name: "Javascript",
//     price: 100,
//     image: 'image',
//     getName() {
//         return this.name;
//     }
// }
// var {name, price, image, ...rest} = object;

// console.log('rest: ', rest);

// var courses = [
//     'Javascript',
//     'Java',
//     'PHP'
// ]

// // destructuring and rest operator
// var [a, , ...rest] = courses;
// console.log(a, rest);




function myFunc(...params) { 
    // console.log("", params); //(3) [1, 2, 3]
    console.log(arguments);
}

myFunc(1, 2, 3);
/**
 * rest sử dụng kết hợp với việc sử dụng destructuring
 * và sử dụng cho việc định nghĩa ra tham số của hàm
 * 
 * còn khi truyền đối số thì đây là spread
 * và khi dùng để rãi nó cho 1 array trong 1 object khác thì nó chính
 * là spread
 */

