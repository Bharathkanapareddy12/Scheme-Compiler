package ast;

public class CondExpressionNode extends condExpression implements ASTNode{

ASTNode e1;
	
	public CondExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new CondExpressionNode(");
		e1.print();
		System.out.println(")");
	}
}
