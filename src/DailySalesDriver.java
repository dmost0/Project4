// Imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Driver of daily sales
 *
 */
public class DailySalesDriver extends JFrame implements ActionListener {

	// Declare fields
	DailySales daily;
	JTextField lText;
	JTextField mText;
	JTextField sText;
	JTextField bText;
	
	JTextField lTotalText;
	JTextField mTotalText;
	JTextField sTotalText;
	JTextField bTotalText;
	
	JTextField totalSalesText;
	JTextField totalTaxText;
	JTextField netSalesText;
	JTextField dailyCostText;
	JTextField profitOrLossText;
	
	JLabel profitOrLossLabel;
	
	/**
	 * Constructor
	 */
	public DailySalesDriver()
	{
		// set frame settings
		setBackground(Color.WHITE);
		setSize(493,360);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		profitOrLossLabel = new JLabel("Profit of");
		
		// Build different panels of this JFrame
		buildTopPanel();
		buildCenterPanel();
		buildBottomPanel();
		
		// Allow JFrame to be seen
		setVisible(true);
	}
	
	/**
	 * Builds top panel
	 */
	public void buildTopPanel()
	{
		// Create top panel
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.YELLOW);		
		// Create components
		JLabel title = new JLabel("Eve's Pizza Daily Sales");

		// Add components to topPanel
		topPanel.add(title);
				
