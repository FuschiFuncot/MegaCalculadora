import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interface_teste extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;
	private JTextField txtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interface_teste frame = new interface_teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interface_teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite um  ano");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 36, 124, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 205, 50, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situação");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 236, 66, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSituaçao = new JLabel("vazio");
		lblSituaçao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituaçao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSituaçao.setBounds(86, 236, 174, 14);
		contentPane.add(lblSituaçao);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIdade.setBounds(88, 205, 46, 14);
		contentPane.add(lblIdade);
		
		txtNasc = new JTextField();
		txtNasc.setBounds(176, 83, 86, 20);
		contentPane.add(txtNasc);
		txtNasc.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setBounds(144, 36, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ano = Integer.parseInt(txtAno.getText());
				int nascimento = Integer.parseInt(txtNasc.getText());
				int idade = ano - nascimento;
				
				lblIdade.setText(Integer.toString(idade));
				String sit = ((idade>=16 && idade<18) || (idade>70))?"Adolescente":"Velho";
				
				lblSituaçao.setText(sit);			
			}
			
			//testando
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalc.setBounds(144, 143, 136, 23);
		contentPane.add(btnCalc);
		
		JLabel lblNewLabel_3 = new JLabel("Ano de nascimento");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 80, 161, 20);
		contentPane.add(lblNewLabel_3);
		


	}
}
