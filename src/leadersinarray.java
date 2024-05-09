import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class leadersinarray {
    static void leaderarr(int  [] arr){
        for(int i=0;i<arr.length;i++){
            boolean isleader=true;
            for (int j=i+1;j< arr.length;j++){

                if(arr[j]>=arr[i]){
                    isleader=false;
                    break;
                }

            }
            if(isleader==true){
                System.out.println(arr[i]);
            }
        }
    }
    //optimized
    static ArrayList<Integer> leaders(int [] arr){
        ArrayList<Integer> result=new ArrayList<Integer>();
        int curLeader=arr[arr.length-1];
        result.add(curLeader);
        for(int i= arr.length-2;i>=0;i--){
            if(curLeader<arr[i]){
                curLeader=arr[i];
                result.add(curLeader);
            }
            Collections.sort(result,Collections.reverseOrder());
        }

        return result;
    }

    public static void main(String[] args) {
        int [] a={8,11,5,11,7,6,3};
        leaderarr(a);
        ArrayList<Integer> result=new ArrayList<Integer>();
        result=leaders(a);
        System.out.println(result);
    }
}
