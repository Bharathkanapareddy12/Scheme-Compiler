package ast;

public class VectorExpressionNode extends vector_expression implements ASTNode{
ASTNode e1;
	
	public VectorExpressionNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new VectorExpressionNode(");
		e1.print();
		System.out.println(")");
	}

}
