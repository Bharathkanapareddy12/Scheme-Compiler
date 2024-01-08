package ast;

public class DoExpressionNode extends do_expression implements ASTNode{

ASTNode e1;
	
	public DoExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new DoExpressionNode(");
		e1.print();
		System.out.println(")");
	}
}
