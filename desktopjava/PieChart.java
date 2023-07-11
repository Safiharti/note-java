package desktopjava;

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import org.jfree.chart.*; 
//import org.jfree.chart.plot.*; 
//import org.jfree.data.*; 
import org.jfree.data.general.DefaultPieDataset;
import java.sql.ResultSet;
import java.sql.Statement;


public class PieChart extends JFrame { 
        private JPanel pnl = null;
        private Connections conn;
    public PieChart() throws ClassNotFoundException {
        conn=new Connections();
        addWindowListener(new WindowAdapter(){ 
            @Override
            public void windowClosing(WindowEvent e) { 
                dispose(); 
                System.exit(0); 
                    } 
            }); 
                pnl = new JPanel(new BorderLayout()); 
                setContentPane(pnl); 
                setSize(400, 250);
                String query = "SELECT statut, COUNT(*) AS nbr FROM (" +
                    "SELECT etudiant.`n°Inscription`, CASE " +
                    "WHEN SUM((notes.note*matiere.Coef))/(SUM(matiere.Coef)) < 7.5 THEN 'Exclu' " +
                    "WHEN SUM((notes.note*matiere.Coef))/(SUM(matiere.Coef)) < 10 THEN 'Redoublant' " +
                    "ELSE 'Admis' END AS statut " +
                    "FROM etudiant " +
                    "JOIN notes ON etudiant.`n°Inscription` = notes.`n°Inscription` " +
                    "JOIN matiere ON matiere.codemat = notes.codemat " +
                    "WHERE notes.Annee = 'L1' " +
                    "GROUP BY etudiant.`n°Inscription`" +
                    ") AS subquery " +
                    "GROUP BY statut";
              try{
                Statement stmt=conn.createStatement();
                ResultSet res=stmt.executeQuery(query);                
                DefaultPieDataset pieDataset = new DefaultPieDataset(); 
                while(res.next()){
                    int nbr=res.getInt(1);
                    String statu=res.getString(2);
                    System.out.println(nbr+" "+statu);
                    pieDataset.setValue(statu, Integer.valueOf(nbr));
                } 
                JFreeChart pieChart = ChartFactory.createPieChart("Test camembert", pieDataset, true, true, true); 
                ChartPanel cPanel = new ChartPanel(pieChart); 
                pnl.add(cPanel); }
              catch(Exception e){e.printStackTrace();}
        } 
        public static void main(String args[]) throws ClassNotFoundException { 
            PieChart tpc = new PieChart(); 
            tpc.setVisible(true); 
        } 
}
