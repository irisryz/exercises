import java.util.Arrays;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int[][] arr = crea(4,4);
        String[][] stringArray = {
            {"Hello", "World", "!"},
            {"Java", "is", "fun"},
            {"Let's", "code", "more"}};
        System.out.println(longStr(stringArray));

        System.out.println(toString(crea(4,4)));
        
        //System.out.println(Arrays.deepToString(crea(4,4)));
        
        System.out.println(largestSum(arr));
        
        System.out.println(Arrays.toString(retC(arr, 2)));
    }
    
    public static int[][] crea(int rowCount, int columnCount) {
        int[][] ret = new int[rowCount][columnCount];
        for(int r = 0; r < rowCount; r++) {
            for (int c = 0; c < columnCount; c++) {
                ret[r][c] = r + c;
            }
        }
        return ret;
    }
    
    // note inefficient! i dont need to use up more memory to store my array ^_^
    public static int largestSum(int[][] list) {
        int[] sums = new int[list.length];
        int temp = 0;
        int place = list[0][0];
        
        for (int r = 0; r < list.length; r++) {
            for (int c = 0; c < list[0].length; c++) {
                temp += list[r][c];
            }
            sums[r] = temp;
            temp = 0;
        }
         
        for(int k = 0; k < sums.length; k++) {
            if(sums[k] > temp) {
                place = k;
            }
        }
        
        return place+1; 
    }
    
    public static int[] retC(int[][] list, int colIndex) {
        int[] ret = new int[list[0].length];
    
        for (int r = 0; r < list.length; r++) {
            ret[r] = list[r][colIndex];
        }
            
        return ret;
    }
    
    public static String toString(int[][] arr) {
        String ret = "";
        for(int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                ret += " ";
                ret += arr[r][c];
            }
            ret += " ";
            ret += "\n";
        }
        return ret;
    }
    // 2d array of strings, find the row that contains the longest string. if multiple rows have teh same longest string length, return the index of the first such row 

    public static int longStr(String[][]list) {
        int longestLen = 0;
        int index = 0; 

        for(int r = 0; r < list.length; r++) {
            for (int c = 0; c < list[0].length; c++) {
                if(list[r][c].length() > longestLen) {
                    index = r+1;
                }
            }
        }
        return index;
    }
    
    public static ArrayList countingNumbers(int par) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i =1 ; i <= par; i++) {
            list.add(i);
        }
        return list;
    }
    
    public static void remShort(ArrayList<String> list) {
        for (String str : list) {
            if (str.length() < 3) {
                list.remove(list.indexOf(str));
                }
            }
        }
    }
}
