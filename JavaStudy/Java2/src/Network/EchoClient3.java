package Network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient3 {
    public static void main(String[] args) {
        String host = args.length > 0 ? args[0] : "localhost";
        try {
            Socket socket = new Socket(host, 9000);
            Thread out = new Thread() {
                public void run() {
                    Scanner sc = new Scanner(System.in);
                    try {
                        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
                        while (true) {
                            out.println(sc.nextLine());
                            out.flush();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    sc.close();
                }
            };
            Thread in = new Thread() {
                public void run() {
                    try {
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        while (true) {
                            String str = in.readLine();
                            if (str == null) {
                                socket.close();
                                System.exit(0);
                            }
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            out.start();
            in.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
