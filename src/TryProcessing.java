import processing.core.PApplet;

public class TryProcessing extends PApplet {
    int[] x = {0, 0, 0, 0};// X position of the balls
    float[] y={1,2,3,4};// Initial y positions for the balls
    int[] speeds = {1, 2, 3, 4}; // Speeds for the balls
    public static void main(String[] args) {
        PApplet.main("TryProcessing");
    }

    @Override
    public void settings() {
        size(600, 600);
    }

    @Override
    public void setup() {
        background(255);
    }

    @Override
    public void draw() {

        ellipse(x[0], y[0]*600/5, 15, 15);
        ellipse(x[1], y[1]*600/5, 15, 15);
        ellipse(x[2], y[2]*600/5, 15, 15);
        ellipse(x[3], y[3]*600/5, 15, 15);
        for (int i = 0; i < x.length; i++) {
            x[i] += speeds[i];

        }
    }
}
