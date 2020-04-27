
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SevenShapes implements KeyListener {

    JFrame j = new JFrame();

    JPanel p = new JPanel();

    Graphics g = null;

    String currentShape = "L";

    boolean[][] brd = new boolean[80][10];
    boolean[][] spaces = new boolean[80][10]; // Brd..set?
    Shape L = new Shape();
    Shape Block = new Shape();
    Shape S1 = new Shape();
    Shape S2 = new Shape();
    Shape Z1 = new Shape();
    Shape Z2 = new Shape();
    Shape Pyramid = new Shape();

    Move move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            move.mvLft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            move.mvRght();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (currentShape.equals("L")) {

                L.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[L.pts.point12][L.pts.point11] = true;
                    brd[L.pts.point22][L.pts.point21] = true;
                    brd[L.pts.point32][L.pts.point31] = true;
                    brd[L.pts.point42][L.pts.point41] = true;
                } catch(Exception event) {
                    
                }
                
            } else if (currentShape.equals("S2")) {

                S2.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[S2.pts.point12][S2.pts.point11] = true;
                    brd[S2.pts.point22][S2.pts.point21] = true;
                    brd[S2.pts.point32][S2.pts.point31] = true;
                    brd[S2.pts.point42][S2.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            } else if (currentShape.equals("Z1")) {

                Z1.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[Z1.pts.point12][Z1.pts.point11] = true;
                    brd[Z1.pts.point22][Z1.pts.point21] = true;
                    brd[Z1.pts.point32][Z1.pts.point31] = true;
                    brd[Z1.pts.point42][Z1.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            } else if (currentShape.equals("Z2")) {

                Z2.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[Z2.pts.point12][Z2.pts.point11] = true;
                    brd[Z2.pts.point22][Z2.pts.point21] = true;
                    brd[Z2.pts.point32][Z2.pts.point31] = true;
                    brd[Z2.pts.point42][Z2.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            } else if (currentShape.equals("Block")) {

                Block.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[Block.pts.point12][Block.pts.point11] = true;
                    brd[Block.pts.point22][Block.pts.point21] = true;
                    brd[Block.pts.point32][Block.pts.point31] = true;
                    brd[Block.pts.point42][Block.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            } else if (currentShape.equals("S1")) {

                S1.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[S1.pts.point12][S1.pts.point11] = true;
                    brd[S1.pts.point22][S1.pts.point21] = true;
                    brd[S1.pts.point32][S1.pts.point31] = true;
                    brd[S1.pts.point42][S1.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            } else if (currentShape.equals("Pyramid")) {

                Pyramid.moveDown();

                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 10; j++) {
                        brd[i][j] = false;
                    }
                }

                try {
                    brd[Pyramid.pts.point12][Pyramid.pts.point11] = true;
                    brd[Pyramid.pts.point22][Pyramid.pts.point21] = true;
                    brd[Pyramid.pts.point32][Pyramid.pts.point31] = true;
                    brd[Pyramid.pts.point42][Pyramid.pts.point41] = true;
                } catch(Exception event) {
                    
                }

            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    class Shape {

        int x = 5;
        int y = 0;

        Points pts = new Points();

        void moveDown() {
            y++;
            
            for(int i=0; i<80; i++) {
                for(int j=0; j<10; j++) {
                    brd[i][j] = false;
                }
            }
            
            try {
                brd[this.pts.point12][this.pts.point11] = true;
                brd[this.pts.point22][this.pts.point21] = true;
                brd[this.pts.point32][this.pts.point31] = true;
                brd[this.pts.point42][this.pts.point41] = true;
            } catch(Exception e) {
                
            }
            
            this.pts.point12++;
            this.pts.point22++;
            this.pts.point32++;
            this.pts.point42++;
        }
    }

    void rotate() {
        if (currentShape.equals("L")) {
            L.pts.point11 += 1;
            L.pts.point12 += 1;
            L.pts.point21 += 1;
            L.pts.point22 += 1;
            L.pts.point31 += 1;
            L.pts.point32 += 1;
            L.pts.point41 += 1;
            L.pts.point42 += 1;
        } else if (currentShape.equals("Z1")) {
            Z1.pts.point11 += 1;
            Z1.pts.point12 += 1;
            Z1.pts.point21 += 1;
            Z1.pts.point22 += 1;
            Z1.pts.point31 += 1;
            Z1.pts.point32 += 1;
            Z1.pts.point41 += 1;
            Z1.pts.point42 += 1;
        } else if (currentShape.equals("Z2")) {
            Z2.pts.point11 += 1;
            Z2.pts.point12 += 1;
            Z2.pts.point21 += 1;
            Z2.pts.point22 += 1;
            Z2.pts.point31 += 1;
            Z2.pts.point32 += 1;
            Z2.pts.point41 += 1;
            Z2.pts.point42 += 1;
        } else if (currentShape.equals("Block")) {
            S1.pts.point11 += 1;
            S1.pts.point12 += 1;
            S1.pts.point21 += 1;
            S1.pts.point22 += 1;
            S1.pts.point31 += 1;
            S1.pts.point32 += 1;
            S1.pts.point41 += 1;
            S1.pts.point42 += 1;
        } else if (currentShape.equals("Pyramid")) {
            S2.pts.point11 += 1;
            S2.pts.point12 += 1;
            S2.pts.point21 += 1;
            S2.pts.point22 += 1;
            S2.pts.point31 += 1;
            S2.pts.point32 += 1;
            S2.pts.point41 += 1;
            S2.pts.point42 += 1;
        }
    }

    public SevenShapes() {
        
        createGUI();
        
        try {
            runGame();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    void runGame() throws Exception {
        currentShape = "L";
        L.pts.point11 = L.x;
        L.pts.point12 = L.y;
        L.pts.point21 = L.x;
        L.pts.point22 = L.y+1;
        L.pts.point31 = L.x;
        L.pts.point32 = L.y+2;
        L.pts.point41 = L.x;
        L.pts.point42 = L.y+3;

        Random random = new Random();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(currentShape.equals("L")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        L.moveDown();
                        
                        if(L.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }
                    } else if(currentShape.equals("S1")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(S1.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }

                        S1.moveDown();
                    } else if(currentShape.equals("S2")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(S2.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }

                        S2.moveDown();
                    } else if(currentShape.equals("Z1")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(Z1.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }

                        Z1.moveDown();
                    } else if(currentShape.equals("Z2")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(Z2.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }

                        Z2.moveDown();
                    } else if(currentShape.equals("Block")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(Block.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }
                         
                        Block.moveDown();
                        
                    } else if(currentShape.equals("Pyramid")) {
                        move = new Move(L, Block, S1, S2, Z1, Z2, Pyramid, currentShape, brd);
                        
                        if(Pyramid.y >= 10) {
                            int selectionShape = random.nextInt(7);
                            if(selectionShape == 0) {
                                currentShape = "L";
                                L.x = 5;
                                L.y = 0;
                                L.pts.point11 = L.x;
                                L.pts.point12 = L.y;
                                L.pts.point21 = L.x;
                                L.pts.point22 = L.y+1;
                                L.pts.point31 = L.x;
                                L.pts.point32 = L.y+2;
                                L.pts.point41 = L.x;
                                L.pts.point42 = L.y+3;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
                                currentShape = "Block";
                                Block.x = 5;
                                Block.y = 0;
                                Block.pts.point11 = Block.x;
                                Block.pts.point12 = Block.y;
                                Block.pts.point21 = Block.x+1;
                                Block.pts.point22 = Block.y;
                                Block.pts.point31 = Block.x;
                                Block.pts.point32 = Block.y+1;
                                Block.pts.point41 = Block.x+1;
                                Block.pts.point42 = Block.y+1;
                                L.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
                                currentShape = "S1";
                                S1.x = 5;
                                S1.y = 0;
                                S1.pts.point11 = S1.x+1;
                                S1.pts.point12 = S1.y;
                                S1.pts.point21 = S1.x+1;
                                S1.pts.point22 = S1.y+1;
                                S1.pts.point31 = S1.x+2;
                                S1.pts.point32 = S1.y+2;
                                S1.pts.point41 = S1.x;
                                S1.pts.point42 = S1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "S2";
                                S2.x = 5;
                                S2.y = 0;
                                S2.pts.point11 = S2.x;
                                S2.pts.point12 = S2.y;
                                S2.pts.point21 = S2.x;
                                S2.pts.point22 = S2.y+1;
                                S2.pts.point31 = S2.x;
                                S2.pts.point32 = S2.y+2;
                                S2.pts.point41 = S2.x+1;
                                S2.pts.point42 = S2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 4) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x+1;
                                Pyramid.pts.point12 = Pyramid.y;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Z2.x = -1000;
                            } else if(selectionShape == 5) {
                                currentShape = "Z1";
                                Z1.x = 5;
                                Z1.y = 0;
                                Z1.pts.point11 = Z1.x+1;
                                Z1.pts.point12 = Z1.y;
                                Z1.pts.point21 = Z1.x+1;
                                Z1.pts.point22 = Z1.y+1;
                                Z1.pts.point31 = Z1.x;
                                Z1.pts.point32 = Z1.y+1;
                                Z1.pts.point41 = Z1.x;
                                Z1.pts.point42 = Z1.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z2.x = -1000;
                                Pyramid.x = -1000;
                            } else if(selectionShape == 6) {
                                currentShape = "Z2";
                                Z2.x = 5;
                                Z2.y = 0;
                                Z2.pts.point11 = Z2.x;
                                Z2.pts.point12 = Z2.y;
                                Z2.pts.point21 = Z2.x;
                                Z2.pts.point22 = Z2.y+1;
                                Z2.pts.point31 = Z2.x+1;
                                Z2.pts.point32 = Z2.y+1;
                                Z2.pts.point41 = Z2.x+1;
                                Z2.pts.point42 = Z2.y+2;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                                Z1.x = -1000;
                                Pyramid.x = -1000;
                            }
                        }

                        Pyramid.moveDown();
                    }

                    ///  .filear screen
                    g.setColor(Color.YELLOW);
                    g.fillRect(0, 0, 500, 800);
                    
                    drawShape();
                    
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        ////thread.join();
        thread.start();
    }
    
    void drawShape() {
        g.setColor(Color.red);
        if(currentShape.equals("L")) {
            g.fillRect(L.pts.point11*40, L.pts.point12*40, 40, 40);
            g.fillRect(L.pts.point21*40, L.pts.point22*40, 40, 40);
            g.fillRect(L.pts.point31*40, L.pts.point32*40, 40, 40);
            g.fillRect(L.pts.point41*40, L.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("S1")) {
            g.fillRect(S1.pts.point11*40, S1.pts.point12*40, 40, 40);
            g.fillRect(S1.pts.point21*40, S1.pts.point22*40, 40, 40);
            g.fillRect(S1.pts.point31*40, S1.pts.point32*40, 40, 40);
            g.fillRect(S1.pts.point41*40, S1.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("S2")) {
            g.fillRect(S2.pts.point11*40, S2.pts.point12*40, 40, 40);
            g.fillRect(S2.pts.point21*40, S2.pts.point22*40, 40, 40);
            g.fillRect(S2.pts.point31*40, S2.pts.point32*40, 40, 40);
            g.fillRect(S2.pts.point41*40, S2.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("Z1")) {
            g.fillRect(Z1.pts.point11*40, Z1.pts.point12*40, 40, 40);
            g.fillRect(Z1.pts.point21*40, Z1.pts.point22*40, 40, 40);
            g.fillRect(Z1.pts.point31*40, Z1.pts.point32*40, 40, 40);
            g.fillRect(Z1.pts.point41*40, Z1.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("Z2")) {
            g.fillRect(Z2.pts.point11*40, Z2.pts.point12*40, 40, 40);
            g.fillRect(Z2.pts.point21*40, Z2.pts.point22*40, 40, 40);
            g.fillRect(Z2.pts.point31*40, Z2.pts.point32*40, 40, 40);
            g.fillRect(Z2.pts.point41*40, Z2.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("Pyramid")) {
            g.fillRect(Pyramid.pts.point11*40, Pyramid.pts.point12*40, 40, 40);
            g.fillRect(Pyramid.pts.point21*40, Pyramid.pts.point22*40, 40, 40);
            g.fillRect(Pyramid.pts.point31*40, Pyramid.pts.point32*40, 40, 40);
            g.fillRect(Pyramid.pts.point41*40, Pyramid.pts.point42*40, 40, 40);
        }
        if(currentShape.equals("Block")) {
            g.fillRect(Block.pts.point11*40, Block.pts.point12*40, 40, 40);
            g.fillRect(Block.pts.point21*40, Block.pts.point22*40, 40, 40);
            g.fillRect(Block.pts.point31*40, Block.pts.point32*40, 40, 40);
            g.fillRect(Block.pts.point41*40, Block.pts.point42*40, 40, 40);
        }
    }

    void createGUI() {
        j.setLayout(null);
        j.setBounds(0, 0, 500, 800);
        p.setBounds(j.getBounds());
        j.add(p);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        
        j.addKeyListener(this);

        g = p.getGraphics();
    }
}
