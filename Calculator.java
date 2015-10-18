package TDD;

public class stringCalculator {
    	public static int add(String text){
            	String delimeter = "!|n";
            	String numWoutDelimeter = text;
            	if(text.startsWith("//")){
                    	int Index = text.indexOf("//") + 2;
                    	delimeter = text.substring(Index, Index + 1);
                    	numWoutDelimeter = text.substring(text.indexOf("n") + 1);
            	}
            	return sum(numWoutDelimeter, delimeter);
    	}

    	private static int toInt(String number){
        	return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String delimeter){
        	return numbers.split(delimeter);
	}

	private static int sum(String numbers, String delimeter){
        	int total = 0;
        	String[] arr = numbers.split(delimeter);
        	for(String number : arr){
                	if (!number.trim().isEmpty()) {
                	total += toInt(number.trim());
                	}
        	}
        	return total;
	}
}
