package ast;

public class BooleanNode extends atom implements ASTNode{
String id;
	
	public BooleanNode(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new BooleanNode(" + id + ")");
	}
	

}
