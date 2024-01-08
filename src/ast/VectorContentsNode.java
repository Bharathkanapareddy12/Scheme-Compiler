package ast;

public class VectorContentsNode extends list_contents implements ASTNode{
	ASTNode e1;
	
	public VectorContentsNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new VectorContentsNode(");
		e1.print();
		System.out.println(")");
	}

}