		// Add topPanel to content pane's north
		add(topPanel,BorderLayout.NORTH);
	}
	
	/**
	 * Builds center panel
	 */
	public void buildCenterPanel()
	{
		// Create Panels
		JPanel centerPanel = new JPanel();
		JPanel quantitySold = new JPanel();
		JPanel totalDailySales = new JPanel();
		JPanel lastPanel = new JPanel();
		
		
		// Populate QuantitySold Panel
		quantitySold.setBorder(BorderFactory.createTitledBorder("Quantity Sold"));
		quantitySold.setLayout(new BoxLayout(quantitySold, BoxLayout.Y_AXIS));
		JLabel lLabel = new JLabel("Large Pizza");
		JLabel mLabel = new JLabel("Medium Pizza");
		JLabel sLabel = new JLabel("Small Pizza");
		JLabel bLabel = new JLabel("Bread Sticks");
		lText = new JTextField(10);
		mText = new JTextField(10);
		sText = new JTextField(10);
		bText = new JTextField(10);
		
		JPanel l = new JPanel();
		l.setLayout(new GridLayout(1,2));
		l.add(lLabel);
		l.add(lText);

		JPanel m = new JPanel();
		m.setLayout(new GridLayout(1,2));
		m.add(mLabel);
		m.add(mText);

		JPanel s = new JPanel();
		s.setLayout(new GridLayout(1,2));
		s.add(sLabel);
		s.add(sText);
		
		JPanel b = new JPanel();
		b.setLayout(new GridLayout(1,2));
		b.add(bLabel);
		b.add(bText);
		
		quantitySold.add(l);
		quantitySold.add(m);
		quantitySold.add(s);
		quantitySold.add(b);
		
		
		// Populate totalDailySales Panel
		totalDailySales.setBorder(BorderFactory.createTitledBorder("Total Daily Sales"));
		totalDailySales.setLayout(new BoxLayout(totalDailySales, BoxLayout.Y_AXIS));
		lTotalText = new JTextField(17);
		mTotalText = new JTextField(17);
		sTotalText = new JTextField(17);
		bTotalText = new JTextField(17);
		lTotalText.setEditable(false);
		mTotalText.setEditable(false);
		sTotalText.setEditable(false);
		bTotalText.setEditable(false);
		
		JPanel lSale = new JPanel();
		lSale.setLayout(new GridLayout(1,2));
		lSale.add(lTotalText);

		JPanel mSale = new JPanel();
		mSale.setLayout(new GridLayout(1,2));
		mSale.add(mTotalText);

		JPanel sSale = new JPanel();
		sSale.setLayout(new GridLayout(1,2));
		sSale.add(sTotalText);
		
		JPanel bSale = new JPanel();
		bSale.setLayout(new GridLayout(1,2));
		bSale.add(bTotalText);
		
		
		totalDailySales.add(lTotalText);
		totalDailySales.add(mTotalText);
		totalDailySales.add(sTotalText);
		totalDailySales.add(bTotalText);
		
		// Populate lastPanel Panel
		lastPanel.setLayout(new BoxLayout(lastPanel, BoxLayout.Y_AXIS));
		JLabel totalSalesLabel = new JLabel("Total Sales");
		JLabel totalTaxLabel = new JLabel("Total Tax");
		JLabel netSalesLabel = new JLabel("Net Sales");
		JLabel dailyCostLabel = new JLabel("Daily Oper Cost");
		totalSalesText = new JTextField(17);
		totalTaxText = new JTextField(17);
		netSalesText = new JTextField(17);
		dailyCostText = new JTextField(17);
		profitOrLossText = new JTextField(17);
		
		totalSalesText.setEditable(false);
		totalTaxText.setEditable(false);
		netSalesText.setEditable(false);
		dailyCostText.setEditable(false);
		profitOrLossText.setEditable(false);
		
		JPanel totalSale = new JPanel();
		totalSale.setLayout(new GridLayout(1,2));
		totalSale.add(totalSalesLabel);
		totalSale.add(totalSalesText);

		JPanel totalTax = new JPanel();
		totalTax.setLayout(new GridLayout(1,2));
		totalTax.add(totalTaxLabel);
		totalTax.add(totalTaxText);

		JPanel netSales = new JPanel();
		netSales.setLayout(new GridLayout(1,2));
		netSales.add(netSalesLabel);
		netSales.add(netSalesText);
		
		JPanel dailyOperCost = new JPanel();
		dailyOperCost.setLayout(new GridLayout(1,2));
		dailyOperCost.add(dailyCostLabel);
		dailyOperCost.add(dailyCostText);		

		JPanel profitOrLoss = new JPanel();
		profitOrLoss.setLayout(new GridLayout(1,2));
		profitOrLoss.add(profitOrLossLabel);
		profitOrLoss.add(profitOrLossText);
		
		lastPanel.add(totalSale);
		lastPanel.add(totalTax);
		lastPanel.add(netSales);
		lastPanel.add(dailyOperCost);
		lastPanel.add(profitOrLoss);
		
		
		// Add sub panels to main center panel
		centerPanel.add(quantitySold);
		centerPanel.add(totalDailySales);
		centerPanel.add(lastPanel);
		
		// Add main center panel to content pane center
		add(centerPanel,BorderLayout.CENTER);		
	}
	
	/**
	 * Builds bottom panel
	 */
	public void buildBottomPanel()
	{
		// Create bottom panel
		JPanel bottomPanel = new JPanel();
				
		// Create components
		JButton clear = new JButton("Clear Fields");
		JButton calculate= new JButton("Calculate");
		JButton exit = new JButton("Exit");
				
		// Register action listeners
		clear.addActionListener(this);
		calculate.addActionListener(this);
		exit.addActionListener(this);
				
		// Set action command
		clear.setActionCommand("1");
		calculate.setActionCommand("2");
		exit.setActionCommand("3");
				
		// Add components to bottomPanel
		bottomPanel.add(clear);
		bottomPanel.add(calculate);
		bottomPanel.add(exit);
			
		// Add bottomPanel to content pane's south
		add(bottomPanel,BorderLayout.SOUTH);
	}
	
	/**
	 * Action performed method used for button events
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Clear Fields button pressed
		if(e.getActionCommand() == "1"){
			lText.setText("");
			mText.setText("");
			sText.setText("");
			bText.setText("");
			
			lTotalText.setText("");
			mTotalText.setText("");
			sTotalText.setText("");
			bTotalText.setText("");
			
			totalSalesText.setText("");
			totalTaxText.setText("");
			netSalesText.setText("");
			dailyCostText.setText("");
			profitOrLossText.setText("");
		}
		
		// Calculate button pressed
		else if(e.getActionCommand() == "2"){
			daily = new DailySales(Integer.parseInt(lText.getText()), Integer.parseInt(mText.getText()), Integer.parseInt(sText.getText()), Integer.parseInt(bText.getText()));
			
			lTotalText.setText(String.valueOf(daily.getSalesLarge()));
			mTotalText.setText(String.valueOf(daily.getSalesMedium()));
			sTotalText.setText(String.valueOf(daily.getSalesSmall()));
			bTotalText.setText(String.valueOf(daily.getSalesStick()));
					
			totalSalesText.setText(String.valueOf(daily.getTotalSales()));
			totalTaxText.setText(String.valueOf(daily.getTotalTax()));
			netSalesText.setText(String.valueOf(daily.getNetSales()));
			dailyCostText.setText("1000");
			
			if(daily.getProfit() < 0){
				profitOrLossText.setText(String.valueOf(daily.getProfit() * - 1));
				profitOrLossLabel.setText("Loss of");
			}
			else{
				profitOrLossText.setText(String.format("%.2d",daily.getProfit()));
			}
		}
		
		// Close button pressed
		else{
			// Makes frame invisible then disposes of it
			setVisible(false);
			dispose();
		}
	}
	
	/**
	 * Starts the main program
	 * @param args default args
	 */
	public static void main(String[] args)
	{
		new DailySalesDriver();
	}

}
