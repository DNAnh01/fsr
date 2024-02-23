

// DOM attributes


// attribute là một nhánh từ element đi ra
// vì vậy để tương tác với attribute thì đầu tiên phải get ra đc element


var headingElement = document.querySelector('h1');

// setter
// headingElement.id = 'Heading';
// headingElement.className = 'Heading';


// thuộc tính hợp lệ của thẻ h1
headingElement.title = 'Title test';
console.log(headingElement.title); // Title test

// set thuộc tính mới (not default) cho thẻ h1 
headingElement.setAttribute('href', 'anchor');
console.log(headingElement.getAttribute('href')); // anchor





