// Polyfill?
// code bên dưới giúp hỗ trợ cho các trình duyệt cũ không hỗ trợ hàm includes
if (!String.prototype.includes) {
    String.prototype.includes = function (search, start) {
        'use strict';

        if (search instanceof RegExp) {
            throw TypeError('first argument must not be a RegExp');
        }
        if (start === undefined) { start = 0; }
        return this.indexOf(search, start) !== -1;
    };
}

// chuỗi 'Javascript' có nằm trong 'Javascript course' tại vị trí 0 
var isIncludes = 'Javascript course'.includes('Javascript', 0);
console.log("🚀 ~ file: 30. Polyfill.js:17 ~ isIncludes:", isIncludes)

