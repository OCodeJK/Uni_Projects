package pkg;

import ryanguru.ColorDisplay;

public class YourCode
{
	public static void DrawJK(String color) //Draw JK
    {
        int[] rows = {9,9,9,9,9,9,9,8,7,6,5,4,3,2,1,0,0,0,1,2,3 , 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 5, 6, 7, 8, 9, 4, 3, 2, 1, 0};
        int[] cols = {3,4,5,6,7,8,9,6,6,6,6,6,6,6,6,5,4,3,2,2,2 ,11,11,11,11,11,11,11,11,11,11,12,13,14,15,16,13,14,15,16,17};
        for (int i=0; i< rows.length; i++)
        {
            ColorDisplay.setPixelColor(rows[i], cols[i], color);
            ColorDisplay.pause(10);
        }
    }
	public static void Linewave(int row, int col, String color) //its a smaller curly line
	{
		int[] rows = {row,row+1,row,row+1,row,row+1,row,row+1,row,row+1,row,row+1,row,row+1,row,row+1,row,row+1,row,row+1}; //take it that it starts from 0
		int[] cols = {col,col+1,col+2,col+3,col+4,col+5,col+6,col+7,col+8,col+9,col+10,col+11,col+12,col+13,col+14,col+15,col+16,col+17,col+18,col+19}; //take it that it starts from 0
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(50);
		}
		ColorDisplay.pause(100);
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
		}
	}
	public static void Curlylinefromback(String color) //curly line starting from (1,19)
	{
		int[] rows = {1,0,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,0};
		int[] cols = {19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(50);
		}
		ColorDisplay.pause(200);
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
		}
	}
	public static void CurlyLine(int row, int col, String color) //draw a curly line starting from (0,0)
	{
		int[] rows = {row, row+1,row+2,row+3,row+4,row+5,row+6,row+7,row+8,row+9,row+8,row+7,row+6,row+5,row+4,row+3,row+2,row+1,row,row+1};
		int[] cols = {col, col+1,col+2,col+3,col+4,col+5,col+6,col+7,col+8,col+9,col+10,col+11,col+12,col+13,col+14,col+15,col+16,col+17,col+18,col+19};
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i],cols[i],color);
			ColorDisplay.pause(50);
		}
		ColorDisplay.pause(200);
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
		}
	}
	public static void DrawSmileyface(int row, int col, String color) //Draw a cute smile face
	{
		int[] rows = {row, row, row-3,row-4,row-3,row-3, row, row-1, row-2, row-3, row-4, row-5, row-6, row-6, row-6, row-6, row-5, row-4, row-3, row-2 ,row-1 ,row ,row+1 ,row+2,row+3, row+3, row+3, row+3 , row+2 ,row+1 };
		int[] cols = {col, col+3,col+3,col+4,col+5,col+3,col+6, col, col, col, col+1, col+2, col+3, col+4, col+5, col+6, col+7, col+8, col+9, col+9, col+9, col+9, col+8,col+7, col+6, col+5, col+4, col+3 , col+2, col+1 };
		for (int i=0; i< rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(100);
		}
		ColorDisplay.pause(200);
		for (int i=0; i< rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
		}
	}	

	public static void DrawSquare(int row, int col, String color) //Draw Caterpillar effect square
	{
		int[] rows = {row,row,row+1,row+1,row+1,row,row-1,row-1,row-1,row-1,row,row+1,row+2,row+2,row+2,row+2,row+2,row+1,row,row-1,row-2,row-2,row-2,row-2,row-2,row-2};
		int[] cols = {col,col+1,col+1,col,col-1,col-1,col-1,col,col+1,col+2,col+2,col+2,col+2,col+1,col,col-1,col-2,col-2,col-2,col-2,col-2,col-2,col-1,col,col+1,col+2};
		
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(50);
		}
		ColorDisplay.pause(100);
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
			ColorDisplay.pause(50);
		}
		
	}
	public static void DrawHeart(int row, int col, String color) //draw heart anywhere as long as got space
	{
		int[] rows = {row, row+1, row+1, row, row-1, row-2, row-3, row-3, row-2, row-1, row, row+1, row+1, row};
		int[] cols = {col, col+1, col+2, col+3, col+2, col+1, col, col-1, col-2, col-3, col-4, col-3, col-2, col-1};
		
		for (int i = 0; i<rows.length; i++)
		{
			ColorDisplay.setPixelColor(rows[i], cols[i], color);
			ColorDisplay.pause(100);
		}
		ColorDisplay.pause(100);
		
		for (int i=0; i<rows.length; i++)
		{
			ColorDisplay.setPixelOFF(rows[i], cols[i]);
		}
			
	}
	public static void RaveTime(int row, int col, String color) //ripple effect
	{
		ColorDisplay.setPixelColor(row, col, "GREEN");
		ColorDisplay.pause(150);
		ColorDisplay.setPixelOFF(row, col);
		ColorDisplay.setPixelColor(row,col-1, "CYAN");
		ColorDisplay.setPixelColor(row-1, col-1, "CYAN");
		ColorDisplay.setPixelColor(row-1, col, "CYAN");
		ColorDisplay.setPixelColor(row-1, col+1, "CYAN");
		ColorDisplay.setPixelColor(row, col+1, "CYAN");
		ColorDisplay.setPixelColor(row+1, col+1, "CYAN");
		ColorDisplay.setPixelColor(row+1, col, "CYAN");
		ColorDisplay.setPixelColor(row+1, col-1, "CYAN");
		ColorDisplay.pause(150);
		ColorDisplay.setPixelOFF(row,col-1);
		ColorDisplay.setPixelOFF(row-1, col-1);
		ColorDisplay.setPixelOFF(row-1, col);
		ColorDisplay.setPixelOFF(row-1, col+1);
		ColorDisplay.setPixelOFF(row, col+1);
		ColorDisplay.setPixelOFF(row+1, col+1);
		ColorDisplay.setPixelOFF(row+1, col);
		ColorDisplay.setPixelOFF(row+1, col-1);
		ColorDisplay.pause(150);
		ColorDisplay.setPixelColor(row,col-2, "RED");
		ColorDisplay.setPixelColor(row-2, col-1, "RED");
		ColorDisplay.setPixelColor(row-2, col-2, "RED");
		ColorDisplay.setPixelColor(row-2, col+1, "RED");
		ColorDisplay.setPixelColor(row-2, col, "RED");
		ColorDisplay.setPixelColor(row-2, col+2, "RED");
		ColorDisplay.setPixelColor(row+2, col+1, "RED");
		ColorDisplay.setPixelColor(row+2, col-1, "RED");
		ColorDisplay.setPixelColor(row, col+2, "RED");
		ColorDisplay.setPixelColor(row+2, col+2, "RED");
		ColorDisplay.setPixelColor(row+2, col, "RED");
		ColorDisplay.setPixelColor(row+2, col-2, "RED");
		ColorDisplay.setPixelColor(row+1, col+2, "RED");
		ColorDisplay.setPixelColor(row+1, col-2, "RED");
		ColorDisplay.setPixelColor(row-1, col+2,"RED");
		ColorDisplay.setPixelColor(row-1, col-2, "RED");
		ColorDisplay.pause(150);
		ColorDisplay.setPixelOFF(row,col-2);
		ColorDisplay.setPixelOFF(row-2, col-1);
		ColorDisplay.setPixelOFF(row-2, col-2);
		ColorDisplay.setPixelOFF(row-2, col+1);
		ColorDisplay.setPixelOFF(row-2, col);
		ColorDisplay.setPixelOFF(row-2, col+2);
		ColorDisplay.setPixelOFF(row+2, col+1);
		ColorDisplay.setPixelOFF(row+2, col-1);
		ColorDisplay.setPixelOFF(row, col+2);
		ColorDisplay.setPixelOFF(row+2, col+2);
		ColorDisplay.setPixelOFF(row+2, col);
		ColorDisplay.setPixelOFF(row+2, col-2);
		ColorDisplay.setPixelOFF(row+1, col+2);
		ColorDisplay.setPixelOFF(row+1, col-2);
		ColorDisplay.setPixelOFF(row-1, col+2);
		ColorDisplay.setPixelOFF(row-1, col-2);
		ColorDisplay.pause(150);
	}
	public static void DrawVertLineAtBottomCol(int col, int ht, String color) //Draw vertical line at bottom row
	{
		for (int i=0; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(20);
		}
		ColorDisplay.pause(150);
		for (int i=0; i<ht; i++)
		{
			ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(20);
		}
	}
	public static void DrawVertLineAtTopCol(int col, int ht, String color) //draw vertical line at top row
	{
		for (int i=9; i>ht; i--)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(20);
		}
		ColorDisplay.pause(150);
		for (int i=9; i>ht; i--)
		{
			ColorDisplay.setPixelOFF(i, col);
			ColorDisplay.pause(20);
		}
	}
	public static void DrawHoriLineAtFrontRow(int row, int lgth, String color) //Draw Horizontal Line at front column
	{
		for (int i=0; i<lgth; i++)
		{
			ColorDisplay.setPixelColor(row, i, color);
			ColorDisplay.pause(20);
		}
		ColorDisplay.pause(150);
		for (int i=0; i<lgth; i++)
		{
			ColorDisplay.setPixelOFF(row, i);
			ColorDisplay.pause(20);
		}
	}
	public static void DrawHoriLineAtBackRow(int row, int lgth, String color) //Draw horizontal line back column
	{
		for (int i=19; lgth<i; i--)
		{
			ColorDisplay.setPixelColor(row, i, color);
			ColorDisplay.pause(20);
		}
		ColorDisplay.pause(150);
		for (int i=19; lgth<i; i--)
		{
			ColorDisplay.setPixelOFF(row, i);
			ColorDisplay.pause(20);
		}
	}
	public static void onBeat(int c)
	{
		System.out.println("At beat : " + c);
		
		if (c > 0 && c <=20) //basically this parts displays from 0 to 20
		{
			if (c%2 != 0) //this is if remainder is not equal to 0 then it will display
			{
				DrawVertLineAtBottomCol(0,10, "ORANGE");
				DrawVertLineAtTopCol(1,9, "RED");
				DrawVertLineAtBottomCol(2,8, "GREEN");
				DrawVertLineAtTopCol(3,7, "CYAN");
				DrawVertLineAtBottomCol(4,6, "BLUE");
				DrawVertLineAtTopCol(5,5, "ORANGE");
				DrawVertLineAtBottomCol(6,4, "RED");
				DrawVertLineAtTopCol(7,3, "GREEN");
				DrawVertLineAtBottomCol(8,2, "CYAN");
				DrawVertLineAtTopCol(9,1, "BLUE");
				
			}
			else if (c%2 == 0) // this is if remainder is equal to 0 then it will display this 
			{
				DrawVertLineAtBottomCol(19,10, "ORANGE");
				DrawVertLineAtTopCol(18,9, "RED");
				DrawVertLineAtBottomCol(17,8, "GREEN");
				DrawVertLineAtTopCol(16,7, "CYAN");
				DrawVertLineAtBottomCol(15,6, "BLUE");
				DrawVertLineAtTopCol(14,5, "ORANGE");
				DrawVertLineAtBottomCol(13,4, "RED");
				DrawVertLineAtTopCol(12,3, "GREEN");
				DrawVertLineAtBottomCol(11,2, "CYAN");
				DrawVertLineAtTopCol(10,1, "BLUE"); //it will create a up and down tower effect
			}
		}
		else if (c > 20 && c <= 40) //this is a smile-y face but the eyes would explode due to the RaveTime method
		{
			DrawSmileyface(6, 0, ColorDisplay.randomColor());
			RaveTime(6,3,"BLUE");
			RaveTime(6,6,"BLUE");
			DrawSmileyface(6, 10, ColorDisplay.randomColor());
			RaveTime(6,13,"RED");
			RaveTime(6,16,"RED");
		}
		 
		else if (c > 40 && c <= 80) // this creates the worm effect by just using the Line wave method and using the gray color 
		{
			Linewave(0,0,ColorDisplay.randomColor());
			ColorDisplay.pause(50);
			Linewave(0,0,"GRAY");
			Linewave(3,0,ColorDisplay.randomColor());
			ColorDisplay.pause(50);
			Linewave(3,0,"GRAY");
			Linewave(6,0,ColorDisplay.randomColor());
			ColorDisplay.pause(50);
			Linewave(6,0,"GRAY");
		}
		else if (c > 80 && c <= 120 ) //this would draw lines both both side in ascending order
		{
			DrawHoriLineAtBackRow(c % 10 , c % 20, ColorDisplay.randomColor());
			DrawHoriLineAtFrontRow(c % 10, c % 20, ColorDisplay.randomColor());
			DrawHoriLineAtBackRow(c % 10 , c % 20, ColorDisplay.randomColor());
			DrawHoriLineAtFrontRow(c % 10, c % 20, ColorDisplay.randomColor());
			DrawHoriLineAtBackRow(c % 10 , c % 20, ColorDisplay.randomColor());
			DrawHoriLineAtFrontRow(c % 10, c % 20, ColorDisplay.randomColor());
		}
		else if (c > 120 && c <= 160)
		{
			DrawHeart(7,4, ColorDisplay.randomColor());
			ColorDisplay.pause(100);
			DrawHeart(3,10,ColorDisplay.randomColor());
			ColorDisplay.pause(100);
			DrawHeart(7,16,ColorDisplay.randomColor());
			ColorDisplay.pause(100);
			
		}
		else if (c > 160 && c <= 200)
		{
			DrawSquare(3,3,ColorDisplay.randomColor());
			DrawSquare(7,10,ColorDisplay.randomColor());
			DrawSquare(2,15,ColorDisplay.randomColor());
		}
		else if (c > 200 && c <= 220)
		{
			DrawSmileyface(6,6,"BLUE");
			RaveTime(7,2,"BLUE");
			RaveTime(2,2,"BLUE");
		}
		else if (c > 220 && c <= 260)
		{
			CurlyLine(0,0,ColorDisplay.randomColor());
			CurlyLine(0,0,"GRAY");
		}
		else if (c > 260 && c <= 280)
		{
			RaveTime(4,5,"CYAN");
			RaveTime(6,10,"RED");
			RaveTime(2,15,"YELLOW");
		}
		else if (c > 280 && c <= 300)
		{
			Curlylinefromback(ColorDisplay.randomColor());
			ColorDisplay.pause(300);
			Curlylinefromback("GRAY");
		}
		else if (c > 300 && c <= 306)
		{
			DrawJK(ColorDisplay.randomColor());
			DrawJK("GRAY");
		}
		else if (c == 307)
		{
			DrawJK(ColorDisplay.randomColor());
		}
		
	}
}


