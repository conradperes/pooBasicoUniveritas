package internacionalizacaoGabarito;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternacioanalizacaoGabarito extends javax.swing.JFrame {

	private static final long serialVersionUID = 7127115087411877599L;

	/** Cria o Form Princiapal */
	public InternacioanalizacaoGabarito() {
		initComponents();

		internacionaliza();
	}

	public void internacionaliza() {
		Locale locale = Locale.getDefault();
		ResourceBundle palavras = ResourceBundle.getBundle(
				"infnet.internacionalizacaoGabarito.linguas.Linguas", locale);

		this.setTitle(palavras.getString("titulo"));
		jL_Lingua.setText(palavras.getString("lingua"));
		jL_Nome.setText(palavras.getString("nome"));
		jL_Telefone.setText(palavras.getString("telefone"));
		jL_Email.setText(palavras.getString("email"));
	}

	/**
	 * M?todo usado para inciar os componentes, assim como desenh?-los
	 */
	@SuppressWarnings("unchecked")
	private void initComponents() {

		jL_Nome = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jL_Telefone = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jL_Email = new javax.swing.JLabel();
		jL_Lingua = new javax.swing.JLabel();
		jCB_Lingua = new javax.swing.JComboBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jL_Nome.setText("Nome");
		jL_Nome.setName("jL_Nome"); // NOI18N

		jTextField1.setName("jTextField1"); // NOI18N

		jTextField2.setName("jTextField2"); // NOI18N

		jL_Telefone.setText("Telefone");
		jL_Telefone.setName("jL_Telefone"); // NOI18N

		jTextField3.setName("jTextField3"); // NOI18N

		jL_Email.setText("Email");
		jL_Email.setName("jL_Email"); // NOI18N

		jL_Lingua.setText("L?ngua");
		jL_Lingua.setName("jL_Lingua"); // NOI18N

		jCB_Lingua.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"pt_BR", "en_US", "fr_FR", "de_DE" }));
		jCB_Lingua.setName("jCB_Lingua"); // NOI18N
		jCB_Lingua.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCB_LinguaActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jL_Nome)
												.addComponent(jL_Telefone)
												.addComponent(jL_Email)
												.addComponent(jL_Lingua))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														104, Short.MAX_VALUE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														104, Short.MAX_VALUE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														104, Short.MAX_VALUE)
												.addComponent(
														jCB_Lingua,
														javax.swing.GroupLayout.Alignment.TRAILING,
														0, 104, Short.MAX_VALUE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jL_Lingua)
												.addComponent(
														jCB_Lingua,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jL_Nome)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jL_Telefone)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jL_Email)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));

		pack();
	}

	private void jCB_LinguaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jCB_LinguaActionPerformed
		String[] selecionado = jCB_Lingua.getSelectedItem().toString()
				.split("_");
		Locale.setDefault(new Locale(selecionado[0], selecionado[1]));
		internacionaliza();
	}// Orienta??o a eventos

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				InternacioanalizacaoGabarito p = new InternacioanalizacaoGabarito();
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
	}

	// Declara??o dos atributos de classe
	@SuppressWarnings("rawtypes")
	private javax.swing.JComboBox jCB_Lingua;
	private javax.swing.JLabel jL_Email;
	private javax.swing.JLabel jL_Lingua;
	private javax.swing.JLabel jL_Nome;
	private javax.swing.JLabel jL_Telefone;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
}
