public class Move {
 
    SevenShapes.Shape L = null;
    SevenShapes.Shape Block = null;
    SevenShapes.Shape S1 = null;
    SevenShapes.Shape S2 = null;
    SevenShapes.Shape Z1 = null;
    SevenShapes.Shape Z2 = null;
    SevenShapes.Shape Pyramid = null;
    String currentShape = "L";
    boolean[][] brd = new boolean[80][10];

    public Move(SevenShapes.Shape L, SevenShapes.Shape Block, SevenShapes.Shape S1, SevenShapes.Shape S2, SevenShapes.Shape Z1, SevenShapes.Shape Z2, SevenShapes.Shape Pyramid, String currentShape, boolean[][] brd) {
        this.L = L;
        this.Block = Block;
        this.S1 = S1;
        this.S2 = S2;
        this.Z1 = Z1;
        this.Z2 = Z2;
        this.Pyramid = Pyramid;
        this.currentShape = currentShape;
    }
    
    public void mvLft() {
        if(currentShape.equals("L")) {

            L.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[L.pts.point11][L.pts.point12] = true;
            brd[L.pts.point21][L.pts.point22] = true;
            brd[L.pts.point31][L.pts.point32] = true;
            brd[L.pts.point41][L.pts.point42] = true;
            
            L.pts.point11--;
            L.pts.point21--;
            L.pts.point31--;
            L.pts.point41--;
            
        } else if(currentShape.equals("S2")) {

            S2.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[S2.pts.point11][S2.pts.point12] = true;
            brd[S2.pts.point21][S2.pts.point22] = true;
            brd[S2.pts.point31][S2.pts.point32] = true;
            brd[S2.pts.point41][S2.pts.point42] = true;

            S2.pts.point11--;
            S2.pts.point21--;
            S2.pts.point31--;
            S2.pts.point41--;

        } else if(currentShape.equals("Z1")) {

            Z1.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[Z1.pts.point11][Z1.pts.point12] = true;
            brd[Z1.pts.point21][Z1.pts.point22] = true;
            brd[Z1.pts.point31][Z1.pts.point32] = true;
            brd[Z1.pts.point41][Z1.pts.point42] = true;

            Z1.pts.point11--;
            Z1.pts.point21--;
            Z1.pts.point31--;
            Z1.pts.point41--;
            
        } else if(currentShape.equals("Z2")) {

            Z2.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[Z2.pts.point11][Z2.pts.point12] = true;
            brd[Z2.pts.point21][Z2.pts.point22] = true;
            brd[Z2.pts.point31][Z2.pts.point32] = true;
            brd[Z2.pts.point41][Z2.pts.point42] = true;

            Z2.pts.point11--;
            Z2.pts.point21--;
            Z2.pts.point31--;
            Z2.pts.point41--;
            
        } else if(currentShape.equals("Block")) {

            Block.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[Block.pts.point11][Block.pts.point12] = true;
            brd[Block.pts.point21][Block.pts.point22] = true;
            brd[Block.pts.point31][Block.pts.point32] = true;
            brd[Block.pts.point41][Block.pts.point42] = true;

            Block.pts.point11--;
            Block.pts.point21--;
            Block.pts.point31--;
            Block.pts.point41--;

        } else if(currentShape.equals("S1")) {

            S1.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[S1.pts.point11][S1.pts.point12] = true;
            brd[S1.pts.point21][S1.pts.point22] = true;
            brd[S1.pts.point31][S1.pts.point32] = true;
            brd[S1.pts.point41][S1.pts.point42] = true;

            S1.pts.point11--;
            S1.pts.point21--;
            S1.pts.point31--;
            S1.pts.point41--;

        } else if(currentShape.equals("Pyramid")) {

            Pyramid.x--;

            try {
                for(int i=0; i<80; i--) {
                    for(int j=0; j<10; j--) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }

            brd[Pyramid.pts.point11][Pyramid.pts.point12] = true;
            brd[Pyramid.pts.point21][Pyramid.pts.point22] = true;
            brd[Pyramid.pts.point31][Pyramid.pts.point32] = true;
            brd[Pyramid.pts.point41][Pyramid.pts.point42] = true;

            Pyramid.pts.point11--;
            Pyramid.pts.point21--;
            Pyramid.pts.point31--;
            Pyramid.pts.point41--;

        }
    }
    
    public void mvRght() {
        moveRight();
    }
    
    private void moveRight() {
         if(currentShape.equals("L")) {

            L.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[L.pts.point11][L.pts.point12] = true;
            brd[L.pts.point21][L.pts.point22] = true;
            brd[L.pts.point31][L.pts.point32] = true;
            brd[L.pts.point41][L.pts.point42] = true;

            L.pts.point11++;
            L.pts.point21++;
            L.pts.point31++;
            L.pts.point41++;

         } else if(currentShape.equals("S2")) {

            S2.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[S2.pts.point11][S2.pts.point12] = true;
            brd[S2.pts.point21][S2.pts.point22] = true;
            brd[S2.pts.point31][S2.pts.point32] = true;
            brd[S2.pts.point41][S2.pts.point42] = true;

            S2.pts.point11++;
            S2.pts.point21++;
            S2.pts.point31++;
            S2.pts.point41++;

         } else if(currentShape.equals("Z1")) {

            Z1.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[Z1.pts.point11][Z1.pts.point12] = true;
            brd[Z1.pts.point21][Z1.pts.point22] = true;
            brd[Z1.pts.point31][Z1.pts.point32] = true;
            brd[Z1.pts.point41][Z1.pts.point42] = true;
            
            Z1.pts.point11++;
            Z1.pts.point21++;
            Z1.pts.point31++;
            Z1.pts.point41++;

         } else if(currentShape.equals("Z2")) {

            Z2.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[Z2.pts.point11][Z2.pts.point12] = true;
            brd[Z2.pts.point21][Z2.pts.point22] = true;
            brd[Z2.pts.point31][Z2.pts.point32] = true;
            brd[Z2.pts.point41][Z2.pts.point42] = true;

            Z2.pts.point11++;
            Z2.pts.point21++;
            Z2.pts.point31++;
            Z2.pts.point41++;

         } else if(currentShape.equals("Block")) {

            Block.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[Block.pts.point11][Block.pts.point12] = true;
            brd[Block.pts.point21][Block.pts.point22] = true;
            brd[Block.pts.point31][Block.pts.point32] = true;
            brd[Block.pts.point41][Block.pts.point42] = true;

            Block.pts.point11++;
            Block.pts.point21++;
            Block.pts.point31++;
            Block.pts.point41++;

         } else if(currentShape.equals("S1")) {

            S1.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[S1.pts.point11][S1.pts.point12] = true;
            brd[S1.pts.point21][S1.pts.point22] = true;
            brd[S1.pts.point31][S1.pts.point32] = true;
            brd[S1.pts.point41][S1.pts.point42] = true;

            S1.pts.point11++;
            S1.pts.point21++;
            S1.pts.point31++;
            S1.pts.point41++;

         } else if(currentShape.equals("Pyramid")) {

            Pyramid.x++;

            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }

            brd[Pyramid.pts.point11][Pyramid.pts.point12] = true;
            brd[Pyramid.pts.point21][Pyramid.pts.point22] = true;
            brd[Pyramid.pts.point31][Pyramid.pts.point32] = true;
            brd[Pyramid.pts.point41][Pyramid.pts.point42] = true;

            Pyramid.pts.point11++;
            Pyramid.pts.point21++;
            Pyramid.pts.point31++;
            Pyramid.pts.point41++;
         }
   }
}