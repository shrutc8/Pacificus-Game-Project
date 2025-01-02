/* ICS3UI CPT: Pacificus
 * Shrut Chokshi
 * Mr. Conway
 *
 * Program Description:
 *
 * In this program it will start off by introducing you to the game, which has 3 buttons. Start, Instructions and Exit. On the exit button you will exit out of the program, with the instructions
 * button you will gain information to the program. After you click the start it brings you to a storyline. In the year 1431, located in a city named Kingdom of Valencia, there was King Roberto IV. 
 * Valencia miners discovered the rarest and most priceless piece of stone ever. King Roberto IV created one of the most priceless pieces of Jewelry, and named it Pacificus which translates to Peaceful (latin).
 * Pacificus was heavily guarded with Valencia’s most trained guards. Until one day, it was stolen by a skilled thief. 
 * The skilled thief decided to maximize its profits and break it into precise multiple pieces, and sell those pieces individually. He put the location on a map of the places that it was sent too. 
 * Unfortunately, the thief was caught, right after all the pieces were sold and shipped away, and it could be in any parts of the world. Even today, all of Pacificus' pieces are still not known.
 *
 * All the pieces were located on the map. The storyline then switches to the present day where someone found the old bunker, and saw the location of Pacificus. They decided to create a team to get on the adventure of finding it
 * and they need YOUR help.
 *
 * There are 4 simple levels (I was planning to do more in each level but time was short). In the first level the setting is in a jungle and the Jungle Master has the 1st piece of Pacificus. In order to reach it you must fight off the ambush,
 * and then you must use your sneaking skills to go past the vicious tiger without touching any of the bushes. (If you touch it you can just restart from the top). You must cross the flying bananas. Then you can meet with the Jungle Master and you can take it from him by answering a riddle that nobody answered for over 1000 years.
 *
 * In the next level, you are in a high intense situation of stealing something. You are put into a position like real life to show how intense it is to steal something and that it is not easy. You have to steal the second piece from a museum, within 3 seconds.
 * If you are unable to do that, then you will lose. No worries, as there is a try again button in which a method created in main is called and re- defines all the variables so you can play again. You will keep doing this until you reach the gem successfully within these 3 intense seconds.
 *
 * After this you will be brought back to the main menu, in which you can play your third game. In this third gem you are located on a shipwreck, and while it was being transported to the location it drowned. You must know the passcode in order to open the gate, but no worries as you can use your clues around you to figure it out.
 * You must also be in range of the box and it will ask you for the pin. After you enter it you have obtained the third piece. With this third piece you are brought back to the main menu to get the last piece.
 *
 * You can now click the last hunt and in this it is a traditional hotter or colder game. The hidden treasure is buried somewhere in the desert land, and it is your job to find it. Using commands such as "hot" , "cold", "fire", "warm" "ice", you can navigate your way through the desert.
 * After you have completed this last piece you are finished with the game.
 *
 * The rules of this game are simple, you can move with your up, down, left and right arrow keys, which will be explained before you start. You can also use your mouse to select portions to select stuff. You may have the opportunity to use space to shoot a projectile or to use space to dig something.
 * You also may not be able to move up/ down in some levels where there would be gravity in which the boolean recording if they can click up/ down keys would be set to false.
 *
 *
 * Program Details:
 *
 * Many of the programming constructs were found throughout the program. For example strings were used to record the status of options in a JOptionPane or to check what the user was typing so that it can check if it can convert it to lowercase/ uppercase and check if it is correct. If statements were found mostly everywhere in the program as it was
 * used to help control the flow of the program. Random numbers were used in classes to set a random speed of the bananas, for example and to set a random position of the animals attacking you at the start.
 * I used a while loop inside my JOptionPane to tell it to keep running, as well as a Do - While loop as well. I used a for loop to bring in images in the form of an array. String class- methods were used in the riddle answer checking portion to check if the user's string matched the correct string while also checking if it was lowercase/ uppercase
 * in which we focused a lot on unit 3. Try - Catch statements were used in the JOptionPanes, as well as bringing in fonts, to keep the program from crashing. I used 1 array in the concept of ImageIcons and I used 1 array in the concept of buttons for the JOptionPane.
 * I made a self- made method in the program as a try - again method, which is very useful if the user needs to spawn again or retry. I used 2 additional classes: One for the player and one for the enemies. I used the JOptionPane class a lot as well. I used frames to make both images move using the keyboard, as well as images to communicate with the mouse.
 * Collision detection was also used throughout this program to check if, for example, the projectile collided with the animals, or to check if you have stepped on a bush that would make noise, or to check if you have clicked in the radius of an object. Many collision detections were used. 
 *
 * This program was both a mix of Animation not using the keyboard/ mouse and only going off the timers. It was also a mix of using the keyboard and mouse as well to interact with other individuals in order to receive Pacificus.
 */


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

//Extend JPanel as well as implement ActionListener as we have timers, KeyListener for keyboard buttons, MouseListener for clicks, and MouseMotionListener for Hovers
public class Pacificus extends JPanel implements ActionListener, KeyListener, MouseListener, MouseMotionListener{

	//Field: Create Variables 

	//Get ImageIcons for loading screens and buttons
	private ImageIcon loadingScreen, loadingcircle, introKingdom, mainMenu, startButton, instructionButton, exitButton, bigStart, bigExit, bigInstruction;

	//Get ImageIcons for animation in the StoryLine
	private ImageIcon instructionsPage, kingRoberto, miners, pacificusImage, ninja, ninjaBunker, gemBed, map, presentday, boatdown, boatleft, boatup, boatright;
	private ImageIcon presentdaybunker, teampick, skip, skipclicked;

	//Get Images for user to pick their characters
	private ImageIcon choosescreen, Triangula, Shadow, Joseph, Albert, AlexanderIII, George, bigTriangula, bigGeorge, bigShadow, bigJoseph, bigAlbert, bigAlexanderIII; 

	//Get Images for level 1
	private ImageIcon silverwood, junglebackground, keyarrows, projectileAxe, spacebutton, guider, bushobstacles, bananarun, monkey1, monkey2;

	//Get Images for other levels 
	private ImageIcon finalJungle, jungleMaster, viking, museum, loss, diverboy, shipBackground, rockNum2, rockNum3, rockNum6, rockNum9, sand, winScreen;

	//Get Array of Images for those images that are almost the same type. 
	private ImageIcon[] guardImage, thiefstoryline, thiefcaught, menuScreen, lazer;

	//Set up the JFrame to be a global variable 
	private JFrame frame = new JFrame();

	//Get booleans to check if things have clicked, or have been set to true to help control the flow of the program 
	private boolean finishedStory, showFirstScreen, showSecondScreen, showThirdScreen, showFourthScreen,showGuardScreen, showFifthScreen, showSixthScreen, showSeventhScreen, showEighthScreen, showNinthScreen, showTenthScreen, showEleventhScreen;
	private boolean guardScreen1, guardScreen2, guardScreen3, guardScreen4, drawBigStart, drawBigInstruction, drawBigExit, isMoving;
	private boolean isThiefCaught1, isThiefCaught2, isThiefCaught3, isPresentDayBunker, isTeamPick, presentDayScreen;
	private boolean pickTeam, pickTimeManipulator, pickArmorEngineer, drawSkipClicked, drawBigTriangula, drawBigGeorge, drawBigShadow, drawBigJoseph, drawBigAlexanderIII, drawBigAlbert;
	private boolean menuScreenShow, showleveldone0, showleveldone1, showleveldone2, showleveldone3, showleveldone4, nextSpot, touch, isFired;
	private boolean projectileDirectionRight, canFire, ambush, drawEnemyMask = true, drawEnemyMask2 = true, drawEnemyMask3 = true, draw1 = true, draw2 = true, draw3 = true, draw4 = true, draw5 = true;
	private boolean startTimerMonkey = true, canPressUPDOWN = true, canPressLEFTRIGHT = true;

	//Set all the integers that will help with the flow 

	private int screenShow, storyLineShow;
	boolean skipScreenSilverwood, showScreenSilverwood; 

	//Set integers for User Choice
	private int choiceTimeManipulator = 0, choiceArmorEngineer = 0, pickedTriangula = 2, pickedShadow = 3, pickedJoseph = 4, pickedAlbert = 5, pickedAlexanderIII = 6, pickedGeorge = 1;

	//Set a private timer for animations
	private Timer loadingSwitch, firstScreen, secoundScreen, thirdScreen, fourthScreen, ninjaMove,timetoMove, ninjaWait, fifthScreen, sixthScreen, seventhScreen, eighthScreen, ninthScreen, tenthScreen, eleventhScreen;
	private Timer guardLoading, guardLoading2, guardLoading3, timerBoat, loadingThiefCaught1, loadingThiefCaught2, loadingThiefCaught3, waitTime, waitTime2, loading, jungleconfront;

	//Create custom fonts
	private Font f, f2, f3;

	//Create rectangles for collision checking 
	private Rectangle2D axeMask, enemyMask, playerMask, enemyMask2, enemyMask3, bush1, bush2, bush3, bush4, bush5, bush6, bush7, bush8, bush9, bush10, continueSpace, banana1, banana2, banana3, banana4, jungleMasterArea, vaultArea, swimBoyArea;
	private Rectangle2D hot, warm, fire, cold, ice, icebath; 

	//Create ints for positions of characters in the animation
	private int ninjaxPos, ninjayPos, boatupYpos, boatdownYpos, boatleftXpos, boatrightXpos, joptionpane, rc;

