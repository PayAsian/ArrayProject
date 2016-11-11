package array.view;

import javax.swing.JFrame;
import array.controller.ArrayController;
import java.awt.Dimension;
import array.view.HipsterPanel;

public class HipsterFrame extends JFrame
{

	private ArrayController baseController;
	private HipsterPanel BasePanel;
	
	public HipsterFrame(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		BasePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(BasePanel);
		this.setTitle("Hipsters 2016");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	
}
