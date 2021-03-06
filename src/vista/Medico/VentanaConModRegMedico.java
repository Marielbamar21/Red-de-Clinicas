package vista.Medico;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class VentanaConModRegMedico extends javax.swing.JFrame{

	private JTextField textField_Cedula;
	private JTextField textField_Nombre;
	private JDateChooser textField_FechaN;
	private JLabel lblEmail;
	private JTextField textField_Email;
	private JLabel lblNmeroDeTelfono;
	private JTextField textField_TlfCasa;
	private JLabel lblNmeroCelular;
	private JTextField textField_TlfCelular;
	private JLabel lblEspecialidad;
	private JTextField textField_AlmaMater;
	private JTextField textField_AnnoG;
	private JCheckBox chckbxactualmenteEstudiando;
	private JTable table_Horario;
	private JLabel lblHorarioDeTrabajo;
	private JButton btnRegistrar;
	private JButton btnSalir;
	private JButton btnModificar;
	private JButton btnEliminar;

	/**
	 * Create the application.
	 */
	public VentanaConModRegMedico() {
		super();
		initialize();
		setSize(579, 351);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
		setBounds(100, 100, 579, 351);
		getContentPane().setForeground(Color.BLUE);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		JLabel lblNombre = new JLabel("Cédula:");
		
		textField_Cedula = new JTextField();
		textField_Cedula.setColumns(10);
		
		JLabel lblApellido = new JLabel("Nombre y Apellido:");
		
		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento:");
		
		textField_FechaN = new JDateChooser();
		
		lblEmail = new JLabel("E-Mail:");
		
		textField_Email = new JTextField();
		textField_Email.setColumns(10);
		
		lblNmeroDeTelfono = new JLabel("Tlf. Casa:");
		
		textField_TlfCasa = new JTextField();
		textField_TlfCasa.setColumns(10);
		
		lblNmeroCelular = new JLabel("Tlf. Celular:");
		
		textField_TlfCelular = new JTextField();
		textField_TlfCelular.setColumns(10);
		
		lblEspecialidad = new JLabel("Especialidad:");
		
		JComboBox cB_Especialidad = new JComboBox();
		cB_Especialidad.setModel(new DefaultComboBoxModel(new String[] {"Urólogo", "Neurólogo", "Perro Loco"}));
		
		JButton btnEditarEspecialidades = new JButton("Editar Especialidades");
		
		JLabel lblAlmaMter = new JLabel("Alma Máter:");
		
		textField_AlmaMater = new JTextField();
		textField_AlmaMater.setColumns(10);
		
		JLabel lblAoDeGraduacin = new JLabel("Año de Graduación:");
		
		textField_AnnoG = new JTextField();
		textField_AnnoG.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar Postgrados");
		
		chckbxactualmenteEstudiando = new JCheckBox("¿Actualmente estudiando?");
		
		JScrollPane scrollPane = new JScrollPane();
		
		lblHorarioDeTrabajo = new JLabel("Horario de Trabajo:");
		
		btnRegistrar = new JButton("Registrar");
		
		btnSalir = new JButton("Salir");
		
		btnModificar = new JButton("Modificar");
		
		btnEliminar = new JButton("Eliminar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
						.addComponent(lblHorarioDeTrabajo, GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre)
							.addGap(6)
							.addComponent(textField_Cedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblApellido)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_Nombre, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnConsultar, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAlmaMter)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_AlmaMater, 181, 181, 181))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEspecialidad)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cB_Especialidad, 0, 172, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNmeroDeTelfono)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_TlfCasa, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechaDeNacimiento)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_FechaN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAoDeGraduacin)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_AnnoG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblEmail)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_Email, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNmeroCelular)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_TlfCelular, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
								.addComponent(btnEditarEspecialidades, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
								.addComponent(chckbxactualmenteEstudiando, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnRegistrar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnModificar)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEliminar)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
							.addComponent(btnSalir)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textField_Cedula, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido)
						.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechaDeNacimiento)
						.addComponent(textField_FechaN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(textField_Email, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNmeroDeTelfono)
						.addComponent(textField_TlfCasa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNmeroCelular)
						.addComponent(textField_TlfCelular, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEspecialidad)
						.addComponent(cB_Especialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEditarEspecialidades))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAlmaMter)
						.addComponent(textField_AlmaMater, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAoDeGraduacin)
						.addComponent(textField_AnnoG, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnConsultar)
						.addComponent(chckbxactualmenteEstudiando))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblHorarioDeTrabajo)
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnRegistrar)
						.addComponent(btnSalir)
						.addComponent(btnModificar)
						.addComponent(btnEliminar))
					.addGap(111))
		);
		
		table_Horario = new JTable();
		table_Horario.setModel(new DefaultTableModel(
			new Object[][] {
				{"Matutino", null, null, null, null, null},
				{"Vespertino", null, null, null, null, null},
			},
			new String[] {
				"Horario", "Lunes", "Martes", "Mi\u00E9rcoles", "Jueves", "Viernes"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table_Horario);
		getContentPane().setLayout(groupLayout);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void blanquearCampos() {
		textField_Cedula.setText(null);
		textField_Nombre.setText(null);
		textField_FechaN.setDate(null);
		textField_AlmaMater.setText(null);
		textField_AnnoG.setText(null);
		textField_Email.setText(null);
		textField_TlfCasa.setText(null);
		textField_TlfCelular.setText(null);
		DefaultTableModel model = (DefaultTableModel) table_Horario.getModel();
		Object[] empty = {null,null,null,null,null};
		model.removeRow(0);
		model.removeRow(0);
		model.addRow(empty);
		model.addRow(empty);
		chckbxactualmenteEstudiando.setSelected(false);
	}
	
	public void llenarCampos(String cedula, String nombre, Date fechan, String email, String tlfcasa, String tlfcelu, String codespec, String almamater, int annogrado, String[] horariomat, String[] horariovesp, boolean estudia) {
		textField_Cedula.setText(cedula);
		textField_Nombre.setText(nombre);
		textField_FechaN.setDate(fechan);
		textField_AlmaMater.setText(almamater);
		textField_AnnoG.setText(Integer.toString(annogrado));
		textField_Email.setText(email);
		textField_TlfCasa.setText(tlfcasa);
		textField_TlfCelular.setText(tlfcelu);
		DefaultTableModel model = (DefaultTableModel) table_Horario.getModel();
		model.addRow(horariomat);
		model.addRow(horariovesp);
		chckbxactualmenteEstudiando.setSelected(estudia);
	}
	
	public void addListener(ActionListener actionListener) {
		btnRegistrar.addActionListener(actionListener);
		btnModificar.addActionListener(actionListener);
		btnEliminar.addActionListener(actionListener);
		btnSalir.addActionListener(actionListener);
	}

	public JTextField getTextField_Cedula() {
		return textField_Cedula;
	}

	public void setTextField_Cedula(JTextField textField_Cedula) {
		this.textField_Cedula = textField_Cedula;
	}

	public JTextField getTextField_Nombre() {
		return textField_Nombre;
	}

	public void setTextField_Nombre(JTextField textField_Nombre) {
		this.textField_Nombre = textField_Nombre;
	}

	public JDateChooser getTextField_FechaN() {
		return textField_FechaN;
	}

	public void setTextField_FechaN(JDateChooser textField_FechaN) {
		this.textField_FechaN = textField_FechaN;
	}

	public JTextField getTextField_Email() {
		return textField_Email;
	}

	public void setTextField_Email(JTextField textField_Email) {
		this.textField_Email = textField_Email;
	}

	public JTextField getTextField_TlfCasa() {
		return textField_TlfCasa;
	}

	public void setTextField_TlfCasa(JTextField textField_TlfCasa) {
		this.textField_TlfCasa = textField_TlfCasa;
	}

	public JTextField getTextField_TlfCelular() {
		return textField_TlfCelular;
	}

	public void setTextField_TlfCelular(JTextField textField_TlfCelular) {
		this.textField_TlfCelular = textField_TlfCelular;
	}

	public JTextField getTextField_AlmaMater() {
		return textField_AlmaMater;
	}

	public void setTextField_AlmaMater(JTextField textField_AlmaMater) {
		this.textField_AlmaMater = textField_AlmaMater;
	}

	public JTextField getTextField_AnnoG() {
		return textField_AnnoG;
	}

	public void setTextField_AnnoG(JTextField textField_AnnoG) {
		this.textField_AnnoG = textField_AnnoG;
	}

	public JCheckBox getChckbxactualmenteEstudiando() {
		return chckbxactualmenteEstudiando;
	}

	public void setChckbxactualmenteEstudiando(JCheckBox chckbxactualmenteEstudiando) {
		this.chckbxactualmenteEstudiando = chckbxactualmenteEstudiando;
	}

	public JTable getTable() {
		return table_Horario;
	}

	public void setTable(JTable table) {
		this.table_Horario = table;
	}

	public void interfazRegistro() {
		btnEliminar.setEnabled(false);;
		btnModificar.setEnabled(false);
		btnEliminar.setVisible(false);
		btnModificar.setVisible(false);
	}
	
	public void interfazConsulta() {
		btnRegistrar.setEnabled(false);
		btnRegistrar.setVisible(false);
		textField_Cedula.setEditable(false);
		textField_AlmaMater.setEditable(false);
		textField_AnnoG.setEditable(false);
	}
	
	public boolean chequearLlenos() { //Chequea y verifica que todos los campos estén actualmente llenos.
		return (textField_AlmaMater.getText().equals("") ||	textField_Cedula.getText().equals("") || 
				textField_Nombre.getText().equals("") || textField_FechaN.getDate().equals("") || 
				textField_AlmaMater.getText().equals("") || textField_AnnoG.getText().equals("") ||
				textField_Email.getText().equals("") || textField_TlfCasa.getText().equals("") ||
				textField_TlfCelular.getText().equals(""));
	}
	
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}
	
	public String getCedula() {
		return textField_Cedula.getText();
	}
	
	public String getNombre() {
		return textField_Nombre.getText();
	}
	
	public Date getFechaN() {
		return textField_FechaN.getDate();
	}
	
	public String getEmail() {
		return textField_Email.getText();
	}
	
	public String getTlfCasa() {
		return textField_TlfCasa.getText();
	}
	
	public String getTlfCelular() {
		return textField_TlfCelular.getText();
	}
	
	public String getEspecialidad() {
		return "Proximamente"; 
	}
	
	public String getAlmaMater() {
		return textField_AlmaMater.getText();
	}
	
	public int getAnnoG() {
		return Integer.parseInt(textField_AnnoG.getText());
	}
	
	public boolean getEstudiando() {
		return chckbxactualmenteEstudiando.isSelected();
	}
	
	public String[] getHorarioMatu() {
		String[] hor = {null,null,null,null,null};
		for (int i=1;i<6;i++) {
			hor[(i-1)] = table_Horario.getValueAt(i, 1).toString();
		}
		return hor;
	}
	
	public String[] getHorarioVesper() {
		String[] hor = {null,null,null,null,null};
		for (int i=1;i<6;i++) {
			hor[(i-1)] = table_Horario.getValueAt(i, 2).toString();
		}
		return hor;
	}
	
	public void salir() {
		setVisible(false);
		dispose();
	}
}