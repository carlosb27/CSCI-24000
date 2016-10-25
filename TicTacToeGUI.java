package TTTProject;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
public class TicTacToeGUI extends JFrame {
	private static final long serialVersionUID = 1L;
	Main main = new Main();
	public JButton button1;
	public JButton button2;
	public JButton button3;
	public JButton button4;
	public JButton button5;
	public JButton button6;
	public JButton button7;
	public JButton button8;
	public JButton button9;
	public JButton exitbutton;
	public JButton newgamebutton;
	public boolean setVisible;
	private JLabel lblOPlayer;
	private JRadioButton rdbtnNewRadioButton;
	public TicTacToeGUI() {
		getContentPane().setBackground(new Color(0, 153, 0));
		setBackground(Color.LIGHT_GRAY);
		getContentPane().setForeground(Color.BLACK);
		initComponents();
	}
	public void button1ActionPerformed(ActionEvent e) { //sets the events for button 1
		if(button1.getText().equals("")){ //if button is empty replace it with X or O
			if(Main.nextTurn == true){ // if there is a next turn, set it win an X
				button1.setText("X"); //the letter X will be inserted
				Main.winCalculations(); //goes through win calculations for X
				Main.nextTurn = false; 
			} else{                  //else statement for O
				button1.setText("0"); //if X was used previously, it will place an O instead
				Main.winCalculations(); //goes through win calculations for O
				Main.nextTurn = true; //there is a next turn if no winner
			}
		}
	}
	public void button2ActionPerformed(ActionEvent e) {  //sets the events for button 2
		if(button2.getText().equals("")){
			if(Main.nextTurn == true){
				button2.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button2.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button3ActionPerformed(ActionEvent e) {  //sets the events for button 3
		if(button3.getText().equals("")){
			if(Main.nextTurn == true){
				button3.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button3.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button4ActionPerformed(ActionEvent e) { //sets the events for button 4
		if(button4.getText().equals("")){
			if(Main.nextTurn == true){
				button4.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button4.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button5ActionPerformed(ActionEvent e) {  //sets the events for button 5
		if(button5.getText().equals("")){
			if(Main.nextTurn == true){
				button5.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button5.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button6ActionPerformed(ActionEvent e) {  //sets the events for button 6
		if(button6.getText().equals("")){
			if(Main.nextTurn == true){
				button6.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button6.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button7ActionPerformed(ActionEvent e) {  //sets the events for button 7
		if(button7.getText().equals("")){
			if(Main.nextTurn == true){
				button7.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button7.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button8ActionPerformed(ActionEvent e) {  //sets the events for button 8
		if(button8.getText().equals("")){
			if(Main.nextTurn == true){
				button8.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button8.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button9ActionPerformed(ActionEvent e) {   //sets the events for button 9
		if(button9.getText().equals("")){
			if(Main.nextTurn == true){
				button9.setText("X");
				Main.winCalculations();
				Main.nextTurn = false;
			} else{
				button9.setText("0");
				Main.winCalculations();
				Main.nextTurn = true;
			}
		}
	}
	public void button10ActionPerformed(ActionEvent e){  //sets the action for the exit button
		System.exit(0);
	}
	public void button11ActionPerformed(ActionEvent e){  //resets the game board
		button1.setText("");
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
	}
	public void initComponents() {
		setTitle("Tic Tac Toe Game"); //gives the gui a title
		Container contentPane = getContentPane();
		
		button1 = new JButton();    //gui button edit
		button1.setFont(new Font("Ravie", Font.PLAIN, 23));
		button2 = new JButton();
		button2.setFont(new Font("Ravie", Font.BOLD, 23));
		button3 = new JButton();
		button3.setFont(new Font("Ravie", Font.BOLD, 23));
		button4 = new JButton();
		button4.setFont(new Font("Ravie", Font.PLAIN, 23));
		button5 = new JButton();
		button5.setFont(new Font("Ravie", Font.PLAIN, 23));
		button6 = new JButton();
		button6.setFont(new Font("Ravie", Font.PLAIN, 23));
		button7 = new JButton();
		button7.setFont(new Font("Ravie", Font.PLAIN, 23));
		button8 = new JButton();
		button8.setFont(new Font("Ravie", Font.PLAIN, 23));
		button9 = new JButton();
		button9.setFont(new Font("Ravie", Font.PLAIN, 23));
		exitbutton = new JButton(); // gui exit button
		exitbutton.setBackground(Color.RED);
		exitbutton.setForeground(Color.WHITE);
		exitbutton.setFont(new Font("Times New Roman", Font.BOLD, 28));
		newgamebutton = new JButton(); //gui new game button
		newgamebutton.setForeground(Color.WHITE);
		newgamebutton.setFont(new Font("Times New Roman", Font.BOLD, 28));
		newgamebutton.setBackground(Color.BLUE);
		
		button1.setText(""); // sets the text for the buttons
		button2.setText("");
		button3.setText("");
		button4.setText("");
		button5.setText("");
		button6.setText("");
		button7.setText("");
		button8.setText("");
		button9.setText("");
		exitbutton.setText("Exit");
		newgamebutton.setText("New Game");
		button1.addActionListener(new ActionListener() {    //Button 1 action
			@Override
			public void actionPerformed(ActionEvent e) {
				button1ActionPerformed(e);
			}
		});
		button2.addActionListener(new ActionListener() {   //Button 2
			@Override
			public void actionPerformed(ActionEvent e) {
				button2ActionPerformed(e);
			}
		});
		button3.addActionListener(new ActionListener() {    //Button 3
			@Override
			public void actionPerformed(ActionEvent e) {
				button3ActionPerformed(e);
			}
		});
		button4.addActionListener(new ActionListener() {     //Button 4
			@Override
			public void actionPerformed(ActionEvent e) {
				button4ActionPerformed(e);
			}
		});
		button5.addActionListener(new ActionListener() {     //Button 5
			@Override
			public void actionPerformed(ActionEvent e) {
				button5ActionPerformed(e);
			}
		});
		button6.addActionListener(new ActionListener() {     //Button 6
			@Override
			public void actionPerformed(ActionEvent e) {
				button6ActionPerformed(e);
			}
		});
		button7.addActionListener(new ActionListener() {     //Button 7
			@Override
			public void actionPerformed(ActionEvent e) {
				button7ActionPerformed(e);
			}
		});
		button8.addActionListener(new ActionListener() {    //Button 8
			@Override
			public void actionPerformed(ActionEvent e) {
				button8ActionPerformed(e);
			}
		});
		button9.addActionListener(new ActionListener() {    //Button 9
			@Override
			public void actionPerformed(ActionEvent e) {
				button9ActionPerformed(e);
			}
		});
        exitbutton.addActionListener(new ActionListener() {   //Button 10
               @Override
                public void actionPerformed(ActionEvent e) {
                        button10ActionPerformed(e);
                }
        });
        newgamebutton.addActionListener(new ActionListener() {   //Button 11
               @Override
                public void actionPerformed(ActionEvent e) {
                        button11ActionPerformed(e);
                }
        });
        
        JLabel lblXPlayer = new JLabel("X = Player 1"); //lable for X
        lblXPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        
        lblOPlayer = new JLabel("O = Player 2");   //Label for O
        lblOPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 24));
        
        rdbtnNewRadioButton = new JRadioButton("Human Vs Human"); 
        rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
        rdbtnNewRadioButton.setBackground(new Color(148, 0, 211));
        rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPaneLayout.setHorizontalGroup(
        	contentPaneLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(contentPaneLayout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(contentPaneLayout.createSequentialGroup()
        					.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblXPlayer)
        						.addComponent(lblOPlayer)
        						.addComponent(rdbtnNewRadioButton))
        					.addGap(79)
        					.addGroup(contentPaneLayout.createParallelGroup(Alignment.TRAILING, false)
        						.addGroup(contentPaneLayout.createSequentialGroup()
        							.addComponent(button7, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(button8, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
        						.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        							.addGroup(contentPaneLayout.createSequentialGroup()
        								.addComponent(button4, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(button5, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
        							.addGroup(contentPaneLayout.createSequentialGroup()
        								.addComponent(button1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        								.addPreferredGap(ComponentPlacement.RELATED)
        								.addComponent(button2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        						.addComponent(button9, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        						.addComponent(button6, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(contentPaneLayout.createSequentialGroup()
        					.addComponent(newgamebutton)
        					.addGap(67)
        					.addComponent(exitbutton, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)))
        			.addGap(114))
        );
        contentPaneLayout.setVerticalGroup(
        	contentPaneLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(contentPaneLayout.createSequentialGroup()
        			.addGap(60)
        			.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
        					.addComponent(button2, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
        					.addComponent(button3, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
        				.addGroup(Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
        					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
        				.addComponent(rdbtnNewRadioButton))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(contentPaneLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(contentPaneLayout.createSequentialGroup()
        					.addComponent(lblXPlayer)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblOPlayer))
        				.addComponent(button7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button8, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button9, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
        			.addGap(43)
        			.addGroup(contentPaneLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(newgamebutton, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        				.addComponent(exitbutton, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        			.addContainerGap())
        );
		contentPane.setLayout(contentPaneLayout);
		pack();
		setLocationRelativeTo(getOwner());
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{getContentPane(), button1, button2, button3, exitbutton, button4, button5, button6, newgamebutton, button7, button8, button9}));
	}
}
