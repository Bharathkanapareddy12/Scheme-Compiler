package ast;

public class StatementListNode extends statementList implements ASTNode{
public ASTNode e1, s1;
	
	public StatementListNode(ASTNode e1, ASTNode s1) {
		super();
		this.e1 = e1;
		this.s1 = s1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub new StatementListNode
		System.out.print(" ");
		e1.print();
		System.out.print(" , ");
		if (s1 != null){
			s1.print();
		}
		System.out.println(" ");
	}

}
