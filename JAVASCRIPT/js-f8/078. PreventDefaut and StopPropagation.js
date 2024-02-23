


// DOM events

// 1. preventDefault
// -> loại bỏ hành vi mặc định của trình duyệt trên 1 thẻ HTML






// 2. stopPropagation
// -> Ngăn chặn hành vi lan truyền nổi bọt

document.querySelector('div').onclick = function() {
    console.log('DIV');
}


document.querySelector('button').onclick = function(e) {
    e.stopPropagation();
    console.log('Click me');
}


