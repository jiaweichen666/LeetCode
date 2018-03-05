package p36ValidSudoku;

public class MatirxTraversal {
    public void travelsal(int [][] matirx){
        int i;
        int len = matirx.length;
        for (i = 0;i<9;i++)
            for (int j = 0;j<9;j++){
            int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
                System.out.print("RowIndex:"+RowIndex+" ColIndex:"+ColIndex);
                System.out.print(" i:"+ (RowIndex+j/3));
                System.out.println(" j:"+(ColIndex+j%3));
            }
    }
}
