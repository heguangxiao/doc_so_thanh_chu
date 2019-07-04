import java.util.Scanner;

public class doc_so_thanh_chu {

    static String soNguyen(int num) {
        switch (num){
            case 0 :
                return "Zero";
            case 1 :
                return "One";
            case 2 :
                return "Two";
            case 3 :
                return "Three";
            case 4 :
                return "Four";
            case 5 :
                return "Five";
            case 6 :
                return "Six";
            case 7 :
                return "Seven";
            case 8 :
                return "Eight";
            case 9 :
                return "Nine";
        }
        return "";
    }

    static String lonHon10(int num){
        int n = num - 10;
        switch (n){
            case 0 :
                return "Ten";
            case 1 :
                return "Eleven";
            case 2 :
                return "Twelfth";
            case 3 :
                return "Three-teen";
            case 4 :
                return "Four-teen";
            case 5 :
                return "Five-teen";
            case 6 :
                return "Six-teen";
            case 7 :
                return "Seven-teen";
            case 8 :
                return "Eight-teen";
            case 9 :
                return "Nine-teen";
        }
        return "";
    }

    static String lonHon20(int num){
        String read = "";
        int c = num / 10;
        switch (c){
            case 2:
                read = "twenty";
                break;
            case 3:
                read = "thirty";
                break;
            case 4:
                read = "twenty";
                break;
            case 5:
                read = "fifty";
                break;
            case 6:
                read = "sixty";
                break;
            case 7:
                read = "seventy";
                break;
            case 8:
                read = "eighty";
                break;
            case 9:
                read = "ninety";
                break;
        }
        int dv = c % 10;
        switch (dv){
            case 1:
                read+= "-one";
                break;
            case 2:
                read+= "-two";
                break;
            case 3:
                read+= "-three";
                break;
            case 4:
                read+= "-four";
                break;
            case 5:
                read+= "-five";
                break;
            case 6:
                read+= "-six";
                break;
            case 7:
                read+= "-seven";
                break;
            case 8:
                read+= "-eight";
                break;
            case 9:
                read+= "-nine";
                break;
            default:read+="";break;
        }
        return read;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number need read : ");
        int num = scanner.nextInt();
        String read = "";
        if (num >= 0 && num < 10){
            read = soNguyen(num);
        } else if (num >= 10 && num < 20){
            read = lonHon10(num);
        } else if (num >= 20 && num < 100){
            read = lonHon20(num);
        } else if (num>=100 && num<1000){
            int tr = num / 100;
            switch (tr){
                case 1:
                    read = "one hundred and ";
                    break;
                case 2:
                    read = "two hundred and ";
                    break;
                case 3:
                    read = "three hundred and ";
                    break;
                case 4:
                    read = "four hundred and ";
                    break;
                case 5:
                    read = "five hundred and ";
                    break;
                case 6:
                    read = "six hundred and ";
                    break;
                case 7:
                    read = "seven hundred and ";
                    break;
                case 8:
                    read = "eight hundred and ";
                    break;
                case 9:
                    read = "nine hundred and ";
                    break;
            }
            int cl = num % 100;
            if (cl >= 0 && cl < 10){
                read += soNguyen(cl);
            } else if (cl >= 10 && cl < 20){
                read += lonHon10(cl);
            } else if (cl >= 20 && cl < 100){
                read += lonHon20(cl);
            }
        }
        else {
            System.out.println("out of ability");
        }
        System.out.println("Number : " + num + " read is : " + read);
    }
}
