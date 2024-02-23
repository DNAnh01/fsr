

// Classes

function Course(name, price) {
    this.name = name;
    this.price = price;
    this.getPrice = () => {
        return this.price;
    }
}

const myCourse = new Course('Javascript', 100);
console.log(myCourse.getPrice());

class Language {
    constructor(name, description) {
        this.name = name;
        this.description = description;
    }
    getName = function () {
        return this.name;
    }
    getDescription = () => {
        return this.description;
    }
}
const myLanguage = new Language('English', 'Ame');
console.log(myLanguage.getDescription());



const createPerson = (name, age) => {
    this.name = "name";
    this.age = "age";
};
console.log(createPerson)