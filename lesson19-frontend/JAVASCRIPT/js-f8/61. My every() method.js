
// every()
// kiểm tra tất cả elements trong mảng phải cùng thỏa mãn điều kiện
// return true or false

Array.prototype.every2 = function (callback) {
    var output = true;
    for (var index in this) {
        if (this.hasOwnProperty(index)) {
            var result = callback(this[index], index, this);
            if(!result) {
                output = false;
                break;
            }
        }
    }
    return output;
}

var courses = [
    {
        name: 'Javascript',
        coin: 680,
        isFinish: false
    },
    {
        name: 'PHP',
        coin: 860,
        isFinish: false
    },
    {
        name: 'Python',
        coin: 980,
        isFinish: false
    }
];

var result = courses.every(function(course, index, array) {
    return course.coin > 700;
});
console.log(result);