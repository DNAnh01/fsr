/**
Một sô điều cần biết về function

1.  Khi function đặt trùng tên?
2.  Khai báo biến trong function?
3.  Định nghĩa hàm trong hàm?

*/
//1.  Khi function đặt trùng tên?
function showMessage() {
    console.log('Message 1');
}

function showMessage() {
    console.log('Message 2');
}

function showMessage() {
    console.log('Message 3');
}
showMessage(); // Message 3
// khi định nghĩa ra hai function trùng tên thì func định nghĩa sau cùng
// nó sẽ ghi đè func định nghĩa trước nó 

//2.  Khai báo biến trong function?
// thì phạm vi sử dụng của biến chỉ đc sử dụng trong func chứa biến đó
function getAccount() {
    var fullName = 'Nguyen Anh';
    console.log(fullName);
}
getAccount(); 

//3.  Định nghĩa hàm trong hàm?
function showMessage() {
    function showMessage2() {
        console.log('Message 2');
    }
    showMessage2();
}
// code trong môt hàm đc thực thi khi mà mk gọi hàm đó mà thôi
// showMessage();




