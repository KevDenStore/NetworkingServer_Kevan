
import java.net. *;
import java.io. *;

public class NetworkingServer {
    public static void main(String [] args){

        ServerSocket server = null;
        Socket client;

        int portnumber = 50000;
        if(args.length >=1)

    {
        portnumber = Integer.parseInt(args[0]);
    }
                try {
                    server = new ServerSocket(portnumber);
    }              catch (IOException ie) {
                    System.out.println("Cannot open socket.") + ie);
                    System.exit(1);
    }
                System.out.println("serversocket is created " + server);
                while(true) {
                    try {
                        System.out.println("waiting for connect request...");
                        client = server.accept();
                        System.out.println("Connect request is accepted...");
                        String clientHost =
                                Client.getInetAddress().getHostAddress();
                        int clientPort = client.getPort();
                        System.out.println("client host = " + clientHost + " Client port = " + clientPort);
                        InputStream clientIn = client.getInputStream();
                        BufferedReader br = new BufferedReader (new InputStreamReader(clientIn));
                        String msgFromClient = br.readLine();
                        System.out.println("message recieved from client = " + msgFromClient);

                        if (msgFromClient != null && ! msgFromClient.equalsIgnoreCase("bye")) {
                            OutputStream
                        }
    }
}