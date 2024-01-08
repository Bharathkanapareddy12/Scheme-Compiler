package ast;

public class DefineExpressionNode extends define_expression implements ASTNode{
	String id;
	ASTNode e1;
		
		public DefineExpressionNode(String id, ASTNode e1) {
			super();
			this.id = id;
			this.e1 = e1;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.print("new DefineExpressionNode(");// + id);
			e1.print();
			System.out.println(")");
		}

}
