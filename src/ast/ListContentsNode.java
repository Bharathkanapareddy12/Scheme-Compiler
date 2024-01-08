package ast;

public class ListContentsNode extends list_contents implements ASTNode{
	ASTNode e1;
	
	public ListContentsNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub new ListContentsNode
		System.out.print(" ");
		e1.print();
		System.out.println(" ");
	}

}
