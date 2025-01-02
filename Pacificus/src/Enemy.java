import javax.swing.ImageIcon;
 
//Pacificus 

public class Enemy 

{
	//Fields 
	
	//Get all the positions
	private int enemyX, enemyY, enemy2X, enemy2Y, enemy3X, enemy3Y;
	
	// Get all the images 
	private ImageIcon enemy1, enemy2, enemy3;
	private ImageIcon banana1, banana2, banana3, banana4;
	
	//Get the directions
	private int dirLR, dirUD, dir2LR, dir2UD, dir3LR, dir3UD;
	private int dir1, dir2, dir3, dir4;
	
	//Get the banana positions
	private int banana1x, banana2x, banana3x, banana4x, banana1y, banana2y, banana3y, banana4y;
	
	//Get the position redirectors 
	private final int UP = 0, DOWN = 1, LEFT = 2, RIGHT =3;
	
	//Get the frame Width and Height for boundary checking
	private int frameWidth, frameHeight;
	
	private final int up = 0, down = 1;
	
	
	//Constructor: Initialize all the variables
	public Enemy()
	{
		enemyX= (int) (Math.random() * 600); 
		enemyY= (int) (Math.random() * 600);
		
		enemy2X= (int) (Math.random() * 600); 
		enemy2Y= (int) (Math.random() * 600);
		
		enemy3X= (int) (Math.random() * 600); 
		enemy3Y= (int) (Math.random() * 600);
		

		enemy1 = new ImageIcon ("enemy1.png");
		enemy2 = new ImageIcon ("enemy2.png");
		enemy3 = new ImageIcon ("enemy3.png");

		banana1 = new ImageIcon ("banana.png");
		banana2 = new ImageIcon ("banana copy.png");
		banana3 = new ImageIcon ("banana copy 2.png");
		banana4 = new ImageIcon ("banana copy 3.png");

		
		dirLR = RIGHT; 
		dirUD = DOWN;
		
		dir2LR = LEFT; 
		dir2UD = DOWN;
		
		dir3LR = LEFT; 
		dir3UD = UP;
		
//		dir1 = UP;
		
		banana1x = 250;
		banana1y = 0;
		
		banana2x = 550; 
		banana2y = 0;
		
		banana3x = 850; 
		banana3y = 0;
		
		banana4x = 1100; 
		banana4y = 0;
			
		//enemy1 = new ImageIcon ("junglekingright.png");

	}

	//get bounds
	public void bounds(int width, int height)
	{
		frameWidth = width; 
		frameHeight = height;
	}

	//get x
	public int getX()
	{
		return enemyX;
	}

	//get y
	public int getY()
	{
		return enemyY;
	}

	
	//get 2X
	public int get2X()
	{
		return enemy2X;
	}

	//get 2Y
	public int get2Y()
	{
		return enemy2Y;
	}
	
	//get 3X
	public int get3X()
	{
		return enemy3X;
	}

	//get 3Y
	public int get3Y()
	{
		return enemy3Y;
	}
	
	//getEnemy1 Image
	public ImageIcon getEnemy1()
	{
		return enemy1;
	}

	//get image for enemy2
	public ImageIcon getEnemy2()
	{
		return enemy2;
	}
	
	//get image for enemy3
	public ImageIcon getEnemy3()
	{
		return enemy3;
	}
	
	//get all banana x and y positions
	public int getBanana1X()
	{
		return banana1x;
	}
	public int getBanana2X()
	{
		return banana2x;
	}
	public int getBanana3X()
	{
		return banana3x;
	}
	public int getBanana4X()
	{
		return banana4x;
	}
	
	public int getBanana1Y()
	{
		return banana1y;
	}
	public int getBanana2Y()
	{
		return banana2y;
	}
	public int getBanana3Y()
	{
		return banana3y;
	}
	public int getBanana4Y()
	{
		return banana4y;
	}
	
	//get banana 1 image
	public ImageIcon getBanana1()
	{
		return banana1;
	}
	
	//get banana 2 image

	public ImageIcon getBanana2()
	{
		return banana2;
	}
	
	//get banana 3 image

	public ImageIcon getBanana3()
	{
		return banana3;
	}
	
	//get banana 4 image

