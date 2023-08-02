

// Tagged template literals trong ES6

function highlight([first, ...strings], ...values) {
    return values.reduce((acc, cur) => [...acc, `<span>${cur}</span>`, strings.shift()],
    [first])
    .join("");
}

var course = 'Javascript';
var brand = 'F8';

const html = highlight`Hoc lap trinh ${course} tai ${brand}!`;
console.log(html);



