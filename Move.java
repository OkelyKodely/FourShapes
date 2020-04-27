public class Move {
    FourShapes.Shape L = null;
    FourShapes.Shape Block = null;
    FourShapes.Shape S1 = null;
    FourShapes.Shape S2 = null;
    FourShapes.Shape Z1 = null;
    FourShapes.Shape Z2 = null;
    FourShapes.Shape Pyramid = null;
    String currentShape = "L";
    boolean[][] brd = new boolean[80][50];
    public Move(FourShapes.Shape L, FourShapes.Shape S1, FourShapes.Shape S2, FourShapes.Shape Pyramid, String currentShape, boolean[][] brd) {
        this.L = L;
        this.Block = Block;
        this.S1 = S1;
        this.S2 = S2;
        this.Z1 = Z1;
        this.Z2 = Z2;
        this.Pyramid = Pyramid;
        this.currentShape = currentShape;
        for(int i=0; i<80; i++) {
            for(int j=0; j<40; j++) {
                brd[i][j] = false;
            }
        }
    }
    public void mvLft() {
        if(currentShape.equals("L")) {
            L.x--;
            try {
                for(int i=0; i<80; i++) {
                    for(int j=0; j<35; j++) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            brd[L.pts.point12][L.pts.point11] = true;
            brd[L.pts.point22][L.pts.point21] = true;
            brd[L.pts.point32][L.pts.point31] = true;
            brd[L.pts.point42][L.pts.point41] = true;
            L.pts.point11--;
            L.pts.point21--;
            L.pts.point31--;
            L.pts.point41--;
        } else if(currentShape.equals("S2")) {
            S2.x--;
            try {
                for(int i=0; i<80; i++) {
                    for(int j=0; j<10; j++) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            brd[S2.pts.point12][S2.pts.point11] = true;
            brd[S2.pts.point22][S2.pts.point21] = true;
            brd[S2.pts.point32][S2.pts.point31] = true;
            brd[S2.pts.point42][S2.pts.point41] = true;
            S2.pts.point11--;
            S2.pts.point21--;
            S2.pts.point31--;
            S2.pts.point41--;
        } else if(currentShape.equals("S1")) {
            S1.x--;
            try {
                for(int i=0; i<80; i++) {
                    for(int j=0; j<10; j++) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            brd[S1.pts.point12][S1.pts.point11] = true;
            brd[S1.pts.point22][S1.pts.point21] = true;
            brd[S1.pts.point32][S1.pts.point31] = true;
            brd[S1.pts.point42][S1.pts.point41] = true;
            S1.pts.point11--;
            S1.pts.point21--;
            S1.pts.point31--;
            S1.pts.point41--;
        } else if(currentShape.equals("Pyramid")) {
            Pyramid.x--;
            try {
                for(int i=0; i<80; i++) {
                    for(int j=0; j<10; j++) {
                        brd[i][j] = false;
                    }
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
            brd[Pyramid.pts.point12][Pyramid.pts.point11] = true;
            brd[Pyramid.pts.point22][Pyramid.pts.point21] = true;
            brd[Pyramid.pts.point32][Pyramid.pts.point31] = true;
            brd[Pyramid.pts.point42][Pyramid.pts.point41] = true;
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
            brd[L.pts.point12][L.pts.point11] = true;
            brd[L.pts.point22][L.pts.point21] = true;
            brd[L.pts.point32][L.pts.point31] = true;
            brd[L.pts.point42][L.pts.point41] = true;
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
            try {
                brd[S2.pts.point12][S2.pts.point11] = true;
                brd[S2.pts.point22][S2.pts.point21] = true;
                brd[S2.pts.point32][S2.pts.point31] = true;
                brd[S2.pts.point42][S2.pts.point41] = true;
            } catch(Exception e) {}
            S2.pts.point11++;
            S2.pts.point21++;
            S2.pts.point31++;
            S2.pts.point41++;
         } else if(currentShape.equals("S1")) {
            S1.x++;
            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }
            brd[S1.pts.point12][S1.pts.point11] = true;
            brd[S1.pts.point22][S1.pts.point21] = true;
            brd[S1.pts.point32][S1.pts.point31] = true;
            brd[S1.pts.point42][S1.pts.point41] = true;
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
            brd[Pyramid.pts.point12][Pyramid.pts.point11] = true;
            brd[Pyramid.pts.point22][Pyramid.pts.point21] = true;
            brd[Pyramid.pts.point32][Pyramid.pts.point31] = true;
            brd[Pyramid.pts.point42][Pyramid.pts.point41] = true;
            Pyramid.pts.point11++;
            Pyramid.pts.point21++;
            Pyramid.pts.point31++;
            Pyramid.pts.point41++;
        }
    }
}