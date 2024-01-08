package ast;

public class ListExpNode extends list_exp implements ASTNode{

ASTNode e1;
	
	public ListExpNode(ASTNode e1) {

		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new ListExpNode(");
		e1.print();
		System.out.println(")");
	}
}
