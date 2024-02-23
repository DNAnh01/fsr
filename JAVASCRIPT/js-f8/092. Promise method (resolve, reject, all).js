

// 1. Promise.resolve
// 2. Promise.reject
// 3. Promise.all


// var promise = Promise.resolve('Success');
// promise.then(function (result) {
//     console.log(result);
//     return new Promise(function (resolve, reject) {
//         reject('failure');
//     });
// }).catch(function (error) {
//     console.log(error);
// });

// với những logic nó đều là bất đồng bộ nhưng nó không phụ thuộc nhau
// thì chúng ta muốn chạy nó song song

var promise1 = new Promise(
    function (resolve) {
        setTimeout(function () {
            resolve([1]);
        }, 2000);
    }
);

var promise2 = new Promise(
    function (resolve) {
        setTimeout(function () {
            resolve([2, 3]);
        }, 5000);
    }
);

var promise3 = Promise.reject('co loi');

Promise.all([promise1, promise2, promise3])
    .then(function (result) {
        var result1 = result[0];
        var result2 = result[1];

        console.log(result1.concat(result2));
    })
    .catch(function (error) {
        console.log(error);
    });