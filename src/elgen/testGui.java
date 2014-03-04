package elgen;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class testGui extends JFrame implements ActionListener {

        private JButton btnTest;
        private JMenuItem excelInn, excelUt, publisering, grafer, multivariat, bivariat, univariat, settElg, tannanalyse, værdata, skogsanalyse, beiteregistrering;
        private JPanel testContent, mainContent, loginContent;
        private JMenu hjemMenu;
        
        
    public testGui() {
            
        setTitle("Elgskit");
        setSize(800, 600);
            
        //Lager menybar for JFrame
        JMenuBar menuBar = new JMenuBar();
        //Adder menybaren til Framen
        setJMenuBar(menuBar);
        
        // Hjem
        hjemMenu = new JMenu("Hjem");
        menuBar.add(hjemMenu);
        
        // Import
        JMenu importMenu = new JMenu("Import");
        menuBar.add(importMenu);
        excelInn = new JMenuItem("Excel");
        importMenu.add(excelInn);
        
        // Export
        JMenu exportMenu = new JMenu("Export");
        menuBar.add(exportMenu);
        excelUt = new JMenuItem("Excel");
        publisering = new JMenuItem("Publisering");
        exportMenu.add(excelUt);
        exportMenu.add(publisering);
        
        // Statistikk
        JMenu statistikkMenu = new JMenu("Statistikk");
        menuBar.add(statistikkMenu);
        grafer = new JMenuItem("Grafer");
        multivariat = new JMenuItem("Multivariat analyse");
        bivariat = new JMenuItem("Bivariat analyse");
        univariat = new JMenuItem("Univariat analyse");
        statistikkMenu.add(grafer);
        statistikkMenu.add(multivariat);
        statistikkMenu.add(bivariat);
        statistikkMenu.add(univariat);
        
        // Registrering
        JMenu registreringMenu = new JMenu("Registrering");
        menuBar.add(registreringMenu);
        settElg = new JMenuItem("Sett elg");
        tannanalyse = new JMenuItem("Tannanalyse");
        værdata = new JMenuItem("Værdata");
        skogsanalyse = new JMenuItem("Skogsanalyse");
        beiteregistrering = new JMenuItem("Beiteregistrering");
        registreringMenu.add(settElg);
        registreringMenu.add(tannanalyse);
        registreringMenu.add(værdata);
        registreringMenu.add(skogsanalyse);
        registreringMenu.add(beiteregistrering);
        
        // Arkiv
        JMenu arkivMenu = new JMenu("Arkiv");
        menuBar.add(arkivMenu);
        
        // Ulike paneler
        mainContent = new JPanel();
        JTextArea nytext = new JTextArea(15, 70);
        
        nytext.setText("Dette er en test");
        
        nytext.setSize(10, 10);
        
        mainContent.add(nytext);
        
        loginContent = new JPanel(new GridBagLayout());
        JLabel userName = new JLabel("Brukernavn :");
        JLabel passWord = new JLabel("Passord :");
        JTextField user = new JTextField(10);
        JPasswordField pass = new JPasswordField(10);
        loginContent.add(userName);
        loginContent.add(user);
        loginContent.add(passWord);
        loginContent.add(pass);
        
        testContent = new JPanel();
        btnTest = new JButton("HURRA");
        testContent.add(btnTest);
        add(mainContent, BorderLayout.SOUTH);
        add(testContent, BorderLayout.CENTER);
        add(loginContent, BorderLayout.CENTER);
        
        testContent.setVisible(false);
        
        // Lyttere
        excelInn.addActionListener(this);
        excelUt.addActionListener(this);
        publisering.addActionListener(this);
        grafer.addActionListener(this);
        multivariat.addActionListener(this);
        bivariat.addActionListener(this);
        univariat.addActionListener(this);
        settElg.addActionListener(this);
        tannanalyse.addActionListener(this);
        værdata.addActionListener(this);
        skogsanalyse.addActionListener(this);
        beiteregistrering.addActionListener(this);
    
    }
    
    public static void main(String[] args) {
        testGui me = new testGui();
        me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        me.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem clicked = (JMenuItem) e.getSource();
        
        if (clicked == publisering) testContent.setVisible(true);    
        
    }

}
