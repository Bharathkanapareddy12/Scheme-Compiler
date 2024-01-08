package ast;

public class ExpNode extends exp implements ASTNode{
	public ASTNode s1;
	
	
	public ExpNode(ASTNode s1) {
		super();
		this.s1 = s1;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new ExpNode (");
		if (s1 != null) {
			s1.print();
		}
		System.out.println(")");
	}

}
