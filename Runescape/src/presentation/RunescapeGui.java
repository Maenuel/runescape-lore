package presentation;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import business.God;

public class RunescapeGui {
	private static JFrame frame;
	private static JFrame godListFrame = null;
	private static JFrame godFrame;
	
	public static void main(String[] args) {
		createFrameFirstPage();
	}

	public static void createFrameFirstPage() {
		frame = new JFrame("Runescape");
		
		addFirstPageContent(frame.getContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	private static void addFirstPageContent(Container container) {
		JLabel label = new JLabel();
		Button godButton = createGodButton();
		label = new JLabel("Runescape Gods Lore");
		
		container.add(label, BorderLayout.NORTH);
		container.add(godButton, BorderLayout.WEST);
		container.add(createTierListButton(), BorderLayout.EAST);
		
		godButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO after backButton action = deactivated
				if (godListFrame == null) {
					createFrameGodsListPage();
					frame.setVisible(false);
					godListFrame.setVisible(true);
				}
			}
			
		});
	}
	
	public static void createFrameGodsListPage() {
		godListFrame = new JFrame("Gods List");
		
		addContentGodsListPage(godListFrame.getContentPane());
		
		godListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		godListFrame.pack();
	}
	
	private static void addContentGodsListPage(Container container) {
		JLabel label = new JLabel();
		GodsList godsList = createGodsList();
		Button backButton = createBackButton();
		label = new JLabel("Gods");
		
		container.add(label, BorderLayout.NORTH);
		container.add(godsList, BorderLayout.WEST);
		container.add(backButton, BorderLayout.EAST);
		
		godsList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = godsList.getSelectedIndex();
				if (index < 0) return; // TODO Address with Exception
				God god = godsList.getGods().get(index);
				createGodFrame(god);
				godListFrame.setVisible(false);
				godFrame.setVisible(true);
			}
			
		});
		
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				godListFrame.setVisible(false);
				frame.setVisible(true);
			}
			
		});
		
	}
	
	private static void createGodFrame(God god) {
		godFrame = new JFrame();
		godFrame.setSize(500, 450);
		
		addContentGodFrame(god, godFrame.getContentPane());
	} 
	
	private static void addContentGodFrame(God god, Container container) {
		JLabel label = new JLabel();
		JTextArea textArea = new JTextArea(god.getDescription(), 10, 20);
		textArea.setSize(350, 400);
		textArea.setLineWrap(true);
		Button backButton = createBackButton();
		backButton.setSize(100,100);
		label = new JLabel(god.getName());
		container.add(label, BorderLayout.NORTH);
		
		container.add(textArea, BorderLayout.WEST);
		
		container.add(backButton, BorderLayout.EAST);
		
		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				godFrame.setVisible(false);
				godListFrame.setVisible(true);
				godFrame = null;
			}
			
		});
	}
	
	private static Button createGodButton() {
		Button cmp = new Button("Gods");
		cmp.setVisible(true);
		return cmp;
	}
	
	private static Button createTierListButton() {
		Button btn = new Button("Tier List");
		btn.setVisible(true);
		return btn;
	}
	
	private static Button createBackButton() {
		Button btn = new Button("Back");
		btn.setVisible(true);
		btn.setSize(100, 100);
		return btn;
	}
	
	private static GodsList createGodsList() {
		GodsList gods = new GodsList();
		gods.setSize(150, 500);
		gods.setVisible(true);
		return gods;
	}
}
