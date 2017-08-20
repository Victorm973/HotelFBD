package br.com.projeto.view;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class TelaListaVinculos {

	private JFrame frame;
	private JTextField textFieldVinculoValores;
	private JLabel lblNomedocliente;
	private DefaultListModel<String> defaultVinculo = new DefaultListModel<String>(); 
			

	
	public TelaListaVinculos() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDebitosDoCliente = new JLabel("Debitos do Cliente :");
		lblDebitosDoCliente.setBounds(10, 11, 105, 20);
		frame.getContentPane().add(lblDebitosDoCliente);
		
		lblNomedocliente = new JLabel("NomedoCliente");
		lblNomedocliente.setBounds(125, 14, 299, 14);
		frame.getContentPane().add(lblNomedocliente);
		
		JScrollPane scrollPaneVinculo = new JScrollPane();
		scrollPaneVinculo.setBounds(10, 72, 414, 153);
		frame.getContentPane().add(scrollPaneVinculo);
		
		JList<String> textAreaVinculoLista = new JList<String>(defaultVinculo);
		scrollPaneVinculo.setViewportView(textAreaVinculoLista);
		
		JLabel lblDebitoTotal = new JLabel("Debito Total");
		lblDebitoTotal.setBounds(266, 236, 75, 14);
		frame.getContentPane().add(lblDebitoTotal);
		
		textFieldVinculoValores = new JTextField();
		textFieldVinculoValores.setEditable(false);
		textFieldVinculoValores.setBounds(338, 233, 86, 20);
		frame.getContentPane().add(textFieldVinculoValores);
		textFieldVinculoValores.setColumns(10);
		
		JLabel lblDescrioDoServio = new JLabel("Descri\u00E7\u00E3o do Servi\u00E7o");
		lblDescrioDoServio.setBounds(10, 42, 222, 14);
		frame.getContentPane().add(lblDescrioDoServio);
	}

	public JTextField getTextFieldVinculoValores() {
		return textFieldVinculoValores;
	}

	public void setTextFieldVinculoValores(JTextField textFieldVinculoValores) {
		this.textFieldVinculoValores = textFieldVinculoValores;
	}

	public JLabel getLblNomedocliente() {
		return lblNomedocliente;
	}

	public void setLblNomedocliente(JLabel lblNomedocliente) {
		this.lblNomedocliente = lblNomedocliente;
	}

	public DefaultListModel<String> getDefaultVinculo() {
		return defaultVinculo;
	}

	public void setDefaultVinculo(DefaultListModel<String> defaultVinculo) {
		this.defaultVinculo = defaultVinculo;
	}
	
	
}
