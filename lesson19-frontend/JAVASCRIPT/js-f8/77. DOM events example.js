


// DOM events


// 1. Input / select
// 2. Key up / down


// 1. Input / select
var inputValue;
var inputTextElement = document.querySelector('input[type="text"]');
inputTextElement.oninput = function(e) {
    // console.log(e.target.value);
};

var inputCheckElement = document.querySelector('input[type="checkbox"]');
inputCheckElement.onchange = function(e) {
    console.log(e.target.checked); // true
};


var inputSelectElement = document.querySelector('select');
inputSelectElement.onchange = function(e) {
    console.log(e.target.value);
};



// 2. Key up / down

inputTextElement.onkeyup = function(e) {
    console.log(e.which);

    switch (e.which) {
        case 27:
            console.log('Exit');
            break;
    }
};