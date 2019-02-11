package Lab1_java;

public class Shoes 
{
 private String manufacturer = "Albano";
 private String color = "Black";
 private int price = 4000;
 private int size = 38;

 private String country = "Italy"; //// country of production
 private String material = "Leather"; // material of production
 
 private static int numberOfShoesBought = 7168; //number of shoes bought
 
 protected String forWhomItIsIntended = "For women "; //shoes for men or women
 protected String typeOfShoes = "Boots";//type of shoes
  
   
    public Shoes(String manufacturer, String color, int price, int size) 
    {
	   this();
	   this.manufacturer=manufacturer;
	   this.color=color;
	   this.price=price;
	   this.size=size;
    }
    public Shoes(String manufacturer, String color, int price, int size, String country, String material, String forWhomItIsIntended, String typeOfShoes)
    {
	   this(manufacturer, color, price, size);
	   this.country=country;
	   this.material=material;
	   this.forWhomItIsIntended=forWhomItIsIntended;
	   this.typeOfShoes=typeOfShoes;
    }
    public Shoes() 
    {
	 numberOfShoesBought++;
    }
	
	public void setManufacturer(String manufacturer)
  	{	this.manufacturer =manufacturer ;}
  	public String getManufacturer()
  	{	return manufacturer;}
  	
  	public void setColor(String color)
	{	this.color = color;}
	public String getColor()
	{	return color;}
	
	public void setPrice(int price)
	{	this.price = price;}
	public int getPrice()
	{	return price;}
	
	public void setSize(int size)
	{	this.size = size;}
	public int getSize()
	{	return size;}
	
	public void setCountry(String country)
	{	this.country = country;}
	public String getCountry()
	{	return country;}

	public void setMaterial(String material)
	{	this.material = material;}
	public String getMaterial()
	{	return material;}
 
	public String toString()
	{
	return    " manufacturer: "+manufacturer+
				"\n color: "+color+
				"\n price: "+price+"$"+
				"\n size: "+size+ "cm"+
				"\n country: "+country+
				"\n material: "+material+
				"\n for whom it is intended: "+forWhomItIsIntended+
				"\n type of shoes: "+typeOfShoes+
				"\n";
    }
	public static void printStaticNumberOfShoesBought()
	{
			System.out.println(numberOfShoesBought);
	}
	public void printNumberOfShoesBought()
	{
			System.out.println(numberOfShoesBought);
	}
	 
	
	public void resetValues(String manufacturer, String color, int price, int size, String country, String material, String forWhomItIsIntended, String typeOfShoes)
	{
		this.manufacturer = manufacturer;
		this.color = color;
		this.price = price;
		this.size = size;
		this.country = country;
		this.material = material;
		this.forWhomItIsIntended = forWhomItIsIntended;
		this.typeOfShoes = typeOfShoes;
	}
    public static void main(String[] args)
	{
			Shoes boots1 = new Shoes();
			Shoes boots2 = new Shoes(
					"Alban", "black", 4000, 38);
			Shoes boots3 = new Shoes("Aldo Brue", "black", 4750, 40, "Italy", "Leather", "For women ", "Boots");
			System.out.println(boots1);
			System.out.println(boots2);
			System.out.println(boots3);			
			Shoes.printStaticNumberOfShoesBought();
			boots1.printNumberOfShoesBought();
	}
}
