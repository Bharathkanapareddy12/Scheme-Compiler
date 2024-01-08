package ast;

public class PairNode extends pair implements ASTNode{
	
String id;
ASTNode e1;
	
	public PairNode(String id, ASTNode e1) {
		super();
		this.id = id;
		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new PairNode(" + id+" ");
		e1.print();
		System.out.println(")");
	}

}
