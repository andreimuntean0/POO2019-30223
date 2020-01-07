package quiz;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Rezultat extends Test {

	JLabel personalitate;
	JTextArea afisare;
	JPanel panel;

	Rezultat() {
		getContentPane().removeAll();
		repaint();
		setTitle("Quiz de personalitate - REZULTAT");
		setSize(400, 300);
		setLocation(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		Container cont = getContentPane();
		cont.setLayout(null);
		personalitate = new JLabel();
		afisare = new JTextArea();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				reset();
			}
		});
		calc();
		int numc = 0;
		if (ctDA > ctNU)
			numc = 1;
		if (numc != 0) {
			personalitate = new JLabel("Aveti o personalitate extrovertita");
			afisare.setText(
					"Extrovertitii fac eforturi catre socializare, pentru a-si largi contactele, legaturile de afaceri, fiind oameni care vor sa ia totul de la viata.");
		} else {
			personalitate = new JLabel("Aveti o personalitate introvertita");
			afisare.setText(
					"Introvertitii isi limiteaza contactele, se inchid in sine, nu fac costuri inutile incercand sa investeasca in noi relatii si isi pazesc fortele.");
		}
		afisare.setFont(new Font("Serif", Font.PLAIN, 14));
		afisare.setSize(300, 250);
		afisare.setLineWrap(true);
		afisare.setWrapStyleWord(true);
		afisare.setOpaque(false);
		afisare.setEditable(false);

		panel = new JPanel();
		panel.setLocation(10, 10);
		panel.setSize(300, 250);
		panel.setLayout(new GridLayout(4, 2));
		panel.add(personalitate);
		panel.add(afisare);
		cont.add(panel);
		add(cont);
		setVisible(true);
	}

}