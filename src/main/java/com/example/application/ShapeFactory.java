package com.example.application;

/*
 * @author: Manas Verma
 * 
 * this is factory class used to create object based on certain information.
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		else if (shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else {
			return null;
		}
	}
}
