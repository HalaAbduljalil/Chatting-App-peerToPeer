/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalhomeworkfiles;


import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import javax.swing.JOptionPane;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.SocketTimeoutException;
import java.util.Random;
import javax.swing.*;
import javax.swing.text.*;
/**
 *
 * @author dell
 */
@SuppressWarnings("serial")
public class ChattingPeerToPeer extends JFrame {

   
  
    /**
     * Creates new form ChattingPeerToPeer
     */
      Color pane;
    public ChattingPeerToPeer() {
         super("PeerToPeer");
        initComponents();
    }
       public static boolean flag=false;
       public static boolean flag2=false;
	    public static int srcPORT;
             public static int portt;
           public  static String serverRoute="";
	    public static InetAddress srcIP;
	public static DatagramSocket datagramSocket;
        boolean error;
      String name ;
      static int ww=1;
     static int checksum = 0;
           static int checksumafter = 0;

       // AREA1 = new ColorPane();
       // AREA1.setBackground(new Color(245, 245, 245));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ChattingArea = new javax.swing.JTextArea();
        msgSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        UL = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        uername0 = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        LocalPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RemotePort = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        LocalIp = new javax.swing.JTextField();
        RemoteIP = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        status1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uername1 = new javax.swing.JTextField();
        loginButton1 = new javax.swing.JButton();
        nameee = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        select1 = new javax.swing.JButton();
        err = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        ChattingArea.setColumns(20);
        ChattingArea.setRows(5);
        jScrollPane1.setViewportView(ChattingArea);

        msgSend.setText("SEND");
        msgSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgSendActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(UL);

        jButton4.setText("TEST BUTTON");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("USERNAME :");

