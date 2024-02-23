

// ClassList Property
// add             | thêm class vào element 
// contains        | kiểm tra 1 class có nằm trong element này hay ko
// remove          | xóa bỏ 1 class khỏi element
// toggle          | nếu 1 class ở element thì nếu gọi đến thì sẽ xóa class đó còn nếu không có thì sẽ thêm vào


// cũng giống như style, đây là thuộc tính của element node cho nên chỉ truy cập đc 
// khi lấy ra element node


var boxElement = document.querySelector('.box');

// console.log(boxElement.classList); // DOMTokenList 

// console.log(typeof boxElement.classList.value);
// console.log(boxElement.classList);

boxElement.classList.add('red');

// kiểm tra một element có class red hay ko 
// console.log(boxElement.classList.contains('red'));

setInterval(() => {
    boxElement.classList.toggle('red');
}, 500);




