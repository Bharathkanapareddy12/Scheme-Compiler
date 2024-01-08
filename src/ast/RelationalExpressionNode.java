package ast;

public class RelationalExpressionNode extends relational_expression implements ASTNode{

	ASTNode e1;
	Integer op;
	
	
	public RelationalExpressionNode(Integer op, ASTNode e1) {
		super();
		this.e1 = e1;
		this.op = op;
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		if (op>=1 && op<=12) {
		System.out.print("new RelationalExpressionNode (");}
		else {
			System.out.print("new AssignmentExpressionNode (");}
		switch(op) {
		    case 1: System.out.print("EQ, ");
		            break;
		    case 2: System.out.print("EQUAL, ");
		            break;
		    case 3: System.out.print("LT, ");
		            break;
		    case 4: System.out.print("GT, ");
		            break;
		    case 5: System.out.print("LE, ");
		            break;
		    case 6: System.out.print("GE, ");
		            break;
		    case 7: System.out.print("AND, ");
		            break;
		    case 8: System.out.print("OR, ");
		            break;
		    case 9: System.out.print("NOT, ");
		            break;
		    case 10: System.out.print("NAND, ");
		            break;
		    case 11: System.out.print("XOR, ");
		            break;
		    case 12: System.out.print("NOR, ");
		            break;
		    case 13: System.out.print("ADD, ");
		            break;
		    case 14: System.out.print("SUB, ");
		            break;
		    case 15: System.out.print("MUL, ");
		            break;
		    case 16: System.out.print("DIV, ");
		            break;
		    case 17: System.out.print("ABS, ");
		            break;
		    case 18: System.out.print("QUOTIENT, ");
		            break;
		    case 19: System.out.print("REMAINDER, ");
		            break;
		    case 20: System.out.print("MODULO, ");
		            break;
		    default: System.out.print("Invalid Operator, ");
		            break;
		}

		System.out.print(",");
		e1.print();
		System.out.println(")");
		
	}

}
