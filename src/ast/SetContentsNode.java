package ast;

public class SetContentsNode extends set_contents implements ASTNode{
	ASTNode e1;
	
	public SetContentsNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new SetContentsNode(");
		e1.print();
		System.out.println(")");
	}

}
