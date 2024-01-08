package ast;

public class CaseExpressionNode extends caseExpression implements ASTNode{

ASTNode e1,e2;
	
public CaseExpressionNode(ASTNode e1, ASTNode e2) {

	this.e1 = e1;
	this.e2=e2;
}

@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.print("new CaseExpressionNode(");
	e1.print();
	System.out.print(",");
	e2.print();

	System.out.println(")");
}

}
