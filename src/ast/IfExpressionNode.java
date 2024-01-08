package ast;

public class IfExpressionNode extends ifExpression implements ASTNode{

ASTNode e1;
	
	public IfExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new IfExpressionNode(");
		e1.print();
		System.out.println(")");
	}
}
