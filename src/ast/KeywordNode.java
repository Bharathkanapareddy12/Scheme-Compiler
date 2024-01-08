package ast;

public class KeywordNode extends atom implements ASTNode{
String id;
	
	public KeywordNode(String id) {
		super();
		this.id = id;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("new KeywordNode(" + id + ")");
	}
	

}
