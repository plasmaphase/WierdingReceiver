import java.io.IOException;
import java.io.FileWriter;

public class fWriter {

    private static FileWriter fW;

    public static void SetupFile(String file) throws IOException
    {
        fW = new FileWriter(file);
    }

    public static void Write(String s) throws IOException
    {
        fW.write(s);
    }

    public static void Close() throws IOException
    {
        fW.close();
    }
}
