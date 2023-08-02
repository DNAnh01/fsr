

// Arrow function

const createPerson = (name, age) => ({
    name: name,
    age: age,
});
console.log(createPerson('Nguyen Anh', 22));

const logger = log => console.log(log);
logger('hhh');


const course = {
    name: "Javascript basic",
    getName: function() {
        return this.name; // context
    }
}
console.log(course.getName());

// arrow func ko co context cua no 

const Course = (name, price) => {  
    this.name = name;
    this.price = price;
}

const jsCourse = new Course("Javascript", 1000);
console.log(jsCourse);

// arrow function ko the lam Object constructor
