import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StringDecorator {

    private String inputString;

    public StringDecorator(String inputString) {
        this.inputString = inputString;
    }


    public void jsonDecorator() throws FileNotFoundException, UnsupportedEncodingException {
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

    public void htmlDecorator() {
        System.out.println("<p>" + inputString + "</p>");
    }

    public void asciiDecorator()
    {
        String [] words = inputString.split(" ");
        String res = "";
        for(String word : words)
        {
            for(int i = 0; i < word.length(); i++)
            {
                res += String.valueOf((int)word.charAt(i)) + ",";
            }
            res+=" ";
        }
        res = res.strip();
        res = res.substring(0, res.length()-1);
        System.out.println(res);
    }

    public void latexHeaderDecorator() {
        System.out.println("\\section{" + inputString + "} \\label{" +
                inputString.toLowerCase()
                           .replace(" ", "-")
                           .replace(",", "")
                           .replace("!", "") +
                "}");
    }
    
}
