package Vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;

public class Registar_ventas extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	DefaultTableModel dtm = new  DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registar_ventas frame = new Registar_ventas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registar_ventas() {
		setTitle("TRENDS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 911, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("REGISTRAR VENTA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(294, 10, 298, 47);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 35));
		panel.setLayout(null);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("CANCELAR");
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBounds(18, 411, 114, 21);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CONFIRMAR");
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBounds(763, 411, 114, 21);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(Color.GRAY);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Lista de Compra", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_1.setBounds(18, 204, 859, 181);
		panel.add(panel_1);
		panel_1.setLayout(new MigLayout("", "[grow]", "[grow]"));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, "flowx,cell 0 0,growx");
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setColumnSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setFillsViewportHeight(true);
		cargatabla();
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(Color.GRAY);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Seleccione Los Articulos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		panel_2.setBounds(18, 65, 859, 129);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ARTICULO:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(175, 49, 87, 13);
		panel_2.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(272, 45, 110, 21);
		panel_2.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(568, 45, 110, 21);
		panel_2.add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("CANTIDAD:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(471, 49, 87, 13);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("QUITAR");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(321, 98, 96, 21);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("AGREGAR");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(435, 98, 96, 21);
		panel_2.add(btnNewButton);
	}
	
	public void cargatabla() {
		ArrayList<Object>nombrecolumna = new ArrayList<Object>();
		nombrecolumna.add("PRODUCTO");
		nombrecolumna.add("CANTIDAD");
		nombrecolumna.add("PRECIO");
		nombrecolumna.add("TOTAL");
		for (Object columna : nombrecolumna) {
			dtm.addColumn(columna);
		}
		this.table_1.setModel(dtm);
		
		
		ArrayList<Object[]> datos = new ArrayList<Object[]>();
		
		for(int i=0;i<=8;i++) {
			String id_articulo = "  ";
			String cant = "  ";
			String precio = "  ";
			String total = "  ";
			Object[] info = new Object[]{id_articulo, cant, precio, total};
			datos.add(info);
		}
		
		for(Object []guardadato : datos) {
			dtm.addRow(guardadato);
		}
		
		table_1.setModel(dtm);
		
	}
}
