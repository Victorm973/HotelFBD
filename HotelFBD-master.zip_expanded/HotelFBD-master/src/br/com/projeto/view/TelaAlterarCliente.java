package br.com.projeto.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

import br.com.projeto.entidades.Cliente;
import br.com.projeto.fachada.CoreFacade;
import br.com.projeto.fachada.ICoreFacade;

public class TelaAlterarCliente {
	
	private JFrame frameCliente;
	private JTextField textFieldClienteNome;
	private JTextField textFieldClienteCPF;
	private JTextField textFieldClienteRG;
	private JTextField textFieldClienteTelefone;
	private JTextField textFieldClienteRua;
	private JTextField textFieldClienteBairro;
	private JTextField textFieldClienteCidade;
	private JTextField textFieldClienteCep;
	private JTextField textFieldClienteUF;
	private JTextField textFieldClienteBuscarCPF;
	
	private Long id;
	
	private Cliente cliente;
	private static ICoreFacade fachada;

	public TelaAlterarCliente() {
		
		frameCliente = new JFrame();
		frameCliente.setTitle("Atualizar Cliente");
		
		fachada = new CoreFacade();
		

		JPanel panelCliente = new JPanel();
		panelCliente.setLayout(null);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 11, 46, 14);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panelCliente.add(lblNome);

