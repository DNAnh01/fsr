/*
Introducing some build-in functions
    1. Alert
    2. Console
    3. Confirm 
    4. Prompt
    5. Set timeout
    6. Set interval
*/
// 2. Console
console.log('day la mot dong log');
console.error('ERROR');
// 3. Confirm
confirm('Xac nhan ban du tuoi'); // Products with Cancel and OKE
// 4. Prompt
prompt('Xac nhan ban du tuoi'); // input
// 5. Set timeout // Give a code running after a time
setTimeout(function () {
    alert('Thong bao');
}, 1000);
// 6. Set interval // Execute continuously after a period of time
setInterval(function () {
    console.log('Day la log ' + Math.random);
}, 1000);