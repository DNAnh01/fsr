// Object trong Javascript

var genderKey = 'gender';

var myInfo = {
    name: 'Nguyen Anh',
    age: 18,
    address: 'Quang Nam',
    [genderKey]: 'men',
    // val của key là một expression function
    getName: function() {
        return this.name;
    }
};
// thêm thuộc tính mới
myInfo.email = 'donguyenanh2k1@gmail.com';
myInfo['phone-number'] = 0852501009;
console.log(myInfo); // {name: 'Nguyen Anh', age: 18, address: 'Quang Nam', email: 'donguyenanh2k1@gmail.com', phone-number: 852501009}
// lấy val của thuộc tính (key)
console.log(myInfo.name); // Nguyen Anh


var myKey = 'address';
console.log(myInfo[myKey]); // Quang Nam

console.log(myInfo);

// xóa một key
delete myInfo[genderKey];
console.log(myInfo); // {name: 'Nguyen Anh', age: 18, address: 'Quang Nam', email: 'donguyenanh2k1@gmail.com', phone-number: 852501009}

// getName
console.log(myInfo.getName()); // Nguyen Anh



