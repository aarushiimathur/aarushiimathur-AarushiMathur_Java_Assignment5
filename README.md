**Shape Calculator**

**Description**
This Java program allows users to calculate the area, perimeter, and volume (if applicable) of various geometric shapes, including circles, rectangles, squares, spheres, cylinders, and pyramids. It uses object-oriented programming (OOP) concepts such as inheritance, abstraction, and interfaces.

**Features**
1. Calculate area and perimeter for:
2. Circle
3. Rectangle
4. Square
5. Calculate surface area and volume for:
  1. Sphere
  2. Cylinder
  3. Pyramid
6. Interactive menu-based system for user input
   
**Usage**
1. Run the program.
2. Select a shape from the menu.
3. Enter the required dimensions.
4. View the calculated area, perimeter, and volume (if applicable).
5. Repeat for other shapes or exit the program.
   
**Code Structure**
Main.java: Contains the main logic and user interaction.
Shape.java: Abstract base class with common attributes and methods.
Circle.java, Rectangle.java, Square.java: Inherit from Shape and implement shape-specific calculations.
Sphere.java, Cylinder.java, Pyramid.java: Inherit from Shape and implement Volume interface for 3D shapes.
