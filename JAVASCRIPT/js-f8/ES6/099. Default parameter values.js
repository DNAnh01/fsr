

// Default parameter values in ES6

function logger(log = 'default value') {
    // if(typeof log === "undefined") {
    //     log = "default value";
    // }
    console.log(log);
}

logger(undefined);