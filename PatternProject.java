import javax.swing.*;
public class PatternProject
{
    void SquarePattern()
    {
        System.out.println("---------- Square Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 5 ; i++){
            for ( j = 1 ; j <= 5 ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    void Tringle()
    {
        System.out.println("---------- Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 4 ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?" ":"X ");
            }
            System.out.println();
        }
    }
    void LeftTringlePattern()
    {
          System.out.println("---------- Left Tringle Pattern ----------");
        int i , j;
        for( i = 1 ;  i <= 5 ; i++){
            for( j = 1 ; j <= i ; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
    void rightTringlePattern()
    {
        
        System.out.println("---------- Right Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 4  ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?"  ":"X ");
            }
            System.out.println();
        }
        
    }
    void InverseLeftTringlePattern()
    {
        
        System.out.println("---------- Inverse-Left Tringle Pattern ----------");
        int i , j , k;
        for( i = 1 , k = 5  ;  i <= 5 ; i++ , k--){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<=k)?"X ":"  ");
            }
            System.out.println();
        }
    }
    void InverseRightTringlePattern()
    {
       
        System.out.println("---------- Inverse-Right Tringle Pattern ----------");
        int i , j;
        for( i = 1  ;  i <= 5 ; i++){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print((j<i)?"  ":"X ");
            }
            System.out.println();
        }
    }
    void EmptySquerPattern()
    {
        
         System.out.println("---------- Empty Squer Pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 5 ; i++){
            for( j = 1 ; j <= 5 ; j++){
                System.out.print(((i==1&&j<=5)||(j==1&&i<=5)||(i==5&&j<=5)||(j==5&&i<=5))?"X ":"  ");
            }
            System.out.println();
        }
    }
    void SquareFramewithCross()
    {
         
        System.out.println("---------- Square Frame with Cross ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
    }
   void Boxwithcrosslines()
   {
          System.out.println("---------- Box with cross lines ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i==5||j==5))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void BorderedXpattern()
   {
            System.out.println("---------- Bordered X pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((j==1&&i<=9)||(j==9&&i<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void XBarpattern()
   {
        System.out.println("---------- X-Bar pattern ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(i==9&&j<=9)||(i==j)||(i+j==10))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void Starinabox()
   {
                System.out.println("---------- Star in a box ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j<=9)||(j==1&&i<=9)||(i==9&&j<=9)||(j==9&&i<=9)||(i+j==6)||(j-i==4)||(i-j==4)||(i+j==14))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void Swastic()
   {
          System.out.println("---------- Swastic ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j>=5)||(j==1&&i<=5)||(i==9&&j<=5)||(j==9&&i>=5)||(i==5||j==5))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void DiamondPattern()
   {
     System.out.println("---------- Diamond Pattern ---------\n");
        for(int i = 1; i <= 5; i++) {
            for(int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--) {
            for(int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
   }
   void MirroredHookcross()
   {
        System.out.println("---------- Mirrored Hook cross ----------");
        int i , j ;
        for( i = 1 ;  i <= 9 ; i++){
            for( j = 1 ; j <= 9 ; j++){
                System.out.print(((i==1&&j>=5)||(j==1&&i>=5)||(i==9&&j<=5)||(j==9&&i<=5)||(i==5&&j>=1)||(j==5&&i>=1))?"X ":"  ");
            }
            System.out.println();
        }
   }
   void CrossPattern()
   {
     System.out.println("---------- Cross Pattern  ---------\n");
        
         int i , j ,k ,l;
        for (i = 1 , l = 5 , k = 5 ; i <= 5 ; i++ , k-- ,l++){
            for (j = 1 ; j <= 9 ; j++){
                System.out.print((j<=5)?(j<=k)?"X ":"  ":(j>=l)?"X ":"  ");
            }
            System.out.println();
        }
   }
   void XStarpattern()
   {
        System.out.println("--------- X-Star pattern ---------");
       int i , j ;
        for( i = 1 ; i <= 9 ; i++){
        for ( j = 1 ; j <= 9 ; j++){
            System.out.print(((i+j==6)||(j-i==4)||(i-j==4)||(i+j==14))?"X ":"  ");
        }
        System.out.println();
       }
   }
   void ButterflyPattern()
   {
      System.out.println("---------- Butterfly Pattern ---------\n");
        int n = 5;

        // Upper Half
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            for(int j = 1; j <= 2*(n - i); j++)
                System.out.print("  ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // Lower Half
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            for(int j = 1; j <= 2*(n - i); j++)
                System.out.print("  ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
   }
   void CubePattern()
   {
        System.out.println("---------- Cube Pattern ---------\n");
        int i, j;
        for ( i = 1 ; i <= 10 ; i++){
            for ( j = 1 ; j <= 10 ; j++){
                System.out.print((!(i==j&&i>=7))?((i==1&&j<=7)||(j==1&&i<=7)||(i==7&&j<=7)||(i<=7&&j==7))?"X ":(i>=4&&j>=4)?((i==4&&j>=4)||(i>=4&&j==4)||(i==10&&j>=4)||(i>=4&&j==10))?"X ":"  ":((i==j)||(i-j==7)||(j-i==6))?"X ":"  ":"X ");
            }
            System.out.println();
         }
   }
   void ChristmasTreepattern()
   {
      System.out.println("---------- Christmas Tree pattern ---------\n");
      int height = 5;  // Number of layers
        int space = height + 3;

        // Tree leaves - 3 triangles stacked
        for (int k = 1; k <= 3; k++) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= space - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print("*");
                System.out.println();
            }
        }

        // Tree trunk
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= space - 1; j++)
                System.out.print(" ");
            System.out.println("***");
        }
   }
    static void MainModule()
    {
        System.out.println("Pattern Generator");
        System.out.println("1. SquerPattern\t\t\t2.TringlePattern\t");
        System.out.println("3. Left Tringle Pattern\t\t4. right Tringle Pattern");
        System.out.println("5. Inverse-Left Tringle Pattern\t6.Inverse-Right Tringle Pattern");
        System.out.println("7. Empty Squer Pattern\t\t8. Square Frame with Cross");
        System.out.println("9. Box with cross lines\t\t10. Bordered X pattern ");
        System.out.println("11. X-Bar pattern\t\t12. Star in a box ");
        System.out.println("13. Swastic\t\t\t14. Diamond Pattern ");
        System.out.println("15. Mirrored Hook cross\t\t16. Cross Pattern ");
        System.out.println("17. X-Star pattern\t\t18. Butterfly Pattern");
        System.out.println("19. Cube Pattern\t\t20. Christmas Tree pattern");
        String c;
        System.out.println("Choose any one of them....");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        PatternProject p = new PatternProject();
        if (c.equals("1")){
            p.SquarePattern();
        }
        else if (c.equals("2")){
            p.Tringle();
        }
        else if (c.equals("3")){
            p.LeftTringlePattern();
        }
         else if (c.equals("4")){
            p.rightTringlePattern();
        }
         else if (c.equals("5")){
            p.InverseLeftTringlePattern();
        }
         else if (c.equals("6")){
            p.InverseRightTringlePattern();
        }
         else if (c.equals("7")){
            p.EmptySquerPattern();
        }
        else if (c.equals("8")){
            p.SquareFramewithCross();
        }
         else if (c.equals("9")){
            p.Boxwithcrosslines();
        }
         else if (c.equals("10")){
            p.BorderedXpattern();
        }
         else if (c.equals("11")){
            p.XBarpattern();
        }
         else if (c.equals("12")){
            p.Starinabox();
        }
         else if (c.equals("13")){
            p.Swastic();
        }
         else if (c.equals("14")){
            p.DiamondPattern();
        }
         else if (c.equals("15")){
            p.MirroredHookcross();
        }
         else if (c.equals("16")){
            p.CrossPattern();
        }
         else if (c.equals("17")){
            p.XStarpattern();
        }
         else if (c.equals("18")){
            p.ButterflyPattern();
        }
         else if (c.equals("19")){
            p.CubePattern();
        }
         else if (c.equals("20")){
            p.ChristmasTreepattern();
        }
        System.out.println("\nDo you want to continue.. Press 1 else any key");
        c = JOptionPane.showInputDialog("Enter Your Choice --- ");
        if (c.equals("1")){
            MainModule();
        }
    }
    public static void main(String args[]){
        MainModule();
    }
}