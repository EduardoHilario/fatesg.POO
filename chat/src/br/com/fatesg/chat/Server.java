package br.com.fatesg.chat;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server extends Thread{

    private static ArrayList<BufferedWriter> clients;
    private static ServerSocket server;
    private String nome;
    private Socket con;
    private InputStream in;
    private InputStreamReader inr;
    private BufferedReader bfr;

    /**
     *  Método construtor
     *  @param con do tipo Socket
     */

    public Server(Socket con){
        this.con = con;

        try {

            in = con.getInputStream();
            inr = new InputStreamReader(in);
            bfr = new BufferedReader(inr);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  Método run
     */
    public void run(){

        try {

            String msg;
            OutputStream ou = this.con.getOutputStream();
            Writer ouw = new OutputStreamWriter(ou);
            BufferedWriter bfw = new BufferedWriter(ouw);
            clients.add(bfw);
            nome = msg = bfr.readLine();

            while (!"Sair".equalsIgnoreCase(msg) && msg != null){

                msg = bfr.readLine();
                sendToAll(bfw, msg);
                System.out.println(msg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  Método usado para enviar mensagem para todos os clients
     *  @param bwOut do tipo BufferedWriter
     *  @param msg do tipo String
     *  @throws IOException
     */
    public void sendToAll(BufferedWriter bwOut, String msg) throws IOException{

        BufferedWriter bwS;

        for (BufferedWriter bw: clients
             ) {
            bwS = (BufferedWriter)bw;

            if(!(bwOut == bwS)){
                bw.write(nome + " -> "+msg+"\r\n");
                bw.flush();
            }
            
        }
    }

    /**
     *  Método main
     *  @param args
     */
    public static void main(String[] args) {
        try{
            //Cria os objetos necessário para instânciar o servidor
            JLabel lblMessage = new JLabel("Porta do Servidor:");
            JTextField txtPorta = new JTextField("12345");
            Object[] texts = {lblMessage, txtPorta };
            JOptionPane.showMessageDialog(null, texts);
            server = new ServerSocket(Integer.parseInt(txtPorta.getText()));
            clients = new ArrayList<BufferedWriter>();
            JOptionPane.showMessageDialog(null,"Servidor ativo na porta: "+
                    txtPorta.getText());

            while(true){
                System.out.println("Aguardando conexão...");
                Socket con = server.accept();
                System.out.println("Cliente conectado...");
                Thread t = new Server(con);
                t.start();
            }

        }catch (Exception e) {

            e.printStackTrace();
        }
    }
}
