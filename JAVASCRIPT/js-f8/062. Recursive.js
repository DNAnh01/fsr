// recursive
// hàm gọi lại chính nó
/**
    1. Xác định dc điểm dừng
    2. Logic handle -> tạo ra điểm dừng
 */
/**
    ex:
    Xóa các phần tử trùng trong mảng.
    input arr = ['a', 'b', 'c', 'd', 'a', 'a', 'c']
    output arr = ['a', 'b', 'c', 'd']
 */

// var arr = ['a', 'b', 'c', 'd', 'a', 'a', 'c'];

// console.log([...(new Set(arr))]);


// function recursive() {
//     recursive();
// }
// recursive();

// A -> Loop -> CPU
// A -> Recursive -> RAM


function countDown(num) {
    if(num > 0) {
        console.log(num);
        return countDown(num - 1);

    }
    return num;
}

// countDown(3);

function loop(start, end, callback) {
    if(start < end) {
        callback(start);
        return loop(start+1, end, callback);
    }
}

var array = ['Javascript', 'PHP', 'Ruby'];


loop(0, array.length, function(index) {
    console.log(array[index]);
})