public class RemoveLeadingZeroesInAString{


public static void main(String[] args){
		
		String s = removeZeros("00000123789");
        System.out.println(s);
	}
	
	
	
	public static String removeZeros(String s){
	
        if(s.charAt(0)!='0') return "-1";

        String strWithoutZero = "";
		for(int i = 0; i<s.length(); i++){

			char ch = s.charAt(i);
			if(Character.isDigit(ch)){
                
                int num = Integer.parseInt(ch+"");
                if(num!=0)  strWithoutZero += num;
            }
		}
		
        return strWithoutZero;
	}
}
