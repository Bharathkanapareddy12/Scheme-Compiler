package ast;

public class SrcExpressionNode extends srcexpression implements ASTNode{
	
public ASTNode s1,s2;
	
	
	public SrcExpressionNode(ASTNode s1, ASTNode s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void print() {
		// TODO Auto-generated method stub new SrcExpressionNode 
		System.out.print(" (");
		s1.print();
		System.out.print(" , ");
		if (s2 != null) {
			s2.print();
		}
		System.out.println(")");
	}

}
