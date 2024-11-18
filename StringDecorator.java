public class StringDecorator {
    
    private String inputString; 

    public StringDecorator(String inputString)
    {
        this.inputString = inputString;
    }
    public LatexHeaderDecorator() {
        return "\\section{" + inputString + "} \\label{"
                + inputString.toLowerCase().replace(" ", "-")
                +"}";
    }
}
