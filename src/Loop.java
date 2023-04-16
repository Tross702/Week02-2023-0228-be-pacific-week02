public class Loop {
  public static void main2(String[] args) {
    // while
    // do... while
    // for
    
    // Deterministic
    for(int index = 0; index < 10; index++) {
      System.out.println("A");
    }
    
    //for( /* initialize */ ;  /* conditional */ ;  /* increment/next */ ) {
    //  // code we want to repeat
    //}
    
    for (int count = 0; count < 100; count++) {
      //System.out.println("FOR: " + count);
    }
    
    // Non-determinstic
    int count = 0;
    while(count < 100) {
      //System.out.println("WHILE: " + count);
      count++; //count = count + 1;
    }
    
    // /* initialize */
    // while ( /*conditional */ ) {
    //   // code we want to repeat
    //   /* increment / next */
    // }
    // do {
    // } while();
    
    for (int index = 0; index >= 0; index++) {
      System.out.println(index);
    }
    
    // game loop
    // while(! gameOver) {
    //   getInput();
    //   updatePosition();
    //   draw();
    // } // how fast we do this is? FPS
  }
}
