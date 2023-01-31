// everything is object

// declaration function
function sum(a, b) {
    return a + b;
}

function print(preText,input) {
    console.log(preText + ": " + input);
}

let result = sum(2, 10);
print("Sum of 2 and 10", result)

// arrow function, anonymous function : the same lamda in java08+
// expression function
// sub is object type, everything(object, function) is object in JS

let sub = (a, b) => a-b;
print("Sub of 20 and 5", sub(20, 5));

console.log("----------------")

// callback function: trong một hàm có tham số truyền một hàm khác
// khái niệm này khá giống với lamda trong java8


let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
function filter(elements, callback) {
	for (let element of elements) {
		if (callback(element)) {
			console.log("matched element: " + element);
		}
	}
}

function isEven(element) {
	return element %2 == 0;
}
//  callback <-> isEven
// filter(numbers, isEven);

// filter(numbers, function(element) {return element %2 != 0; });

// the same stratery pattern in java
filter(numbers, element => element % 5 == 0);
