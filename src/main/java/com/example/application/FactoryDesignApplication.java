package com.example.application;

public class FactoryDesignApplication {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape = shapeFactory.getShape("circle"); // passed information is used of creating type of object.
		
		shape.draw();
	}
}
