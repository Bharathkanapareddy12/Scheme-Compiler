grammar hello;

@header{
	import ast.*;
}

program returns [ASTNode node]
: srcexpression EOF {$node = $srcexpression.node;$node.print();}
;

srcexpression returns [ASTNode node]
    : e1=expression s1=srcexpression {$node = new SrcExpressionNode($e1.node, $s1.node);}
    | 
    ;

expression returns [ASTNode node]
    : e1=exp {$node = $e1.node;}
    | e2=ifExpression {$node = $e2.node;}
    | e3=condExpression {$node = $e3.node;}
    | e4=caseExpression {$node = $e4.node;}
    | e5=define_expression {$node = $e5.node;}
    | e6=list_expression {$node = $e6.node;}
    | e7=vector_expression {$node = $e7.node;}
    | e8=set_expression {$node = $e8.node;}
    | e9=dict_expression {$node = $e9.node;}
    | e10=lambda_expression {$node = $e10.node;}
//    | e11=macroexp {$node = $e11.node;}
//    | e12=threading_macro {$node = $e12.node;}
    | e13=function_definition {$node = $e13.node;}
    | e14=filter_expression {$node = $e14.node;}
    | e15=do_expression {$node = $e15.node;}
    | e16=relational_expression {$node = $e16.node;}
    | e17=assignment_expression {$node = $e17.node;}
    | e18=atom {$node = $e18.node;}
    | e19=print_expression {$node = $e19.node;}
    ;

print_expression returns [ASTNode node]
	: LPARAN DISPLAY s1=expression RPARAN {$node = new PrintExpressionNode($s1.node);}
	;

exp returns [ASTNode node]
    : LPARAN e1=srcexpression RPARAN {$node = new ExpNode($e1.node);}
    ;

statementList returns [ASTNode node]
    : e1=expression s1=statementList {$node = new StatementListNode($e1.node, $s1.node);}
    | 
    ;

relational_expression returns [ASTNode node]
    : LPARAN r1=operator s1=srcexpression RPARAN {$node = new RelationalExpressionNode($r1.opType, $s1.node);}
    ;

assignment_expression returns [ASTNode node]
    : LPARAN 'set!' ID s1=srcexpression RPARAN {$node = new AssignmentExpressionNode($ID.text, $s1.node);}
    ;

define_expression returns [ASTNode node]
    : LPARAN 'define' ID s1=srcexpression RPARAN {$node = new DefineExpressionNode($ID.text, $s1.node);}
    ;

list_expression returns [ASTNode node]
    : LPARAN 'list' l1=list_contents RPARAN {$node = new ListExpressionNode($l1.node);}
    ;

list_contents returns [ASTNode node]
    : s1=statementList {$node = new ListContentsNode($s1.node);}
    ;

vector_expression returns [ASTNode node]
    : LPARAN 'vector' v1=vector_contents RPARAN {$node = new VectorExpressionNode($v1.node);}
    ;

vector_contents returns [ASTNode node]
    : s1=statementList {$node = new VectorContentsNode($s1.node);}
    ;

set_expression returns [ASTNode node]
    : LPARAN 'make-set' s1=set_contents RPARAN {$node = new SetExpressionNode($s1.node);}
    ;

set_contents returns [ASTNode node]
    : s1=statementList {$node = new SetContentsNode($s1.node);}
    ;

dict_expression returns [ASTNode node]
    : LPARAN p1=pair p2=dictcommapair RPARAN {$node = new DictExpressionNode($p1.node, $p2.node);}
    ;

dictcommapair returns [ASTNode node]
    : p1=pair p2=dictcommapair {$node = new DictCommaPairNode($p1.node, $p2.node);}
    | 
    ;

pair returns [ASTNode node]
    : LPARAN ID DOT v1=value RPARAN {$node = new PairNode($ID.text, $v1.node);}
    ;

value returns [ASTNode node]
    : STRING {$node = new String1Node($STRING.text);}
    | NUMBER {$node = new Number1Node($NUMBER.text);}
    ;

lambda_expression returns [ASTNode node]
    : 'lambda' LPARAN id_list RPARAN expression {$node = new LambdaExpressionNode($id_list.node, $expression.node);}
    ;

id_list returns [ASTNode node]
    : ID id_list {$node = new IdListNode($ID.text, $id_list.node);}
    | 
    ;

filter_expression returns [ASTNode node]
    : LPARAN 'filter' tolambda list_exp RPARAN {$node = new FilterExpressionNode($tolambda.node, $list_exp.node);}
    ;

tolambda returns [ASTNode node]
    : LPARAN lambda_expression RPARAN {$node = $lambda_expression.node;}
    ;

list_exp returns [ASTNode node]
    : srcexpression {$node = new ListExpNode($srcexpression.node);}
    ;

function_definition returns [ASTNode node]
    : LPARAN 'define' LPARAN ID id_list RPARAN srcexpression RPARAN
      {$node = new FunctionDefinitionNode($ID.text, $id_list.node, $srcexpression.node);}
    ;

ifExpression returns [ASTNode node]
    : LPARAN 'if' srcexpression RPARAN {$node = new IfExpressionNode($srcexpression.node);}
    ;

