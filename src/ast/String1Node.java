package ast;

public class String1Node extends value implements ASTNode{
String id;
	
	public String1Node(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new StringNode(" + id + ")");
	}
	

}
