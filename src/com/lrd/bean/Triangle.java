package com.lrd.bean;

public class Triangle {
	private Double a;
	private Double b;
	private Double c;
	private Double area;
	boolean istriangle = false;

	
	public boolean isIstriangle() {
		if(a+b>c && a+c>b && b+c>a){
			istriangle=true;
		}
		return istriangle;
	}
	public void setIstriangle(boolean istriangle) {
		this.istriangle = istriangle;
	}
	public Double getA() {
		return a;
	}
	public void setA(Double a) {
		this.a = a;
	}
	public Double getB() {
		return b;
	}
	public void setB(Double b) {
		this.b = b;
	}
	public Double getC() {
		return c;
	}
	public void setC(Double c) {
		this.c = c;
	}
	public Double getArea() {
		Double p = (a+b+c)/2;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}

}
