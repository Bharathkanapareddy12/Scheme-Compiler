package ast;

public class IdNode extends atom implements ASTNode{
String id;
	
	public IdNode(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new IdExp(" + id + ")");
	}
	

}
