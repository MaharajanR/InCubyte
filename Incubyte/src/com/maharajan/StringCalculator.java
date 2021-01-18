package com.maharajan;

public class StringCalculator {
    private int ans = 0;

    public int Add(String numbers) {
        System.out.println("Numbers = " + numbers);
        if (numbers.isEmpty()) {
            return ans;
        } else {
            if (numbers.indexOf("-") < 0) {
                numbers = numbers.replaceAll("\n", ",");
                String val = numbers;
                String[] parseVal = val.split(",");
                int length = parseVal.length;
                System.out.println("Length == " + length);
                for (int i = 0; i < length; i++) {
                    ans += Integer.parseInt(parseVal[i]);
                }
            }else{
                throw new RuntimeException("“negatives not allowed");
            }
            return ans;
        }
    }

}
