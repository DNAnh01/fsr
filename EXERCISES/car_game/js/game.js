var game = function(){
    this.canvas = null;
    this.context = null;

    this.width = window.innerWidth;
    this.height = window.innerHeight;

    this.car = null;
    
    this.leftKeyIsPressed = false;
    this.rightKeyIsPressed = false;
    this.upKeyIsPressed = false;
    this.downKeyIsPressed = false;


    var self = this;

    this.init = function(){
        this.canvas = document.createElement('canvas');
        this.canvas.width = this.width;
        this.canvas.height = this.height;
        this.context = this.canvas.getContext('2d');
        document.body.appendChild(this.canvas);

        this.car = new car(this);
        this.car.init();

        this.loop();

        this.listenKey();
    };

    this.listenKey = function(){
        document.addEventListener('keydown', function(event){
            if (event.code === 'ArrowUp') {
                self.upKeyIsPressed = true;
            } else if (event.code === 'ArrowDown') {
                self.downKeyIsPressed = true;
            } else if (event.code === 'ArrowLeft') {
                self.leftKeyIsPressed = true;
            } else if (event.code === 'ArrowRight') {
                self.rightKeyIsPressed = true;
            }
            else { 
                // really? 
            }
        });
        document.addEventListener('keyup', function(event){
            if (event.code === 'ArrowUp') {
                self.upKeyIsPressed = false;
            } else if (event.code === 'ArrowDown') {
                self.downKeyIsPressed = false;
            } else if (event.code === 'ArrowLeft') {
                self.leftKeyIsPressed = false;
            } else if (event.code === 'ArrowRight') {
                self.rightKeyIsPressed = false;
            }
            else { 
                // really? 
            }
        });
    };

    this.loop = function(){
        self.update();
        self.draw();
        setTimeout(self.loop, 20); // 50 fps
    };

    this.update = function(){
        this.car.update();
    };

    this.draw = function(){
        this.clearScreen();
        this.car.draw();
    };

    this.clearScreen = function(){
        this.context.fillStyle = '#ffffff';
        this.context.fillRect(0, 0, this.width, this.height);
    };
};