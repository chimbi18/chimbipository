package Interfaz;

import javax.swing.*;

import java.awt.*;
import java.util.Calendar;

public class InterfazPrueba extends JFrame {

	private Dibujo contenedora;

	private JLabel fechaActual;
	private JLabel btnOpciones;
	private JLabel lineaProyecto1;
	private JLabel lineaProyecto2;
	private JLabel lineaProyecto3;
	private JLabel cantidadActividades1;
	private JLabel cantidadActividades2;
	private JLabel cantidadActividades3;
	private JLabel cantidadActividadesSinCompletar1;
	private JLabel cantidadActividadesSinCompletar2;
	private JLabel cantidadActividadesSinCompletar3;
	private JLabel circulo1;
	private JLabel circulo2;
	private JLabel circulo3;
	

	public class Dibujo extends JPanel {

		public void paintComponent(Graphics g) {

			Color c = new Color(105, 105, 105);
			this.repaint();
			Graphics2D g2 = (Graphics2D) g;
			g2.setColor(c);
			Toolkit imagen = Toolkit.getDefaultToolkit();
			Image img = imagen.getImage("Imagenes/Fondo1.png");
			g2.drawImage(img, 0, 0, 394, 700, this);

			this.repaint();

		}

		public Dibujo() {

			this.setLayout(null);
		}
	}

	public InterfazPrueba(String dia, String mes, String annio) {

		this.setUndecorated(true);
		this.setLayout(null);
		contenedora = new Dibujo();

		Color col1 = new Color(200, 205, 211);
		Font fuente1 = new Font("Arial", Font.BOLD, 12);
		Font fuente2 = new Font("Arial", Font.BOLD, 30);
		Font fuente3 = new Font("Arial", Font.BOLD, 25);

		fechaActual = new JLabel(mes + " " + dia + ", " + annio);

		fechaActual.setBounds(132, 60, 130, 15);
		fechaActual.setForeground(col1);
		fechaActual.setFont(fuente1);

		fechaActual.setVerticalAlignment(SwingConstants.CENTER);
		fechaActual.setHorizontalAlignment(SwingConstants.CENTER);

		btnOpciones = new JLabel();
		btnOpciones.setBounds(339, 32, 46, 40);
		btnOpciones.setIcon(convertirTamanho("Imagenes/BtnOpciones.png", 46, 40));

		lineaProyecto1 = new JLabel();
		lineaProyecto1.setBounds(24, 80, 346, 3);
		lineaProyecto1.setBackground(new Color(255,215,0));
		lineaProyecto1.setOpaque(true);

		lineaProyecto2 = new JLabel();
		lineaProyecto2.setBounds(24, 286, 346, 3);
		lineaProyecto2.setBackground(new Color(237, 188, 99));
		lineaProyecto2.setOpaque(true);

		lineaProyecto3 = new JLabel();
		lineaProyecto3.setBounds(24, 492, 346, 3);
		lineaProyecto3.setBackground(new Color(140, 141, 235));
		lineaProyecto3.setOpaque(true);

		cantidadActividades1 = new JLabel("5,201");
		cantidadActividades1.setBounds(149,164,96,41);
		cantidadActividades1.setFont(fuente2);
		cantidadActividades1.setForeground(col1);
		cantidadActividades1.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividades1.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadActividades2 = new JLabel("5,201");
		cantidadActividades2.setBounds(149,370,96,41);
		cantidadActividades2.setFont(fuente2);
		cantidadActividades2.setForeground(col1);
		cantidadActividades2.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividades2.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadActividades3 = new JLabel("5,201");
		cantidadActividades3.setBounds(149,576,96,41);
		cantidadActividades3.setFont(fuente2);
		cantidadActividades3.setForeground(col1);
		cantidadActividades3.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividades3.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadActividadesSinCompletar1 = new JLabel("2,799");
		cantidadActividadesSinCompletar1.setBounds(282,158,69,30);
		cantidadActividadesSinCompletar1.setFont(fuente3);
		cantidadActividadesSinCompletar1.setForeground(col1);
		cantidadActividadesSinCompletar1.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividadesSinCompletar1.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadActividadesSinCompletar2 = new JLabel("2,799");
		cantidadActividadesSinCompletar2.setBounds(282,364,69,30);
		cantidadActividadesSinCompletar2.setFont(fuente3);
		cantidadActividadesSinCompletar2.setForeground(col1);
		cantidadActividadesSinCompletar2.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividadesSinCompletar2.setHorizontalAlignment(SwingConstants.CENTER);
		
		cantidadActividadesSinCompletar3 = new JLabel("2,799");
		cantidadActividadesSinCompletar3.setBounds(282,570,69,30);
		cantidadActividadesSinCompletar3.setFont(fuente3);
		cantidadActividadesSinCompletar3.setForeground(col1);
		cantidadActividadesSinCompletar3.setVerticalAlignment(SwingConstants.CENTER);
		cantidadActividadesSinCompletar3.setHorizontalAlignment(SwingConstants.CENTER);
		
		circulo1= new JLabel();
		circulo1.setBounds(125,110,145,145);
		circulo1.setIcon(convertirTamanho("Imagenes/Circulos/17.png", 145, 145));
		
		circulo2= new JLabel();
		circulo2.setBounds(125,316,145,145);
		circulo2.setIcon(convertirTamanho("Imagenes/Circulos/50.png", 145, 145));
		
		circulo3= new JLabel();
		circulo3.setBounds(125,522,145,145);
		circulo3.setIcon(convertirTamanho("Imagenes/Circulos/8.png", 145, 145));
		

		contenedora.add(fechaActual);
		contenedora.add(btnOpciones);
		contenedora.add(lineaProyecto1);
		contenedora.add(lineaProyecto2);
		contenedora.add(lineaProyecto3);
		contenedora.add(cantidadActividades1);
		contenedora.add(cantidadActividades2);
		contenedora.add(cantidadActividades3);
		contenedora.add(cantidadActividadesSinCompletar1);
		contenedora.add(cantidadActividadesSinCompletar2);
		contenedora.add(cantidadActividadesSinCompletar3);
		contenedora.add(circulo1);
		contenedora.add(circulo2);
		contenedora.add(circulo3);
		setSize(394, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		contenedora.setBounds(0, 0, 394, 700);
		add(contenedora);

	}

	public static void main(String[] args) {

		String[] meses = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
				"OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };
		Calendar c1 = Calendar.getInstance();
		String dia = Integer.toString(c1.get(Calendar.DATE));
		String mes = meses[c1.get(Calendar.MONTH)];
		String annio = Integer.toString(c1.get(Calendar.YEAR));

		InterfazPrueba b = new InterfazPrueba(dia, mes, annio);
		b.setVisible(true);

	}

	public ImageIcon convertirTamanho(String image, int x, int y) {

		ImageIcon imagen = new ImageIcon(image);
		Image conversion = imagen.getImage();

		Image tamanho = conversion.getScaledInstance(x, y, Image.SCALE_DEFAULT);
		// TODO Auto-generated method stub
		return new ImageIcon(tamanho);
	}
}
