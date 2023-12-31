let currentIndex = 0;
let autoSlideInterval;

function nextSlide() {
    let lists = document.querySelectorAll('.item');
    document.getElementById('slide').appendChild(lists[0]);
}

function prevSlide() {
    let lists = document.querySelectorAll('.item');
    document.getElementById('slide').prepend(lists[lists.length - 1]);
}

function startAutoSlide() {
    autoSlideInterval = setInterval(function() {
        nextSlide();
    }, 3000);
}

function stopAutoSlide() {
    clearInterval(autoSlideInterval);
}

document.getElementById('next').onclick = function() {
    nextSlide();
    stopAutoSlide(); // Dừng tự động chuyển slide khi click vào nút next
};

document.getElementById('prev').onclick = function() {
    prevSlide();
    stopAutoSlide(); // Dừng tự động chuyển slide khi click vào nút prev
};

// Bắt đầu tự động chuyển slide khi trang web được tải
startAutoSlide();

// Bắt đầu tự động chuyển slide lại sau khi 2 giây không có hành động
document.addEventListener('DOMContentLoaded', function() {
    document.addEventListener('mousemove', function() {
        stopAutoSlide(); // Dừng tự động chuyển slide khi có hành động chuột
        startAutoSlide(); // Bắt đầu lại sau khi có hành động chuột
    });

    document.addEventListener('keydown', function() {
        stopAutoSlide(); // Dừng tự động chuyển slide khi có hành động phím
        startAutoSlide(); // Bắt đầu lại sau khi có hành động phím
    });
});