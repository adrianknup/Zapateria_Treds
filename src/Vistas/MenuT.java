package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class MenuT extends JFrame {
	
	
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					MenuT frame = new MenuT();
					//JOptionPane.showMessageDialog(null,"","ERROR",JOptionPane.ERROR_MESSAGE);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public MenuT() {
		setResizable(false);
		setBackground(Color.GRAY);
		
		
		
		setTitle("TRENDS");
		setBounds(100, 100, 742, 481);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.WHITE);
		menuBar.setBackground(Color.DARK_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("VENTAS");
		mnNewMenu_1.setForeground(Color.WHITE);
		mnNewMenu_1.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Registar Nueva Venta");
		mntmNewMenuItem.setForeground(Color.WHITE);
		mntmNewMenuItem.setBackground(Color.DARK_GRAY);
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_2 = new JMenu("RESUMENES DE VENTA");
		mnNewMenu_2.setForeground(Color.WHITE);
		mnNewMenu_2.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("CUENTAS CORRIENTES");
		mnNewMenu_3.setForeground(Color.WHITE);
		mnNewMenu_3.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_5 = new JMenu("DEVOLUCIONES");
		mnNewMenu_5.setForeground(Color.WHITE);
		mnNewMenu_5.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("ARTICULOS / PROMOCIONES");
		mnNewMenu_6.setForeground(Color.WHITE);
		mnNewMenu_6.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_6);
		
		JMenu mnNewMenu_4 = new JMenu("EXTRAS");
		mnNewMenu_4.setForeground(Color.WHITE);
		mnNewMenu_4.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
}



