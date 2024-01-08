package ast;

public class ListExpressionNode extends list_expression implements ASTNode{
ASTNode e1;
	
	public ListExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new ListExpressionNode(");
		e1.print();
		System.out.println(")");
	}

}
