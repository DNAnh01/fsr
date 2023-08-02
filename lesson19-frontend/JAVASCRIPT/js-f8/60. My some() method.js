// some()
// tối thiểu phần tử nào trong mảng mà thỏa mãn điều kiện
// return true or false

// đưa empty array thì some() sẽ không lặp ra các phần tử trống

Array.prototype.some2 = function(callback) {
    for (var index in this) {
        if(this.hasOwnProperty(index)) {
            if(callback(this[index], index, this)) {
                return true;
            }
        }
    }
    return false;
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
        isFinish: true
    }
];

var result = courses.some(function(course, index, array) {
    return course.isFinish === true;
});

console.log(result);

