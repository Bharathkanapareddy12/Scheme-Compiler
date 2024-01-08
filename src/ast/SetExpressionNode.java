package ast;

public class SetExpressionNode extends set_expression implements ASTNode{
ASTNode e1;
	
	public SetExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new SetExpressionNode(");
		e1.print();
		System.out.println(")");
	}

}
