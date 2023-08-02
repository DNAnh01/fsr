

// Promise chain

// promise có ba trạng thái
// 1. Pending
// 2. fulfilled
// 3. rejected


// function sleep(ms) {
//     return new Promise(function(resolve) {
//         setTimeout(resolve, ms);
//     });
// }

// sleep(1000)
//     .then(function () {
//         console.log(1);
//         return sleep(1000);
//     })
//     .then(function () {
//         console.log(2);
//         return new Promise(function(resolve, reject) {
//             reject("error");
//         });
//     })
//     .then(function () {
//         console.log(3);
//         return sleep(1000);
//     })
//     .then(function () {
//         console.log(4);
//         return sleep(1000);
//     })
//     .catch(function (error) { 
//         console.log(error);
//     });



// nếu 1 block then return ra 1 promise thì cais
// thèn then liền kề phải chờ promise này giải quyết
// thì nó mới chạy


// trong trường hợp 1 then trong chain bị reject thì các 
// then tiếp theo ko dc hoạt động


// Giả định hàm giữa người dùng từ API
function getUser() {
    return new Promise((resolve, reject) => {
        // Giả định một tác vụ bất đồng bộ, như gọi API
        setTimeout(() => {
            const user = { id: 1, name: "John Doe" };
            resolve(user); // Trả về kết quả sau khi tác vụ hoàn thành
        }, 1000);
    });
}

// Giả định hàm để lấy dữ liệu người dùng từ API dựa trên thông tin người dùng
function getUserData(user) {
    return new Promise((resolve, reject) => {
        // Giả định một tác vụ bất đồng bộ, như gọi API dựa trên thông tin người dùng
        setTimeout(() => {
            const userData = { userId: user.id, email: "john.doe@example.com" };
            resolve(userData); // Trả về kết quả sau khi tác vụ hoàn thành
        }, 1500);
    });
}

// Sử dụng Promise chaining để gọi hàm getUser và sau đó gọi hàm getUserData với kết quả từ getUser
getUser()
    .then((user) => {
        console.log("User info:", user);
        return getUserData(user); // Trả về một Promise khác từ block then
    })
    .then((userData) => {
        console.log("User data:", userData);
    })
    .catch((error) => {
        console.error("Error:", error);
    });
