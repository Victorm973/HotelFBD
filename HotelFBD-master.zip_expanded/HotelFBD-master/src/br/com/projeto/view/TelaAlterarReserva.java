package br.com.projeto.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.projeto.entidades.Reserva;
import br.com.projeto.fachada.CoreFacade;
import br.com.projeto.fachada.ICoreFacade;

public class TelaAlterarReserva {
	
	private JFrame frameReserva;
	
	private JTextField textFieldReservaDataEntrada;
	private JTextField textFieldReservaDataSaida;
	private JTextField textFieldReservaIdAcomodacao;
	private JTextField textFieldIdReserva;
	
	private Long Id;
	
	private Reserva reserva;
	private static ICoreFacade fachada;

	public TelaAlterarReserva() {
		
		frameReserva = new JFrame();
		frameReserva.setTitle("Atualizar Reserva");
		
		fachada = new CoreFacade();

		JPanel panelalterarReserva = new JPanel();
		panelalterarReserva.setLayout(null);

		JLabel lblIdDaReserva = new JLabel("ID da Reserva");
		lblIdDaReserva.setBounds(49, 27, 69, 14);
		panelalterarReserva.add(lblIdDaReserva);
		
		textFieldIdReserva = new JTextField();
		textFieldIdReserva.setEditable(false);
		textFieldIdReserva.setBounds(158, 24, 109, 20);
		textFieldIdReserva.setColumns(10);
		panelalterarReserva.add(textFieldIdReserva);
				
		JLabel lblDataDeEntrada = new JLabel("Data de Entrada");
		lblDataDeEntrada.setBounds(39, 58, 79, 14);
		panelalterarReserva.add(lblDataDeEntrada);

		textFieldReservaDataEntrada = new JTextField();
		textFieldReservaDataEntrada.setBounds(158, 55, 109, 20);
		panelalterarReserva.add(textFieldReservaDataEntrada);
		textFieldReservaDataEntrada.setColumns(10);

		JLabel lblDataDeSaida = new JLabel("Data de Saida Prevista");
		lblDataDeSaida.setBounds(10, 89, 109, 14);
		panelalterarReserva.add(lblDataDeSaida);

		textFieldReservaDataSaida = new JTextField();
		textFieldReservaDataSaida.setBounds(158, 86, 109, 20);
		panelalterarReserva.add(textFieldReservaDataSaida);
		textFieldReservaDataSaida.setColumns(10);

		JLabel lblIDDeAcomodao = new JLabel("ID da Acomodação");
		lblIDDeAcomodao.setBounds(28, 120, 90, 14);
		panelalterarReserva.add(lblIDDeAcomodao);
		

		textFieldReservaIdAcomodacao = new JTextField();
		textFieldReservaIdAcomodacao.setBounds(158, 117, 109, 20);
		panelalterarReserva.add(textFieldReservaIdAcomodacao);
		textFieldReservaIdAcomodacao.setColumns(10);

		JButton btnAlterarReserva = new JButton("Atualizar Reserva");
		btnAlterarReserva.setBounds(77, 197, 151, 23);
		panelalterarReserva.add(btnAlterarReserva);
		
		btnAlterarReserva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				reserva = new Reserva();

				reserva.setId(getId());
				reserva.setIdAcomodacao(Long.parseLong(textFieldReservaIdAcomodacao.getText()));

				String strDataInicio = textFieldReservaDataEntrada.getText();
				String strDataFim = textFieldReservaDataSaida.getText();

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

				try {
					Date dateI = sdf.parse(strDataInicio);
					
					Calendar c = Calendar.getInstance();
					c.setTime(dateI);
					reserva.setInicioReserva(dateI);

				} catch (Exception e1) {
					e1.printStackTrace();
				}

				try {
					Date dateF = sdf.parse(strDataFim);
					reserva.setFimReserva(dateF);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
				fachada.salvarOuEditarReserva(reserva);
			}
		});
		
		frameReserva.getContentPane().add(panelalterarReserva);
		frameReserva.setSize(315, 300);
		frameReserva.setLocationRelativeTo(null);
		frameReserva.setVisible(true);
		frameReserva.setResizable(false);
		
		
		
	}

	public JTextField getTextFieldReservaDataEntrada() {
		return textFieldReservaDataEntrada;
	}

	public void setTextFieldReservaDataEntrada(JTextField textFieldReservaDataEntrada) {
		this.textFieldReservaDataEntrada = textFieldReservaDataEntrada;
	}

	public JTextField getTextFieldReservaDataSaida() {
		return textFieldReservaDataSaida;
	}

	public void setTextFieldReservaDataSaida(JTextField textFieldReservaDataSaida) {
		this.textFieldReservaDataSaida = textFieldReservaDataSaida;
	}

	public JTextField getTextFieldReservaIdAcomodacao() {
		return textFieldReservaIdAcomodacao;
	}

	public void setTextFieldReservaIdAcomodacao(JTextField textFieldReservaIdAcomodacao) {
		this.textFieldReservaIdAcomodacao = textFieldReservaIdAcomodacao;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public JTextField getTextFieldIdReserva() {
		return textFieldIdReserva;
	}

	public void setTextFieldIdReserva(JTextField textFieldIdReserva) {
		this.textFieldIdReserva = textFieldIdReserva;
	}
	
	
}
