

// 1. DOM event  / Event listener
// -> chúng ta có thể sử dụng DOM event trong những case rất đơn giản
// ví dụ muốn lắng nghe sự kiện nào đó và không có nhu cầu gỡ bỏ nó đi

// 2. JSON
// 3. Fetch
// 4. DOM location
// 5. Local storage
// 6. Session storage
// 7. Coding convention
// 8. Best Practices
// 9. Mistakes
// 10. Performance

// 1. Xử lý nhiều việc khi 1 event xảy ra
// 2. Lắng nghe / hủy bỏ lắng nghe

var btn = document.getElementById('btn');

// setTimeout(function() {
//     btn.onclick = function() {
//         // Viec 1
//         console.log('CV1');
//         // Viec 2
//         console.log('CV2');
//         // Viec 3
//         alert('CV3');
//     }
// }, 5000);

/// hủy bỏ lắng nghe bằng cách gán lại cho sự kiện DOM event bằng 1 function rỗng



// làm thế nào để lắng nghe sự kiện (event listener)

btn.addEventListener('click', function(e) {
    console.log(Math.random());
});

// mỗi addEventListener được thêm vào 1 callback thì callback đó
// đều dc gọi theo thứ tự add vào


