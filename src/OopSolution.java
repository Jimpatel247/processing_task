import processing.core.PApplet;

public class OopSolution extends PApplet {

    Ball[] balls = new Ball[4];
    int canvasWidth = 800;
    int canvasHeight = 600;

    public static void main(String[] args) {
        PApplet.main("OopSolution");
    }

    @Override
    public void settings() {
        size(canvasWidth, canvasHeight);
    }

    @Override
    public void setup() {
        background(255);
        int[] ballSpeeds = {1, 2, 3, 4};
        int[] ballHeights = {canvasHeight / 5, 2 * canvasHeight / 5, 3 * canvasHeight / 5, 4 * canvasHeight / 5};

        for (int i = 0; i < balls.length; i++) {
            balls[i] = new Ball(0, ballHeights[i], ballSpeeds[i], this);
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls) {
            ball.update();
            ball.display();
        }
    }

    class Ball {
        int x, y, speed;
        PApplet p;

        Ball(int x, int y, int speed, PApplet p) {
            this.x = x;
            this.y = y;
            this.speed = speed;
            this.p = p;
        }

        void update() {
            x += speed;
        }

        void display() {
            p.ellipse(x, y, 20, 20);
        }
    }
}

