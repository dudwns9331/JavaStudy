package Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String host = args.length > 0 ? args[0] : "localhost";
        try {
            Socket socket = new Socket(host, 9000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true) {
                out.println(sc.nextLine());
                out.flush();
                String str = in.readLine();
                if(str == null) {
                    break;
                }
                System.out.println(str);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
