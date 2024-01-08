package ast;

public class FunctionDefinitionNode extends function_definition implements ASTNode{
	String id;
	ASTNode e1,e2;
		
		public FunctionDefinitionNode(String id, ASTNode e1, ASTNode e2) {
			super();
			this.id = id;
			this.e1 = e1;
			this.e2=e2;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.print("new FunctionDefinitionNode(" + id+" ");
			e1.print();
			System.out.print(", ");
			e2.print();
			System.out.println(")");
		}

}
