/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package msc;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class displaydata extends JFrame {

	private JPanel contentPane;
	JFrame frame1;
	JTable table1;
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/msc";
        //String url1 = "jdbc:mysql://localhost:3306/msc?zeroDateTimeBehavior=convertToNull";
        String dbName = "msc";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
	
public void actionPerformed1(ActionEvent arg0,String sql) {

	String[] columnnames ={"CID", "Customer Name", "SID"};
        int cid,sid;
        String cname;
        frame1=new JFrame("Database search result");
				
	DefaultTableModel model=new DefaultTableModel();
				
	model.setColumnIdentifiers(columnnames);
	table1=new JTable();
	table1.setModel(model);
	JScrollPane scroll=new JScrollPane(table1);
				
    try{   

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, userName, password);
    
        //sql="select models.model_id,`models`.`model_name`,`models`.`brand_id`,`models`.`warranty_period` FROM msc.models;";
        //String sql1="SELECT * FROM `msc`.`brands`;";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs =  statement.executeQuery(sql);
                                        
        rs.beforeFirst();
        rs.next();			

        do{                                           
            cid=rs.getInt(1);
            cname=rs.getString(2);
            sid=rs.getInt(3);
            						
            model.addRow(new Object[]{cid,cname,sid});	
        }while(rs.next());
        
        //statement.execute();
        conn.close();						
	frame1.getContentPane().add(scroll);
	frame1.setVisible(true);
	frame1.setSize(400, 300);					
    }
    catch(  ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
        //System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"Invalid customer id!");
    }
        //add(table1);

    }
 
public void actionPerformed2(ActionEvent arg0,String sql) {

	String[] columnnames ={"Model_id","Model_name", "Brand_id","Warranty_period"};
        int mid,bid,wp;
        String mname;
        frame1=new JFrame("Database search result");
				
	DefaultTableModel model=new DefaultTableModel();
				
	model.setColumnIdentifiers(columnnames);
	table1=new JTable();
	table1.setModel(model);
	JScrollPane scroll=new JScrollPane(table1);
				
    try{   

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, userName, password);
    
        //sql="select models.model_id,`models`.`model_name`,`models`.`brand_id`,`models`.`warranty_period` FROM msc.models;";
        //String sql1="SELECT * FROM `msc`.`brands`;";
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs =  statement.executeQuery(sql);
                                        
        rs.beforeFirst();
        rs.next();			

        do{                                           
            mid=rs.getInt(1);
            mname=rs.getString(2);
            bid=rs.getInt(3);
            wp=rs.getInt(4);
            						
            model.addRow(new Object[]{mid,mname,bid,wp});	
        }while(rs.next());

        conn.close();						
	frame1.getContentPane().add(scroll);
	frame1.setVisible(true);
	frame1.setSize(400, 300);					
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"Invalid model id!");
    }
				//add(table1);

    }

public void actionPerformed3(ActionEvent arg0,String sql) {

	String[] columnnames ={"SID","CID", "Customer Name","Cost", "MID","Complaint"};
        int cid,sid,mid1,cost;
        String cname,complaint;
        frame1=new JFrame("Database search result");
				
	DefaultTableModel model=new DefaultTableModel();		
	model.setColumnIdentifiers(columnnames);
	table1=new JTable();
	table1.setModel(model);
	JScrollPane scroll=new JScrollPane(table1);
				
    try{   

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, userName, password);
    
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs =  statement.executeQuery(sql);
                                        
        rs.beforeFirst();
        rs.next();			

        do{                                           
            sid=rs.getInt(1);
            cid=rs.getInt(2);
            cname=rs.getString(3);
            cost=rs.getInt(4);
            mid1=rs.getInt(5);
            complaint=rs.getString(6);
            						
            model.addRow(new Object[]{sid,cid,cname,cost,mid1,complaint});	
        }while(rs.next());

        conn.close();						
	frame1.getContentPane().add(scroll);
	frame1.setVisible(true);
	frame1.setSize(400, 300);				
    }
    catch(  ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
        //System.out.println(e.getMessage());
        JOptionPane.showMessageDialog(null,"Invalid service id!");
    }
	//add(table1);

    }

public void actionPerformed4(ActionEvent arg0,String sql) {

	String[] columnnames ={"Brands","No of Models"};
        int models1;
        String bname1;
        frame1=new JFrame("Database search result");
				
	DefaultTableModel model=new DefaultTableModel();		
	model.setColumnIdentifiers(columnnames);
	table1=new JTable();
	table1.setModel(model);
	JScrollPane scroll=new JScrollPane(table1);
				
    try{   

        Class.forName(driver).newInstance();
        conn = DriverManager.getConnection(url, userName, password);
    
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet rs;
        rs = statement.executeQuery("call msc.sp1();");
        rs = statement.executeQuery(sql);
                                        
        rs.beforeFirst();
        rs.next();			

        do{                                           
            bname1=rs.getString(1);
            models1=rs.getInt(2);
            model.addRow(new Object[]{bname1,models1});	
        }while(rs.next());
        

        conn.close();						
	frame1.getContentPane().add(scroll);
	frame1.setVisible(true);
	frame1.setSize(400, 300);					
    }
    catch(  ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
       
        JOptionPane.showMessageDialog(null,"Error!");
    }
	//add(table1);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bid1;
    private javax.swing.JTextField bname;
    private javax.swing.JPanel brands;
    private javax.swing.JButton insertBrands;
    private javax.swing.JButton insertBrands1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbError1;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbid1;
    private javax.swing.JLabel lbid2;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbname1;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JPanel models;
    // End of variables declaration//GEN-END:variables
		

}