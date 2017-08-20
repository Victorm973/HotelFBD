package br.com.projeto.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.projeto.entidades.Servico;
import br.com.projeto.fachada.CoreFacade;
import br.com.projeto.fachada.ICoreFacade;

public class TelaAlterarServico {
	
	private JFrame frameServico;
	
	private JTextField textFieldServicoCodigoServ;
	private JTextField textFieldServicoValorServ;
	private JTextArea textAreaServicoDescri��oServ;
	private Long id;
	
	private Servico servico;
	private static ICoreFacade fachada;

	public TelaAlterarServico() {
		
		frameServico = new JFrame();
		frameServico.setTitle("Atualizar Servi�o");
		
		fachada = new CoreFacade();

		JPanel panelServico = new JPanel();
		panelServico.setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(17, 11, 57, 14);
		panelServico.add(lblCodigo);

		textFieldServicoCodigoServ = new JTextField();
		textFieldServicoCodigoServ.setBounds(73, 8, 70, 20);
		textFieldServicoCodigoServ.setEditable(false);
		panelServico.add(textFieldServicoCodigoServ);
		textFieldServicoCodigoServ.setColumns(10);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(216, 11, 41, 14);
		panelServico.add(lblValor);

		textFieldServicoValorServ = new JTextField();
		textFieldServicoValorServ.setBounds(267, 8, 81, 20);
		panelServico.add(textFieldServicoValorServ);
		textFieldServicoValorServ.setColumns(10);

		JLabel lblDescricao = new JLabel("Descri��o");
		lblDescricao.setBounds(10, 36, 64, 14);
		panelServico.add(lblDescricao);

		textAreaServicoDescri��oServ = new JTextArea();
		textAreaServicoDescri��oServ.setBounds(10, 61, 430, 150);
		panelServico.add(textAreaServicoDescri��oServ);

		JButton btnServicoAlterarServico = new JButton("Alterar Servi�o");
		btnServicoAlterarServico.setBounds(154, 237, 144, 23);
		panelServico.add(btnServicoAlterarServico);
		
		btnServicoAlterarServico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				servico = new Servico();
				
				servico.setId(getId());
				servico.setCodigo(Integer.parseInt(textFieldServicoCodigoServ.getText()));
				servico.setValor(Double.parseDouble(textFieldServicoValorServ.getText()));
				servico.setDescricao(textAreaServicoDescri��oServ.getText());
			
				fachada.salvarOuEditarServico(servico);
				
			}
		});
		

		frameServico.getContentPane().add(panelServico);
		frameServico.setSize(465, 300);
		frameServico.setLocationRelativeTo(null);
		frameServico.setVisible(true);
		frameServico.setResizable(false);

	}

	public JTextField getTextFieldServicoCodigoServ() {
		return textFieldServicoCodigoServ;
	}

	public void setTextFieldServicoCodigoServ(JTextField textFieldServicoCodigoServ) {
		this.textFieldServicoCodigoServ = textFieldServicoCodigoServ;
	}

	public JTextField getTextFieldServicoValorServ() {
		return textFieldServicoValorServ;
	}

	public void setTextFieldServicoValorServ(JTextField textFieldServicoValorServ) {
		this.textFieldServicoValorServ = textFieldServicoValorServ;
	}

	public JTextArea getTextAreaServicoDescri��oServ() {
		return textAreaServicoDescri��oServ;
	}

	public void setTextAreaServicoDescri��oServ(JTextArea textAreaServicoDescri��oServ) {
		this.textAreaServicoDescri��oServ = textAreaServicoDescri��oServ;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


}
