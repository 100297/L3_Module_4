package threads;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Robot a = new Robot(460, 500);
		Robot b = new Robot(380, 450);
		Robot c = new Robot(560, 500);
		Robot d = new Robot(500, 450);
		Robot e = new Robot(640, 450);

		new Thread(() -> {
			a.penDown();
			for (int i = 0; i < 360; i++) {
				a.move(1);
				a.turn(1);
			}
		}).start();
		new Thread(() -> {
			b.penDown();
			for (int i = 0; i < 360; i++) {
				b.move(1);
				b.turn(1);
			}
		}).start();
		new Thread(() -> {
			c.penDown();
			for (int i = 0; i < 360; i++) {
				c.move(1);
				c.turn(1);
			}
		}).start();
		new Thread(() -> {
			d.penDown();
			for (int i = 0; i < 360; i++) {
				d.move(1);
				d.turn(1);
			}
		}).start();
		new Thread(() -> {
			e.penDown();
			for (int i = 0; i < 360; i++) {
				e.move(1);
				e.turn(1);
			}
		}).start();
	}

}
