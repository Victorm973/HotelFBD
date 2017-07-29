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
		
		
		
		textFieldReservaListaApts = new JTextField();
		textFieldReservaListaApts.setBounds(10, 145, 430, 118);
		panelRealizarReserva.add(textFieldReservaListaApts);
		textFieldReservaListaApts.setColumns(10);

		JLabel lblAcomodaesDisponveis = new JLabel("Acomodações Disponíveis");
		lblAcomodaesDisponveis.setBounds(158, 120, 164, 14);
		panelRealizarReserva.add(lblAcomodaesDisponveis);
		
		JButton btnReservaListarAcomodacoes = new JButton("Listar Acomodações");
		btnReservaListarAcomodacoes.setBounds(303, 80, 135, 39);
		panelRealizarReserva.add(btnReservaListarAcomodacoes);

		JPanel panelReservasRealizadas = new JPanel();
		tabbedPaneReserva.addTab("Lista de Reservas Realizadas", null, panelReservasRealizadas, null);
		panelReservasRealizadas.setLayout(null);

		JTextArea textAreaReservaListaFeitas = new JTextArea();
		textAreaReservaListaFeitas.setBounds(10, 11, 430, 201);
		panelReservasRealizadas.add(textAreaReservaListaFeitas);
		
		JButton btnReservaListarReservas = new JButton("Listar Reservas");
		btnReservaListarReservas.setBounds(164, 223, 125, 40);
		panelReservasRealizadas.add(btnReservaListarReservas);
		tabbedPaneReserva.setVisible(false);


	}
}
