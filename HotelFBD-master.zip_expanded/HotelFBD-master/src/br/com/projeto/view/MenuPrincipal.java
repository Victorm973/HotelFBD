package br.com.projeto.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import br.com.projeto.entidades.Acomodacao;
import br.com.projeto.entidades.Cliente;
import br.com.projeto.entidades.Reserva;
import br.com.projeto.entidades.Servico;
import br.com.projeto.entidades.VinculoClienteServico;
import br.com.projeto.fachada.ICoreFacade;
import br.com.projeto.fachada.CoreFacade;


public class MenuPrincipal {


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


	private Cliente cliente;
	private Servico servico;
	private Acomodacao acomodacao;
	private Reserva reserva;
	private VinculoClienteServico vinculo;
	private static ICoreFacade fachada;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		fachada = new CoreFacade();

		new MenuPrincipal();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
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
	public MenuPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Hotel FBD");
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);

		JLabel lblMenuPrincipal = new JLabel("Menu Principal");
		lblMenuPrincipal.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblMenuPrincipal.setBounds(165, 11, 143, 29);
		frame.getContentPane().add(lblMenuPrincipal);

		JButton btnClientes = new JButton("Clientes");

		btnClientes.setBounds(10, 44, 106, 23);
		frame.getContentPane().add(btnClientes);

		JButton btnServico = new JButton("Serviços");

		btnServico.setBounds(126, 44, 106, 23);
		frame.getContentPane().add(btnServico);

		JButton btnReserva = new JButton("Reserva");

		btnReserva.setBounds(239, 44, 106, 23);
		frame.getContentPane().add(btnReserva);

		JButton btnAcomodacao = new JButton("Acomodação");

		btnAcomodacao.setBounds(355, 44, 119, 23);
		frame.getContentPane().add(btnAcomodacao);

		JLabel lblNewLabel = new JLabel("Bem Vindo!!!");
		lblNewLabel.setBounds(143, 208, 202, 47);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 36));

		//INICIO TABBEDPANE CLIENTE

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

		btnClienteRealizarCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e1) {

				cliente = new Cliente();

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

				textFieldClienteNome.setText("");
				textFieldClienteCPF.setText("");
				textFieldClienteRG.setText("");
				textFieldClienteTelefone.setText("");
				textFieldClienteRua.setText("");
				textFieldClienteBairro.setText("");
				textFieldClienteCidade.setText("");
				textFieldClienteCep.setText("");
				textFieldClienteUF.setText("");

			}
		});

		JPanel panelClientePesquisa = new JPanel();
		tabbedPaneCliente.addTab("Pesquisar Cliente", null, panelClientePesquisa, null);
		panelClientePesquisa.setLayout(null);

		JScrollPane scrollPaneListarClientes = new JScrollPane();
		scrollPaneListarClientes.setBounds(10, 39, 430, 183);
		panelClientePesquisa.add(scrollPaneListarClientes);

		DefaultListModel<String> modeloCliente = new DefaultListModel<String>();
		JList<String> textAreaClienteInfoClienteBusca = new JList<String>(modeloCliente);

		scrollPaneListarClientes.setViewportView(textAreaClienteInfoClienteBusca);
		textAreaClienteInfoClienteBusca.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JButton btnClienteListarTodos = new JButton("Listar Todos os Clientes");
		btnClienteListarTodos.setBounds(268, 8, 172, 23);
		panelClientePesquisa.add(btnClienteListarTodos);
		tabbedPaneCliente.setVisible(false);

		btnClienteListarTodos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Cliente> cliente = new ArrayList<Cliente>();
				cliente = fachada.getClientes();
				modeloCliente.clear();

				for(int i = 0; i < cliente.size();i++){

					modeloCliente.addElement("     "+cliente.get(i).getId() + "     |     " + cliente.get(i).getCpf() + "     |     " + cliente.get(i).getNome() + "\n");
				}

			}
		});


		JButton btnClienteEditarInformacoes = new JButton("Editar Informações");
		btnClienteEditarInformacoes.setBounds(279, 233, 161, 23);
		panelClientePesquisa.add(btnClienteEditarInformacoes);
		
		JLabel lblIdCpf = new JLabel(" ID     |          CPF          |     Nome");
		lblIdCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdCpf.setBounds(10, 11, 430, 14);
		panelClientePesquisa.add(lblIdCpf);
		
		JButton btnMostrarDbitos = new JButton("Mostrar D\u00E9bitos");
		btnMostrarDbitos.setBounds(10, 233, 166, 23);
		panelClientePesquisa.add(btnMostrarDbitos);
		tabbedPaneCliente.setVisible(false);

		btnClienteEditarInformacoes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Cliente> cliente = new ArrayList<Cliente>();
				cliente = fachada.getClientes();

				for(int i = 0; i < cliente.size();i++){

					if(textAreaClienteInfoClienteBusca.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null, "Nenhum Cliente Selecionado!!! \n Selecione algum Cliente!");
						break;
					}

					if(textAreaClienteInfoClienteBusca.getSelectedValue().contains(cliente.get(i).getCpf())){


						TelaAlterarCliente telaCliente = new TelaAlterarCliente();

						telaCliente.setId(cliente.get(i).getId());
						telaCliente.getTextFieldClienteNome().setText(cliente.get(i).getNome());;
						telaCliente.getTextFieldClienteCPF().setText(cliente.get(i).getCpf());
						telaCliente.getTextFieldClienteRG().setText(cliente.get(i).getIdentidade());
						telaCliente.getTextFieldClienteTelefone().setText(cliente.get(i).getTelefone());
						telaCliente.getTextFieldClienteRua().setText(cliente.get(i).getRua());
						telaCliente.getTextFieldClienteBairro().setText(cliente.get(i).getBairro());
						telaCliente.getTextFieldClienteCidade().setText(cliente.get(i).getCidade());
						telaCliente.getTextFieldClienteUF().setText(cliente.get(i).getUf());
						telaCliente.getTextFieldClienteCep().setText(cliente.get(i).getCep());

					}
				}
			}
		});
		
		btnMostrarDbitos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				List<Cliente> cliente = new ArrayList<Cliente>();
				cliente = fachada.getClientes();

				for(int i = 0; i < cliente.size();i++){

					if(textAreaClienteInfoClienteBusca.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null, "Nenhum Cliente Selecionado!!! \n Selecione algum Cliente!");
						break;
					}

					if(textAreaClienteInfoClienteBusca.getSelectedValue().contains(cliente.get(i).getCpf())){
				
							TelaListaVinculos telaListVinc = new TelaListaVinculos();
				
							telaListVinc.getLblNomedocliente().setText(cliente.get(i).getNome());
							
							List<VinculoClienteServico> vinculo = new ArrayList<VinculoClienteServico>();
							
							double aux = 0;
							
							vinculo = fachada.getVinculo(cliente.get(i));
							
							for(int g = 0; g < vinculo.size(); g++) {
								
								telaListVinc.getDefaultVinculo().addElement(vinculo.get(g).getNomeServicos());
								aux += vinculo.get(g).getValor();
								
							}
							
							
							telaListVinc.getTextFieldVinculoValores().setText(String.valueOf(aux));
							
				
					}
					
				}
				
			}
		});

		// FINAL TABBED PANE CLIENTE INICIO TABBED PANE SERVIÇOS

		JTabbedPane tabbedPaneServicos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneServicos.setBounds(10, 78, 464, 302);
		frame.getContentPane().add(tabbedPaneServicos);

		JPanel panelCadastrarServico = new JPanel();
		tabbedPaneServicos.addTab("Cadastrar Novo Serviço", null, panelCadastrarServico, null);
		panelCadastrarServico.setLayout(null);

		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 11, 57, 14);
		panelCadastrarServico.add(lblCodigo);

		textFieldServicoCodigoCadServ = new JTextField();
		textFieldServicoCodigoCadServ.setBounds(74, 8, 70, 20);
		panelCadastrarServico.add(textFieldServicoCodigoCadServ);
		textFieldServicoCodigoCadServ.setColumns(10);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(154, 11, 41, 14);
		panelCadastrarServico.add(lblValor);

		textFieldServicoValorCadserv = new JTextField();
		textFieldServicoValorCadserv.setBounds(205, 8, 81, 20);
		panelCadastrarServico.add(textFieldServicoValorCadserv);
		textFieldServicoValorCadserv.setColumns(10);

		JLabel lblDescricao = new JLabel("Descrição");
		lblDescricao.setBounds(10, 36, 64, 14);
		panelCadastrarServico.add(lblDescricao);

		JTextArea textAreaServicoDescriçãoCadServ = new JTextArea();
		textAreaServicoDescriçãoCadServ.setBounds(10, 61, 430, 150);
		panelCadastrarServico.add(textAreaServicoDescriçãoCadServ);

		JButton btnServicoCadastrarServico = new JButton("Cadastrar Serviço");
		btnServicoCadastrarServico.setBounds(296, 7, 144, 23);
		panelCadastrarServico.add(btnServicoCadastrarServico);

		btnServicoCadastrarServico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					servico = new Servico();

					servico.setCodigo(Integer.parseInt(textFieldServicoCodigoCadServ.getText()));
					servico.setValor(Double.parseDouble(textFieldServicoValorCadserv.getText()));
					servico.setDescricao(textAreaServicoDescriçãoCadServ.getText());

					fachada.salvarOuEditarServico(servico);

					textFieldServicoCodigoCadServ.setText("");
					textFieldServicoValorCadserv.setText("");
					textAreaServicoDescriçãoCadServ.setText("");


				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios ou Inválidos!!!");

				}
			}
		});

		JPanel panelSolicitarServico = new JPanel();
		tabbedPaneServicos.addTab("Solicitar Servico", null, panelSolicitarServico, null);
		panelSolicitarServico.setLayout(null);

		JLabel lblIdDoServio = new JLabel("Id do Serviço Solicitado");
		lblIdDoServio.setBounds(10, 11, 135, 14);
		panelSolicitarServico.add(lblIdDoServio);

		textFieldServicoIDServico = new JTextField();
		textFieldServicoIDServico.setBounds(166, 8, 100, 20);
		panelSolicitarServico.add(textFieldServicoIDServico);
		textFieldServicoIDServico.setColumns(10);

		JLabel lblCpfDoCliente = new JLabel("CPF do Cliente Solicitante");
		lblCpfDoCliente.setBounds(10, 36, 146, 14);
		panelSolicitarServico.add(lblCpfDoCliente);

		textFieldServicoCPFServico = new JTextField();
		textFieldServicoCPFServico.setBounds(166, 33, 100, 20);
		panelSolicitarServico.add(textFieldServicoCPFServico);
		textFieldServicoCPFServico.setColumns(11);

		JButton btnServicoRegistrarServico = new JButton("Registrar Serviço");
		btnServicoRegistrarServico.setBounds(276, 11, 164, 39);
		panelSolicitarServico.add(btnServicoRegistrarServico);

		btnServicoRegistrarServico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
				
				vinculo = new VinculoClienteServico();

				vinculo.setIdServico(Long.parseLong(textFieldServicoIDServico.getText()));
				vinculo.setCpfCliente(textFieldServicoCPFServico.getText());

				fachada.salvarOuEditarVinculoClienteServico(vinculo);
				
				textFieldServicoIDServico.setText("");
				textFieldServicoCPFServico.setText("");

				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios ou Inválidos!!!");

				}
			}
		});

		JPanel panelListaServico = new JPanel();
		tabbedPaneServicos.addTab("Lista de Serviços Disponiveis", null, panelListaServico, null);
		panelListaServico.setLayout(null);

		JScrollPane scrollPaneServico = new JScrollPane();
		scrollPaneServico.setBounds(10, 36, 439, 184);
		panelListaServico.add(scrollPaneServico);

		DefaultListModel<String> modeloServico = new DefaultListModel<String>();
		JList<String> textAreaServicoListaServicos = new JList<String>(modeloServico);

		textAreaServicoListaServicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneServico.setViewportView(textAreaServicoListaServicos);

		JButton btnServicoListar = new JButton("Listar");
		btnServicoListar.setBounds(33, 231, 122, 23);
		panelListaServico.add(btnServicoListar);

		btnServicoListar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				List<Servico> servico = new ArrayList<Servico>();
				servico = fachada.getServico();

				modeloServico.clear();

				for(int i = 0; i < servico.size();i++){

					modeloServico.addElement("  "+servico.get(i).getId() + "    |               " + servico.get(i).getCodigo() + "                 |         " + servico.get(i).getValor() + "          |          " + servico.get(i).getDescricao() + "\n");
				}
			}
		});

		JButton btnAlterarServico = new JButton("Alterar Serviço");
		btnAlterarServico.setBounds(296, 231, 122, 23);
		panelListaServico.add(btnAlterarServico);
		
		JLabel lblNewLabel1 = new JLabel("ID   |       C\u00F3digo       |     Valor      |      Descri\u00E7\u00E3o");
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel1.setBounds(10, 11, 439, 14);
		panelListaServico.add(lblNewLabel1);

		btnAlterarServico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Servico> servico = new ArrayList<Servico>();
				servico = fachada.getServico();

				for(int i = 0; i < servico.size();i++){

					if(textAreaServicoListaServicos.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null, "Nenhum Serviço Selecionado!!! \n Selecione algum Serviço!");
						break;
					}

					if(textAreaServicoListaServicos.getSelectedValue().contains(Long.toString(servico.get(i).getId()))){


						TelaAlterarServico telaServico = new TelaAlterarServico();

						telaServico.getTextFieldServicoCodigoServ().setText(Integer.toString(servico.get(i).getCodigo()));;
						telaServico.getTextFieldServicoValorServ().setText(Double.toString(servico.get(i).getValor()));
						telaServico.getTextAreaServicoDescriçãoServ().setText(servico.get(i).getDescricao());
						telaServico.setId(servico.get(i).getId());

					}
				}
			}
		});
		
		tabbedPaneServicos.setVisible(false);


		//FINAL TABBED PANE SERVIÇOS INICIO RESERVA

		JTabbedPane tabbedPaneReserva = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneReserva.setBounds(10, 78, 464, 302);
		frame.getContentPane().add(tabbedPaneReserva);

		JPanel panelRealizarReserva = new JPanel();
		tabbedPaneReserva.addTab("Reservar Acomodação", null, panelRealizarReserva, null);
		panelRealizarReserva.setLayout(null);

		JLabel lblCpfDoCliente2 = new JLabel("CPF do Cliente");
		lblCpfDoCliente2.setBounds(49, 17, 99, 14);
		panelRealizarReserva.add(lblCpfDoCliente2);

		textFieldReservaCPFCliente = new JTextField();
		textFieldReservaCPFCliente.setBounds(158, 14, 109, 20);
		panelRealizarReserva.add(textFieldReservaCPFCliente);
		textFieldReservaCPFCliente.setColumns(10);

		JLabel lblDataDeEntrada = new JLabel("Data de Entrada");
		lblDataDeEntrada.setBounds(39, 42, 109, 14);
		panelRealizarReserva.add(lblDataDeEntrada);

		textFieldReservaDataEntrada = new JTextField();
		textFieldReservaDataEntrada.setBounds(158, 39, 109, 20);
		panelRealizarReserva.add(textFieldReservaDataEntrada);
		textFieldReservaDataEntrada.setColumns(10);

		JLabel lblDataDeSaida = new JLabel("Data de Saida Prevista");
		lblDataDeSaida.setBounds(10, 67, 145, 14);
		panelRealizarReserva.add(lblDataDeSaida);

		textFieldReservaDataSaida = new JTextField();
		textFieldReservaDataSaida.setBounds(158, 64, 109, 20);
		panelRealizarReserva.add(textFieldReservaDataSaida);
		textFieldReservaDataSaida.setColumns(10);

		JLabel lblIDDeAcomodao = new JLabel("ID da Acomodação");
		lblIDDeAcomodao.setBounds(29, 92, 129, 14);
		panelRealizarReserva.add(lblIDDeAcomodao);

		textFieldReservaIDAcomodacao = new JTextField();
		textFieldReservaIDAcomodacao.setBounds(158, 89, 109, 20);
		panelRealizarReserva.add(textFieldReservaIDAcomodacao);
		textFieldReservaIDAcomodacao.setColumns(10);

		JButton btnRealizarReserva = new JButton("Realizar Reserva");
		btnRealizarReserva.setBounds(303, 17, 135, 39);
		panelRealizarReserva.add(btnRealizarReserva);

		btnRealizarReserva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					reserva = new Reserva();

					reserva.setCpfCliente(textFieldReservaCPFCliente.getText());
					reserva.setIdAcomodacao(Long.parseLong(textFieldReservaIDAcomodacao.getText()));

					String strDataInicio = textFieldReservaDataEntrada.getText();
					String strDataFim = textFieldReservaDataSaida.getText();

					System.out.println(textFieldReservaDataEntrada.getText());

					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


					Date dateI = sdf.parse(strDataInicio);

					Calendar c = Calendar.getInstance();
					c.setTime(dateI);
					reserva.setInicioReserva(dateI);

					Date dateF = sdf.parse(strDataFim);
					reserva.setFimReserva(dateF);

				} catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios ou Inválidos!!!");

				}

				fachada.salvarOuEditarReserva(reserva);

				textFieldReservaCPFCliente.setText("");
				textFieldReservaIDAcomodacao.setText("");
				textFieldReservaDataEntrada.setText("");
				textFieldReservaDataSaida.setText("");			

			}
		});
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(10, 170, 430, 93);
		panelRealizarReserva.add(scrollPane2);

		DefaultListModel<String> modeloReservaAcomodacao = new DefaultListModel<String>();
		JList<String> textFieldReservaListaApts = new JList<String>(modeloReservaAcomodacao);
		textFieldReservaListaApts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane2.setViewportView(textFieldReservaListaApts);

		JLabel lblAcomodaesDisponveis = new JLabel("Acomodações Disponíveis");
		lblAcomodaesDisponveis.setBounds(158, 120, 164, 14);
		panelRealizarReserva.add(lblAcomodaesDisponveis);

		JButton btnReservaListarAcomodacoes = new JButton("Listar Acomodações");
		btnReservaListarAcomodacoes.setBounds(303, 80, 135, 39);
		panelRealizarReserva.add(btnReservaListarAcomodacoes);
		
		JLabel lblIdQuartos = new JLabel(" ID  |  N\u00BA do Quarto  |   Valor Di\u00E1ria  |   Descri\u00E7\u00E3o");
		lblIdQuartos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdQuartos.setBounds(10, 145, 428, 14);
		panelRealizarReserva.add(lblIdQuartos);

		JPanel panelReservasRealizadas = new JPanel();
		tabbedPaneReserva.addTab("Lista de Reservas Realizadas", null, panelReservasRealizadas, null);
		panelReservasRealizadas.setLayout(null);

		JScrollPane scrollPaneReserva = new JScrollPane();
		scrollPaneReserva.setBounds(10, 36, 439, 193);
		panelReservasRealizadas.add(scrollPaneReserva);

		DefaultListModel<String> modeloReserva = new DefaultListModel<String>();
		JList<String> textAreaReservaListaFeitas = new JList<String>(modeloReserva);
		textAreaReservaListaFeitas.setFont(new Font("Tahoma", Font.BOLD, 12));

		textAreaReservaListaFeitas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneReserva.setViewportView(textAreaReservaListaFeitas);

		JButton btnReservaListarReservas = new JButton("Listar Reservas");
		btnReservaListarReservas.setBounds(31, 240, 125, 23);
		panelReservasRealizadas.add(btnReservaListarReservas);

		JButton btnReservaAtualizar = new JButton("Atualizar Reserva");
		btnReservaAtualizar.setBounds(303, 240, 135, 23);
		panelReservasRealizadas.add(btnReservaAtualizar);
		
		JLabel lblIdC = new JLabel("ID  |     Entrada     |       Sa\u00EDda       |     CPF Cliente    |  ID Acomodação");
		lblIdC.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdC.setBounds(10, 11, 439, 14);
		panelReservasRealizadas.add(lblIdC);
		

		btnReservaListarReservas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Reserva> reserva = new ArrayList<Reserva>();
				reserva = fachada.getReserva();

				modeloReserva.clear();

				for(int i = 0; i < reserva.size();i++){

					modeloReserva.addElement(reserva.get(i).getId() + " | " + reserva.get(i).getInicioReserva() + "  |  " + reserva.get(i).getFimReserva() + "  |  " + reserva.get(i).getCpfCliente() + "  |      " + reserva.get(i).getIdAcomodacao() + "\n");
				}

			}
		});

		btnReservaAtualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				List<Reserva> reserva = new ArrayList<Reserva>();
				reserva = fachada.getReserva();

				for(int i = 0; i < reserva.size();i++){

					if(textAreaReservaListaFeitas.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null, "Nenhuma Reserva Selecionada!!! \n Selecione alguma Reserva!");
						break;
					}

					if(textAreaReservaListaFeitas.getSelectedValue().contains(Long.toString(reserva.get(i).getId()))){

						System.out.println(i);

						TelaAlterarReserva telaReserva = new TelaAlterarReserva();

						String strDataInicio = reserva.get(i).getInicioReserva().toString();
						String strDataFim = reserva.get(i).getFimReserva().toString();

						telaReserva.getTextFieldIdReserva().setText(Long.toString(reserva.get(i).getId()));
						telaReserva.getTextFieldReservaDataEntrada().setText(strDataInicio);
						telaReserva.getTextFieldReservaDataSaida().setText(strDataFim);
						telaReserva.getTextFieldReservaIdAcomodacao().setText(Long.toString(reserva.get(i).getIdAcomodacao()));
						telaReserva.setId(reserva.get(i).getId());

					}
				}							
			}
		});
		
		btnReservaListarAcomodacoes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				List<Acomodacao> acomodacao = new ArrayList<Acomodacao>();
				acomodacao = fachada.getAcomodacao();
				modeloReservaAcomodacao.clear();

				for(int i = 0; i < acomodacao.size();i++){

					modeloReservaAcomodacao.addElement(acomodacao.get(i).getId() + "     |     " + acomodacao.get(i).getNumero() + "     |     " + acomodacao.get(i).getValor_diaria() + "     |     " + acomodacao.get(i).getDescricao() + "\n");
				}
			}
		});

		tabbedPaneReserva.setVisible(false);


		//FINAL TABBED PANE RESERVA INICIO ACOMODAÇÃO

		JTabbedPane tabbedPaneAcomodacao = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneAcomodacao.setBounds(10, 78, 464, 302);
		frame.getContentPane().add(tabbedPaneAcomodacao);

		JPanel panelAcomodacaoCadastro = new JPanel();
		tabbedPaneAcomodacao.addTab("Cadastrar Acomodação", null, panelAcomodacaoCadastro, null);
		panelAcomodacaoCadastro.setLayout(null);

		JLabel lblNumeroDaAcomodao = new JLabel("Numero da Acomodação");
		lblNumeroDaAcomodao.setBounds(10, 11, 152, 14);
		panelAcomodacaoCadastro.add(lblNumeroDaAcomodao);

		JLabel lblValorDaAcomodao = new JLabel("Valor da Acomodação");
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

		btnAcomodacaoCriarAcomodao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					acomodacao = new Acomodacao();

					acomodacao.setNumero(Integer.parseInt(textFieldAcomodacaoCadNum.getText()));
					acomodacao.setValor_diaria(Double.parseDouble(textFieldAcomodacaoCadValor.getText()));
					acomodacao.setDescricao(textAreaAcomodacaoCadDesc.getText());
					acomodacao.setDisponivel(true);

					fachada.salvarOuEditarAcomodacao(acomodacao);

					textFieldAcomodacaoCadNum.setText("");
					textFieldAcomodacaoCadValor.setText("");
					textAreaAcomodacaoCadDesc.setText("");

				} catch (Exception e2) {

					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "ERRO! \n Campos Vazios ou Inválidos!!!");

				}

			}
		});

		JLabel lbldiaria = new JLabel("(Diária)");
		lbldiaria.setBounds(318, 36, 58, 14);
		panelAcomodacaoCadastro.add(lbldiaria);

		JPanel panelAcomodacaoListar = new JPanel();
		tabbedPaneAcomodacao.addTab("Listar Acomodações", null, panelAcomodacaoListar, null);
		panelAcomodacaoListar.setLayout(null);

		JScrollPane scrollPaneAcomodacao = new JScrollPane();
		scrollPaneAcomodacao.setBounds(10, 35, 439, 189);
		panelAcomodacaoListar.add(scrollPaneAcomodacao);

		DefaultListModel<String> modeloAcomodacao = new DefaultListModel<String>();
		JList<String> textAreaAcomodacaoListar = new JList<String>(modeloAcomodacao);

		textAreaAcomodacaoListar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPaneAcomodacao.setViewportView(textAreaAcomodacaoListar);

		JButton btnAcomodacaoListar = new JButton("Listar");
		btnAcomodacaoListar.setBounds(37, 235, 125, 23);
		panelAcomodacaoListar.add(btnAcomodacaoListar);

		JButton btnAcomodacaoAlterar = new JButton("Alterar");
		btnAcomodacaoAlterar.setBounds(289, 235, 125, 23);
		panelAcomodacaoListar.add(btnAcomodacaoAlterar);
		
		JLabel lblIdNuba = new JLabel(" ID  |  N\u00BA do Quarto  |   Valor Di\u00E1ria  |        Descri\u00E7\u00E3o");
		lblIdNuba.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdNuba.setBounds(10, 11, 439, 14);
		panelAcomodacaoListar.add(lblIdNuba);

		btnAcomodacaoListar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Acomodacao> acomodacao = new ArrayList<Acomodacao>();
				acomodacao = fachada.getAcomodacao();
				modeloAcomodacao.clear();

				for(int i = 0; i < acomodacao.size();i++){

					modeloAcomodacao.addElement("  "+acomodacao.get(i).getId() + "    |             " + acomodacao.get(i).getNumero() + "              |          " + acomodacao.get(i).getValor_diaria() + "          |      " + acomodacao.get(i).getDescricao() + "\n");
				}
			}				

		});

		btnAcomodacaoAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				List<Acomodacao> acomodacao = new ArrayList<Acomodacao>();
				acomodacao = fachada.getAcomodacao();

				for(int i = 0; i < acomodacao.size();i++){

					if(textAreaAcomodacaoListar.isSelectionEmpty()){
						JOptionPane.showMessageDialog(null, "Nenhuma Acomodação Selecionada!!! \n Selecione alguma Acomodação!");
						break;
					}

					if(textAreaAcomodacaoListar.getSelectedValue().contains(Long.toString(acomodacao.get(i).getId()))){

						TelaAlterarAcomodacao telaAcomodacao = new TelaAlterarAcomodacao();

						telaAcomodacao.getTextFieldAcomodacaoNum().setText(Integer.toString(acomodacao.get(i).getNumero()));;
						telaAcomodacao.getTextFieldAcomodacaoValor().setText(Double.toString(acomodacao.get(i).getValor_diaria()));
						telaAcomodacao.getTextAreaAcomodacaoDesc().setText(acomodacao.get(i).getDescricao());
						telaAcomodacao.setId(acomodacao.get(i).getId());

					}
				}				
			}
		});

		tabbedPaneAcomodacao.setVisible(false);

		//FINAL DO TABBED PANE DA ACOMODAÇÃO

		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblNewLabel.setVisible(false);
				tabbedPaneAcomodacao.setVisible(false);
				tabbedPaneReserva.setVisible(false);
				tabbedPaneServicos.setVisible(false);
				tabbedPaneCliente.setVisible(true);

			}
		});

		btnAcomodacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				lblNewLabel.setVisible(false);
				tabbedPaneReserva.setVisible(false);
				tabbedPaneServicos.setVisible(false);
				tabbedPaneCliente.setVisible(false);
				tabbedPaneAcomodacao.setVisible(true);
			}
		});

		btnServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblNewLabel.setVisible(false);
				tabbedPaneReserva.setVisible(false);
				tabbedPaneCliente.setVisible(false);
				tabbedPaneAcomodacao.setVisible(false);
				tabbedPaneServicos.setVisible(true);

			}
		});

		btnReserva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblNewLabel.setVisible(false);
				tabbedPaneCliente.setVisible(false);
				tabbedPaneAcomodacao.setVisible(false);
				tabbedPaneServicos.setVisible(false);
				tabbedPaneReserva.setVisible(true);


			}
		});
	}


}
