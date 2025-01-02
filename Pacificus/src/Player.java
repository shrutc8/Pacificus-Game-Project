import javax.swing.ImageIcon;
 
//Pacificus

public class Player 

{
	//Fields: Set up variables 
	
	//Jungle x pos 
	private int junglekingx, junglekingy;
	
	//Character image 
	private ImageIcon junglekingleft, junglekingright;
	private boolean up, down, left, right;
	private int frameWidth, frameHeight;

	public Player()
	{
		
		//Initialize variables 
		
		junglekingx= 0; 
		junglekingy= 0; 

		junglekingleft = new ImageIcon ("junglekingleft.png");
		junglekingright = new ImageIcon ("junglekingright.png");


		up = false; 
		down = false; 
		left = false; 
		right = false;
	}

	public void bounds(int width, int height)
	{
		//Get width and height of frame
		frameWidth = width; 
		frameHeight = height;
	}

	//get x
	public int getX()
	{
		return junglekingx;
	}

	//get Y
	public int getY()
	{
		return junglekingy;
	}
	
	
	
	//get X, but bring X from main
	public int getX(int x)
	{
		junglekingx = x;
		
		return junglekingx;
	}

	//get Y, but bring Y from main
	public int getY(int y)
	{
		junglekingy = y;
		
		return junglekingy;
	}

	//Get Picture 
	public ImageIcon getPicture(boolean junglepic)
	{
		if (junglepic == true)
		{
			return junglekingleft;
		}

		else
		{
			return junglekingright;
		}
	}

	
	//Move
	public void move(boolean up, boolean down, boolean left, boolean right, int speed)
	{ 		
		//Switch direction if true 
		if (up)
		{
			//System.out.print(up);

			if (junglekingy <= 0 ) 
			{
				junglekingy -= 0;
			}

			else
			{
				junglekingy -= speed;			
			}
		}

		//Switch direction if true 
		if (down)
		{
			//System.out.print(down);

			if (junglekingy + junglekingleft.getIconHeight() >= frameHeight) 
			{
				junglekingy+= 0;
			}

			else
			{
				junglekingy += speed;
			}
		}

		//Switch direction if true 
		if (left)
		{
			//System.out.print(left);

			if (junglekingx <= 0)
			{
				junglekingx +=0;
			}

			else
			{
				junglekingx -= speed; 
			}
		}

		//Switch direction if true 
		if (right)
		{
			//System.out.print(right);

			if (junglekingx + junglekingright.getIconWidth() >= frameWidth)
			{
				junglekingx+= 0;
			}
			else
			{
				junglekingx+= speed;
			}
		}
	}
}