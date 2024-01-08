package ast;

public class IdListNode extends id_list implements ASTNode{
	String id;
	ASTNode e1;
		
		public IdListNode(String id, ASTNode e1) {
			super();
			this.id = id;
			this.e1 = e1;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.print("new IdListNode(" + id+" ");
			if (e1!= null) {
				e1.print();
			}
			System.out.println(")");
		}


}
