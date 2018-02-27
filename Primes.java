//Класс Primes(выводит простые числа от 2 до 100)
  public class Primes 
  { 
  //Главный метод, выводящий простые числа
	public static void main(String[] args) 
	{ 
		for (int i=1; i<100; i++)
			if(isPrime(i)==true)
			System.out.print(" "+i);
		
	}
	//Функция проверяет, является ли число простым
	public static boolean isPrime(int n) 
	{
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n) + 1; i = i + 2) 
		{
            if (n % i == 0) {
                return false;
            }
        }
		return true;
    }
}
