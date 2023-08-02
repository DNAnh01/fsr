

// Promise 

// - sync
// - async

// setTimeout, setInterval, fetch,
// XMLHttpRequest, file reading
// request animation frame

// Đồng bộ là thằng nào viết trước chạy trc thằng nào viết sau chạy sau


// setTimeout(function () {
//     console.log("1");
// })
// console.log("2");

// Callback hell
// Pyramid doom

// setTimeout(function () {
//     console.log(1); // cong viec 1
//     setTimeout(function () {
//         console.log(2); // cong viec 2
//         setTimeout(function () {
//             console.log(3); // cong viec 3
//             setTimeout(function () {
//                 console.log(4); // cong viec 4
//             }, 1000);
//         }, 1000);
//     }, 1000);
// }, 1000);


// 1. new Promise
// 2. Executor

// Memory leak

// 1. khi ko resolve, ko reject thi dang o Pending
// 2. fulfilled
// 3. reject

var promise = new Promise(
    // Executor
    function (resolve, reject) {
        // Logic
        // Thành công: resolve()
        // Thất bại: reject()

        // Fake call API
        // resolve([
        //     {
        //         id: 1,
        //         name: "Javascript",
        //     }
        // ]);
        reject('Cos loi');
    }
);

promise
    .then(function (courses) {
        console.log(courses);
    })
    .catch(function (error) {
        console.log(error);
    })
    .finally(function () {
        console.log('done');
    });

/// Câu hỏi phỏng vấn:
/**
 * Promise là một khái niệm sinh ra để xử lý các quy tắc bất đồng bộ
 * và trc khi có promise thì chúng ta thường sử dụng callback
 * và callback nó thường xảy ra vấn đề là callback hell
 * làm code bị rối, khó nhìn, khó hiểu
 * 
 * --> thèn promise sinh ra (ES6) để khắc phục tình trạng callback hell
 * 
 */