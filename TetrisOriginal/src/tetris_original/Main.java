package tetris_original;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
//	private JLabel status;
	
//	public JLabel getStatusLabel() {
//		return status;
//		
//	}
	public void init() {
		JFrame frame = new JFrame();
		Board board = new Board();
//		status = new JLabel("test");
//		frame.add(status, new BorderLayout().CENTER);
		frame.add(board);
//		frame.add(board.status);
		frame.setSize(board.getWHSize());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main game = new Main();
		game.init();


	}

}
