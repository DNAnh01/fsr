

// DOM events
// những hành vi, sự kiện diễn ra ở trong DOM

// Attribute events
// Assign event using the element node


// trong trường hợp ta click vào thẻ con của thẻ đang sử dụng DOM event
// thì sự kiện nó cũng đc diễn ra

var h1Element = document.querySelector('h1');

document.querySelector('h1').onclick = function () {
    console.log(Math.round(Math.random() * 99) + 1);
};


