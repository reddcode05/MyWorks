for (int i = 1; i <= 10; i++) {
    for (int j = 1; j <= 15; j++) {
        System.out.print("* ");
    }
    System.out.println("");
}
OUTPUT:
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
  * * * * * * * * * * * * * * * 
==============================================
int limit = 10;
for (int i = 1; i <= limit; i++) {
    for (int j = 1; j <= limit; j++) {
        if (i==1||j==1||i==limit||j==limit) {
            System.out.print("* ");
        }else{
            System.out.print("  ");
        }
    }    
    System.out.println("");
}
OUTPUT:
  * * * * * * * * * * 
  *                 * 
  *                 * 
  *                 * 
  *                 * 
  *                 * 
  *                 * 
  *                 * 
  *                 * 
  * * * * * * * * * * 
