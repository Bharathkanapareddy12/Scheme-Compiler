package ast;

public class StringNode extends atom implements ASTNode{
String id;
	
	public StringNode(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new StringNode(" + id + ")");
	}
	

}
