package com.vti.lesson4;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) Tạo 1 Class cha có tên là Car, bao gồm các thuộc tính và phương thức như
		 * sau: int speed; double regularPrice; String color ; double getSalePrice();
		 * 
		 * 2)Tạo 1 Class con của Class Car và có tên là Truck, bao gồm các thuộc tính và
		 * phương thức như sau: int weight; double getSalePrice(); // nếu weight > 2000
		 * thì discount 10%. Nếu không thì discount 20%
		 * 3) Tạo 1 Class con của Class Car
		 * và có tên là Ford, bao gồm các thuộc tính và phương thức như sau:  int year;
		 * int manufacturerDiscount;  double getSalePrice(); // Lấy giá sale từ Class
		 * Car, sau đó trừ đi manufacturerDiscount. 
		 * 4) Tạo 1 Class con của Class Car và
		 * có tên là Sedan, bao gồm các thuộc tính và phương thức như sau:  int length;
		 *  double getSalePrice(); //Nếu length > 20 feet thì discount 5%, nếu không
		 * discount 10% 
		 * 5) Tạo class MyOwnAutoShop có chứa phương thức main(), làm những
		 * điều sau: a) Tạo 1 instance của class Sedan và khởi tạo tất cả các thuộc tính
		 * với giá trị thích hợp. Sử dụng phương thức super(...) trong hàm khởi tạo để
		 * khởi tạo các thuộc tính của class cha. b) Tạo 2 instance của class Ford và
		 * khởi tạo tất cả các thuộc tính với giá trị thích hợp. Sử dụng phương thức
		 * super(...) trong hàm khởi tạo để khởi tạo các thuộc tính của class cha. c)
		 * Tạo 1 instance của class Car và khởi tạo tất cả các thuộc tính với giá trị
		 * thích hợp. d) Hiển thị giá sale của tất cả các instance
		 */
		 
		Sedan sedan1 = new Sedan(2000,15000,"Red",25);
		Ford  f1 = new Ford(3000, 20000, "blue", 2016,300);
		Ford  f2 = new Ford(7000, 30000, "pink", 2016,200);
		Car  car = new Car(1000, 12000, "black");
		
		System.out.println("regularPrice Of Sedan, ford1, ford2, Car");
		System.out.println(sedan1.getSalePrice());
		System.out.println(f1.getSalePrice());
		System.out.println(f2.getSalePrice());
		System.out.println(car.getSalePrice());

		

	}

}
