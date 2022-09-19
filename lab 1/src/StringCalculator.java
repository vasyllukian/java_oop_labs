import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
class StringCalculator{
	public int add(String numbers) throws Exception {
		if(numbers == "") {
			return 0;
		} else if (numbers.startsWith("//")){
			Matcher matches = Pattern.compile("//(.)\n(.*)").matcher(numbers);
			matches.matches();
			String the_delimiter = matches.group(1);
			String numbers_with_custom = matches.group(2);
			String[] actual_numbers = numbers_with_custom.split(the_delimiter);
			int sum = 0;
			List<String> negatives = new ArrayList<String>();
			for (int i = 0; i < actual_numbers.length; i++) {
				if (Integer.parseInt(actual_numbers[i]) >= 0 && Integer.parseInt(actual_numbers[i]) <= 1000) {
					sum = sum + Integer.parseInt(actual_numbers[i]);
				}
				if (Integer.parseInt(actual_numbers[i]) < 0) {
					negatives.add(actual_numbers[i]);
				}
			if (negatives.size() > 0) {
				System.out.println("Список негативних елементів" + Arrays.toString(negatives.toArray()));
				throw new Exception("Негативні елементи не дозволені");
			}
			}
			return sum;
		} else if (numbers.startsWith("//[")) {
			Matcher matches = Pattern.compile("//[.+]\n(.*)").matcher(numbers);
			matches.matches();
			String the_delimiter = matches.group(1);
			String numbers_with_custom = matches.group(2);
			String[] actual_numbers = numbers_with_custom.split(the_delimiter);
			int sum = 0;
			List<String> negatives = new ArrayList<String>();
			for (int i = 0; i < actual_numbers.length; i++) {
				if (Integer.parseInt(actual_numbers[i]) >= 0 && Integer.parseInt(actual_numbers[i]) <= 1000) {
					sum = sum + Integer.parseInt(actual_numbers[i]);
				}
				if (Integer.parseInt(actual_numbers[i]) < 0) {
					negatives.add(actual_numbers[i]);
				}
			if (negatives.size() > 0) {
				System.out.println("Список негативних елементів" + Arrays.toString(negatives.toArray()));
				throw new Exception("Негативні елементи не дозволені");
			}
			}
			return sum;
		} else if (numbers.contains(",") || numbers.contains("\n")) {
			if (numbers.contains(",\n") || numbers.contains("\n,")) {
				System.out.println("Некоректні вхідні дані, нова строка може бути замість коми але не поруч з нею");
				return 0;
			}
			String[] actual_numbers_withoutnewline = numbers.split("\n");
			String[] actual_numbers_withoutnewline_and_coma_but_with_null = new String[1000];
			List<String> actual_numbers = new ArrayList<String>();
			List<String> negatives = new ArrayList<String>();
			int sum = 0;
			int j = 0;
			for (String s: actual_numbers_withoutnewline) {
				for (String t: s.split(",")) {
					actual_numbers_withoutnewline_and_coma_but_with_null[j++] = t;
				}
			}
			for (String m: actual_numbers_withoutnewline_and_coma_but_with_null) {
				if (m != null && m.length() > 0) {
					actual_numbers.add(m);
				}
			}
			actual_numbers_withoutnewline_and_coma_but_with_null = actual_numbers.toArray(new String[actual_numbers.size()]);
			for (int i = 0; i < actual_numbers_withoutnewline_and_coma_but_with_null.length; i++) {
				if (Integer.parseInt(actual_numbers_withoutnewline_and_coma_but_with_null[i]) >= 0 && Integer.parseInt(actual_numbers_withoutnewline_and_coma_but_with_null[i]) <= 1000) {
					sum = sum + Integer.parseInt(actual_numbers_withoutnewline_and_coma_but_with_null[i]);
				}
				if (Integer.parseInt(actual_numbers_withoutnewline_and_coma_but_with_null[i]) < 0) {
					negatives.add(actual_numbers_withoutnewline_and_coma_but_with_null[i]);
				}
			}
			if (negatives.size() > 0) {
				System.out.println("Список негативних елементів" + Arrays.toString(negatives.toArray()));
				throw new Exception("Негативні елементи не дозволені");
			}
			return sum;
		} else {
			int actual_number = 0;
	        actual_number = Integer.parseInt(numbers);
	        return actual_number;
	    }
	}
}

