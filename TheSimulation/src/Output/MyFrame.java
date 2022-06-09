package Output;

import javax.swing.*;



public class MyFrame extends JFrame {

	
	
		// TODO Auto-generated method stub
		private static final long serialVersionUID = 1571040322866592542L;
		MyPanel panel;
		
		public MyFrame(){
			
			panel = new MyPanel();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.add(panel);
			this.pack();
			this.setLocationRelativeTo(null);
			this.setVisible(true);
			
		}

  
}
	


