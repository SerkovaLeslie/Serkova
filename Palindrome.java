//Описание класса
public class Palindrome
{
	public static void main(String[] args)
	{
		for(int i=0; i<args.length;i++)
		{
			String str = args[i];
			System.out.print(" "+isPalindrome(str));
		}
	}
	//Изменяет символы в строке
	public static String reverseString(String s)
	{
		String newstr="";
		for(int i=s.length()-1;i>=0;--i)
			newstr += s.charAt(i);
		return newstr;
	}
	//Проверяет, является ли строка палиндромом
	public static boolean isPalindrome(String str)
	{
		if (str.equals(reverseString(str)))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
        return str.equals(reverseString(str));
	}
}