	//Create int for the actual characters
	private int timeRun, speed, projectileAxeX, projectileAxeY, projSpeed, animalSpeed, drawPane = 0; 

	//Set booleans for key pressed
	private boolean keyPressed1 = true, keyPressed2 = true, keyPressed3 = true, keyPressed4 = true, keyPressed5;
	private boolean startGame, pressKeys = true;

	//Set boolean for next for JOptionPane control flow
	private boolean next1, next2, next3, next4, next5, next6, next7;
	private boolean drawLoss; 
	private boolean digGem;

	//Set timers to help control the flow of the program
	private Timer timeleft, playerTimer3;

	private Timer playerTimer, timerAxe, timerFight, timeToWait, playerTimer2, JPanePause, bananaFalling, playerrun2, playertimer4; 
	private Player player;
	private Enemy enemy;

	//Create our arrays for our JOptionPane buttons
	String [] options = {"Ok", "Cool" , "Go"};
	String [] buttons = {"Continue"};
	String [] next = {"..."};


	//Set booleans for key pressed
	private boolean up = false, down = false, left = false, right = false, junglePic = false; 



	public Pacificus()
	{
		//Constructor: Initializes all the variables

		//Define all images for animation
		loadingScreen = new ImageIcon("loadingscreen.png");
		loadingcircle = new ImageIcon("loading.gif");
		introKingdom = new ImageIcon("old times background.png");
		mainMenu = new ImageIcon("mainmenu.png");
		startButton = new ImageIcon("startbutton.png");
		instructionButton = new ImageIcon("instructionsbutton.png");
		exitButton = new ImageIcon("exitbutton.png");
		bigStart = new ImageIcon("bigstart.png");
		bigExit = new ImageIcon("bigexit.png");
		bigInstruction = new ImageIcon("biginstruction.png");
		kingRoberto = new ImageIcon("King Roberto IV.png");
		miners = new ImageIcon("miners.png");
		pacificusImage = new ImageIcon("Pacificus.png");
		ninja = new ImageIcon("ninja.png");
		ninjaBunker = new ImageIcon("ninjabunker.png");

		
		//Images for animation
		gemBed = new ImageIcon("gem on the bed.png");
		map = new ImageIcon ("map.png");
		presentday = new ImageIcon ("presentday.png");
		boatup = new ImageIcon ("boatup.png");
		boatdown = new ImageIcon ("boatdown.png");
		boatright = new ImageIcon ("boatright.png");
		boatleft = new ImageIcon ("boatleft.png");

		presentdaybunker = new ImageIcon("presentdaybunker.png");
		teampick = new ImageIcon ("teampick.png");
		skip = new ImageIcon("skip.png");

		//Pick character images
		Triangula = new ImageIcon("Triangula.png");
		Shadow = new ImageIcon("Shadow.png");
		Joseph = new ImageIcon("Joseph.png");
		Albert = new ImageIcon("Albert.png");
		AlexanderIII = new ImageIcon("Alexander III.png");
		George = new ImageIcon("George.png");

		//Big Character pick images
		bigTriangula = new ImageIcon ("Triangula copy.png");
		bigGeorge = new ImageIcon("George copy.png");
		bigShadow = new ImageIcon("Shadow copy.png");
		bigAlexanderIII	= new ImageIcon("Alexander III copy.png");
		bigAlbert = new ImageIcon("Albert copy.png");
		bigJoseph = new ImageIcon("Joseph copy.png");


		//Screen clicked
		choosescreen = new ImageIcon("choosescreen.png");
		skipclicked = new ImageIcon ("skip clicked.png");

		silverwood = new ImageIcon ("Silverwood forest.png");
		junglebackground = new ImageIcon ("junglebackground.png");
		keyarrows = new ImageIcon ("keysbutton.gif");

		//Projectile and other obstacles
		projectileAxe = new ImageIcon ("axe.png");
		spacebutton = new ImageIcon("space.png");
		guider = new ImageIcon ("guider.png");
		bushobstacles = new ImageIcon ("bushobstacles.png");
		bananarun = new ImageIcon("bananarun.png");
		monkey1 = new ImageIcon ("monkey1.png");
		monkey2 = new ImageIcon ("monkey2.png");
		finalJungle = new ImageIcon ("finaljungle.jpg");
		jungleMaster = new ImageIcon ("jungle master.png");

		
		//Backgrounds and characters
		viking = new ImageIcon ("jungleking.png");
		museum = new ImageIcon ("museum.png");
		loss = new ImageIcon ("lost.png");
		diverboy = new ImageIcon ("diverboy.png");

		shipBackground = new ImageIcon ("shipbackground.png");

		//Rocks
		rockNum2 = new ImageIcon ("2.png");
		rockNum3 = new ImageIcon ("3.png");
		rockNum6 = new ImageIcon ("6.png");
		rockNum9 = new ImageIcon ("9.png");

		sand = new ImageIcon ("sandbackground.jpeg");

		winScreen = new ImageIcon ("youwin.jpeg");

		//Define the ninjaX and Y pos for animation
		ninjaxPos = -60;
		ninjayPos = -90;

		timeRun = 0;


		//Define our array length
		guardImage = new ImageIcon[4];
		thiefstoryline = new ImageIcon[3];
		thiefcaught = new ImageIcon[3];
		menuScreen = new ImageIcon[5];
		lazer = new ImageIcon[6];

		//Use for loops to set up our array

		for (int i = 0; i < 4; i++)
		{
			guardImage[i] = new ImageIcon("Guard" + (i+1) +".png");
		}

		for (int i = 0; i < 3; i++)
		{
			thiefstoryline[i] = new ImageIcon("thiefstoryline" + (i+1) +".png");
		}

		for (int i = 0; i < 3; i++)
		{
			thiefcaught[i] = new ImageIcon("thiefcaught" + (i+1) +".png");
		}

		for (int i = 0; i < 5; i++)
		{
			menuScreen[i] = new ImageIcon((i) +"leveldone.png");
		}

		for (int i = 0; i < 6; i++)
		{
			lazer[i] = new ImageIcon("lazer" + (i+1) +".png");
		}



		//Initialize all timers
		instructionsPage = new ImageIcon("instructionspage.png");
		screenShow = 1;
		loadingSwitch = new Timer(2000, this);
		firstScreen = new Timer(4000, this);
		secoundScreen = new Timer(3500, this);
		thirdScreen = new Timer (4000, this);
		ninjaMove = new Timer (50, this);
		timerBoat = new Timer (50, this);

		timetoMove = new Timer (4000, this);
		ninjaWait = new Timer (800, this);
		guardLoading = new Timer (1500, this);
		guardLoading2 = new Timer (1500, this);
		guardLoading3 = new Timer (1500,this);
		fourthScreen = new Timer (7000, this);
		fifthScreen = new Timer (1800, this);
		sixthScreen = new Timer (2000, this);
		seventhScreen = new Timer (2000, this);
		eighthScreen = new Timer (4000, this);
		ninthScreen = new Timer (4000, this);
		tenthScreen = new Timer (6000, this);
		eleventhScreen = new Timer (7000, this);
		
		
		waitTime = new Timer (20, this);
		waitTime2 = new Timer (20, this);
		playerrun2 = new Timer (50, this);


		loadingThiefCaught1 = new Timer (4000, this);
		loadingThiefCaught2 = new Timer (4000, this);
		loadingThiefCaught3 = new Timer (4000, this);

		playerTimer = new Timer (50, this);

		playerTimer2 = new Timer (50, this);

		playerTimer3 = new Timer (50, this);

		playertimer4 = new Timer (50, this);

		loading = new Timer (1000, this);
		timerAxe = new Timer(50, this);
		timerFight = new Timer (50, this);
		timeToWait = new Timer (2500, this);

		JPanePause = new Timer (1000, this);
		bananaFalling = new Timer (50, this);

		jungleconfront = new Timer (50, this);

		timeleft = new Timer (3000, this);


		//Set positions for the boats 
		boatupYpos = 100;
		boatdownYpos = 428;
		boatleftXpos = 260;
		boatrightXpos = 500;

		finishedStory = false;


		//Add Mouse, MouseMotion and KeyListeners 

		addMouseListener(this);
		addMouseMotionListener((MouseMotionListener) this);
		addKeyListener(this);

		setFocusable(true);
		requestFocus();

		//Get font 1
		try
		{
			f = Font.createFont(Font.TRUETYPE_FONT, new File("Chalkduster.ttf")).deriveFont(180f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Chalkduster.ttf")));
			FontMetrics fm = getFontMetrics(f);

		} 
		catch (IOException | FontFormatException e) 
		{

		}

		// Get font 2
		try
		{
			f2 = Font.createFont(Font.TRUETYPE_FONT, new File("Georgia Italic.ttf")).deriveFont(80f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Georgia Italic.ttf")));
			FontMetrics fm = getFontMetrics(f2);

		} 
		catch (IOException | FontFormatException e) 
		{

		}

		// Get font 3
		try
		{
			f3 = Font.createFont(Font.TRUETYPE_FONT, new File("Herculanum.ttf")).deriveFont(40f);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Herculanum.ttf")));
			FontMetrics fm = getFontMetrics(f2);

		} 
		catch (IOException | FontFormatException e) 
		{

		}

		//Initialize buttons
		showFirstScreen = true;
		showSecondScreen = false;
		showThirdScreen = false;
		drawBigStart = false;
		drawBigInstruction = false;
		drawBigExit = false;

		//Get Access to other classes
		player = new Player();
		enemy = new Enemy();

		//Set up player, enemy and axe rectangles for ambush 
		enemyMask = new Rectangle2D.Double(enemy.getX(), enemy.getY(), enemy.getEnemy1().getIconWidth(), enemy.getEnemy1().getIconHeight());

		enemyMask2 = new Rectangle2D.Double(enemy.get2X(), enemy.get2Y(), enemy.getEnemy2().getIconWidth(), enemy.getEnemy2().getIconHeight());

		enemyMask3 = new Rectangle2D.Double(enemy.get3X(), enemy.get3Y(), enemy.getEnemy3().getIconWidth(), enemy.getEnemy3().getIconHeight());

		axeMask = new Rectangle2D.Double(-100, -100, projectileAxe.getIconWidth() / 2  , projectileAxe.getIconHeight() / 2) ;

		playerMask = new Rectangle2D.Double(player.getX(), player.getY(), player.getPicture(junglePic).getIconWidth() - 100, player.getPicture(junglePic).getIconHeight() + 100);

		//Draw bush rectangles 
		bush1 = new Rectangle2D.Double(251,40,150, 60) ;
		bush2 = new Rectangle2D.Double(36,93,186 , 200) ;
		bush3 = new Rectangle2D.Double(214,259,140 ,138) ;
		bush4 = new Rectangle2D.Double(407,354,60,210);
		bush5 = new Rectangle2D.Double(590,167,140,90);
		bush6 = new Rectangle2D.Double(759,475,165,100);
		bush7 = new Rectangle2D.Double(790,202,165,145);

		//Draw banana rectangles
		banana1 = new Rectangle2D.Double(enemy.getBanana1X() + 15, enemy.getBanana1Y() + 30, enemy.getBanana1().getIconWidth() - 20, enemy.getBanana1().getIconHeight() - 30);
		banana2 = new Rectangle2D.Double(enemy.getBanana2X() + 15, enemy.getBanana2Y() + 30, enemy.getBanana2().getIconWidth() - 20, enemy.getBanana2().getIconHeight() - 30);
		banana3 = new Rectangle2D.Double(enemy.getBanana3X() + 15, enemy.getBanana3Y() + 30, enemy.getBanana3().getIconWidth() - 20, enemy.getBanana3().getIconHeight() - 30);
		banana4 = new Rectangle2D.Double(enemy.getBanana4X() + 15, enemy.getBanana4Y() + 30, enemy.getBanana4().getIconWidth() - 20, enemy.getBanana4().getIconHeight() - 30);

		jungleMasterArea = new Rectangle2D.Double(800, 500, jungleMaster.getIconWidth() + 100, jungleMaster.getIconHeight() + 100);

		vaultArea = new Rectangle2D.Double(857, 320, 330, 315);

		fire = new Rectangle2D.Double(811, 498, 77, 50);

		hot = new Rectangle2D.Double(690, 245, 360, 490);

		warm = new Rectangle2D.Double(597, 3, 602, 763);
		cold = new Rectangle2D.Double(0, 504, 765, 267);
		ice = new Rectangle2D.Double(0, 3, 580, 501);


		joptionpane = 0;

		//Set up JFrame
		frame = new JFrame();
		frame.setContentPane(this);
		frame.setSize(loadingScreen.getIconWidth() - 10, loadingScreen.getIconHeight());
		frame.setTitle("Pacificus");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

		player.bounds(getWidth(), getHeight());
		enemy.bounds(getWidth(), getHeight());


		playerTimer = new Timer(50, this);
		playerTimer2 = new Timer (50, this);

		loadingSwitch.start();


	}

	//Set up method PlayAgain
	private void playAgain()
	{
		//Do all of this once it is called 
		if (drawPane == 10)
		{
			rc = JOptionPane.showOptionDialog(null, "You have 3 seconds to steal the gem before you get caught", "You", JOptionPane.ERROR_MESSAGE, 0, viking, next, null);  

			if ( rc >= 0)
			{
				drawPane = 11;
				screenShow = 12;

				timeleft.start();
				playerTimer2.start();

				player.getX(0);
				player.getY(0);
			}
		}


	}

	public static void main(String[] args) 

	{
		new Pacificus();
	}


	public void mouseClicked(MouseEvent e) 

	{
		//Check if mouse clicked start button and set screen according to it 
		if (screenShow == 2) 
		{
			if (e.getX() >= 425 && e.getX() <= 425 + startButton.getIconWidth() && e.getY() >= 250 && e.getY() <= 250 + startButton.getIconHeight()) 

			{
				screenShow = 4;
			} 

			//Check if mouse clicked instructions button and set screen according to it 
			else if (e.getX() >= 200 && e.getX() <= 200 + instructionButton.getIconWidth() && e.getY() >= 475 && e.getY() <= 475 + instructionButton.getIconHeight()) 
			{
				screenShow = 3;
			} 

			//Check if mouse clicked exit button and set screen according to it 
			else if (e.getX() >= 700 && e.getX() <= 700 + exitButton.getIconWidth() && e.getY() >= 460 && e.getY() <= 460 + exitButton.getIconHeight()) 

			{
				System.exit(0);
			}
		}

		//Move back to home page if instructions back is clicked

		if (screenShow == 3) {
			if (e.getX() >= 40 && e.getX() <= 40 + 290 && e.getY() >= 546 && e.getY() <= 546 + 30) {
				screenShow = 2;
			}
		}

		//Start picking your time manipulator 
		if (screenShow == 4) {
			if (e.getX() >= 0 && e.getX() <= 0 + skip.getIconWidth() && e.getY() >= 0 && e.getY() <= 0 + skip.getIconHeight()) {
				screenShow = 5;
				pickTeam = true;
				pickTimeManipulator = true;
			}
		}

		//Pick your team and get the stats according to it
		if (screenShow == 5) {
			if (e.getX() >= 682 && e.getX() <= 682 + Triangula.getIconWidth() && e.getY() >= 120 && e.getY() <= 120 + Triangula.getIconHeight()) {
				choiceTimeManipulator = 2;
				waitTime.start();
				animalSpeed = 18;
			}

			if (e.getX() >= 391 && e.getX() <= 391 + Shadow.getIconWidth() && e.getY() >= 450 && e.getY() <= 450 + Shadow.getIconHeight()) {
				choiceTimeManipulator = 3;
				waitTime.start();
				animalSpeed = 12;
			}

			if (e.getX() >= 100 && e.getX() <= 100 + George.getIconWidth() && e.getY() >= 110 && e.getY() <= 110 + George.getIconHeight()) {
				choiceTimeManipulator = 1;
				waitTime.start();
				animalSpeed = 25;
			}

			//After done pick armor engineer
			pickArmorEngineer = true;
			nextSpot = true;
		}

		//Pick armor engineer and set stats according to it
		if (screenShow == 6) {
			if (pickArmorEngineer) {
				if (e.getX() >= 100 && e.getX() <= 100 + Joseph.getIconWidth() && e.getY() >= 120 && e.getY() <= 120 + Joseph.getIconHeight()) {
					choiceArmorEngineer = 4;
					speed = 21;
					projSpeed = 25;
					waitTime2.start();
				} else if (e.getX() >= 391 && e.getX() <= 391 + AlexanderIII.getIconWidth() && e.getY() >= 450 && e.getY() <= 450 + AlexanderIII.getIconHeight()) {
					choiceArmorEngineer = 6;
					speed = 38;
					projSpeed = 39;
					waitTime2.start();
				} else if (e.getX() >= 682 && e.getX() <= 682 + Albert.getIconWidth() && e.getY() >= 110 && e.getY() <= 110 + Albert.getIconHeight()) {
					choiceArmorEngineer = 5;
					speed = 31;
					projSpeed = 32;
					waitTime2.start();
				}

				menuScreenShow = true;
				showleveldone0 = true;
			}
		}

		//If play again button clicked called method playAgain
		if (screenShow == 13) {
			if (e.getX() >= 247 && e.getX() <= 387 && e.getY() >= 267 && e.getY() <= 317) {

				playAgain();
			}
		}


		repaint();


		//		System.out.println("xPos:        " + e.getX());
		//		System.out.println("yPos:        " + e.getY());
		//		System.out.println("\n");

	}

	public void mousePressed(MouseEvent e) 	{

		//Check what button mouse pressed on home page and set variables according to that 

		if (screenShow == 7 && showleveldone0)
		{

			if (e.getX() >= 54 && e.getX() <= 54 + 305 && e.getY() >= 181 && e.getY() <= 181 + 113) {

				showScreenSilverwood = true;
				screenShow = 8;

				loading.start();
			}
		}

		//Check what button mouse pressed on home page and set variables according to that 


		if (screenShow == 7 && showleveldone1)
		{
			if (e.getX() >= 753 && e.getX() <= 753 + 300 && e.getY() >= 169 && e.getY() <= 169 + 100) {

				screenShow = 12;

				timeleft.start();
				playerTimer2.start();

			}
		}

		//Check what button mouse pressed on home page and set variables according to that 

		if (screenShow == 7 && showleveldone2)
		{
			if (e.getX() >= 67 && e.getX() <= 67 + 300 && e.getY() >= 540 && e.getY() <= 540 + 127) {

				playerTimer3.start();
				screenShow = 14;
			}
		}

		//Check what button mouse pressed on home page and set variables according to that 


		if (screenShow == 7 && showleveldone3) 
		{
			if (e.getX() >= 756 && e.getX() <= 756 + 300 && e.getY() >= 538 && e.getY() <= 538 + 110) {

				playertimer4.start();
				screenShow = 15;
			}

		}

		repaint();
	}

	//Ignore
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub

	}

	//Ignore
	public void mouseEntered(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) 

	{
		//Check if mouse hovered over the buttons to set it to their big state
		if (screenShow == 2) {


			if (e.getX() >= 425 && e.getX() <= 425 + startButton.getIconWidth() && e.getY() >= 250 && e.getY() <= 250 + startButton.getIconHeight())
			{
				drawBigStart = true;
			}

			else {
				drawBigStart = false;
			}

			if (e.getX() >= 200 && e.getX() <= 200 + instructionButton.getIconWidth() && e.getY() >= 475 && e.getY() <= 475 + instructionButton.getIconHeight()) 
			{
				drawBigInstruction = true;
			}

			else {
				drawBigInstruction = false;
			}

			if (e.getX() >= 700 && e.getX() <= 700 + exitButton.getIconWidth() && e.getY() >= 460 && e.getY() <= 460 + exitButton.getIconHeight())
			{
				drawBigExit = true;
			}

			else {
				drawBigExit = false;
			}


		}

		//Check if mouse hovered over the skip button to set it to its big state

		if (screenShow == 4)
		{

			if (e.getX() >= 0 && e.getX() <= 0 + skip.getIconWidth() && e.getY() >= 0 && e.getY() <= 0 + skip.getIconHeight()) 
			{
				drawSkipClicked = true;
			}

			else {

				drawSkipClicked = false;
			}

		}

		//Check is user hovered over character names 

		if (screenShow == 5)
		{

			if (e.getX() >= 682 && e.getX() <= 682 + Triangula.getIconWidth() && e.getY() >= 120 && e.getY() <= 120 + Triangula.getIconHeight()) 
			{
				drawBigTriangula = true;
			}

			else {

				drawBigTriangula = false;

			}

			if (e.getX() >= 391 && e.getX() <= 391 + Shadow.getIconWidth() && e.getY() >= 450 && e.getY() <= 450 + Shadow.getIconHeight()) 
			{
				drawBigShadow = true;
			}

			else {

				drawBigShadow = false;

			}

			if (e.getX() >= 100 && e.getX() <= 100 + George.getIconWidth() && e.getY() >= 110 && e.getY() <= 110 + George.getIconHeight()) 
			{
				drawBigGeorge = true;
			}

			else {

				drawBigGeorge = false;

			}


		}

		if (screenShow == 6)
		{

			if (e.getX() >= 100 && e.getX() <= 100 + Joseph.getIconWidth() && e.getY() >= 120 && e.getY() <= 120 + Joseph.getIconHeight()) 
			{
				drawBigJoseph = true;
			}

			else {

				drawBigJoseph = false;

			}

			if (e.getX() >= 391 && e.getX() <= 391 + AlexanderIII.getIconWidth() && e.getY() >= 450 && e.getY() <= 450 + AlexanderIII.getIconHeight()) 
			{
				drawBigAlexanderIII = true;
			}

			else {

				drawBigAlexanderIII = false;

			}

			if (e.getX() >= 682 && e.getX() <= 682 + Albert.getIconWidth() && e.getY() >= 110 && e.getY() <= 110 + Albert.getIconHeight()) 
			{
				drawBigAlbert = true;
			}

			else {

				drawBigAlbert = false;
			}
		}

		repaint();

	}




	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	public void keyPressed(KeyEvent e)
	{
		//Check if keyPressed only when these screens with action happening need it
		if (screenShow == 8 || screenShow == 9 || screenShow == 10 || screenShow == 11 || screenShow == 12 || screenShow == 14 || screenShow == 15 )
		{
			//Check if pressKeys is true
			if (pressKeys)
			{
				//Check if can press left and right to press it
				if (canPressLEFTRIGHT)
				{

					//Set left to true
					if (e.getKeyCode() == KeyEvent.VK_LEFT)
					{
						left = true;

						if (screenShow == 8)
						{
							junglePic = true;
							keyPressed1 = false;
						}
					}

					//Set right key pressed to true
					if (e.getKeyCode() == KeyEvent.VK_RIGHT)
					{

						right = true; 
						junglePic = false;
						keyPressed2 = false;

					}
				}

				//Check if can press up and down arrow keys and let them press it 
				if (canPressUPDOWN)
				{
					//Set up key to true
					if (e.getKeyCode() == KeyEvent.VK_UP)
					{
						up = true;
						keyPressed3 = false;


					}

					//Set down key to true
					if (e.getKeyCode() == KeyEvent.VK_DOWN)
					{

						down = true; 
						keyPressed4 = false;
					}


				}

				//Check if projectile shot and do required
				if (e.getKeyCode() == KeyEvent.VK_SPACE)
				{
					keyPressed5 = true;

					if (canFire)
					{
						if (isFired == false)
						{
							projectileAxeX = player.getX(); 
							projectileAxeY = player.getY(); 
							isFired = true; 
							timerAxe.start();
							touch = false;

							projectileDirectionRight = !junglePic;

						}
					}

					//Check if projectile out of reach
					if (isFired == true && projectileAxeX + projectileAxe.getIconWidth() >= getWidth() || projectileAxeX <= 0)
					{
						isFired = false; 
						timerAxe.stop();
					}

				}

				//Check if the space button and dig is true to dig up the gem 
				if (e.getKeyCode() == KeyEvent.VK_SPACE && playerMask.intersects(fire) && screenShow == 15)
				{
					digGem = true;
					screenShow = 16;
					repaint();
				}
			}
		}

		repaint();

	}


	public void keyReleased(KeyEvent e)
	{
		//Set variables back to false after key released
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			left = false;
		}

		//Set variables back to false after key released
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			right = false; 
		}

