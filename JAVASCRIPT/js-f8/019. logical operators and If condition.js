// Hiểu hơn về câu lênh điều kiện 
// và phép so sanh

/**
Có 6 giá trị trong Javascript khi convert sang Boolean sẽ có giá trị false
    0
    ''
    null
    NaN
    undefine
    false
 */

var a = 1;
var b = 2;

var result = a < b;
console.log('result: ', result);

if (a < b) {
    console.log('a < b');
} else {
    console.log('a > b');
}

var result2 = a < b && a < 0;
console.log('result2: ', result2); // false là kết quả của phép so sánh thứ 2

// toán tử logic && chỉ trả về kết quả một trong hai vế tùy vào trường hợp xảy ra

var result3 = 'A' && 'B' && 'C';
console.log('result3: ', result3); // C

/**
    Khi sử dụng toán tử and && thì nó luôn đọc từ vế trái sang vế phải
    nếu mà nó gặp giá trị mà khác 6 giá trị trên thì nó sẽ đọc từ trái dang phải
    lấy giá trị vế phải và gán lại giá trị cho result3


    ngược lại || thì nếu giá trị bên trái khác 6 giá trị trên thì nó lấy luôn giá trị đó
*/

var result4 = 'A' && 'B' && NaN && 'C';
console.log('result4: ', result4); // NaN




