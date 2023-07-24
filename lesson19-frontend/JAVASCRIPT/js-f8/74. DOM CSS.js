

// DOM style


var boxElement = document.querySelector('.box');

// console.log(boxElement.style);

boxElement.style.width = '100px';
boxElement.style.height = '200px';
boxElement.style.backgroundColor = 'green';
boxElement.style.borderRadius = '30px 0 30px 0';

// sinh ra CSS inline 
Object.assign(boxElement.style, {
    width: '100px',
    height: '100px',
    backgroundColor: 'red',
    borderRadius: '50%'
});

console.log(boxElement.style.backgroundColor);