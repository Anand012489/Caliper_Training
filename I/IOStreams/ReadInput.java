package I.IOStreams;
import java.io.*;

public class ReadInput {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter("Anand.pdf"));

        System.out.println("Enter text:");
        String line = reader.readLine();

        while (line != null && !line.equals("exit")) {
            writer.write(line);
            writer.newLine();
            line = reader.readLine();
        }

        reader.close();
        writer.close();

        System.out.println("Text written to file.");

    }

}
