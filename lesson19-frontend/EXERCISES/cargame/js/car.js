const onDegree = Math.PI/180;

var car = function(game){
    this.game = game;

    this.x = 300;
    this.y = 300;

    this.img = null;
    this.loaded = false;

    this.degree = 0;
    this.speed = 5;

    var self = this;

    this.init = function(){
        this.img = new Image();
        this.img.onload = function(){
            self.loaded = true;
            console.log('image loaded');
            self.game.draw(); // Call the draw method of the game object once the image is loaded
        };
        this.img.src = './images/car_img.png';
    };

    this.update = function(){
        if (this.game.upKeyIsPressed || this.game.downKeyIsPressed){
            if (this.game.leftKeyIsPressed){
                this.degree -= onDegree;
            }
            else if(this.game.rightKeyIsPressed){
                this.degree += onDegree;
            }
        }

        if (this.game.upKeyIsPressed){
            self.goForward();
        }
        else if(this.game.downKeyIsPressed){
            self.goBackward();
        }
    };

    this.goForward = function(){
        var speedX = this.speed * Math.cos(this.degree);
        var speedY = this.speed * Math.sin(this.degree);
        this.x += speedX;
        this.y += speedY;
    };

    this.goBackward = function(){
        var speedX = this.speed * Math.cos(this.degree);
        var speedY = this.speed * Math.sin(this.degree);
        this.x -= speedX;
        this.y -= speedY;
    };

    this.draw = function(){
        if (this.loaded){
            var scale = 0.3; // Set the scale factor for resizing the image 
            var width = this.img.width * scale;
            var height = this.img.height * scale;
            this.game.context.save();
            this.game.context.translate(this.x + (width/2), this.y + (height/2));
            this.game.context.rotate(this.degree);
            this.game.context.drawImage(this.img, -(width/2), -(height/2), width, height);
            this.game.context.restore();
        }
    };
};