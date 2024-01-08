package ast;

public class PrintExpressionNode extends print_expression implements ASTNode{

	ASTNode e1;
		
		public PrintExpressionNode(ASTNode e1) {
			super();
			this.e1 = e1;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.print("new PrintExpressionNode(");
			e1.print();
			System.out.println(")");
		}
}
