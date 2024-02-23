

// Fetch

// const postAPI = 'https://jsonplaceholder.typicode.com/posts';
// fetch(postAPI)
//     .then(response => response.json())
//     .then(posts => {
//         var htmls = posts.map(function (post) {
//             return `<li>
//                         <h2>${post?.title}</h2>
//                         <p>${post?.body}</p>
//                     </li>`
//         });
//         var html = htmls.join('');
//         document.getElementById('post-block').innerHTML = html;
//     })
//     .catch(function (error) {
//         console.log(error);
//     })


var courseAPI = "http://localhost:3000/course";
fetch(courseAPI)
    .then(function (response) {
        return response.json();
    })    
    .then(function (course) {
        console.log(course);
    });