

// innerHTML property

// thêm một element vào trong một element đã có sẵn


// 1. innerHTML
// 2. outerHTML 

// innerHTML, outerHTML là hai thuộc tính của element node
// mà không thể thêm các tag(element node) vào DOM mà chỉ thêm đc text node 

var boxElement = document.querySelector('.box');

// thêm trực tiếp dưới dạng là element node vào trong một element node khác
// tính từ thời điểm thêm element h1 vào DOM  thì mk có thể get đc
boxElement.innerHTML = '<h1 id="inner-html-id">new text</h1>';

boxElement.querySelector('#inner-html-id').setAttribute('style', 'color: green;');


boxElement.querySelector('h1').innerHTML = '<h2>hello</h2>';
console.log(boxElement.querySelector('h1').innerText);


console.log(typeof boxElement.querySelector('h1').innerHTML); // string



// outerHTML


