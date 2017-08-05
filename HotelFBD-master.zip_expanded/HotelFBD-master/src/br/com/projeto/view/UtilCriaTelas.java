package br.com.projeto.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.Reserva;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

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

		JTabbedPane tabbedPaneCliente = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneCliente.setBounds(10, 78, 464, 302);
		frame.getContentPane().add(tabbedPaneCliente);

		JPanel panelCliente = new JPanel();
		tabbedPaneCliente.addTab("Cadastrar Novo Cliente", null, panelCliente, null);
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

		JButton btnClienteRealizarCadastro = new JButton("Realizar Cadastro");
		btnClienteRealizarCadastro.setBounds(174, 215, 138, 23);
		panelCliente.add(btnClienteRealizarCadastro);

	
		JPanel panelClientePesquisa = new JPanel();
		tabbedPaneCliente.addTab("Pesquisar Cliente", null, panelClientePesquisa, null);
		panelClientePesquisa.setLayout(null);

		JLabel lblDigiteOCpf = new JLabel("Digite o CPF do Cliente");
		lblDigiteOCpf.setBounds(10, 11, 151, 14);
		panelClientePesquisa.add(lblDigiteOCpf);

		textFieldClienteBuscarCPF = new JTextField();
		textFieldClienteBuscarCPF.setBounds(144, 8, 137, 20);
		panelClientePesquisa.add(textFieldClienteBuscarCPF);
		textFieldClienteBuscarCPF.setColumns(11);

		JButton btnClienteBuscar = new JButton("Buscar");
		btnClienteBuscar.setBounds(291, 7, 89, 23);
		panelClientePesquisa.add(btnClienteBuscar);
		
		JScrollPane scrollPaneListarClientes = new JScrollPane();
		scrollPaneListarClientes.setBounds(10, 39, 430, 183);
		panelClientePesquisa.add(scrollPaneListarClientes);

		JList textAreaClienteInfoClienteBusca = new JList();
		scrollPaneListarClientes.setViewportView(textAreaClienteInfoClienteBusca);
		textAreaClienteInfoClienteBusca.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnClienteListarTodos = new JButton("Listar Todos os Clientes");
		btnClienteListarTodos.setBounds(10, 233, 172, 23);
		panelClientePesquisa.add(btnClienteListarTodos);
		tabbedPaneCliente.setVisible(false);


		JButton btnClienteEditarInformacoes = new JButton("Editar Informações");
		btnClienteEditarInformacoes.setBounds(279, 233, 161, 23);
		panelClientePesquisa.add(btnClienteEditarInformacoes);
		tabbedPaneCliente.setVisible(false);


	}
}
