package br.com.projeto.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultListModel;
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
import br.com.projeto.entidades.Servico;
import br.com.projeto.entidades.VinculoClienteServico;

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

		

	}
}
