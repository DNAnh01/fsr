
// result(initialValue, accumulator)
Array.prototype.reduce2 = function (callback, result) {
    let i = 0;
    // case: no param initialValue
    if (arguments.length < 2) {
        // khi ko truyen initialValue thi accumulator(bien tich tru) cua ta la phan tu dau tien cua mang
        i = 1;
        result = this[0];
    }
    for (; i < this.length; i++) { 
        result = callback(result, this[i], i, this);
    }
    return result;
}
// my reduce() method

const numbers = [1, 2, 3, 4, 5, 6];

const result = numbers.reduce2((total, number) => total + number);
console.log(result); //21