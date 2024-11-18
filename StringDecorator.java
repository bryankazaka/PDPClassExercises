public class StringDecorator {
    
    private String inputString; 

    public StringDecorator(String inputString)
    {
        this.inputString = inputString;
    }
    public String LatexHeaderDecorator() {
        return "\\section{" + inputString + "} \\label{"
                + inputString.toLowerCase()
        replace(" ", "-")
                .replace(",", "")
                .replace("!", "")
                +"}";
    }
}
