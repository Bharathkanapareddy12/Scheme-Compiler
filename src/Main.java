import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import ast.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
        helloLexer lex = new helloLexer(new ANTLRInputStream(input.toString()));
        Token token;

        List<Token> tokenList = new ArrayList<>(); // Store tokens in a list

        // Consume tokens and store them
        while ((token = lex.nextToken()).getType() != -1) {
            tokenList.add(token);
        }

        // Create a new input stream using the stored tokens
        CommonTokenStream tokenStream = new CommonTokenStream(new ListTokenSource(tokenList));
        helloParser parser = new helloParser(tokenStream);
        SymbolTable symbolTable = new SymbolTable(); // Create symbol table


        // Process tokens from the stored token stream
        for (int i = 0; i < tokenList.size(); i++) {
            token = tokenList.get(i);
            String tokenType = lex.getVocabulary().getSymbolicName(token.getType());
            String tokenText = token.getText();
            //System.out.println(tokenType);
            // Logic to add identifiers to the symbol table
            if ("DEFINE".equals(tokenType) || "IF".equals(tokenType) || "COND".equals(tokenType) ||
                    "CASE".equals(tokenType) || "DO".equals(tokenType)|| "LAMBDA".equals(tokenType) || "DEFINESYNTAX".equals(tokenType) || "FILTER".equals(tokenType)) {
                    //currentScopeLevel++;
                    symbolTable.enterScope();
                }

            // Logic to add identifiers to the symbol table
            if ("ID".equals(tokenType)) {
                symbolTable.addSymbol(tokenText, tokenType);
            }
        }

        symbolTable.displayTable();

        // Invoke the parser
        parser.program();
    }
}