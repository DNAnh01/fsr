/**
    Các loại function

    1. Declaration function // hàm khai báo
    2. Expression function
    3. Arrow function

*/

showMessage();
//1. Declaration function
function showMessage() {
    console.log('Declaration function');
};
//2. Expression function
// có thể đặt tên cho nó or ko
// việc đặt tên cho expression func không có mục đích nào khác
// ngoài việc giúp chúng ta dễ hiểu
var showMessage2 = function () {
    console.log('Expression function');
};

setTimeout(function autoLogin() {

});
var myObject = {
    myFunction: function () {

    }
};

// hosting 
/**
khái niệm này giúp Declaration function có thể đc gọi trc khi đc định nghĩa

thèn expression func sẽ không đc gọi trc khi nó chưa đc định nghĩa
*/


// example expression function

// truyen duoi dang callback
setTimeout(function autoLogin() {

});

var myObject = {
    myFunction: function () {

    }
};

