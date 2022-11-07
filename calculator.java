public class Calculator{
	double leftOperand;
	double rightOperand;
	String operation;
	
	Calculator(double leftOperand, double rightOperand, double operation){
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operation = operation;
	}
	
	public double getLeftOperand() {
	return leftOperand;
	}
	
	public void setLeftOperand(double leftOperand) {
		this.leftOperand = leftOperand;
	}
	
	public double getRightOperand() {
		return rightOperand;
	}
	
	public void setRightOperand(double rightOperand) {
		this.rightOperand = rightOperand;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public double calculate(leftOperand, operator, rightOperand) {
		double result = 0;
		if(operator.equals("+")) {
			result = leftOperand + rightOperand;
		}
		else if(operator.equals("-")) {
			result = leftOperand - rightOperand;
		}
		else if(operator.equals("*")) {
			result = leftOperand * rightOperand;
		}
		else if(operator.equals("/")) {
			result = leftOperand / rightOperand;
		}
		else if(operator.equals("^")) {
			result = Math.pow(leftOperand, rightOperand);
		}
		else if(operator.equals("log")) {
			result = leftOperand*Math.log(rightOperand);
		}
		return result;
		
	}
}
	
