package koch;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 * @author tangzhihe
 *
 */
public class FractalJPanel extends JPanel{
	private static final long serialVersionUID = -255304569184940904L;
	private int depth;
	private Color color;
	private final static int WIDTH = 600;
	private final static int HEIGHT = 700;
	private final static int LENGTH = 450;
	
	public FractalJPanel(int depth){
		setColor(Color.BLUE);
		setDepth(depth);
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	//计算相邻两直线间的夹角
	private double getAngle(int x1, int y1, int x2, int y2){
		return Math.atan2((y1 - y2), (x2 - x1)) + Math.PI/3; 
	}
	//递归绘制
	public void drawFractal(int depth, int x1, int y1, int x2, int y2, Graphics g){
		//递归结束条件
		if(depth == 0){
			g.drawLine(x1, y1, x2, y2);
		}else{
			//计算坐标(xa,ya)
			int xa = (int)Math.round(x1 + (x2 - x1)/3.0);
			int ya = (int)Math.round(y1 + (y2 - y1)/3.0);
			
			//计算坐标(xb,yb)
			int xb = (int)Math.round((xa + x2) / 2.0);
			int yb = (int)Math.round((ya + y2) / 2.0);
			
			//计算递归后的线元长度
			int len = (int)(LENGTH/Math.pow(3, (this.depth - depth + 1)));
			double angle = getAngle(x1, y1, x2, y2);
			
			//计算坐标(xc,yc)
			int xc = (int)Math.round(xa + len * Math.cos(angle));
			int yc = (int)Math.round(ya - len * Math.sin(angle));
			
			//递归
			drawFractal(depth - 1, x1, y1, xa, ya, g);
			drawFractal(depth - 1, xa, ya, xc, yc, g);
			drawFractal(depth - 1, xc, yc, xb, yb, g);
			drawFractal(depth - 1, xb, yb, x2, y2, g);
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//绘制最初的三条直线，形成初始三角形图案
		g.setColor(color);
		drawFractal(depth, 50, 450, 275, 60, g);
		drawFractal(depth, 275, 60, 500, 450, g);
		drawFractal(depth, 500, 450, 50, 450, g);
	}
	
	//获取递归深度
	public int getDepth(){
		return depth;
	}
	
	//设置递归深度
	public void setDepth(int depth){
		this.depth = depth;
	}
	
	//设置颜色
	public void setColor(Color color){
		this.color = color;
	}
}

