		textFieldClienteNome = new JTextField();
		textFieldClienteNome.setBounds(40, 8, 400, 20);
		panelCliente.add(textFieldClienteNome);
		textFieldClienteNome.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 36, 46, 14);
		panelCliente.add(lblCpf);

		textFieldClienteCPF = new JTextField();
		textFieldClienteCPF.setEditable(false);
		textFieldClienteCPF.setBounds(40, 33, 102, 20);
		panelCliente.add(textFieldClienteCPF);
		textFieldClienteCPF.setColumns(11);

		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(153, 36, 46, 14);
		panelCliente.add(lblRg);

		textFieldClienteRG = new JTextField();
		textFieldClienteRG.setBounds(174, 33, 102, 20);
		panelCliente.add(textFieldClienteRG);
		textFieldClienteRG.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(286, 36, 51, 14);
		panelCliente.add(lblTelefone);

		textFieldClienteTelefone = new JTextField();
		textFieldClienteTelefone.setBounds(347, 33, 93, 20);
		panelCliente.add(textFieldClienteTelefone);
		textFieldClienteTelefone.setColumns(10);

		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(197, 80, 72, 14);
		lblEndereco.setBackground(Color.LIGHT_GRAY);
		panelCliente.add(lblEndereco);

		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(10, 113, 25, 14);
		panelCliente.add(lblRua);

		textFieldClienteRua = new JTextField();
		textFieldClienteRua.setBounds(40, 110, 400, 20);
		panelCliente.add(textFieldClienteRua);
		textFieldClienteRua.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(3, 138, 46, 14);
		panelCliente.add(lblBairro);

		textFieldClienteBairro = new JTextField();
		textFieldClienteBairro.setBounds(40, 135, 181, 20);
		panelCliente.add(textFieldClienteBairro);
		textFieldClienteBairro.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(231, 138, 63, 14);
		panelCliente.add(lblCidade);

		textFieldClienteCidade = new JTextField();
		textFieldClienteCidade.setBounds(277, 135, 163, 20);
		panelCliente.add(textFieldClienteCidade);
		textFieldClienteCidade.setColumns(10);

		JLabel lblCep = new JLabel("Cep");
		lblCep.setBounds(10, 163, 46, 14);
		panelCliente.add(lblCep);

		textFieldClienteCep = new JTextField();
		textFieldClienteCep.setBounds(40, 160, 181, 20);
		panelCliente.add(textFieldClienteCep);
		textFieldClienteCep.setColumns(8);

		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(231, 166, 46, 14);
		panelCliente.add(lblUf);

		textFieldClienteUF = new JTextField();
		textFieldClienteUF.setBounds(277, 160, 25, 20);
		panelCliente.add(textFieldClienteUF);
		textFieldClienteUF.setColumns(2);

		JButton btnClienteAtualizar = new JButton("Atualizar Dados do Cliente");
		btnClienteAtualizar.setBounds(130, 220, 195, 23);
		panelCliente.add(btnClienteAtualizar);

		btnClienteAtualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {

				cliente = new Cliente();
				
				cliente.setId(getId());
				cliente.setNome(textFieldClienteNome.getText());
				cliente.setCpf(textFieldClienteCPF.getText());
				cliente.setIdentidade(textFieldClienteRG.getText());
				cliente.setTelefone(textFieldClienteTelefone.getText());
				cliente.setRua(textFieldClienteRua.getText());
				cliente.setBairro(textFieldClienteBairro.getText());
				cliente.setCidade(textFieldClienteCidade.getText());
				cliente.setUf(textFieldClienteUF.getText());
				cliente.setCep(textFieldClienteCep.getText());

				fachada.salvarOuEditarCliente(cliente);


			}
		});
		
		frameCliente.getContentPane().add(panelCliente);
		frameCliente.setSize(465, 300);
		frameCliente.setLocationRelativeTo(null);
		frameCliente.setVisible(true);
		frameCliente.setResizable(false);

	}

	public JTextField getTextFieldClienteNome() {
		return textFieldClienteNome;
	}

	public void setTextFieldClienteNome(JTextField textFieldClienteNome) {
		this.textFieldClienteNome = textFieldClienteNome;
	}

	public JTextField getTextFieldClienteCPF() {
		return textFieldClienteCPF;
	}

	public void setTextFieldClienteCPF(JTextField textFieldClienteCPF) {
		this.textFieldClienteCPF = textFieldClienteCPF;
	}

	public JTextField getTextFieldClienteRG() {
		return textFieldClienteRG;
	}

	public void setTextFieldClienteRG(JTextField textFieldClienteRG) {
		this.textFieldClienteRG = textFieldClienteRG;
	}

	public JTextField getTextFieldClienteTelefone() {
		return textFieldClienteTelefone;
	}

	public void setTextFieldClienteTelefone(JTextField textFieldClienteTelefone) {
		this.textFieldClienteTelefone = textFieldClienteTelefone;
	}

	public JTextField getTextFieldClienteRua() {
		return textFieldClienteRua;
	}

	public void setTextFieldClienteRua(JTextField textFieldClienteRua) {
		this.textFieldClienteRua = textFieldClienteRua;
	}

	public JTextField getTextFieldClienteBairro() {
		return textFieldClienteBairro;
	}

	public void setTextFieldClienteBairro(JTextField textFieldClienteBairro) {
		this.textFieldClienteBairro = textFieldClienteBairro;
	}

	public JTextField getTextFieldClienteCidade() {
		return textFieldClienteCidade;
	}

	public void setTextFieldClienteCidade(JTextField textFieldClienteCidade) {
		this.textFieldClienteCidade = textFieldClienteCidade;
	}

	public JTextField getTextFieldClienteCep() {
		return textFieldClienteCep;
	}

	public void setTextFieldClienteCep(JTextField textFieldClienteCep) {
		this.textFieldClienteCep = textFieldClienteCep;
	}

	public JTextField getTextFieldClienteUF() {
		return textFieldClienteUF;
	}

	public void setTextFieldClienteUF(JTextField textFieldClienteUF) {
		this.textFieldClienteUF = textFieldClienteUF;
	}

	public JTextField getTextFieldClienteBuscarCPF() {
		return textFieldClienteBuscarCPF;
	}

	public void setTextFieldClienteBuscarCPF(JTextField textFieldClienteBuscarCPF) {
		this.textFieldClienteBuscarCPF = textFieldClienteBuscarCPF;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
	
	

}
