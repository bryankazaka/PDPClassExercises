import java.io.PrintWriter;

public class StringDecorator {

    private String inputString;

    public StringDecorator(String inputString) {
        this.inputString = inputString;
    }


    public void jsonDecorator() {
        PrintWriter pw = new PrintWriter(inputString + ".json", "UTF-8");
        String[] splitByNewline = inputString.split(",");
        pw.println("[");
        pw.println("    {");
        for (int i = 0; i < splitByNewline.length; i++) {
            pw.print("      "+splitByNewline[i]);
            pw.print(":");
            pw.print("header1");
            pw.println(",");
            pw.println("    },");
            pw.println();
        }

        pw.println("]");
    }
}
}
