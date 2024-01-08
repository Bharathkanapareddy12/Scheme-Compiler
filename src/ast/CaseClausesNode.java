package ast;

public class CaseClausesNode extends caseClauses implements ASTNode{
ASTNode e1,e2,e3;
	
	public CaseClausesNode(ASTNode e1, ASTNode e2, ASTNode e3) {

		this.e1 = e1;
		this.e2=e2;
		this.e3 =e3;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new CaseClausesNode(");
		e1.print();
		System.out.print(",");
		e2.print();
		
		System.out.print(",");
		e3.print();
		
		System.out.println(")");
	}

}
