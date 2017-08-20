package br.com.projeto.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.fachada.CoreFacade;
import br.com.projeto.fachada.ICoreFacade;

public class TelaAlterarAcomodacao {

	private JFrame frameAcomodacao;

	private JTextField textFieldAcomodacaoNum;
	private JTextField textFieldAcomodacaoValor;
	private JTextArea textAreaAcomodacaoDesc;
	private Long id;

	private Acomodacao acomodacao;
	private static ICoreFacade fachada;

	public TelaAlterarAcomodacao() {
		
		frameAcomodacao = new JFrame();
		frameAcomodacao.setTitle("Atualizar Acomodação");
		
		fachada = new CoreFacade();

		JPanel panelAlterarAcomodacao = new JPanel();
		panelAlterarAcomodacao.setLayout(null);

		JLabel lblNumeroDaAcomodao = new JLabel("Numero da Acomodação");
		lblNumeroDaAcomodao.setBounds(10, 11, 152, 14);
		panelAlterarAcomodacao.add(lblNumeroDaAcomodao);

		JLabel lblValorDaAcomodao = new JLabel("Valor da Acomodação");
		lblValorDaAcomodao.setBounds(23, 36, 139, 14);
		panelAlterarAcomodacao.add(lblValorDaAcomodao);

		textFieldAcomodacaoNum = new JTextField();
		textFieldAcomodacaoNum.setBounds(172, 8, 127, 20);
		panelAlterarAcomodacao.add(textFieldAcomodacaoNum);
		textFieldAcomodacaoNum.setColumns(10);

		textFieldAcomodacaoValor = new JTextField();
		textFieldAcomodacaoValor.setBounds(172, 33, 127, 20);
		panelAlterarAcomodacao.add(textFieldAcomodacaoValor);
		textFieldAcomodacaoValor.setColumns(10);

		JLabel lblAcomoDescQuarto;
		lblAcomoDescQuarto = new JLabel("Descrição do Quarto");
		lblAcomoDescQuarto.setBounds(10, 75, 152, 14);
		panelAlterarAcomodacao.add(lblAcomoDescQuarto);

		textAreaAcomodacaoDesc = new JTextArea();
		textAreaAcomodacaoDesc.setBounds(10, 100, 430, 117);
		panelAlterarAcomodacao.add(textAreaAcomodacaoDesc);

		JButton btnAtualizarAcomodacao = new JButton("Atualizar Acomodação");
		btnAtualizarAcomodacao.setBounds(278, 229, 165, 34);
		panelAlterarAcomodacao.add(btnAtualizarAcomodacao);
		
		JLabel lbldiaria = new JLabel("(Diária)");
		lbldiaria.setBounds(318, 36, 58, 14);
		panelAlterarAcomodacao.add(lbldiaria);

		btnAtualizarAcomodacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					acomodacao = new Acomodacao();

					acomodacao.setId(getId());
					acomodacao.setNumero(Integer.parseInt(textFieldAcomodacaoNum.getText()));
					acomodacao.setValor_diaria(Double.parseDouble(textFieldAcomodacaoValor.getText()));
					acomodacao.setDescricao(textAreaAcomodacaoDesc.getText());
					
					fachada.salvarOuEditarAcomodacao(acomodacao);
					
				} catch (Exception e2) {

					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios ou Inválidos!!!");

				}

			}
		});

		frameAcomodacao.getContentPane().add(panelAlterarAcomodacao);
		frameAcomodacao.setSize(465, 300);
		frameAcomodacao.setLocationRelativeTo(null);
		frameAcomodacao.setVisible(true);
		frameAcomodacao.setResizable(false);
	}

	public JTextField getTextFieldAcomodacaoNum() {
		return textFieldAcomodacaoNum;
	}

	public void setTextFieldAcomodacaoNum(JTextField textFieldAcomodacaoNum) {
		this.textFieldAcomodacaoNum = textFieldAcomodacaoNum;
	}

	public JTextField getTextFieldAcomodacaoValor() {
		return textFieldAcomodacaoValor;
	}

	public void setTextFieldAcomodacaoValor(JTextField textFieldAcomodacaoValor) {
		this.textFieldAcomodacaoValor = textFieldAcomodacaoValor;
	}

	public JTextArea getTextAreaAcomodacaoDesc() {
		return textAreaAcomodacaoDesc;
	}

	public void setTextAreaAcomodacaoDesc(JTextArea textAreaAcomodacaoDesc) {
		this.textAreaAcomodacaoDesc = textAreaAcomodacaoDesc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
