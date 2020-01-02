package lab11;

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ConvertorValutar extends Frame implements ItemListener, ActionListener
{ 
    JComboBox<String> convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton conv, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public ConvertorValutar() { 
        super("Convertor valutar"); 
        setSize(530,220);
        setLayout(null);

        convertFrom = new JComboBox<String>();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("RON");
        convertFrom.addItem("EUR");
        convertFrom.addItem("USD");
        add(convertFrom);

        conv = new JButton(">>");
        conv.setBounds(235,70,60,30);
        conv.setBackground(Color.BLUE.darker());
        conv.setForeground(Color.white);
        add(conv);
        
        convertTo = new JComboBox<String>();
        convertTo.setBounds(350,70,150,30);
        convertTo.addItem("RON");
        convertTo.addItem("EUR");
        convertTo.addItem("USD");
        add(convertTo);

        from = new JLabel("Suma: ");
        from.setBounds(180,110,300,30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(230,110,150,30);
        add(txtFrom);

        to = new JLabel("Rezultat: ");
        to.setBounds(180,150,150,30);
        add(to);   

        txtTo = new JTextField(15);
        txtTo.setBounds(230,150,150,30);
        txtTo.setEditable(false);
        add(txtTo);

        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        conv.addActionListener(this);
        txtFrom.addActionListener(this);
        
        addWindowListener(new WindowAdapter() { 
                public void windowClosing(WindowEvent e) { 
                    exit(); 
                } 
            });
    }
    public void exit(){ 
        System.exit(0); 
    } 

    public static void main(String args[]) { 
    	ConvertorValutar c = new ConvertorValutar(); 
        c.setVisible(true); 
    } 

    public void ConvertDollar() {
        if(convertTo.getSelectedItem()=="USD")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="RON")
        {
            result = (input * 4.2608);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="EUR")
        {
            result = (input * 0.8915);
            txtTo.setText(""+result);
        }
    }

    public void ConvertRON() {
        if(convertTo.getSelectedItem()=="USD")
        {
            result = (input * 0.2347);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="RON")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="EUR")
        {
            result = (input * 0.2092);
            txtTo.setText(""+result);
        }
    }

    public void ConvertEUR() {
        if(convertTo.getSelectedItem()=="USD")
        {
            result = (input * 1.1217);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="RON")
        {
            result = (input * 4.7793);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="EUR")
        {
            result = (input);
            txtTo.setText(""+result);
        }
    }

    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());

        if(e.getSource()==conv)
        {
            if(convertFrom.getSelectedItem()=="USD")
            {
                ConvertDollar();                 
            }
            else if(convertFrom.getSelectedItem()=="RON")
            {
                ConvertRON();
            }
            else if(convertFrom.getSelectedItem()=="EUR")
            {
                ConvertEUR();
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {

    }
} 