	public ImageIcon getBanana4()
	{
		return banana4;
	}

	
	//Use the move wit the speed brought inside based on the user preferances 
	public void move(int enemySpeedX, int enemySpeedY)
	{

		//check direction, if it is met switch the directions
		if (dirLR == LEFT)
		{

			if (enemyX <= 0) //touch left side of room
			{
				dirLR = RIGHT;
			}
			else
			{
				enemyX -= enemySpeedX;
			}
		}
		
		
		//check direction, if it is met switch the directions
		if (dir2LR == LEFT)
		{
			
			if (enemy2X <= 0) //touch left side of room
			{
				dir2LR = RIGHT;
			}
			else
			{
				enemy2X -= enemySpeedX;
			}
		}
		
		//check direction, if it is met switch the directions
		if (dir3LR == LEFT)
		{
			if (enemy3X <= 0) //touch left side of room
			{
				dir3LR = RIGHT;
			}
			else
			{
				enemy3X -= enemySpeedX;
			}
		}

		
		//check direction, if it is met switch the directions
		if (dirLR == RIGHT)
		{
			if (enemyX + enemy1.getIconWidth() >= frameWidth)
			{
				dirLR = LEFT;
			}
			else
			{
				enemyX += enemySpeedX;
			}
		}
		
		
		//check direction, if it is met switch the directions
		if (dir2LR == RIGHT)
		{
			
			if (enemy2X + enemy2.getIconWidth() >= frameWidth)
			{
				dir2LR = LEFT;
			}
			else
			{
				enemy2X += enemySpeedX;
			}
		}
		
		
		//check direction, if it is met switch the directions
		if (dir3LR == RIGHT)
		{
			
			if (enemy3X + enemy3.getIconWidth() >= frameWidth)
			{
				dir3LR = LEFT;
			}
			else
			{
				enemy3X += enemySpeedX;
			}
		
		}
		
		
		//check direction, if it is met switch the directions
		if (dirUD == UP)
		{
			if (enemyY <= 0) 
			{
				dirUD = DOWN;
			}
			else
			{
				enemyY -= enemySpeedY;
			}
		
		}
		
		
		//check direction, if it is met switch the directions
		if (dir2UD == UP)
		{
		
			if (enemy2Y <= 0) 
			{
				dir2UD = DOWN;
			}
			else
			{
				enemy2Y -= enemySpeedY;
			}
		}
		
		
		
		
		//check direction, if it is met switch the directions
		if (dirUD == UP)
		{
			if (enemy3Y <= 0) 
			{
				dir3UD = DOWN;
			}
			else
			{
				enemy3Y -= enemySpeedY;
			}
		}

		
		//check direction, if it is met switch the directions
		if (dirUD == DOWN)
		{
			if (enemyY+ enemy1.getIconHeight() >= frameHeight)
			{
				dirUD = UP;
			}
			else
			{
				enemyY += enemySpeedY;
			}
		}
		
		
		//check direction, if it is met switch the directions
		if (dir2UD == DOWN)
		{
			if (enemy2Y+ enemy2.getIconHeight() >= frameHeight)
			{
				dir2UD = UP;
			}
			else
			{
				enemy2Y += enemySpeedY;
			}
		}
		
		//check direction, if it is met switch the directions
		if (dir3UD == DOWN)
		{
			
			if (enemy3Y+ enemy3.getIconHeight() >= frameHeight)
			{
				dir3UD = UP;
			}
			else
			{
				enemy3Y += enemySpeedY;
			}
		}

	
	}
	
	//get the bananas moving 
	public void fallingBananas(int speedY)
	{
		//switch dir if condition met, else move it 
		if (dir1 == UP)
		{
			if (banana1y <= 0)
			{
				dir1 = DOWN;
			}
			else
			{
				banana1y -= (int) (Math.random() * 31) + 20;
				//enemyY -= 5;
			}
		}
		
		//switch dir if condition met, else move it 
		else if(dir1 == DOWN)
		{
			if (banana1y+ banana1.getIconHeight() >= frameHeight)

			{
				dir1 = UP;
			}
			else
			{
				banana1y += (int) (Math.random() * 31) + 20;
				//enemyY += 5;
			}
		}
		
		
		//switch dir if condition met, else move it 
		if (dir2 == UP)
		{
			if (banana2y <= 0)
			{
				dir2 = DOWN;
			}
			else
			{
				banana2y -= (int) (Math.random() * 31) + 20;
				//enemyY -= 5;
			}
		}
		
		//switch dir if condition met, else move it 
		else if(dir2 == DOWN)
		{
			if (banana2y+ banana2.getIconHeight() >= frameHeight)

			{
				dir2 = UP;
			}
			else
			{
				banana2y += (int) (Math.random() * 31) + 20;
				//enemyY += 5;
			}
		}
		
		
		//switch dir if condition met, else move it 
		if (dir3 == UP)
		{
			if (banana3y <= 0)
			{
				dir3 = DOWN;
			}
			else
			{
				banana3y -= (int) (Math.random() * 31) + 20;
				//enemyY -= 5;
			}
		}
		
		//switch dir if condition met, else move it 
		else if(dir3 == DOWN)
		{
			if (banana3y+ banana3.getIconHeight() >= frameHeight)

			{
				dir3 = UP;
			}
			else
			{
				banana3y += (int) (Math.random() * 31) + 20;
				//enemyY += 5;
			}
		}
		
		//switch dir if condition met, else move it 
		if (dir4 == UP)
		{
			if (banana4y <= 0)
			{
				dir4 = DOWN;
			}
			else
			{
				banana4y -= (int) (Math.random() * 31) + 20;
				//enemyY -= 5;
			}
		}
		
		//switch dir if condition met, else move it 
		else if(dir4 == DOWN)
		{
			if (banana4y+ banana4.getIconHeight() >= frameHeight)

			{
				dir4 = UP;
			}
			else
			{
				banana4y += ((int) (Math.random() * 31) + 20);
				//enemyY += 5;
			}
		}
	}
}