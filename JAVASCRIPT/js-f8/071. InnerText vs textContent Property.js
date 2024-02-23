

// text node

// 1. innerText
// 2. textContent

// tương tự như việc tương tác với attribute node thì việc đầu tiên
// ta cần phải lấy ra element node (parent) của text node đó



// getter:
// innerText thì nội dung lấy được sẽ giống như nội dung hiển thị trên trình duyệt 
// textContent thì nội dung lấy đc sẽ là nội dung text thật của nó nằm trong DOM

// setter

// sự khác nhau giữa innerText và textContent

var headingElement = document.querySelector('h1');
// console.log("🚀 ~ file: 71. InnerText vs textContent Property.js:12 ~ headingElement:", headingElement)

// sự thay đổi này xảy ra khi mà mã js được thực thi
// headingElement.innerText = 'New heading';


console.log(headingElement.innerText);
// text

console.log(headingElement.textContent);
/**
 * 
        Heading
        text
 */