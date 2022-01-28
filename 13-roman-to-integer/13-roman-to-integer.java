class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'I':
                    if (i + 1 == arr.length) {
                        sum = sum + 1;
                    } else if (arr[i + 1] == 'V') {
                        sum = sum + 4;
                        i = i + 1;
                    } else if (arr[i + 1] == 'X') {
                        sum = sum + 9;
                        i = i + 1;
                    }
                    else{
                        sum = sum + 1;
                    }

                    break;
                case 'V':
                    sum = sum + 5;
                    break;

                case 'X':

                    if (i + 1 == arr.length) {
                        sum = sum + 10;
                    } else if (arr[i + 1] == 'L') {
                        sum = sum + 40;
                        i = i + 1;
                    } else if (arr[i + 1] == 'C') {
                        sum = sum + 90;
                        i = i + 1;
                    }
                    else{
                        sum = sum + 10;
                    }
                    break;
                case 'L':
                    sum = sum + 50;
                    break;
                case 'C':
                    if (i + 1 == arr.length) {
                        sum = sum + 100;
                    } else if (arr[i + 1] == 'D') {
                        sum = sum + 400;
                        i = i + 1;
                    } else if (arr[i + 1] == 'M') {
                        sum = sum + 900;
                        i = i + 1;
                    } 
       
                    else{
                        sum = sum + 100;
                    }

                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;

            }
        }

        return sum;
    }
    
}