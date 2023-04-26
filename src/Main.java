import org.antlr.v4.runtime.*;


public class Main{
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("input.exp");
        GerarJsonLexer lexer = new GerarJsonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GerarJsonParser parser = new GerarJsonParser(tokens);
        ParserRuleContext tree = parser.program();


        GeradorJson.criarJson(tree, "arquivoGerado");
    }
}