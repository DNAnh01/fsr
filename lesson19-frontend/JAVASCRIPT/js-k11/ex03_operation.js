// forindex, foieach
let text = "loosely type";
console.log("lenght: " + text.length);
alert("ForLoop-Index -> First Way !!!");
for(let i = 0; i < text.length; i++) {
    console.log(text[i] + " ");
}
alert("ForLoop-Index -> Second Way !!!");
for(let i in text) {
    console.log(text[i] + " ");
}
alert("ForLoop-Each -> Third Way !!!");
for(let letter of text) {
    console.log(letter + " ");
}