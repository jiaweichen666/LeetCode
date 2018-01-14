package p67AddBinary;

class Solution {
    public String addBinary(String a, String b) {
        char [] aArray = a.toCharArray();
        char [] bArray = b.toCharArray();
        int [] aint;
        int [] bint;
        int [] sum = new int[20];
        int lena = aArray.length;
        int lenb  = bArray.length;
        int i = 0;
        int f = 0;
        if ((lena -lenb)>0){
            i = lena-1;
        }else if(lena == lenb){
            i = lenb-1;
            f = 1;
        }else {
            i = lenb-1;
            f = 2;
        }
        if (f == 0){
                bint = new int[lena];
                aint = new int[lena];
                int n = lenb -1 ;
                int m  = i;
                for (;n>=0;m--,n--){
                    aint[m] = Character.getNumericValue(aArray[m]);
                    bint[m] = Character.getNumericValue(bArray[n]);
                }
                for(;m>=0;m--){
                    aint[m] = Character.getNumericValue(aArray[m]);
                }
            }else if (f==1){
            aint = new int[lena];
            bint = new int[lenb];
            int m = i;
            for (;m>=0;m--){
                aint[m] = Character.getNumericValue(aArray[m]);
                bint[m] = Character.getNumericValue(bArray[m]);
            }
        }else {
                aint = new int[lenb];
                bint = new int[lenb];
            int n = lena -1 ;
            int m  = i;
            for (;n>=0;m--,n--){
                aint[m] = Character.getNumericValue(aArray[n]);
                bint[m] = Character.getNumericValue(bArray[m]);
            }
            for(;m>=0;m--){
                bint[m] = Character.getNumericValue(bArray[m]);
            }
        }
        int flag = 0;
        int n  = i;
        String string = new String();
        while(n >= 0){
            aint[n] = aint[n]+bint[n]+flag;
            if (aint[n]>=2){
                aint[n] = aint[n]-2;
                flag = 1;
            }else {
                flag = 0;
            }
            n--;
        }
        if (flag ==1){
            for (int s:aint
                 ) {
                string = string+String.valueOf(s);
            }
            string = "1"+string;
            } else {
            for (int s:aint
                 ) {
                string = string+String.valueOf(s);
            }
        }
        return string;

    }
}