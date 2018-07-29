import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tarun
 */
public class SearchStudent extends javax.swing.JPanel {

	JTextField vari=new JTextField();
    final DefaultListModel<String> dlm=new DefaultListModel<>();
    /**
     * Creates new form SearchStudent
     */
    public SearchStudent() {
        initComponents();
    }

                           
    public void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
    	

        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
       // setBackground(new java.awt.Color(135, 206, 235));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Search Student");

        jLabel3.setText("Name");

        jLabel4.setText("Father's Name");

        jLabel5.setText("class");

        jLabel6.setText("batch");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", " " }));
final DatabaseManagement db=new DatabaseManagement();
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>());
        ArrayList<String> al=db.GetClass();
        for(String i:al)
        {
        	jComboBox2.addItem(i);
        }

        jLabel7.setText("Phone numbers");

        jLabel8.setText("Email Address");

        jButton2.setText("Save");

        jButton3.setText("Reset");

        jButton1.setText("Edit");
        ActionListener editing=new ActionListener()
        {
        	public void actionPerformed(ActionEvent ae)
        	{
        		jTextField2.setEditable(true);
        		jTextField3.setEditable(true);
        		jTextField4.setEditable(true);
        		jTextField5.setEditable(true);
        		jTextField6.setEditable(true);
        	}
        };
        jButton1.addActionListener(editing);
        
        ActionListener saving=new ActionListener()
        {
        	public void actionPerformed(ActionEvent ae)
        	{
        		while(vari.getText().equals("")){
        			JOptionPane.showMessageDialog(null, "Please Enter Something in The TEXT BOX");	
        			//jTextField2.setText(vari.getText());
        			break;
        		}
        		ArrayList<String> savinglist=new ArrayList<String>();
        		savinglist.add(vari.getText());
        		savinglist.add(jTextField2.getText());
        		savinglist.add(jTextField4.getText());
        		savinglist.add(jTextField3.getText());
        		savinglist.add(jTextField5.getText());
        		savinglist.add(jTextField6.getText());
        		savinglist.add(jComboBox2.getSelectedItem().toString());
        		savinglist.add(jComboBox1.getSelectedItem().toString());
        	

        	db.SavingEdits(savinglist);
        	vari.setText(jTextField2.getText());
        	// dlm.setSelectedValue(1);
        	// jTextField2.setText("");
        	 jTextField3.setText("");
        	 jTextField4.setText("");
        	 jTextField5.setText("");
        	 jTextField6.setText("");
        	 jTextField3.setEditable(false);
     		jTextField2.setEditable(false);
     		jTextField4.setEditable(false);
     		jTextField5.setEditable(false);
     		jTextField6.setEditable(false);	
     			//dlm.removeAllElements();
        	list1.removeAll();
     		db.CDatabase();
         	  ArrayList<String> contacts=db.GetNames();
        	  for(String i:contacts)
        	  {
        		  dlm.addElement(i);
        	  }
        	if(vari.getText().equals(""))
        	{
        		jTextField3.setEditable(false);
        		jTextField2.setEditable(false);
        		jTextField4.setEditable(false);
        		jTextField5.setEditable(false);
        		jTextField6.setEditable(false);	
        	}
        	else{
        	ArrayList<String> values=db.GetValues(vari.getText());
        	jTextField2.setText(values.get(0));
        	jTextField3.setText(values.get(1));
        	jTextField5.setText(values.get(2));
        	jTextField6.setText(values.get(3));
        	}	
        	}
        };
        jButton2.addActionListener(saving);
        
        
        
      
        final JList list1 = new JList(dlm);
        ArrayList<String> contacts=db.GetNames();
		for(String i:contacts)
		{
			dlm.addElement(i);
		}

        jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e)
            {
            	list1.setSelectedValue("a", true);
            	dlm.removeAllElements();
            	String text=jTextField1.getText();
               	  ArrayList<String> contacts=db.GetNames(text);
            	  for(String i:contacts)
            	  {
            		  dlm.addElement(i);
            	  }
            }
        	});
        list1.addListSelectionListener(new ListSelectionListener()
    	{
    	public void valueChanged(ListSelectionEvent arg0) {
    		ArrayList<String> values=db.GetValues(list1.getSelectedValue().toString());
    		vari.setText(list1.getSelectedValue().toString());
    		if(list1.getSelectedValue()!=null)
    		{
    			jTextField2.setText(list1.getSelectedValue().toString());
    		jTextField4.setText(values.get(1));
    		jTextField3.setText(values.get(2));
    		jTextField5.setText(values.get(3));
    		jTextField6.setText(values.get(4));
    		jComboBox1.setSelectedItem(values.get(6));
    		jComboBox2.setSelectedItem(values.get(5));
    		}
    		}
    	});
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jTextField6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox2, 0, 183, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addComponent(jTextField4)))))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(28, 28, 28))))
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private java.awt.List list1;
    // End of variables declaration                   
}
