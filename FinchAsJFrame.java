import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Finch extends JFrame implements KeyListener {
	
	ArrayList<Integer> keys = new ArrayList<Integer>();
	JLabel lbl = new JLabel("hi");
	
	public Finch(){
		setPreferredSize(new Dimension(1000, 1000));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(lbl);
		addKeyListener(this);
		pack();
		setVisible(true);
	}
	
	public boolean isBeakUp(){
		return keys.contains(KeyEvent.VK_W);
	}

	public boolean isBeakDown() {
		return keys.contains(KeyEvent.VK_S);
	}

	public boolean isLeftWingDown() {
		return keys.contains(KeyEvent.VK_A);
	}

	public boolean isRightWingDown() {
		return keys.contains(KeyEvent.VK_D);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(!keys.contains(e.getKeyCode()))
			keys.add(e.getKeyCode());
		lbl.setText(keys.toString());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(keys.contains(e.getKeyCode()))
				keys.remove(keys.indexOf(e.getKeyCode()));
		lbl.setText(keys.toString());
	}

	@Override
	public void keyTyped(KeyEvent e) {	}
	
}
