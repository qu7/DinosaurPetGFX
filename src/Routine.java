import java.util.ArrayList;
import java.util.Random;
import main.resources.graphics.Death;
import main.resources.graphics.Intro;
import main.resources.graphics.NewDay;

public class Routine {
	static Dinosaur tri = new Dinosaur(0, 50, 50, "Triceratops");
	static int food = 3;
	static int gold = 0;
	static int key = 0;
	static int age = 0;
	static double time = 6.00;
	static boolean window = true;
	boolean start = true;
	boolean life = true;
	static int rand2, rand3, rand4;		
	static String textLine, hungerText, happyText;
	static ArrayList<String> textArray = new ArrayList<String>();

	
	public static void feedDino() {
		if (food >= 1) {
			time += 1.00;
			food --;
			tri.happy += 2;
			tri.hunger -= 5;
			checkHunger();
			checkHappy();
			textLine = "You fed " + tri.name; 
			textLine =	"He liked it!"; 
		}
		else {
			textLine = "" + tri.name + " has no food! Go find more!"; 
		}	
		updateText();
		
		if (time >= 22) {
			sleep();
		}
	}
	
	public static void explore() {
		Random r = new Random();
		rand3 = r.nextInt(3);
		rand4 = r.nextInt(4);
		if (tri.happy >= 80) {
			// from 0 to 3, if rand4 == 1, 2 or 3
			if (rand4 >= 1) {
				textLine = "He looks pretty confident..."; 
				textLine = "Success! He found a lot of food!";	
				food += 3;
				updateText();
				
				if (rand4 == 3) {
					textLine = tri.name + " also found a key!"; 
					updateText();
					key++;
				}
			}
			else {
				textLine = "Not much food was found."; 
				food += 1;
			}
			updateText();
			
		}
		else if (tri.happy >= 30 && tri.happy < 80) {
			// from 0 to 2, if rand3 equals 1 or 2
			if (rand3 >= 1) {
				textLine = "Looking... looking... Alright! He found some food!"; 
				updateText();
				food += 1;
				if (rand4 == 3) {
					textLine = tri.name + " also found a key!"; 
					updateText();
					key++;
				}
			}
			else {
				textLine = "He looked all over, but no food was found..."; 
				updateText();
			}
			
			}
			tri.hunger += 5;
			time += 5.00;
			checkHunger();
			checkHappy();
			if (time >= 22) {
				sleep();
			}
			
	}
	
	public static void play() {
		Random r = new Random();
		rand2 = r.nextInt(2);
		rand3 = r.nextInt(3);
		rand4 = r.nextInt(4);
		if (rand3 == 0) {
			textLine = tri.name + " wants to play fetch!"; 
			updateText();
		}

		else if (rand3 == 1) {
			textLine = tri.name + " wants to race!"; 
			updateText();
		}

		else {
			textLine = tri.name + " wants to dig!"; 
			updateText();
			if (key >= 1) {
				textLine = tri.name + " found a treasure chest! Do you want to open it?"; 
				updateText();
			}
			else {
				textLine = tri.name + " found a treasure chest! But you don't have a key!!"; 
				updateText();
			}
		}
		time += 2;
		tri.hunger += 5;
		tri.happy += 5;
		checkHunger();
		checkHappy();
		if (time >= 22) {
			sleep();
		}
	}
	
	public static void checkHunger() {
		if (tri.hunger >= 100) {
			hungerText = "Starved to death";
			endOfLife();
		}
		
		if (tri.hunger >= 90) {
			hungerText = "Starving";
		}
		else if (tri.hunger >= 60) {
			hungerText = "Very Hungry";
		}
		else if (tri.hunger >= 40) {
			hungerText = "Hungry";
		}
		else {
			hungerText = "Not hungry";
		}
	}
	
	public static void checkHappy() {
		if (tri.happy >= 80) {
			happyText = "Happy";
		}
		
		else if (tri.happy >= 50) {
			happyText = "Content";
		}
		
		else if (tri.happy >= 30) {
			happyText = "Unhappy";
		}
		
		else {
			happyText = "Angry";
		}
	}
	
	public static void updateText() {
		if (window == false) {
			textArray.add("");
			textArray.add("");
			textArray.add("");
	
			textArray.set(0, textArray.get(1));
			textArray.set(1, textArray.get(2));
			textArray.set(2, textLine);
		}	
	}
	
	// sleep is triggered if time reaches or passes 22.00
	public static void sleep() {
		window = false;
		textLine = tri.name + " is exhausted. He fell asleep.";
		updateText();
		tri.happy = (int) (tri.happy + (30 - time));
		age++;
		tri.hunger += 5;
		textLine = tri.name + " got " + ((30 - time)) + " hours of sleep!";
		if ((30 - time) >= 7) {
			NewDay.qualitySleepText = tri.name + " woke up feeling well rested!";
		}
		else if ((30 - time) >= 5) {
			NewDay.qualitySleepText = tri.name + " slept okay.";
		}
		else {
			NewDay.qualitySleepText = tri.name + " didn't get enough sleep!";
		}
		time = 6.00;
		NewDay.hoursSleepText = textLine;
		NewDay newDay = new NewDay();
		newDay.setVisible(true);
		updateText();
	}
	
	public static void endOfLife() {
		window = false;
		String deathText = tri.name + " has died at the age of " + age + ".";
		Death.deathMessage = deathText;
		Death death = new Death();
		death.setVisible(true);
		updateText();
	}

	public Routine() {
		window = false;
		Intro intro = new Intro();
		intro.setVisible(true);
	}
	
}
