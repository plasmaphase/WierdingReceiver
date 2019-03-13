import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class udpRcvr
{
    private static DatagramSocket rcvSocket;
    private static DatagramPacket rcvPacket;
    private static byte[] rcvData;
    private static int Port;
    public void OpenSocket(int PortIn) throws IOException
    {
        try {
            Port = PortIn;
            rcvSocket = new DatagramSocket(Port);
            rcvData = new byte[512];
            rcvPacket = new DatagramPacket(rcvData, rcvData.length);
        }
        catch(Exception e) {}
    }
    public static String RcvData() throws IOException
    {
        try {
            rcvSocket.receive(rcvPacket);
            String pkt = new String(rcvPacket.getData(), 0, rcvPacket.getLength());
            pkt = pkt + "\r\n";
            return pkt;
        }
        catch(Exception e) {
            return null;            // Always must return something
        }
    }
}