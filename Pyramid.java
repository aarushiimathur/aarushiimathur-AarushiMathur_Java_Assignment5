class Pyramid extends Shape implements Volume{
	public Pyramid(double length, double width,double height){
		super(length,width,height,5);
	}
	public double calculateArea(){
		double baseArea = dim_one * dim_two; 
        double slantHeight = Math.sqrt((dim_one / 2) * (dim_one / 2) + dim_three * dim_three);
        double lateralArea = 2 * (dim_one * slantHeight / 2) + 2 * (dim_two * slantHeight / 2);
        return baseArea + lateralArea;
	}
	public double calculatePerimeter(){
		return 2 * (dim_one + dim_two);
	}
	public double calculateVolume(){
		return (1.0 / 3) * dim_one * dim_two * dim_three;
	}
	
}
