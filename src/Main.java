import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        udpRcvr rcv = new udpRcvr();
        fWriter fw = new fWriter();
        fw.SetupFile("/home/tron/capture.txt");
        rcv.OpenSocket(3333);
        while(true) {
            String rcvdstr = udpRcvr.RcvData();
            fw.Write(rcvdstr);
            //System.out.println(rcvdstr);
        }
    }

}
