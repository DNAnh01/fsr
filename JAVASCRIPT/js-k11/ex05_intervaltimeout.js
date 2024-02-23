// timer repeat every 2 seconds
// timeout: JUST 1 time
let counter = 0;
setTimeout(function() {
	console.log(`timeout --> ${counter++}`);
}, 2000);

// interval: FOREOVER -> không dừng trừ khi mình set clearInteval
let runner = setInterval(function() {
	if (counter === 5) {
		clearInterval(runner); // stop timer
	}
	console.log(`interval --> ${counter++}`);
}, 1000);

// authorization