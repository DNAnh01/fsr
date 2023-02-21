$(document).ready(function () {
    // get elements
    let message = $('.message');
    let input = $('.add-text');
    let btnAdd = $('.add-button');
    let tasks = $('.tasks');
    // let btnRemove = $('.task-remove'); // initial tasks

    btnAdd.on('click', function () {
        if (input.val()) {
            // add
            addNewTask();
            message.css('visibility', 'hidden');
        } else {
            // throw error
            message.css('visibility', 'visible');
        }
    });

    input.keyup(function (e) {
        // message.css('visibility', input.val() ? 'hidden' : 'visible');
        if (input.val()) {
            message.css('visibility', 'hidden');
            // enter
            if (e.which == 13) {
                addNewTask();
            }
        } else {
            message.css('visibility', 'visible');

        }
    });

    // when I add a new element, btnRemove doesn't contain it
    tasks.on('click', '.task-remove', function () {
        let confirmed = confirm('Click OK to remove this task');
        if (confirmed) {
            // $(this) is task-remove (present)
            $(this).parent().remove();
        }
    });

    tasks.on('click', '.task-cbx input[type = "checkbox"]', function () {

        $(this).parent().next().toggleClass('task-done');
    });

    $( "#sortable-list" ).sortable();

    function addNewTask() {  
        let newTask = `<li class="task">
                            <div class="task-cbx">
                                <input type="checkbox" unchecked>
                            </div>
                            <div class="task-text">${input.val()}</div>
                            <div class="task-remove"></div>
                        </li>`;
        tasks.append(newTask);
        // after add new task then reset input is empty
        input.val('');
    };
})

