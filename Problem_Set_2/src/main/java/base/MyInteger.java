package base;

public class MyInteger {
	
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	public boolean isEven()
	{
		return (getiValue()%2)==0;
	}
	public boolean isOdd()
	{
		return (getiValue()%2)!=0;
	}
	public boolean isPrime()
	{
		for(int i=2;i<getiValue();i++)
		{
			if(getiValue()%i==0){
				return(false);
			}
			
		}
		return(true);
	}
	
	
	public static boolean isEvenint(){
		return(10%2==0);
	}
	public static boolean isOddint(){
		return(10%2!=0);
	}
	public static boolean isPrimeint(){
		for(int i=2;i<10;i++)
		{
			if(10%i==0){
				return(false);
			}
			
		}
		return(true);
	}
		public static boolean isEvenMyInteger(){
		return(13%2==0);
	}
	public static boolean isOddMyInteger(){
		return(13%2!=0);
	}
	public static boolean isPrimeMyInteger(){
		for(int i=2;i<13;i++)
		{
			if(13%i==0){
				return(false);
			}
			
		}
		return(true);
	}
	public boolean equalsint(){
		return iValue==10;
	}
	public boolean equalsMyInteger(){
		return iValue==13;
	}
}
