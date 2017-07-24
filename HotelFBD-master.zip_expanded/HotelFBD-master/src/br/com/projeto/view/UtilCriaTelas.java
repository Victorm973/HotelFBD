package br.com.projeto.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UtilCriaTelas {

	private JFrame frame;
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
	private JTextField textFieldServicoIDServico;
	private JTextField textFieldServicoCPFServico;
	private JTextField textFieldServicoCodigoCadServ;
	private JTextField textFieldServicoValorCadserv;
	private JTextField textFieldReservaCPFCliente;
	private JTextField textFieldReservaDataEntrada;
	private JTextField textFieldReservaDataSaida;
	private JTextField textFieldReservaIDAcomodacao;
	private JTextField textFieldReservaListaApts;
	private JTextField textFieldAcomodacaoCadNum;
	private JTextField textFieldAcomodacaoCadValor;
	private JTextField textFieldAcomodaçãoBuscaEdit;
	private JTextField textFieldAcomodacaoAlterarNum;
	private JTextField textFieldAcomodacaoValorNovo;
	
	private JLabel lblAcomoDescQuarto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		new UtilCriaTelas();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UtilCriaTelas window = new UtilCriaTelas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UtilCriaTelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPaneAcomodacao = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneAcomodacao.setBounds(10, 78, 464, 302);
		frame.getContentPane().add(tabbedPaneAcomodacao);

		JPanel panelAcomodacaoCadastro = new JPanel();
		tabbedPaneAcomodacao.addTab("Cadastrar Nova Acomodação", null, panelAcomodacaoCadastro, null);
		panelAcomodacaoCadastro.setLayout(null);

		JLabel lblNumeroDaAcomodao = new JLabel("Numero da Acomodação");
		lblNumeroDaAcomodao.setBounds(10, 11, 152, 14);
		panelAcomodacaoCadastro.add(lblNumeroDaAcomodao);

		JLabel lblValorDaAcomodao = new JLabel("Valor da Acomodaçao");
		lblValorDaAcomodao.setBounds(23, 36, 139, 14);
		panelAcomodacaoCadastro.add(lblValorDaAcomodao);

		textFieldAcomodacaoCadNum = new JTextField();
		textFieldAcomodacaoCadNum.setBounds(172, 8, 127, 20);
		panelAcomodacaoCadastro.add(textFieldAcomodacaoCadNum);
		textFieldAcomodacaoCadNum.setColumns(10);

		textFieldAcomodacaoCadValor = new JTextField();
		textFieldAcomodacaoCadValor.setBounds(172, 33, 127, 20);
		panelAcomodacaoCadastro.add(textFieldAcomodacaoCadValor);
		textFieldAcomodacaoCadValor.setColumns(10);

		JLabel lblAcomoDescQuarto;
		lblAcomoDescQuarto = new JLabel("Descrição do Quarto");
		lblAcomoDescQuarto.setBounds(10, 75, 152, 14);
		panelAcomodacaoCadastro.add(lblAcomoDescQuarto);

		JTextArea textAreaAcomodacaoCadDesc = new JTextArea();
		textAreaAcomodacaoCadDesc.setBounds(10, 100, 430, 117);
		panelAcomodacaoCadastro.add(textAreaAcomodacaoCadDesc);

		JButton btnAcomodacaoCriarAcomodao = new JButton("Criar Acomodação");
		btnAcomodacaoCriarAcomodao.setBounds(278, 229, 165, 34);
		panelAcomodacaoCadastro.add(btnAcomodacaoCriarAcomodao);

		JLabel lbldiaria = new JLabel("(Diária)");
		lbldiaria.setBounds(318, 36, 58, 14);
		panelAcomodacaoCadastro.add(lbldiaria);

		JPanel panelAcomodacaoEdit = new JPanel();
		tabbedPaneAcomodacao.addTab("Modificar Acomodação", null, panelAcomodacaoEdit, null);
		panelAcomodacaoEdit.setLayout(null);

		JLabel lblDigiteOId = new JLabel("Digite o ID da Acomodação");
		lblDigiteOId.setBounds(141, 11, 151, 14);
		panelAcomodacaoEdit.add(lblDigiteOId);

		textFieldAcomodaçãoBuscaEdit = new JTextField();
		textFieldAcomodaçãoBuscaEdit.setBounds(167, 36, 106, 20);
		panelAcomodacaoEdit.add(textFieldAcomodaçãoBuscaEdit);
		textFieldAcomodaçãoBuscaEdit.setColumns(10);

		JButton btnAcomodacaoAlterar = new JButton("Alterar");

		btnAcomodacaoAlterar.setBounds(141, 67, 156, 23);
		panelAcomodacaoEdit.add(btnAcomodacaoAlterar);

		JLabel label = new JLabel("Numero da Acomodação");
		label.setBounds(10, 135, 148, 14);
		panelAcomodacaoEdit.add(label);

		JLabel label_1 = new JLabel("Valor da Acomodação");
		label_1.setBounds(10, 157, 134, 14);
		panelAcomodacaoEdit.add(label_1);

		textFieldAcomodacaoAlterarNum = new JTextField();
		textFieldAcomodacaoAlterarNum.setColumns(10);
		textFieldAcomodacaoAlterarNum.setBounds(168, 132, 171, 20);
		panelAcomodacaoEdit.add(textFieldAcomodacaoAlterarNum);

		textFieldAcomodacaoValorNovo = new JTextField();
		textFieldAcomodacaoValorNovo.setColumns(10);
		textFieldAcomodacaoValorNovo.setBounds(167, 154, 171, 20);
		panelAcomodacaoEdit.add(textFieldAcomodacaoValorNovo);

		JLabel label_2 = new JLabel("(Diária)");
		label_2.setBounds(353, 157, 66, 14);
		panelAcomodacaoEdit.add(label_2);

		JLabel lblModificar = new JLabel("Modificar");
		lblModificar.setBounds(200, 101, 73, 14);
		panelAcomodacaoEdit.add(lblModificar);

		JLabel lblDescrio = new JLabel("Descrição");
		lblDescrio.setBounds(10, 186, 106, 14);
		panelAcomodacaoEdit.add(lblDescrio);

		JTextArea textAreaAcomodacaoNovaDescricao = new JTextArea();
		textAreaAcomodacaoNovaDescricao.setBounds(10, 203, 254, 60);
		panelAcomodacaoEdit.add(textAreaAcomodacaoNovaDescricao);

		JButton btnAcomodacaoModificarAcomodacao = new JButton("Modificar Acomodação");
		btnAcomodacaoModificarAcomodacao.setBounds(274, 213, 175, 39);
		panelAcomodacaoEdit.add(btnAcomodacaoModificarAcomodacao);
	}

	public JTextField getTextFieldClienteNome() {
		return textFieldClienteNome;
	}

	public JTextField getTextFieldClienteCPF() {
		return textFieldClienteCPF;
	}

	public JTextField getTextFieldClienteRG() {
		return textFieldClienteRG;
	}

	public JTextField getTextFieldClienteTelefone() {
		return textFieldClienteTelefone;
	}

	public JTextField getTextFieldClienteRua() {
		return textFieldClienteRua;
	}

	public JTextField getTextFieldClienteBairro() {
		return textFieldClienteBairro;
	}

	public JTextField getTextFieldClienteCidade() {
		return textFieldClienteCidade;
	}

	public JTextField getTextFieldClienteCep() {
		return textFieldClienteCep;
	}

	public JTextField getTextFieldClienteUF() {
		return textFieldClienteUF;
	}

	public JTextField getTextFieldClienteBuscarCPF() {
		return textFieldClienteBuscarCPF;
	}

	public JTextField getTextFieldServicoIDServico() {
		return textFieldServicoIDServico;
	}

	public JTextField getTextFieldServicoCPFServico() {
		return textFieldServicoCPFServico;
	}

	public JTextField getTextFieldServicoCodigoCadServ() {
		return textFieldServicoCodigoCadServ;
	}

	public JTextField getTextFieldServicoValorCadserv() {
		return textFieldServicoValorCadserv;
	}

	public JTextField getTextFieldReservaCPFCliente() {
		return textFieldReservaCPFCliente;
	}

	public JTextField getTextFieldReservaDataEntrada() {
		return textFieldReservaDataEntrada;
	}

	public JTextField getTextFieldReservaDataSaida() {
		return textFieldReservaDataSaida;
	}

	public JTextField getTextFieldReservaIDAcomodacao() {
		return textFieldReservaIDAcomodacao;
	}

	public JTextField getTextFieldReservaListaApts() {
		return textFieldReservaListaApts;
	}

	public JTextField getTextFieldAcomodacaoCadNum() {
		return textFieldAcomodacaoCadNum;
	}

	public JTextField getTextFieldAcomodacaoCadValor() {
		return textFieldAcomodacaoCadValor;
	}

	public JTextField getTextFieldAcomodaçãoBuscaEdit() {
		return textFieldAcomodaçãoBuscaEdit;
	}

	public JTextField getTextFieldAcomodacaoAlterarNum() {
		return textFieldAcomodacaoAlterarNum;
	}

	public JTextField getTextFieldAcomodacaoValorNovo() {
		return textFieldAcomodacaoValorNovo;
	}

	

}
