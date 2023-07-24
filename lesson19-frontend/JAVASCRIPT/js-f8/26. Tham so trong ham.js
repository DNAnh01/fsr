// Tham số hàm - Javascript cơ bản

/**
1. Tham số?
    - Định nghĩa?
    - Kiểu dữ liệu? -> ko giới hạn
    - Tính private -> một biến là tham số ở trong một function nó sẽ có tính private
    - 1 tham số
    - Nhiều tham số

2. Truyền tham số
    - 1 tham số
    - nhiều tham số

3. Arguments?
    - Đối tượng arguments -> chỉ được định nghĩa bên trong một function
    - giới thiệu vòng for of

 */

function writeLog() {
    var myString = '';
    for (var param of arguments) {
        myString += `${param} --`;
    }
    console.log(myString); 
}

writeLog('Hello world', 'My name is Jame', 'I\'m 22 years old'); //Hello world --My name is Jame --I'm 22 years old --