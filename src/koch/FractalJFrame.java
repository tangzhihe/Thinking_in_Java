package koch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FractalJFrame extends JFrame{
	private static final long serialVersionUID = 5327371130381905943L;
	private final static int WIDTH = 600;
	private final static int HEIGHT = 700;
	private final static int MIN_DEPTH = 0; //最小递归深度
	private Color color = Color.BLUE;
	
	private JButton increaseDepthJButton;  //增加递归深度按钮
	private JButton decreaseDepthJButton;  //减少递归深度按钮
	private JButton setColorJButton;       //设置颜色按钮
	private JPanel mainJPanel;
	private JPanel controlJPanel;
	private FractalJPanel drawSpace;       //koch雪花分形具体算法类的一个对象
	private JLabel depthJLabel;            //记录递归深度的标签
	
	public FractalJFrame(){
		//添加标题
		super("Koch雪花");
		// 添加按钮  
        controlJPanel = new JPanel();  
        setColorJButton = new JButton("设置颜色");  
        increaseDepthJButton = new JButton("增加递归深度");  
        decreaseDepthJButton = new JButton("减少递归深度");  
        controlJPanel.add(setColorJButton);  
        controlJPanel.add(increaseDepthJButton);  
        controlJPanel.add(decreaseDepthJButton); 
        
        // 设置按钮相应的有关监听器  
        setColorJButton.addActionListener(  
                new ActionListener() {  
                    public void actionPerformed(ActionEvent event) {  
                        color = JColorChooser.showDialog(  
                                FractalJFrame.this, "请选择一种颜色", color);  
                        if(color == null) {  
                            color = Color.BLUE;  
                        }  
                          
                        drawSpace.setColor(color);  
                    }  
                });  
        increaseDepthJButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent event) {  
                int depth = drawSpace.getDepth();  
                depth++;  
                  
                if(depth >= MIN_DEPTH) {  
                    depthJLabel.setText("depth: " + depth);  
                    drawSpace.setDepth(depth);  
                    repaint();  
                }  
            }  
        }  
        );  
          
        decreaseDepthJButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent event) {  
                int depth = drawSpace.getDepth();  
                depth--;  
                  
                if(depth >= MIN_DEPTH) {  
                    depthJLabel.setText("depth: " + depth);  
                    drawSpace.setDepth(depth);  
                    repaint();  
                }  
            }  
        });  
          
        depthJLabel = new JLabel("depth: 0");  
        controlJPanel.add(depthJLabel);  
          
        drawSpace = new FractalJPanel(0);  
          
        mainJPanel = new JPanel();  
        mainJPanel.setLayout(new BorderLayout());  
        mainJPanel.add(controlJPanel, BorderLayout.NORTH);  
        mainJPanel.add(drawSpace);  
          
        add(mainJPanel);  
        setSize(WIDTH, HEIGHT);  
        setVisible(true);
	}
	
	 public static void main(String args[]) {  // 主方法  
	    FractalJFrame frame = new FractalJFrame();  
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	 } 
}

























