import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;

public class GeradorJson {

    public static void criarJson(ParseTree t, String fileName){
        try {
            FileWriter arquivo = new FileWriter (fileName +".json");
            arquivo.write(toString(t).toString());
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Object toString(ParseTree t) {
        String nomeClasse = t.getClass().getName();
        switch(nomeClasse){
            case "GerarJsonParser$IntContext":
                return Integer.parseInt(t.getChild(0).getText());

            case "GerarJsonParser$StringContext" :
                return t.getChild(0).getText();

            case "GerarJsonParser$BoolContext":
                String val = t.getChild(0).getText();
                if(val.equals("true")) return true;
                else return false;

            case "GerarJsonParser$ParContext":
                String chave = t.getChild(2).getText();
                //return t.getChild(2).getClass().getName();
                Object valor = toString(t.getChild(4));
                return   "\t" + chave + ":" + valor;

            case "GerarJsonParser$ProgramContext":
            case "GerarJsonParser$ObjContext":
            case "GerarJsonParser$ArrayContext":
                return toString(t.getChild(0));

            case "GerarJsonParser$VetorContext":
                int size = t.getChildCount();
                String a = "[\n";
                for(int i = 2; i <size-1; i++){
                    if(!t.getChild(i).getText().equals(",")){
                        a = a + "\t" + toString(t.getChild(i));

                    }
                    else{
                        a = a + t.getChild(i).getText() + "\n";
                    }

                }
                a = a + "\n\t]";
                return a;

            case "GerarJsonParser$ObjetoContext":
                int tamanho = t.getChildCount();
                String o = "{\n";
                for(int i = 2; i <tamanho-1; i++){
                    if(!t.getChild(i).getText().equals(",")){
                        o = o + toString(t.getChild(i));

                    }
                    else{
                        o = o + t.getChild(i).getText() + "\n";
                    }

                }
                o = o + "\n}";
                return o;

        }
        throw new RuntimeException("Nao pode compilar");
    }

}
