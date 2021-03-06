package com.breakout.game;

import java.awt.Color;
import java.awt.Dimension;

/*
 * Dimension related constants are defined in this class.
 * 
 */
public class GameConstants {
	
	//Frame Constants
	protected static final int BOARD_HEIGHT = 600;
	protected static final int BOARD_WIDTH = 600;
	protected static final Dimension BOARD_DIMENSIONS= new Dimension(BOARD_HEIGHT, BOARD_WIDTH);	

	//Play start
	public static boolean PLAY = false;
	
	//Brick constants
	public static int BRICK_HEIGHT = 30;
	public static int BRICK_WIDTH = 50;
	public static int BRICK_ROW = 3;
	public static int BRICK_COLUMN = 10;
	public static int TOTAL_BRICKS = BRICK_ROW * BRICK_COLUMN;
	
	//Ball Constants
	public static int BALL_POS_X = 120; 	//X-coordinate position of ball
	public static int BALL_POS_Y = 200;	//Y-coordinate position of ball
	public static int BALL_VEL_X = -1;	//Velocity on X-axis
	public static int BALL_VEL_Y = -2;	//Velocity on Y-axis
	public static Color BALL_COLOR = Color.RED;  //Ball Color
	
	//Paddle Constants
	public static int PADDLE_POS_X = 300;
	public static int PADDLE_POS_Y = 500;
	public static int PADDLE_WIDTH = 50;
	public static int PADDLE_HEIGHT = 10;
	public static Color PADDLE_COLOR = Color.GREEN;
	
}
