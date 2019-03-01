package cap04;

public class Circle {
	private Double radius;
	private Double diameter;
	private Double area;
	public Circle() {
		radius = 1.0;
		diameter = radius*2;
		area = Math.PI*Math.pow(radius, 2.0); 
	}
	public Double getRadius() {
		return radius;
	}
	public Double getDiameter() {
		return diameter;
	}
	public Double getArea() {
		return area;
	}
	public void setRadius(Double radio) {
		radius = radio;
		diameter = radius*2;
		area = Math.PI*Math.pow(radius, 2.0); 
	}
}
