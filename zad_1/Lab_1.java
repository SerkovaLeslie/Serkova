import java.util.Scanner;
//Класс, вычисляющий площадь треугольника
public class Lab_1
{
	//Ввод 3ех точек и вычисление области
	public static void main(String[] args)
	{
		Point3d[] point = new Point3d[]{new Point3d(), new Point3d(), new Point3d()};
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<3;i++)
		{
			System.out.print("Введите координаты точки\n");
			point[i].setX(Double.parseDouble(scanner.next()));
			point[i].setY(Double.parseDouble(scanner.next()));
			point[i].setZ(Double.parseDouble(scanner.next()));
		}
		//Сравнение точек
		if(point[0].equals(point[1]) || point[0].equals(point[2]) || point[1].equals(point[2]))
			System.out.print("точки равны\n");
		//Вывод области
		else
			System.out.print("область равна "+ computeArea(point[0],point[1],point[2]));
	}
	//Вычисление площади треугольника
	public static double computeArea(Point3d a, Point3d b, Point3d c)
	{
		double AB, AC, BC;
		AB=a.distanceTo(b);
		AC=a.distanceTo(c);
		BC=b.distanceTo(c);
		double S=0.5*(AB+AC+BC);
		return Math.sqrt(S*(S-AB)*(S-AC)*(S-BC));
	}
}