macroexp returns [ASTNode node]
    : LPARAN 'define-syntax' ID LPARAN 'syntax-rules' LPARAN RPARAN syntax_rules RPARAN RPARAN
      {$node = new MacroexpNode($ID.text, $syntax_rules.node);}
    ;

syntax_rules returns [ASTNode node]
    : LPARAN syntax_rule RPARAN {$node = new SyntaxRulesNode($syntax_rule.node);}
    ;

syntax_rule returns [ASTNode node]
    : LPARAN srcexpression RPARAN syntax_rule {$node = new SyntaxRuleNode($srcexpression.node, $syntax_rule.node);}
    | {$node = new EmptyStmt();}
    ;

do_expression returns [ASTNode node]
    : 'do' LPARAN srcexpression RPARAN {$node = new DoExpressionNode($srcexpression.node);}
    ;

//threading_macro returns [ASTNode node]
//    : LPARAN '->>' ID srcexpression RPARAN {$node = new ThreadingMacroNode($ID.text, $srcexpression.node);}
//    ;

condExpression returns [ASTNode node]
    : LPARAN 'cond' condClauses RPARAN {$node = new CondExpressionNode($condClauses.node);}
    ;

condClauses returns [ASTNode node]
    : LPARAN srcexpression RPARAN condClause {$node = new CondClausesNode($srcexpression.node, $condClause.node);}
    ;

condClause returns [ASTNode node]
    : condClauses condClause {$node = new CondClauseNode($condClauses.node, $condClause.node);}
    | 
    ;

caseExpression returns [ASTNode node]
    : LPARAN 'case' expression caseClauses RPARAN {$node = new CaseExpressionNode($expression.node, $caseClauses.node);}
    ;

caseClauses returns [ASTNode node]
    : LPARAN expression srcexpression RPARAN caseClause
      {$node = new CaseClausesNode($expression.node, $srcexpression.node, $caseClause.node);}
    ;

caseClause returns [ASTNode node]
    : caseClauses caseClause {$node = new CaseClauseNode($caseClauses.node, $caseClause.node);}
    | 
    ;

operator returns [int opType]:
    EQ { $opType = 1; }
    | EQUAL { $opType = 2; }
    | LT { $opType = 3; }
    | GT { $opType = 4; }
    | LE { $opType = 5; }
    | GE { $opType = 6; }
    | AND { $opType = 7; }
    | OR { $opType = 8; }
    | NOT { $opType = 9; }
    | NAND { $opType = 10; }
    | XOR { $opType = 11; }
    | NOR { $opType = 12; }
    | ADD { $opType = 13; }
    | SUB { $opType = 14; }
    | MUL { $opType = 15; }
    | DIV { $opType = 16; }
    | ABS { $opType = 17; }
    | QUOTIENT { $opType = 18; }
    | REMAINDER { $opType = 19; }
    | MODULO { $opType = 20; }
    ;

atom returns [ASTNode node]
    : id {$node = new IdNode($id.text);}
    | string {$node = new StringNode($string.text);}
    | number {$node = new NumberNode($number.text);}
    | BOOLEAN {$node = new BooleanNode($BOOLEAN.text);}
    | keyword {$node = new KeywordNode($keyword.text);}
    ;
    
LET: 'let';
LET_STAR: 'let*';
FILTER: 'filter';
id_expression: ID;
datum: atom;

LPARAN: '(';
RPARAN: ')';
id: ID;
string: STRING;
number: NUMBER;
 
BOOLEAN: '#t' | '#f';



DISPLAY: 'display';
DOT: '.';
AND : 'and';
OR : 'or';
NOT : 'not';
NAND: 'nand';
XOR: 'xor';
NOR: 'nor';
STRING: '"' (ESC_SEQ | ~["\\])* '"';
NUMBER: INT | FLOAT;
fragment INT: ('+' | '-')? [0-9]+;
fragment FLOAT: ('+' | '-')? ([0-9]* '.' [0-9]+ | [0-9]+ '.' [0-9]*);
fragment ESC_SEQ: '\\' [btnfr"\\];
keyword: 'access' | 'begin' | 'cons-stream' | 'car' | 'cdr'
    | 'cons' | 'close-input-port' | 'close-output-port' | 'change-directory'|'declare'
     | 'define-integrable' | 'define-structure'
    | 'delay' | 'delete-file' |'directory-list'| 'do' | 'er-macro-transformer'
    | 'fluid-let' | 'file-exists?' |'file-size'| 'file-modify-seconds' | 'let' | 'let*'
    | 'let*-syntax' | 'let-syntax' | 'letrec' | 'local-declare'
    | 'non-hygienic-macrotransformer' | 'newline' | 'null?' | 'named-lambda'
    | 'or' | 'open-input-file' | 'open-output-file' | 'quote' | 'quasiquote'
    | 'read-line' | 'read-char' | 'rename-file' | 'syntax-rules'
    | 'the-environment' | 'write'|'displayln';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
ABS: 'abs';
QUOTIENT: 'quotient';
REMAINDER: 'remainder';
MODULO: 'modulo';
EQ : '=';
EQUAL : 'equal?';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
WS: [ \t\r\n]+ -> skip;
COMMENT :';' ~[\r\n]* -> skip;
ID: [a-zA-Z!$%&+-./:<>?@^~][a-zA-Z!$%&+-./:<=>?@^~0-9]*;