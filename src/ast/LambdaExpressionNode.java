package ast;

public class LambdaExpressionNode extends lambda_expression implements ASTNode{
ASTNode e1,e2;
	
	public LambdaExpressionNode(ASTNode e1, ASTNode e2) {

		this.e1 = e1;
		this.e2=e2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new LambdaExpressionNode(");
		e1.print();
		System.out.print(",");
		if (e2 != null){
			e2.print();
		}
		System.out.println(")");
	}

}
