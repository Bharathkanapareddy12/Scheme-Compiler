package ast;

public class AssignmentExpressionNode extends assignment_expression implements ASTNode{
	
String id;
ASTNode e1;
	
	public AssignmentExpressionNode(String id, ASTNode e1) {
		super();
		this.id = id;
		this.e1 = e1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.print("new AssignmentExpressionNode(" + id);
		e1.print();
		System.out.println(")");
	}

}
