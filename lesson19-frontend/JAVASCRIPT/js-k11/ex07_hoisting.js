// functions
// var calculateAge = function(yearOfBirth);
// everything in JavaScrip is Object
calculateAge(1999); // hoisting for function declaration and not for function epression

// function declaration
function calculateAge(yearOfBirth) {
	console.log('Age: ' + (new Date().getFullYear() - yearOfBirth));
}

// function expression
// đây là hoisting của biến chứ ko phải hoisting của function

// var retirement = undefined;	
// retirement(1995);

var retirement = function(yearOfBirth) {
	console.log("Retirement in: " + (65 - (new Date().getFullYear() - yearOfBirth)));
}

retirement(1995);

// variables
// var age = undefined;
console.log(age);
var age = 36;
console.log(age);


