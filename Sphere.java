class Sphere extends Shape implements Volume{
	public Sphere(double radius){
		super(radius,0,0,0);
	}
	public double calculateArea(){
		return (4 * 3.14 * dim_one * dim_one);
	}
	public double calculatePerimeter(){
		return 0; 
	}
	public double calculateVolume(){
		return 3.14 * dim_one * dim_one *dim_two;
	}
}