        uername0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uername0ActionPerformed(evt);
            }
        });

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jButton2.setText("LOGOUT");

        jLabel7.setText("Online Users :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(204, 204, 204));

        LocalPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalPortActionPerformed(evt);
            }
        });

        jLabel5.setText("sender IP :");

        jLabel6.setText("sender Port :");

        jLabel8.setText("Reciever Port :");

        RemotePort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemotePortActionPerformed(evt);
            }
        });

        jLabel10.setText("Reciever IP :");

        LocalIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalIpActionPerformed(evt);
            }
        });

        RemoteIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoteIPActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setText("STATUS :");

        status1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status1ActionPerformed(evt);
            }
        });

        jLabel2.setText("USERNAME :");

        loginButton1.setForeground(new java.awt.Color(255, 0, 0));
        loginButton1.setText("LOGIN");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });

        nameee.setText("...................................");

        select.setText("send File");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("send from:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Send To:");

        select1.setText("Recive File");
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        err.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errActionPerformed(evt);
            }
        });

        jLabel3.setText("errors :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(status1)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(LocalIp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(LocalPort, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uername1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(loginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RemoteIP, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(err))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RemotePort, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(nameee))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nameee)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uername1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginButton1))
                .addGap(67, 67, 67)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocalIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(LocalPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(RemoteIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemotePort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(err, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(status1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LocalPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalPortActionPerformed

    private void RemotePortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemotePortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemotePortActionPerformed

    private void LocalIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalIpActionPerformed

    private void RemoteIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoteIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoteIPActionPerformed

    private void msgSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgSendActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_msgSendActionPerformed

    private void status1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void uername0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uername0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uername0ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
       
	       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:      
	          flag=true;
                  ww=1;
	   nameee.setText(uername1.getText());
//           FileReceive f = new FileReceive();
           

    }//GEN-LAST:event_loginButton1ActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
          int port = Integer.parseInt(RemotePort.getText());
        String host = RemoteIP.getText(); // local host
       ready(port, host);
    }//GEN-LAST:event_selectActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed

status1.setText("Recive from : IP"+LocalIp.getText()+" Port :" +LocalPort.getText());

    }//GEN-LAST:event_select1ActionPerformed

    private void errActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, BadLocationException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChattingPeerToPeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChattingPeerToPeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChattingPeerToPeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChattingPeerToPeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
      myThread s = new myThread();
      s.start();
   
         while(true){
	       if(flag ){
                  int po=Integer.parseInt(RemotePort.getText());
    String ser="C:\\Users\\hp\\Documents\\hala\\";
          
                   createFile(po, ser);
               }

	      else 
                 //  continue;
                   //break;
               System.out.print("");

	    }
    }
    	private static void handler() throws IOException, BadLocationException {
//	       try {
//                   if(flag)
//                               
//
//                   {System.out.println("chatttinng");
//                   System.out.println("yes it is false ");
//                
//	           srcPORT=Integer.parseInt(LocalPort.getText());
//	           srcIP=InetAddress.getByName(LocalIp.getText());
//	           datagramSocket=new DatagramSocket(srcPORT,srcIP);
//
//	while(flag){
//	byte[] buffer = new byte[256];
//	DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
//
//	datagramSocket.receive(packet);
//       
//	String msg=new String (packet.getData());
//        StyledDocument doc = AREA1.getStyledDocument();
//        Style style = AREA1.addStyle(msg, null);
//        StyleConstants.setForeground(style, Color.blue);
//        doc.insertString(doc.getLength(),"\n"+msg , style);
//        }
//--------
//        if(flag2)
//        {
//             String serverRoute = "C:\\Users\\dell\\Desktop\\hw3\\";
//                 DatagramSocket socket = new DatagramSocket(portt);
//            byte[] receiveFileName = new byte[1024]; // Where we store the data of datagram of the name
//            DatagramPacket receiveFileNamePacket = new DatagramPacket(receiveFileName, receiveFileName.length);
//            socket.receive(receiveFileNamePacket); // Receive the datagram with the name of the file
//            System.out.println("Receiving file name");
//            while(flag2){
//            byte [] data = receiveFileNamePacket.getData(); // Reading the name in bytes
//            String fileName = new String(data, 0, receiveFileNamePacket.getLength()); // Converting the name to string
//            
//            System.out.println("Creating file");
//            File f = new File (serverRoute + fileName); // Creating the file
//            FileOutputStream outToFile = new FileOutputStream(f); // Creating the stream through which we write the file content
//            
//            receiveFile(outToFile, socket); // Receiving the file
//            }
//        }
//	}
//	        } catch (SocketException ex) {
//                    ex.printStackTrace();
//	    }  
//	        
//	        
//	        
//	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
    
    

       void ready(int port, String host) {
           
        System.out.println(port+",,,"+host);
        System.out.println("Choosing file to send ");
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName(host);
            String fileName;

            JFileChooser jfc = new JFileChooser(); // Choosing the file to send
            jfc.setFileSelectionMode(JFileChooser.FILES_ONLY); // Only files can be choosed (not directories)
            if (jfc.isMultiSelectionEnabled()) { // Only one file at a time (no multiple selection)
                jfc.setMultiSelectionEnabled(false);
            }

            int r = jfc.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) { // If a file is choosed
                File f = jfc.getSelectedFile();
                fileName = f.getName();
                byte[] fileNameBytes = fileName.getBytes(); // File name as bytes to send it
                DatagramPacket fileStatPacket = new DatagramPacket(fileNameBytes, fileNameBytes.length, address, port); // File name packet
                socket.send(fileStatPacket); // Sending the packet with the file name
                byte[] fileByteArray = readFileToByteArray(f); // Array of bytes the file is made of
                sendFile(socket, fileByteArray, address, port); // Entering the method to send the actual file
            }
               	String send=new String("check your file in :" +"C:\\Users\\hp\\Documents\\hala\\" );
	byte[] buffer = send.getBytes();
	InetAddress receiverAddress = InetAddress.getByName(RemoteIP.getText());
	int despn=Integer.parseInt(RemotePort.getText());

	DatagramPacket packet = new DatagramPacket(
	        buffer, buffer.length, receiverAddress, despn);
	datagramSocket.send(packet);
            socket.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
           private void sendFile(DatagramSocket socket, byte[] fileByteArray, InetAddress address, int port) throws IOException {
        System.out.println("Sending file in sennnnnnnnd");
        int sequenceNumber = 0; // For order
        boolean flag; // To see if we got to the end of the file
        int ackSequence = 0; // To see if the datagram was received correctly

        for (int i = 0; i < fileByteArray.length; i = i + 1021) {
            sequenceNumber += 1;

            // Create message
//                        byte[] message2 = new byte[20]; // First two bytes of the data are for control (datagram integrity and order)
//message2[0] = (byte) checksum;
//message2[1] = (byte) checksumafter;
//            
byte[] message = new byte[1024]; // First two bytes of the data are for control (datagram integrity and order)
            message[0] = (byte) (sequenceNumber >> 8);
            message[1] = (byte) (sequenceNumber);

            if ((i + 1021) >= fileByteArray.length) { // Have we reached the end of file?
                flag = true;
                message[2] = (byte) (1); // We reached the end of the file (last datagram to be send)
            } else {
                flag = false;
                message[2] = (byte) (0); // We haven't reached the end of the file, still sending datagrams
            }
  message[3] = (byte) (checksum);
   message[4] = (byte) (checksumafter);
            if (!flag) {
                System.arraycopy(fileByteArray, i, message, 3, 1021);
            } else { // If it is the last datagram
                System.arraycopy(fileByteArray, i, message, 3, fileByteArray.length - i);
            }
            checksum = calc(message);
            
           
            
//             DatagramPacket sendPacket1 = new DatagramPacket(message2, message2.length, address, port); // The data to be sen
//            
//            socket.send(sendPacket1);
//            
            error(Integer.parseInt(err.getText()));
            
            DatagramPacket sendPacket = new DatagramPacket(message, message.length, address, port); // The data to be sen
            
            socket.send(sendPacket); // Sending the data
            System.out.println("Sent: Sequence number = " + sequenceNumber);

            boolean ackRec; // Was the datagram received?

            while (true) {
                byte[] ack = new byte[2]; // Create another packet for datagram ackknowledgement
                DatagramPacket ackpack = new DatagramPacket(ack, ack.length);

                try {
                    socket.setSoTimeout(50); // Waiting for the server to send the ack
                    socket.receive(ackpack);
                    ackSequence = ((ack[0] & 0xff) << 8) + (ack[1] & 0xff); // Figuring the sequence number
                    ackRec = true; // We received the ack
                } catch (SocketTimeoutException e) {
                    System.out.println("Socket timed out waiting for ack");
                    ackRec = false; // We did not receive an ack
                }

                // If the package was received correctly next packet can be sent
                if ((ackSequence == sequenceNumber) && (ackRec)) {
                    System.out.println("Ack received: Sequence Number = " + ackSequence);
                    break;
                } // Package was not received, so we resend it
                else {
                    socket.send(sendPacket);
                    System.out.println("Resending: Sequence Number = " + sequenceNumber);
                }
            }
        }
    }
  
    private static byte[] readFileToByteArray(File file) {
        FileInputStream fis = null;
        // Creating a byte array using the length of the file
        // file.length returns long which is cast to int
        byte[] bArray = new byte[(int) file.length()];
        try {
            fis = new FileInputStream(file);
            fis.read(bArray);
            fis.close();

        } catch (IOException ioExp) {
            ioExp.printStackTrace();
        }
        return bArray;
    }
  
    public static void createFile (int port, String serverRoute){
        try{
            if(ww==2){
                  return;  
            }
            else
            {
                
            
            ww=2;
            System.out.println(port+"vbfjbv"+serverRoute);
             datagramSocket = new DatagramSocket(port);
            byte[] receiveFileName = new byte[1024]; // Where we store the data of datagram of the name
             System.out.println("714");
            DatagramPacket receiveFileNamePacket = new DatagramPacket(receiveFileName, receiveFileName.length);
             System.out.println("721"); 
            datagramSocket.receive(receiveFileNamePacket); // Receive the datagram with the name of the file
            System.out.println("Receiving file name");
            byte [] data = receiveFileNamePacket.getData(); // Reading the name in bytes
            String fileName = new String(data, 0, receiveFileNamePacket.getLength()); // Converting the name to string
            
            System.out.println("Creating file");
            File f = new File (serverRoute + fileName); // Creating the file
            System.out.println(serverRoute + fileName+" in line 739");
            FileOutputStream outToFile = new FileOutputStream(f); // Creating the stream through which we write the file content
            
            receiveFile(outToFile, datagramSocket); // Receiving the file
             System.out.println("725  end");
        byte[] buffer = new byte[256];
	DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

	datagramSocket.receive(packet);
       
	String msg=new String (packet.getData());
        status1.setText(msg);
             }
              
        }catch(Exception ex){
            ex.printStackTrace();
          
        }   
    }
    
    private static void receiveFile(FileOutputStream outToFile, DatagramSocket socket) throws IOException {
        System.out.println("Receiving file");
        boolean flag1; // Have we reached end of file
        int sequenceNumber = 0; // Order of sequences
        int foundLast = 0; // The las sequence found
        
        while (true) {
                        //byte[] message2 = new byte[20]; // Where the data from the received datagram is stored
            byte[] message = new byte[1024]; // Where the data from the received datagram is stored
            byte[] fileByteArray = new byte[1021]; // Where we store the data to be writen to the file

            // Receive packet and retrieve the data
            DatagramPacket receivedPacket = new DatagramPacket(message, message.length);
            socket.receive(receivedPacket);
            message = receivedPacket.getData(); // Data to be written to the file

//           
//          DatagramPacket receivedPacket2 = new DatagramPacket(message2, message2.length);
//        socket.receive(receivedPacket2);
//      message2 = receivedPacket2.getData();
//            
            
            
            // Get port and address for sending acknowledgment
            InetAddress address = receivedPacket.getAddress();
            int port = receivedPacket.getPort();

            // Retrieve sequence number
            sequenceNumber = ((message[0] & 0xff) << 8) + (message[1] & 0xff);
            // Check if we reached last datagram (end of file)
            flag1 = (message[2] & 0xff) == 1;
            
            // If sequence number is the last seen + 1, then it is correct
            // We get the data from the message and write the ack that it has been received correctly
            
            if ((message[3] == message[4]))
            {
            System.out.println("error and the checksum :"+checksum+" the checksumafter :"+checksumafter);

         }
            
            if (sequenceNumber == (foundLast + 1)) {

                // set the last sequence number to be the one we just received
                foundLast = sequenceNumber;

                // Retrieve data from message
                System.arraycopy(message, 3, fileByteArray, 0, 1021);

               // Write the retrieved data to the file and print received data sequence number
                outToFile.write(fileByteArray);
                System.out.println("Received: Sequence number:" + foundLast);

                // Send acknowledgement
                sendAck(foundLast, socket, address, port);
            } else {
                System.out.println("Expected sequence number: " + (foundLast + 1) + " but received " + sequenceNumber + ". DISCARDING");
                // Re send the acknowledgement
                sendAck(foundLast, socket, address, port);
            }
            // Check for last datagram
            if (flag1) {
                outToFile.close();
                break;
            }
        }
    }    
    
    private static void sendAck(int foundLast, DatagramSocket socket, InetAddress address, int port) throws IOException {
        // send acknowledgement
        byte[] ackPacket = new byte[2];
        ackPacket[0] = (byte) (foundLast >> 8);
        ackPacket[1] = (byte) (foundLast);
        // the datagram packet to be sent
        DatagramPacket acknowledgement = new DatagramPacket(ackPacket, ackPacket.length, address, port);
        socket.send(acknowledgement);
        System.out.println("Sent ack: Sequence Number = " + foundLast);
    }
  
     
 

    
  
    
  


      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    static javax.swing.JTextArea ChattingArea;
    static javax.swing.JTextField LocalIp;
    static javax.swing.JTextField LocalPort;
    static javax.swing.JTextField RemoteIP;
    static javax.swing.JTextField RemotePort;
    private javax.swing.JList<String> UL;
    private javax.swing.JTextField err;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JButton msgSend;
    private javax.swing.JLabel nameee;
    private javax.swing.JButton select;
    private javax.swing.JButton select1;
    static javax.swing.JTextField status1;
    private javax.swing.JTextField uername0;
    private javax.swing.JTextField uername1;
    // End of variables declaration//GEN-END:variables

    public int calc(byte[] message) {
   int c =0;
for(int i =0 ;i<message.length;i++)
{
    c +=message[i];



}
return c;
    }

public void error(int x)
{
    int random =0 ;
    int var =0;
    var =(int)(x/(double)100)*1024;
    Random rand = new Random();
random = rand.nextInt(1024);

if (random >=0 && random<= var)
{
    checksumafter =70;
}
else {
checksumafter = checksum;
}

}


}

