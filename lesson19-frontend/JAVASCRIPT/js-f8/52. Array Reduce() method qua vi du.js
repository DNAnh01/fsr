var courses = [
  {
    id: 1,
    name: "Javascript",
    coin: 250,
  },
  {
    id: 2,
    name: "HTML, CSS",
    coin: 0,
  },
  {
    id: 3,
    name: "Ruby",
    coin: 0,
  },
  {
    id: 4,
    name: "PHP",
    coin: 400,
  },
  {
    id: 5,
    name: "ReactJS",
    coin: 500,
  },
  {
    id: 6,
    name: "PHP",
    coin: 0,
  },
];

var i = 0;
var totalCoin = courses.reduce(function (total, course) {
  // i++;
  // console.log(i, total, course)
  return total + course.coin;
}, 0);

console.log(
  "🚀 ~ file: 52. Array Reduce() method qua vi du.js:36 ~ totalCoin ~ totalCoin:",
  totalCoin
);

// khi không có initial value thì nó sẽ lấy giá trị đầu tiên cảu mảng để làm giá trị khởi tạo
// và khi này thì currentValue sẽ là element thứ hai và riêng lần đầu tiên đã lấy hai ...

// khi muốn nhận giá trị cuối cùng là gì thì cần tạo biến khởi tạo như vậy

console.log("----------------------------------");

var numbers = [250, 0, 0, 400, 500, 0];

var totalNumbers = numbers.reduce(function (accumulator, currentValue) {
  return accumulator + currentValue;
});
console.log(
  "🚀 ~ file: 52. Array Reduce() method qua vi du.js:58 ~ totalNumbers ~ totalNumbers:",
  totalNumbers
);

// exercises
// Flat - "Làm phẳng" mảng từ Depth Array - "Mảng sâu"

var depthArray = [1, 2, [3, 4], 5, 6, [7, 8, 9]];

// C1: Nếu không sử dụng reduce

var flattenedArray = [];
for (var i = 0; i < depthArray.length; i++) {
    if(Array.isArray(depthArray[i])) {
        for(var j = 0; j < depthArray[i].length; j++) {
            flattenedArray.push(depthArray[i][j]);
        }
    } else {
        flattenedArray.push(depthArray[i]);
    }
}

console.log("🚀 ~ file: 52. Array Reduce() method qua vi du.js:81 ~ flattenedArray:", flattenedArray);


// C2: sử dụng reduce 

var flatArray = depthArray.reduce(function(flatOutput, depthItem) {
    return flatOutput.concat(depthItem);
}, []);
console.log("🚀 ~ file: 52. Array Reduce() method qua vi du.js:89 ~ flatArray ~ flatArray:", flatArray)

console.log('Lấy ra tất cả các khóa học và đưa vào mảng mới');

var topics = [
    {
        topic: 'Frontend',
        courses: [
            {
                id: 1,
                title: 'HTML, CSS'
            },
            {
                id: 2,
                title: 'Javascript'
            }
        ]
    },

    {
        topic: 'Backend',
        courses: [
            {
                id: 1,
                title: 'Java'
            },
            {
                id: 2,
                title: 'NodeJS'
            }
        ]
    }
];

// trong trường hợp này muốn nhận kết quả sau cùng là một array nên ta đưa vào một array trống
var newCourses = topics.reduce(function(courses, topic) {
    return courses.concat(topic.courses);
}, []);
console.log("🚀 ~ file: 52. Array Reduce() method qua vi du.js:127 ~ newCourses ~ newCourses:", newCourses)

var htmls = newCourses.map(function(course) {
    return `
        <div>
            <h2>${course.title}</h2>
            <p>${course.id}</p>
        </div>
    `;
});

console.log(htmls.join(''));