		//Set variables back to false after key released
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			up = false;
		}

		//Set variables back to false after key released
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			down = false; 
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		//Check if timer is loadingSwitch to switch screen
		if (e.getSource() == loadingSwitch)

		{
			loadingSwitch.stop();

			screenShow = 2;

			//screenShow = 15;

		}


		//Check if timer is firstScreen to switch it 
		if (e.getSource() == firstScreen)
		{
			firstScreen.stop();
			showSecondScreen = true;
			showFirstScreen = false;
		}


		//Check if timer is secound to switch it 
		if (e.getSource() == secoundScreen)
		{
			secoundScreen.stop();
			showSecondScreen = false;
			showThirdScreen = true;
			repaint();
		}


		//Check if timer is thirdScreen to switch it 
		if (e.getSource() == thirdScreen)
		{
			thirdScreen.stop();
			showThirdScreen = false;
			showFourthScreen = true;
			repaint();
		} 

		//Check if timer is fourthScreen to switch it 
		if (e.getSource() == fourthScreen)
		{
			fourthScreen.stop();
			showFourthScreen = false;
			showGuardScreen = true;
			guardScreen1 = true;
			repaint();
		} 

		//Make the ninja move for the animation
		if (e.getSource() == ninjaMove)
		{
			if (timeRun < 100)
			{

				if (timeRun <= 20)
				{
					ninjayPos += 5;
					timeRun +=1;
				}

				if (timeRun >= 20)
				{
					ninjayPos += 0;
					ninjaxPos += 10;
				}

				repaint();

			}

		}

		//Check if ninja can move
		if (e.getSource() == timetoMove)
		{
			ninjaMove.stop();
			ninjaxPos += 0;
			ninjayPos += 0;
			timeRun = 101;
			guardScreen1 = false;
			guardScreen2 = true;
		}

		//Check if guard screen can play
		if (e.getSource() == guardLoading)
		{
			guardLoading.stop();
			guardScreen2 = false;
			guardScreen3 = true;
		}

		//Check if guard screenw can play

		if (e.getSource() == guardLoading2)
		{
			guardLoading2.stop();
			guardScreen3 = false;
			guardScreen4 = true;

		}

		//Check if guard screen 3 can play

		if (e.getSource() == guardLoading3)
		{
			guardLoading3.stop();
			guardScreen4 = false;
			showGuardScreen = false;
			showFifthScreen = true;

		}

		//Check if guard screen 3 can play x2 to make it a little longer than the rest while also being smooth

		if (e.getSource() == guardLoading3)
		{
			guardLoading3.stop();
			guardScreen4 = false;
			showGuardScreen = false;
			showFifthScreen = true;

		}

		//Check if screen 5 can play

		if (e.getSource() == fifthScreen)
		{
			fifthScreen.stop();
			showFifthScreen = false;
			showSixthScreen = true;
		}

		//Check if screen 6 can play

		if (e.getSource() == sixthScreen)
		{
			sixthScreen.stop();
			showSixthScreen = false;
			showSeventhScreen = true;
		}

		//Check if screen 7 can play

		if (e.getSource() == seventhScreen)
		{
			seventhScreen.stop();
			showSeventhScreen = false;
			showEighthScreen = true;
		}

		//Check if the boat animation can move

		if (e.getSource() == timerBoat)
		{
			if (isMoving)
			{
				boatupYpos -= 1;
				boatdownYpos += 1;
				boatleftXpos -= 2;
				boatrightXpos += 2;
			}

			//Update Paint
			repaint();
		}

		if (e.getSource() == eighthScreen)
		{
			timerBoat.stop();
			isMoving = false;

			showEighthScreen = false;
			showNinthScreen = true;

			//Check if 8th screen is running and do the actions inside of it

		}

		//Check if 8th screen is running and do the actions inside of it

		if (e.getSource() == eighthScreen)
		{
			timerBoat.stop();
			isMoving = false;

			showEighthScreen = false;
			showNinthScreen = true;
			isThiefCaught1 = true;

		}

		//Check if the thief animation caught 1 is being stopped 
		if (e.getSource() == loadingThiefCaught1)
		{
			loadingThiefCaught1.stop();

			isThiefCaught1 = false;
			isThiefCaught2 = true;
		}

		//Check if the thief animation caught 1 is being stopped 
		if (e.getSource() == loadingThiefCaught2)
		{
			loadingThiefCaught2.stop();

			isThiefCaught2 = false;
			isThiefCaught3 = true;
		}

		//Check if the thief animation caught 1 is being stopped
		if (e.getSource() == loadingThiefCaught3)
		{
			loadingThiefCaught3.stop();

			isThiefCaught3 = false;
			showNinthScreen = false;
			showTenthScreen = true;
			presentDayScreen = true;
		}

		//Check if the tenth animation screen is running
		if (e.getSource() == tenthScreen)
		{
			tenthScreen.stop();
			loadingThiefCaught1.stop();
			loadingThiefCaught2.stop();
			eighthScreen.stop();

			//Set all the thiefCaught variables to false so they do not mess with us
			isThiefCaught1 = false; 
			isThiefCaught2 = false; 
			isThiefCaught3 = false;
			showTenthScreen = false;
			showEleventhScreen = true;
		}

		//Check if timer reaches eleventh screen
		if (e.getSource() == eleventhScreen)
		{
			eleventhScreen.stop();

			showEleventhScreen = false;
			presentDayScreen = false;

			screenShow = 5;
			pickTeam = true; 
			pickTimeManipulator = true;

		}

		//Check if timer reaches waitime in between the animations to make it look smooth
		if (e.getSource() == waitTime)
		{
			waitTime.stop();
			screenShow = 6; 
		}

		//Check if timer reaches waitime2 in between the animations to make it look smooth

		if (e.getSource() == waitTime2)
		{
			waitTime2.stop();
			screenShow = 7; 
		}


		//Check if the playerTimer is running
		if (e.getSource() == playerTimer)
		{
			//Make the player move from the player class and use variables brought in. Including speed.
			player.move(up, down, left, right, speed);
			//Update Paint
			repaint();
		}


		//Check if the loading screen loads to skip the silverwood introduction
		if (e.getSource() == loading)
		{
			skipScreenSilverwood = true;
			showScreenSilverwood = false;
			playerTimer.start();
		}

		//Check if the timer for axe is running
		if (e.getSource() == timerAxe)
		{
			//Throw the axe based on the direction the character is standing
			if (projectileDirectionRight)
			{
				projectileAxeX += projSpeed;
			}

			else {

				projectileAxeX -= projSpeed;
			}
		}



		if (e.getSource() == timerAxe)
		{
			//Check if the axe hits a enemy
			if (axeMask.intersects(enemyMask) && touch == false)
			{
				touch = true;	
				repaint();	
			}

		}

		if (e.getSource() == timerFight)
		{
			//Make the enemy mmove from main, and make the animals move
			enemy.move(animalSpeed, animalSpeed);
			repaint();

			//Set all drawings to false so nothing messes up
			draw1 = false;
			draw2 = false; 
			draw3 = false; 
			draw4 = false;
			draw5 = false;

			//Change the enemy masks to follow the enemy with the timer
			enemyMask = new Rectangle2D.Double(enemy.getX(), enemy.getY(), enemy.getEnemy1().getIconWidth(), enemy.getEnemy1().getIconHeight());

			enemyMask2 = new Rectangle2D.Double(enemy.get2X(), enemy.get2Y(), enemy.getEnemy2().getIconWidth(), enemy.getEnemy2().getIconHeight());

			enemyMask3 = new Rectangle2D.Double(enemy.get3X(), enemy.get3Y(), enemy.getEnemy3().getIconWidth(), enemy.getEnemy3().getIconHeight());


			//Check if axe has been shot
			if (isFired == true)
			{
				axeMask = new Rectangle2D.Double(projectileAxeX, projectileAxeY, projectileAxe.getIconWidth() / 2, projectileAxe.getIconHeight() / 2);
			}

			else {

				axeMask = new Rectangle2D.Double(-100,-100, projectileAxe.getIconWidth() / 2, projectileAxe.getIconHeight() - 100);

			}

		}


		//Check if the timer reaches the time to wait
		if (e.getSource() == timeToWait)

		{
			timeToWait.stop();
			startGame = true;
		}


		//Check if the game is started
		if (startGame)
		{	
			if (axeMask.intersects(enemyMask))
			{
				//Draw enemyImage
				drawEnemyMask = false;
				repaint();
			}

			if (axeMask.intersects(enemyMask2))
			{
				//Draw EnemyImage2
				drawEnemyMask2 = false;
				repaint();
			}

			if (axeMask.intersects(enemyMask3))
			{
				//Draw Enemy Image3
				drawEnemyMask3 = false;
				repaint();
			}

		}

		//Check if timer is running with player 2, and run it from player class again
		if (e.getSource() == playerTimer2)
		{
			player.move(up, down, left, right, speed);		

			//Set rectangle to follow it always 
			playerMask = new Rectangle2D.Double(player.getX() + 30, player.getY() + 25, player.getPicture(junglePic).getIconWidth() - 75, player.getPicture(junglePic).getIconHeight() - 100);

			//Update paint
			repaint();

		}

		//Check if the first player timer is running, and do the same stuff
		if (e.getSource() == playerTimer)
		{ 
			player.move(up, down, left, right, speed);		

			playerMask = new Rectangle2D.Double(player.getX() + 30, player.getY() + 25, player.getPicture(junglePic).getIconWidth() - 75, player.getPicture(junglePic).getIconHeight() - 100);

			repaint();
		}

		//Check if the pause between the JPanel is done
		if (e.getSource() == JPanePause)
		{
			JPanePause.stop();

			rc = JOptionPane.showOptionDialog(null, "Welcome to the jungle, Viking! Seems like you already know the controls! \nPress Space to shoot your special axe and move with the up, down, left and right arrow keys. \nWatch out for suprise attacks. \nThis will be a warm- up so no damage will be taken!", "Guider's Message", JOptionPane.INFORMATION_MESSAGE,0, guider, options, null);


			//Set all variables after they click a button
			if (rc >= 0)
			{

				canFire = true;
				ambush = true;
				timerFight.start();
				timeToWait.start();
				pressKeys = true;
			}
		}

		if (screenShow == 9)
		{

			canPressUPDOWN = true;

			//Check if player touches any of the bushes and set them back to spawn
			if (playerMask.intersects(bush1) || playerMask.intersects(bush2) || playerMask.intersects(bush3) || playerMask.intersects(bush4) || playerMask.intersects(bush5) || playerMask.intersects(bush6) || playerMask.intersects(bush7))
			{
				player.getX(610);
				player.getY(541);
			}

			//Check if they have continued succesfully 
			if (playerMask.intersects(continueSpace))
			{

				if (left == false && right == false && down == false && up == false)
				{
					//Update player variables for next time player is used
					up = false;
					screenShow = 10;

					//Update player variables for next time player is used
					player.getX(0);
					player.getY(500);


					playerTimer.stop();
				}
			}
		}

		if (screenShow == 10)
		{

			//Draw the JOption Pane ONLY ONCE
			if (drawPane == 1)
			{
				drawPane = 2;
				JOptionPane.showMessageDialog(null, "Watch out! These monkeys are not cleaning after themselves!\nBananas are dropping at different speeds, avoid hitting them. \nFinding Pacificus piece #1 is getting closer, just a little bit left!", "Guider's Message", JOptionPane.ERROR_MESSAGE, guider);
				bananaFalling.start();

			}

			//Check if bananas are falling
			if (e.getSource() == bananaFalling)
			{

				// Make sure they can not move up or down
				canPressUPDOWN = false;

				//Call player move
				player.move(up, down, left, right, speed);

				//Make bananas fall from enemy class
				enemy.fallingBananas(speed);

				//Give bananas rectangle for collisions
				banana1 = new Rectangle2D.Double(enemy.getBanana1X() + 15, enemy.getBanana1Y() + 30, enemy.getBanana1().getIconWidth() - 20, enemy.getBanana1().getIconHeight() - 30);
				banana2 = new Rectangle2D.Double(enemy.getBanana2X() + 15, enemy.getBanana2Y() + 30, enemy.getBanana2().getIconWidth() - 20, enemy.getBanana2().getIconHeight() - 30);
				banana3 = new Rectangle2D.Double(enemy.getBanana3X() + 15, enemy.getBanana3Y() + 30, enemy.getBanana3().getIconWidth() - 20, enemy.getBanana3().getIconHeight() - 30);
				banana4 = new Rectangle2D.Double(enemy.getBanana4X() + 15, enemy.getBanana4Y() + 30, enemy.getBanana4().getIconWidth() - 20, enemy.getBanana4().getIconHeight() - 30);

				//Set player mask
				playerMask = new Rectangle2D.Double(player.getX() + 20, player.getY() + 10, player.getPicture(junglePic).getIconWidth(), player.getPicture(junglePic).getIconHeight() + 100);

				if (player.getX() + player.getPicture(junglePic).getIconWidth() >= getWidth() - 125)
				{
					if (left == false && right == false && down == false && up == false)
					{
						//Set the player values for next tie used
						screenShow = 11;
						player.getX(25);
						player.getY(0);

						if (drawPane == 2)
						{
							canPressUPDOWN = false;
							canPressLEFTRIGHT = false;

							drawPane = 3;
							JOptionPane.showMessageDialog(null, "Speak to the Jungle Master. He is the one who hold possession of the first piece of the gem.\nIt will not be easy to convice him for the gem. Go in his radius to start a conversation",  "Guider's Message", JOptionPane.ERROR_MESSAGE, guider);
							jungleconfront.start();
							bananaFalling.stop();

							//Stop the banana falling

						}
					}
				}

				//Check if banaana touched player
				if (playerMask.intersects(banana1) || playerMask.intersects(banana2) || playerMask.intersects(banana3) || playerMask.intersects(banana4))
				{
					//Reset them
					player.getX(0);
					player.getY(500);
				}

				//Update Paint
				repaint();
			}
		}

		//Check if screenShow is 11 and make sure everything can move for the confrontations
		if (screenShow == 11)
		{
			if (e.getSource() == jungleconfront)
			{
				canPressLEFTRIGHT = true;
				canPressUPDOWN = true;
				pressKeys = true;

				playerMask = new Rectangle2D.Double(player.getX() + 30, player.getY() + 25, player.getPicture(junglePic).getIconWidth() - 75, player.getPicture(junglePic).getIconHeight() - 100);

				player.move(up, down, left, right, speed);
				repaint();

			}
		}

		//playerrun Class to move at a certain speed
		if (e.getSource() == playerrun2)
		{
			player.move(up, down, left, right, speed);
			repaint();
		}

		//Player timer4 needed for next time player is brought back
		if (e.getSource() == playertimer4)
		{
			player.move(up, down, left, right, speed);
			repaint();
		}

		//Check if screenShow is 11
		if (screenShow == 11)
		{

			//Check if player is in radius of Jungle Master

			if (playerMask.intersects(jungleMasterArea)) {

				//Make sure all keys are pressed before they fight to avoid dragging
				if (left == false && right == false && down == false && up == false)
				{
					//Do a conversation and after each one clicks the continue button the other persons saying pop's up
					if (drawPane == 3) 
					{

						drawPane = 4;
						rc = JOptionPane.showOptionDialog(null, "Hey! What are you doing here!\nHow did you make it past here. Guards, take him out", "Jungle Master", JOptionPane.INFORMATION_MESSAGE,0, jungleMaster, next, null);

						if (rc >= 0)
						{
							next1 = true;
						}

					}
					if (drawPane == 4 && next1 == true) 
					{
						drawPane = 5;
						rc = JOptionPane.showOptionDialog(null, "WAIT! I went through the jungle. It was easy actually.\nI am here for pacificus.\nI know you have it, Jungle Master", "You", JOptionPane.ERROR_MESSAGE,0, viking, next, null);   

						if ( rc >= 0)
						{
							next2 = true;
						}

					}

					if (drawPane == 5 && next2 == true) 
					{
						drawPane = 6;
						rc = JOptionPane.showOptionDialog(null, "Why would I give it to you?\n Actually, I don't need that stone. But I do need one thing in return.", "Jungle Master", JOptionPane.ERROR_MESSAGE, 0, jungleMaster, next, null);

						if ( rc >= 0)
						{
							next3 = true;
						}
					}

					if (drawPane == 6 && next3 == true) {
						drawPane = 7;
						rc = JOptionPane.showOptionDialog(null, "Yes, I spent so long trying to find the first piece with my team. This is all I need.\nAnything. ", "You", JOptionPane.ERROR_MESSAGE, 0, viking, next, null);    

						if ( rc >= 0)
						{
							next4 = true;
						}
					}

					if (drawPane == 7 && next4) {
						drawPane = 8;
						rc = JOptionPane.showOptionDialog(null, "For the last 1000 years... nobody could give me the answer to my riddle.\nIf you give me the correct answer - you can get it!", "Jungle Master", JOptionPane.ERROR_MESSAGE, 0, jungleMaster, next, null);
						if ( rc >= 0)
						{
							next5 = true;
						}
					}

					if (drawPane == 8 && next5) {

						drawPane = 9;
						rc = JOptionPane.showOptionDialog(null, "OK!", "You", JOptionPane.ERROR_MESSAGE, 0, viking, next, null);  

						if ( rc >= 0)
						{
							next6 = true;
						}
					}

					//Ask user for riddle 
					if (drawPane == 9 && next6) {

						drawPane = 10;

						//Set local variables 
						String correctAnswer = "egg";
						String correctAnswer2 = "a egg";
						String correctAnswer3 = "an egg";
						boolean riddleSolved = false;

						String userAnswer;


						//Check if they have NOT solved it 
						if (!riddleSolved) {
							do {
								userAnswer = JOptionPane.showInputDialog(null, "What is more useful when broken?", "Riddle Game", JOptionPane.QUESTION_MESSAGE);

								//If they do not answer
								if (userAnswer == null) 
								{
									JOptionPane.showMessageDialog(null, "Please Answer! Try Again", "Riddle Game", JOptionPane.WARNING_MESSAGE);
								}

								//if answer does not equal to any of the options.
								else if (!userAnswer.equalsIgnoreCase(correctAnswer) && !userAnswer.equalsIgnoreCase(correctAnswer2) && !userAnswer.equalsIgnoreCase(correctAnswer3)) 

								{
									//Print incorrect
									JOptionPane.showMessageDialog(null, "Incorrect answer. Try again!", "Riddle Game", JOptionPane.WARNING_MESSAGE);
								} else 

								{
									//Run else statement if everything else false
									JOptionPane.showMessageDialog(null, "Congratulations! You solved the riddle!", "Riddle Game", JOptionPane.INFORMATION_MESSAGE);
									riddleSolved = true;

									//Show level progress of main meny
									showleveldone0 = false;

									//Go to meny
									showleveldone1 = true;
									screenShow = 7;

									//Set player x and y pos
									player.getX(0);
									player.getY(0);

									//Go to menu
									menuScreenShow = true;

									repaint();

								}
							} 

							//keep looping if they answer wrong
							while (userAnswer != null && !riddleSolved);
						}
					}

				}

			}
		}

		//check if we can draw the loss button
		if (e.getSource() == timeleft)
		{
			timeleft.stop();

			drawLoss = true;
			screenShow = 13;
			repaint();
		}

		//Check if the JOptionPane ready to be called
		if (screenShow == 14)
		{
			if (playerMask.intersects(vaultArea)) {

				if (left == false && right == false && down == false && up == false)
				{
					if (drawPane == 11 || drawPane == 10)
					{
						drawPane = 12;

						{
							//Create a while statement to keep running until the correct pin is entered
							while (true)
							{
								try 
								{
									//Ask for combination
									String input1 = (String) JOptionPane.showInputDialog(null, "What is the combination? ", "Locker Vault", JOptionPane.QUESTION_MESSAGE, diverboy, null, null);

									if (input1 == null)
									{
										//Check if they want to exit
										System.exit(0);
									}

									int combination = Integer.parseInt(input1);

									//Check if correct and put code for changing screns
									if (combination == 6329)
									{
										showleveldone3 = true;

										showleveldone2 = false;
										screenShow = 7;

										player.getX(0);
										player.getY(0);

										menuScreenShow = true;

										repaint();
										break;
									} 
									else 
									{
										JOptionPane.showMessageDialog(null, "WRONG COMBINATION!", "Error", JOptionPane.ERROR_MESSAGE);
									}

								} 
								catch (NumberFormatException e1) 
								{
									JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
								}
							}
						}
					}
				}
			}
		}
	}

	// - - -- - -- -- -  --  -- - -  --        - - - - - - - - -- - - - -  -- - - -  - -

	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		//Check if it is true and draw loading screen
		if (screenShow == 1)
		{
			g2.drawImage(loadingScreen.getImage(), -10, 0, this);
			g2.drawImage(loadingcircle.getImage(), 500, 250, this);
		}

		//Check if it is true and draw main menu

		if (screenShow == 2)
		{
			frame.setSize(mainMenu.getIconWidth() - 5, mainMenu.getIconHeight());			
			g2.drawImage(mainMenu.getImage(), 0, 0, this);

			if (drawBigStart == false)
			{
				g2.drawImage(startButton.getImage(), 425, 250, this);
			}

			if (drawBigStart)
			{
				g2.drawImage(bigStart.getImage(), 395, 250, this);
			}

			if (drawBigInstruction == false)
			{
				g2.drawImage(instructionButton.getImage(), 200, 475, this);
			}

			if (drawBigInstruction)
			{
				g2.drawImage(bigInstruction.getImage(), 170, 475, this);
			}

			if (drawBigExit == false)
			{
				g2.drawImage(exitButton.getImage(), 700, 460, this);
			}

			if (drawBigExit == true)
			{
				g2.drawImage(bigExit.getImage(), 670, 460, this);
			}
		}

		//Check if it is true and draw instructions screen
		if (screenShow == 3)
		{
			frame.setSize(instructionsPage.getIconWidth() , instructionsPage.getIconHeight() + 15);			
			g2.drawImage(instructionsPage.getImage(), 0, 0, this);
		}


		//Check if it is true and draw intro screen screen

		if (screenShow == 4)
		{

			if (showFirstScreen == true)
			{
				frame.setSize(introKingdom.getIconWidth() , introKingdom.getIconHeight());			
				firstScreen.start();

				g2.drawImage(introKingdom.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}


				g2.setFont(f);
				g2.setColor(Color.black);
				g2.setStroke(new BasicStroke(20));
				g2.drawString("1431, ", 55, 220);
				g2.drawString("Kingdom ", 55, 400);
				g2.drawString("Of Valencia ", 45, 600);
			}

			if (showSecondScreen) {

				//Draw everything necessary
				secoundScreen.start();

				//Set the frame
				frame.setSize(kingRoberto.getIconWidth() , thiefcaught[0].getIconHeight());		

				//set the font to be used 
				g2.setFont(f2);
				
				//draw image of king roberto
				g2.drawImage(kingRoberto.getImage(), 0, 0, this);

				//set colour of the highlight to be white 
				g2.setColor(Color.white);
				g2.fill(new Rectangle2D.Double(16,545,616,61));

				//set colour of the string to be black 
				g2.setColor(Color.black);
				
				//draw King Roberto IV
				g2.drawString("King Roberto IV ", 30, 600);

				//check if skip clicked is going to be called
				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {
					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showThirdScreen)
			{
				//Draw everything necessary

				thirdScreen.start();
				frame.setSize(miners.getIconWidth() , thiefcaught[0].getIconHeight());		

				g2.drawImage(miners.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showFourthScreen)
			{
				//Draw everything necessary

				fourthScreen.start();
				frame.setSize(pacificusImage.getIconWidth() , thiefcaught[0].getIconHeight());		

				g2.drawImage(pacificusImage.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showGuardScreen)
			{
				//Draw everything necessary

				frame.setSize(guardImage[0].getIconWidth() , guardImage[0].getIconHeight() - 80);		

				if (guardScreen1)
				{
					g2.drawImage(guardImage[0].getImage(), 0, 0, this);
					g2.drawImage(ninja.getImage(), ninjaxPos, ninjayPos, this);

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
					ninjaMove.start();
					timetoMove.start();
				}	

				if (guardScreen2)
				{
					//Draw everything necessary

					g2.drawImage(guardImage[1].getImage(), 0, 0, this);
					guardLoading.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}

				}

				if (guardScreen3)
				{
					//Draw everything necessary

					g2.drawImage(guardImage[2].getImage(), 0, 0, this);
					guardLoading2.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}

				if (guardScreen4)
				{
					//Draw everything necessary

					g2.drawImage(guardImage[3].getImage(), 0, 0, this);
					guardLoading3.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}
			}

			if (showFifthScreen)
			{
				//Draw everything necessary and start timer 

				fifthScreen.start();
				g2.drawImage(ninjaBunker.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showSixthScreen)
			{
				//Draw everything necessary and start timer 

				sixthScreen.start();
				g2.drawImage(ninjaBunker.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showSeventhScreen)
			{
				//Draw everything necessary and start timer 

				seventhScreen.start();
				g2.drawImage(gemBed.getImage(), 0, 0, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showEighthScreen)
			{
				//Draw everything necessary and start timer 

				frame.setSize(map.getIconWidth() , map.getIconHeight());		
				g2.drawImage(map.getImage(), 0, 0, this);

				isMoving = true;

				eighthScreen.start();
				timerBoat.start();

				//Draw boat images 

				g2.drawImage(boatup.getImage(), 385, boatupYpos, this);
				g2.drawImage(boatdown.getImage(), 400, boatdownYpos, this);
				g2.drawImage(boatleft.getImage(), boatleftXpos, 255, this);
				g2.drawImage(boatright.getImage(), boatrightXpos, 280, this);

				if (drawSkipClicked == false)
				{
					g2.drawImage(skip.getImage(), 0, 0, this);
				}

				else {

					g2.drawImage(skipclicked.getImage(), -10, -10, this);
				}
			}

			if (showNinthScreen)
			{
				//Check if thief caught storyline is playing
				if (isThiefCaught1)
				{
					frame.setSize(thiefcaught[0].getIconWidth() , thiefcaught[0].getIconHeight());	

					g2.drawImage(thiefcaught[0].getImage(), 0, 0, this);
					loadingThiefCaught1.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}

				//Check if thief caught storyline is playing

				if (isThiefCaught2)
				{
					g2.drawImage(thiefcaught[1].getImage(), 0, 0, this);
					loadingThiefCaught2.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}

				//Check if thief caught storyline is playing

				if (isThiefCaught3)
				{
					g2.drawImage(thiefcaught[2].getImage(), 0, 0, this);
					loadingThiefCaught3.start();

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}

			}

			//Check if present day storyline is playing (in the bunker)

			if (presentDayScreen)
			{
				if (showTenthScreen)
				{
					frame.setSize(presentdaybunker.getIconWidth() , presentdaybunker.getIconHeight());	

					tenthScreen.start();
					g2.drawImage(presentdaybunker.getImage(), 0, 0, this);

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}

				}

				//Check if eleventh Screen is showing
				if (showEleventhScreen)
				{
					//Do all switches necessary 
					frame.setSize(teampick.getIconWidth() , teampick.getIconHeight());	

					eleventhScreen.start();
					g2.drawImage(teampick.getImage(), 0, 0, this);

					if (drawSkipClicked == false)
					{
						g2.drawImage(skip.getImage(), 0, 0, this);
					}

					else {

						g2.drawImage(skipclicked.getImage(), -10, -10, this);
					}
				}

			}
		}

		//Check if screenShow is 5
		if (screenShow == 5)
		{
			//Let them pick their team
			if (pickTeam)
			{
				//Do all switches necessary 

				frame.setSize(choosescreen.getIconWidth() , choosescreen.getIconHeight() - 150);	


				g2.drawImage(choosescreen.getImage(), 0, 0, this);

				if (pickTimeManipulator)
				{
					//Do all switches necessary 

					if (drawBigTriangula == false)
					{
						g2.drawImage(Triangula.getImage(), 682, 120, this);
					}
					else {

						g2.drawImage(bigTriangula.getImage(), 682, 120, this);
					}

					if (drawBigGeorge == false)
					{
						g2.drawImage(George.getImage(), 100, 110, this);
					}

					else {

						g2.drawImage(bigGeorge.getImage(), 100, 110, this);
					}

					if (drawBigShadow == false)
					{
						g2.drawImage(Shadow.getImage(), 391, 450, this);
					}

					else {

						//Do all switches necessary 


						g2.drawImage(bigShadow.getImage(), 391, 450, this);
					}
					g2.setFont(f2);
					g2.setColor(Color.white);
					g2.drawString("Pick Your Time Manipulator", 109, 80);
				}
			}

		}

		//Check if screenShow is 6
		if (screenShow == 6)
		{
			//Check if they can pick the 2nd half of their team
			if (pickTeam)
			{
				//check if user hovered over the screen to draw the big version of it 
				g2.drawImage(choosescreen.getImage(), 0, 0, this);

				if (pickArmorEngineer)
				{
					if (drawBigJoseph == false)
					{
						g2.drawImage(Joseph.getImage(), 100, 120, this);
					}
					else {

						g2.drawImage(bigJoseph.getImage(), 100, 120, this);
					}

					if (drawBigAlbert == false)
					{
						g2.drawImage(Albert.getImage(), 682, 120, this);
					}
					else {

						g2.drawImage(bigAlbert.getImage(), 682, 120, this);
					}
					if (drawBigAlexanderIII == false)
					{
						g2.drawImage(AlexanderIII.getImage(), 391, 450, this);
					}

					else {

						g2.drawImage(bigAlexanderIII.getImage(), 391, 450, this);
					}

					g2.setFont(f2);
					g2.setColor(Color.white);
					g2.drawString("Pick Your Armor Engineer", 109, 80);
				}
			}

		}

		//Go to menu frame
		if (screenShow == 7)
		{
			//Do all switches necessary 

			frame.setSize(menuScreen[0].getIconWidth() , menuScreen[0].getIconHeight());	

			if (menuScreenShow)
			{				
				//Do all switches necessary 

				//Do all switches necessary 
				if (showleveldone0)
				{
					g2.drawImage(menuScreen[0].getImage(), 0, 0, this);
				}

				
				//Do all switches necessary 
				else if (showleveldone1)
				{
					g2.drawImage(menuScreen[1].getImage(), 0, 0, this);
				}

				//Do all switches necessary 
				else if (showleveldone2)
				{
					g2.drawImage(menuScreen[2].getImage(), 0, 0, this);

				}

				//Do all switches necessary 
				else if (showleveldone3)
				{
					g2.drawImage(menuScreen[3].getImage(), 0, 0, this);
				}

				//Do all switches necessary 
				else if (showleveldone4)
				{
					g2.drawImage(menuScreen[4].getImage(), 0, 0, this);
				}
			}
		}

		if (screenShow == 8)
		{
			//Do all switches necessary 

			if (showScreenSilverwood == true)
			{
				frame.setSize(silverwood.getIconWidth() , silverwood.getIconHeight());	
				g2.drawImage(silverwood.getImage(), 0, 0, this);

			}

			if (skipScreenSilverwood)
			{
				//Do all switches necessary 

				frame.setSize(junglebackground.getIconWidth(), junglebackground.getIconHeight());	

				g2.drawImage(junglebackground.getImage(), 0, 0, this);
				g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);

				//Check if all the keys have been pressed atleast once
				if (!keyPressed1 == false || !keyPressed2 == false || !keyPressed3 == false || !keyPressed4 == false || keyPressed5 == false)
				{
					g2.drawImage(keyarrows.getImage(), 900, -50, this);
					g2.drawImage(spacebutton.getImage(), 1000, 200, this);


					//Do all switches necessary 

					g2.setFont(f3);

					g2.setColor(Color.white);
					g2.fill(new Rectangle2D.Double(305,45,660,35));

					g2.setColor(Color.black);
					g2.drawString("Press Keys and Space to Continue", 300, 75);
				}

				else {

					if (joptionpane == 0)
					{
						//Make sure the JOptionPane only runs once and not loops infinite
						joptionpane=1;
						pressKeys = false;
						JPanePause.start();
					}
				}


			}

			if (isFired == true)
			{
				//g2.fill(axeMask);
				//Check if fired is true and draw the image of the axe 
				g2.drawImage(projectileAxe.getImage(), projectileAxeX, projectileAxeY, this);
			}

			//Check if user has gotten ambushed
			if (ambush)
			{
				//Draw the enemy image 1 for it 
				if (drawEnemyMask)
				{
					g2.drawImage(enemy.getEnemy1().getImage(), enemy.getX(), enemy.getY(), this);
				}

				//Draw the enemy image 2 for it 
				if (drawEnemyMask2)
				{
					g2.drawImage(enemy.getEnemy2().getImage(), enemy.get2X(), enemy.get2Y(), this);
				}

				//Draw the enemy image 2for it 

				if (drawEnemyMask3)
				{
					g2.drawImage(enemy.getEnemy3().getImage(), enemy.get3X(), enemy.get3Y(), this);
				}

				g2.setColor(Color.white);
//				g2.fill(axeMask);
//								g2.fill(enemyMask);
//								g2.fill(enemyMask2);
//								g2.fill(enemyMask3);
//								g2.fill(playerMask);

			}

			if (drawEnemyMask == false && drawEnemyMask2 == false && drawEnemyMask3 == false)
			{

				//Check if all of the enemy's are wiped off 

				//Set the new timer for the new screen
				timerFight.stop();
				startGame = false;
				isFired = false;
				screenShow = 9;
				playerTimer2.start();

				//Make sure the ambush is false and set the new coordinates for the x and y pos of the player
				ambush = false;
				timerAxe.stop();
				player.getX(548);
				player.getY(535);

				//Draw all shapes for the bushes 
				bush1 = new Rectangle2D.Double(251,40,150, 60) ;
				bush2 = new Rectangle2D.Double(36,93,186 , 200) ;
				bush3 = new Rectangle2D.Double(214,259,140 , 138) ;
				bush4 = new Rectangle2D.Double(407,354,60,210);
				bush5 = new Rectangle2D.Double(590,167,140,90);
				bush6 = new Rectangle2D.Double(759,475,165,100);
				bush7 = new Rectangle2D.Double(790,202,165,145);
				continueSpace = new Rectangle2D.Double(475,3,30,77);
			}

		}

		if (screenShow == 9)

		{
			//Set press keys to false so they do not glide away
			pressKeys = false;

			frame.setSize(bushobstacles.getIconWidth(), bushobstacles.getIconHeight());	
			g2.drawImage(bushobstacles.getImage(), 0, 0, this);
			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);

			if (drawPane == 0)
			{
				//Get the JOption pane to run only once
				drawPane = 1;
				JOptionPane.showMessageDialog(null, "Shhhh... \nYou are entering the Lion's Territory! Avoid the obstacles and do not touch them or else it will make noise. \nMake your way to the arrow and remember, BE QUIET!", "Guider's Message", JOptionPane.ERROR_MESSAGE, guider);
			}

			pressKeys = true;

//						g2.fill(bush1);
//						g2.fill(bush2);
//						g2.fill(bush3);
//						g2.fill(bush4);
//						g2.fill(bush5);
//						g2.fill(bush6);
//						g2.fill(bush7);
//						
//						g2.fill(playerMask);

			//g2.fill(continueSpace);
		}

		if (screenShow == 10)
		{

			//Get the banana run screen

			frame.setSize(bananarun.getIconWidth(), bananarun.getIconHeight());

			//draw background and extra image
			g2.drawImage(bananarun.getImage(), 0, 0, this);
			g2.drawImage(monkey1.getImage(), 0, 0, this);
			g2.drawImage(monkey1.getImage(), 1000, 0, this);

			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);

			//draw Enemy bananas
			g2.drawImage(enemy.getBanana1().getImage(), enemy.getBanana1X(), enemy.getBanana1Y(), this);
			g2.drawImage(enemy.getBanana2().getImage(), enemy.getBanana2X(), enemy.getBanana2Y(), this);
			g2.drawImage(enemy.getBanana3().getImage(), enemy.getBanana3X(), enemy.getBanana3Y(), this);
			g2.drawImage(enemy.getBanana4().getImage(), enemy.getBanana4X(), enemy.getBanana4Y(), this);

			//			g2.fill(banana1);
			//			g2.fill(banana2);
			//			g2.fill(banana3);
			//			g2.fill(banana4);

			//g2.fill(playerMask);
		}

		if (screenShow == 11)
		{

			//Get the final jungle meet up screen 

			frame.setSize(finalJungle.getIconWidth(), finalJungle.getIconHeight());

			g2.drawImage(finalJungle.getImage(), 0, 0, this);
			g2.drawImage(jungleMaster.getImage(), 800, 500, this);

			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);

			//			g2.fill(jungleMasterArea);
			//			g2.fill(playerMask);

		}

		if (screenShow == 12)
		{

			//Get the museum rope screen 
			frame.setSize(museum.getIconWidth(), museum.getIconHeight());
			player.bounds(getWidth(), getHeight());


			g2.drawImage(museum.getImage(), 0, 0, this);
			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);


		}

		if (screenShow == 13)
		{ 
			//drawLoss if they did not make it 
			if (drawLoss)
			{

				frame.setSize(loss.getIconWidth(), loss.getIconHeight());
				g2.drawImage(loss.getImage(), 0, 0, this);


				//draw everything if the condition here is met 
				if (player.getX() + player.getPicture(junglePic).getIconWidth() >= getWidth())
				{
					screenShow = 7; 

					showleveldone1 = false;
					showleveldone2 = true;
					screenShow = 7;

					player.getX(0);
					player.getY(0);

					menuScreenShow = true;	
				}
			}
		}

		if (screenShow == 14)
		{


			//draw the boat screen with the clues 

			//set the size based on the iamge 
			frame.setSize(shipBackground.getIconWidth(), shipBackground.getIconHeight());
			player.bounds(getWidth(), getHeight());

			g2.drawImage(shipBackground.getImage(), 0, 0, this);
			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);

			//draw the rocks
			g2.drawImage(rockNum6.getImage(), 100, 0, this);
			g2.drawImage(rockNum3.getImage(), 400, 0, this);
			g2.drawImage(rockNum2.getImage(), 700, 0, this);
			g2.drawImage(rockNum9.getImage(), 1000, 0, this);




		}

		if (screenShow == 15) {

			//Get the sand image size 
			frame.setSize(sand.getIconWidth(), sand.getIconHeight());
			
			//Update player boundary
			player.bounds(getWidth(), getHeight());

			
			//Draw images
			g2.drawImage(sand.getImage(), 0, 0, this);
			g2.drawImage(player.getPicture(junglePic).getImage(), player.getX(), player.getY(), this);			

			
			//Check if it intersected the drawing and go down one by one in a else if 
			if (playerMask.intersects(fire))
			{
				setFont(f2);
				g2.drawString("Fire - Press Space to Dig", 300, 75);
			}

			//Check if it intersected the drawing and go down one by one in a else if 

			else if (playerMask.intersects(hot))
			{
				setFont(f2);
				g2.drawString("Hot", 300, 75);
			}
			
			//Check if it intersected the drawing and go down one by one in a else if 

			else if (playerMask.intersects(warm))
			{
				setFont(f2);
				g2.drawString("Warm", 300, 75);
			}

			//Check if it intersected the drawing and go down one by one in a else if 

			else if (playerMask.intersects(cold))
			{
				setFont(f2);
				g2.drawString("Cold", 300, 75);
			}

			//Check if it intersected the drawing and go down one by one in a else if 

			else if (playerMask.intersects(ice))
			{
				setFont(f2);
				g2.drawString("Ice", 300, 75);
			}
		}

		//If they can dig the gem set win screen to true
		if (screenShow == 16)
		{
			if (digGem)
			{

				frame.setSize(winScreen.getIconWidth(), winScreen.getIconHeight());			
				g2.drawImage(winScreen.getImage(), 0, 0, this);

			}
		


		//Used to check the fills for the mask

//					g2.setColor(Color.MAGENTA);
//					g2.fill(warm);
//					
//					g2.setColor(Color.blue);
//					g2.fill(cold);
//					
//					g2.setColor(Color.cyan);
//					g2.fill(ice);
//				
//					
//					g2.setColor(Color.green);
//					g2.fill(hot);
//					
//					g2.setColor(Color.red);
//					g2.fill(fire);

		//g2.fill(playerMask);
		}
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	} 
}
