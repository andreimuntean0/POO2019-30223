package quiz;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.HashMap;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Test extends JFrame implements ActionListener {
	JPanel panel;
	JRadioButton rdbtn1;
	JRadioButton rdbtn2;
	ButtonGroup bg;
	JTextArea textIntrebare;
	JButton btnext;
	String[][] intrebari;
	int n;
	JLabel titlu;
	int ctDA, ctNU;
	HashMap<Integer, Integer> map;

	Test() {
		initializare();
		setTitle("Test de personalitate");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(630, 300);
		setLocation(300, 100);
		setResizable(false);
		Container cont = getContentPane();
		cont.setLayout(null);
		bg = new ButtonGroup();
		rdbtn1 = new JRadioButton("DA", true);
		rdbtn2 = new JRadioButton("NU", false);
		bg.add(rdbtn1);
		bg.add(rdbtn2);
		textIntrebare = new JTextArea();
		textIntrebare.setFont(new Font("Serif", Font.PLAIN, 14));
		textIntrebare.setSize(600, 300);
		textIntrebare.setLineWrap(true);
		textIntrebare.setWrapStyleWord(true);
		textIntrebare.setOpaque(false);
		textIntrebare.setEditable(false);
		btnext = new JButton("Next");
		btnext.addActionListener(this);
		panel = new JPanel();
		panel.setLocation(10, 10);
		panel.setSize(600, 250);
		panel.setLayout(new GridLayout(7, 2));
		titlu = new JLabel("Test de personalitate");
		titlu.setFont(new Font("Serif", Font.CENTER_BASELINE, 20));
		panel.add(titlu);
		panel.add(textIntrebare);
		panel.add(rdbtn1);
		panel.add(rdbtn2);
		panel.add(btnext);
		cont.add(panel);
		setVisible(true);
		n = 0;
		ctDA = 0;
		ctNU = 0;
		citesteIntrebarea(n);

	}

	public void actionPerformed(ActionEvent e) {

		if (btnext.getText().equals("Next")) {
			if (n < 9) {

				map.put(n, getSelection());
				n++;
				citesteIntrebarea(n);
			} else {
				map.put(n, getSelection());
				btnext.setText("Arata rezultatul!");

			}
		} else if (btnext.getText().equals("Arata rezultatul!"))
			new Rezultat();

	}

	public void initializare() {

		intrebari = new String[10][2];

		intrebari[0][0] = "In aceeasi zi, poti viziona doua filme si un spectacol, reusesti sa citesti un capitol dintr-o carte sau un ziar in transportul public sau sa-ti aranjezi cateva intalniri";
		intrebari[1][0] = "Ti se strica buna dispozitie daca televizorul sau computerul se defecteaza. Si atunci cand telefonul este oprit, te simti singur si izolat de lume.";
		intrebari[2][0] = "Tii minte usor evenimente, cazuri, biografii si intampini greutati in memorarea unor formule ciudate sau fraze sofisticate.";
		intrebari[3][0] = "De obicei nu incepeti o conversatie.";
		intrebari[4][0] = "Adesea, spui glume si istorii amuzante. Esti un caracter sociabil.";
		intrebari[5][0] = "Intri usor in contact cu necunoscuti, te orientezi lesne intr-un mediu necunoscut si gasesti rezolvarea unei situatii complexe extrem de repede. ";
		intrebari[6][0] = "Va deranjeaza sa va aflati in centrul atentiei. ";
		intrebari[7][0] = "Chiar si cel mai nesemnificativ eveniment nu poate sa te opresca in luarea unei decizii majore.";
		intrebari[8][0] = "Va considerati ca fiind foarte stabil/a din punct de vedere emotional. ";
		intrebari[9][0] = "Adesea, te inchizi in tine si traiesti exclusiv cu amitirile tale date de o carte frumoasa, un film bun sau un concert de calitate, amintiri care iti tin de urat pentru o luna intreaga.";

		map = new HashMap<Integer, Integer>();

	}

	public int getSelection() {
		int selectedChoice = 0;
		int ct = 0;
		Enumeration<AbstractButton> buttons = bg.getElements();
		while (buttons.hasMoreElements()) {
			JRadioButton temp = (JRadioButton) buttons.nextElement();
			if (temp.isSelected()) {
				selectedChoice = ct;
				ct++;
			}
		}
		return selectedChoice;
	}

	public void citesteIntrebarea(int i) {
		textIntrebare.setText("  " + intrebari[i][0]);
		rdbtn1.setSelected(true);
	}

	public void reset() {
		n = 0;
		map.clear();
		citesteIntrebarea(n);
		btnext.setText("Next");
	}

	public void calc() {
		for (int i = 0; i < 10; i++)
			if (map.get(i) == 0)
				ctNU++;
			else
				ctDA++;
	}
}
