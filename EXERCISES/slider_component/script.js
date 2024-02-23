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
    stopAutoSlide(); 
};

document.querySelector('.container').addEventListener('mouseenter', function() {
    stopAutoSlide();
});

document.querySelector('.container').addEventListener('mouseleave', function() {
    startAutoSlide();
});

startAutoSlide();