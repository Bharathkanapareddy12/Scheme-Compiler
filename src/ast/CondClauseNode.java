package ast;

public class CondClauseNode extends condClause implements ASTNode{
ASTNode e1,e2;
	
	public CondClauseNode(ASTNode e1, ASTNode e2) {

		this.e1 = e1;
		this.e2=e2;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new CondClauseNode(");
		e1.print();
		System.out.print(",");
		if (e2 != null){
			e2.print();
		}
		System.out.println(")");
	}

}
