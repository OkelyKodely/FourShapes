import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class FourShapes implements KeyListener {
    Random random = new Random();    
    JFrame j = new JFrame();
    JPanel p = new JPanel();
    Graphics g = null;
    boolean[][] brd = new boolean[80][50];
    boolean[][] spaces = new boolean[80][50];
    String currentShape = "L";
    Move move;
    Shape L = new Shape();
    Shape Pyramid = new Shape();
    Shape Block = new Shape();
    Shape S1 = new Shape();
    Shape S2 = new Shape();
    public void rotate() {
        if(currentShape.equals("L")) {
            if(L.direction.equals("up")) {
                L.direction = "left";
                L.pts.point11 -= 3;
                L.pts.point12 += 3;
                L.pts.point21 -= 2;
                L.pts.point22 += 2;
                L.pts.point31 -= 1;
                L.pts.point32 += 1;
            } else if(L.direction.equals("left")) {
                L.direction = "down";
                L.pts.point11 += 3;
                L.pts.point12 += 3;
                L.pts.point21 += 2;
                L.pts.point22 += 2;
                L.pts.point31 += 1;
                L.pts.point32 += 1;
            } else if(L.direction.equals("down")) {
                L.direction = "right";
                L.pts.point11 += 3;
                L.pts.point12 -= 3;
                L.pts.point21 += 2;
                L.pts.point22 -= 2;
                L.pts.point31 += 1;
                L.pts.point32 -= 1;
            } else if(L.direction.equals("right")) {
                L.direction = "up";
                L.pts.point11 -= 3;
                L.pts.point12 -= 3;
                L.pts.point21 -= 2;
                L.pts.point22 -= 2;
                L.pts.point31 -= 1;
                L.pts.point32 -= 1;
            }
        }
        if(currentShape.equals("S1")) {
            if(S1.direction.equals("up")) {
                S1.direction = "left";
                S1.pts.point11 -= 2;
                S1.pts.point12 += 2;
                S1.pts.point21 -= 1;
                S1.pts.point22 += 1;
                S1.pts.point41 -= 1;
                S1.pts.point42 -= 1;
            } else if(S1.direction.equals("left")) { //from here suckors.. DOt.PEriOD
                S1.direction = "down";
                S1.pts.point11 += 3;
                S1.pts.point12 += 3;
                S1.pts.point21 += 2;
                S1.pts.point22 += 2;
                S1.pts.point31 += 1;
                S1.pts.point32 += 1;
            } else if(S1.direction.equals("down")) {
                S1.direction = "right";
                S1.pts.point11 += 3;
                S1.pts.point12 -= 3;
                S1.pts.point21 += 2;
                S1.pts.point22 -= 2;
                S1.pts.point31 += 1;
                S1.pts.point32 -= 1;
            } else if(S1.direction.equals("right")) {
                S1.direction = "up";
                S1.pts.point11 -= 3;
                S1.pts.point12 -= 3;
                S1.pts.point21 -= 2;
                S1.pts.point22 -= 2;
                S1.pts.point31 -= 1;
                S1.pts.point32 -= 1;
            }
        }
        if(currentShape.equals("S2")) {
            if(S2.direction.equals("up")) {
                S2.direction = "left";
                S2.pts.point11 -= 2;
                S2.pts.point12 += 2;
                S2.pts.point21 -= 1;
                S2.pts.point22 += 1;
                S2.pts.point41 -= 1;
                S2.pts.point42 -= 1;
            } else if(S2.direction.equals("left")) { //from here suckors.. DOt.PEriOD
                S2.direction = "down";
                S2.pts.point11 += 3;
                S2.pts.point12 += 3;
                S2.pts.point21 += 2;
                S2.pts.point22 += 2;
                S2.pts.point31 += 1;
                S2.pts.point32 += 1;
            } else if(S2.direction.equals("down")) {
                S2.direction = "right";
                S2.pts.point11 += 3;
                S2.pts.point12 -= 3;
                S2.pts.point21 += 2;
                S2.pts.point22 -= 2;
                S2.pts.point31 += 1;
                S2.pts.point32 -= 1;
            } else if(S2.direction.equals("right")) {
                S2.direction = "up";
                S2.pts.point11 -= 3;
                S2.pts.point12 -= 3;
                S2.pts.point21 -= 2;
                S2.pts.point22 -= 2;
                S2.pts.point31 -= 1;
                S2.pts.point32 -= 1;
            }
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            rotate();
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            move.mvLft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            move.mvRght();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            if (currentShape.equals("L")) {
                L.moveDown();
                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 40; j++) {
                        brd[i][j] = false;
                    }
                }
                try {
                    brd[L.pts.point12][L.pts.point11] = true;
                    brd[L.pts.point22][L.pts.point21] = true;
                    brd[L.pts.point32][L.pts.point31] = true;
                    brd[L.pts.point42][L.pts.point41] = true;
                } catch (Exception event){}                
            } else if (currentShape.equals("S2")) {
                S2.moveDown();
                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 40; j++) {
                        brd[i][j] = false;
                    }
                }
                try {
                    brd[S2.pts.point12][S2.pts.point11] = true;
                    brd[S2.pts.point22][S2.pts.point21] = true;
                    brd[S2.pts.point32][S2.pts.point31] = true;
                    brd[S2.pts.point42][S2.pts.point41] = true;
                } catch (Exception event){}
            } else if (currentShape.equals("S1")) {
                S1.moveDown();
                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 40; j++) {
                        brd[i][j] = false;
                    }
                }
                try {
                    brd[S1.pts.point12][S1.pts.point11] = true;
                    brd[S1.pts.point22][S1.pts.point21] = true;
                    brd[S1.pts.point32][S1.pts.point31] = true;
                    brd[S1.pts.point42][S1.pts.point41] = true;
                } catch (Exception event){}
            } else if (currentShape.equals("Pyramid")) {
                Pyramid.moveDown();
                for (int i = 0; i < 80; i++) {
                    for (int j = 0; j < 40; j++) {
                        brd[i][j] = false;
                    }
                }
                try {
                    brd[Pyramid.pts.point12][Pyramid.pts.point11] = true;
                    brd[Pyramid.pts.point22][Pyramid.pts.point21] = true;
                    brd[Pyramid.pts.point32][Pyramid.pts.point31] = true;
                    brd[Pyramid.pts.point42][Pyramid.pts.point41] = true;
                } catch (Exception event){}
            }
        }
    }
    public void keyTyped (KeyEvent e){}
    public void keyReleased (KeyEvent e){}
    class Shape {
        String direction = "up";
        int x = 5;
        int y = 0;
        Points pts = new Points();
        void moveDown() {
            y++;
            for(int i=0; i<80; i++) {
                for(int j=0; j<40; j++) {
                    brd[i][j] = false;
                }
            }
            try {
                brd[this.pts.point12][this.pts.point11] = true;
                brd[this.pts.point22][this.pts.point21] = true;
                brd[this.pts.point32][this.pts.point31] = true;
                brd[this.pts.point42][this.pts.point41] = true;
            } catch (Exception e){}
            this.pts.point12++;
            this.pts.point22++;
            this.pts.point32++;
            this.pts.point42++;
        }
    }
    public FourShapes() {
        for(int i=0; i<80; i++) {
            for(int j=0; j<50; j++) {
                brd[i][j] = false;
            }
        }
        for(int i=0; i<80; i++) {
            for(int j=0; j<50; j++) {
                spaces[i][j] = false;
            }
        }
        createGUI();
        try {
            runGame();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void checkTopStack() {
        for(int j=0; j<80; j++) {
            for(int i=0; i<45; i++) {
                if(L.pts.point11 == i)
                    if(L.pts.point12 == j - 1 && !spaces[i][j])
                    {
                    }    

                if(L.pts.point21 == i)
                    if(L.pts.point22 == j - 1 && !spaces[i][j])
                    {
                    }

                if(L.pts.point31 == i)
                    if(L.pts.point32 == j - 1 && !spaces[i][j])
                    {
                    }

                if(L.pts.point41 == i)
                    if(L.pts.point42 == j - 1 && !spaces[i][j])
                    {
                    }
            }
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
                        move = new Move(L, S1, S2, Pyramid, currentShape, brd);
                        L.moveDown();
                        if(L.y >= 15) {
                            System.out.println(L.pts.point11);
                            System.out.println(L.pts.point12);
                            spaces[L.pts.point12][L.pts.point11] = true;
                            spaces[L.pts.point22][L.pts.point21] = true;
                            spaces[L.pts.point32][L.pts.point31] = true;
                            spaces[L.pts.point42][L.pts.point41] = true;
                            int selectionShape = random.nextInt(4);
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
                                currentShape = "Pyramid";
                                Pyramid.x = 5;
                                Pyramid.y = 0;
                                Pyramid.pts.point11 = Pyramid.x;
                                Pyramid.pts.point12 = Pyramid.y+1;
                                Pyramid.pts.point21 = Pyramid.x;
                                Pyramid.pts.point22 = Pyramid.y+1;
                                Pyramid.pts.point31 = Pyramid.x+1;
                                Pyramid.pts.point32 = Pyramid.y+1;
                                Pyramid.pts.point41 = Pyramid.x+2;
                                Pyramid.pts.point42 = Pyramid.y+1;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                            }
                        }
                    } else if(currentShape.equals("S1")) {
                        move = new Move(L, S1, S2, Pyramid, currentShape, brd);
                        if(S1.y >= 15) {
                            System.out.println(S1.pts.point11);
                            System.out.println(S1.pts.point12);
                            spaces[S1.pts.point12][S1.pts.point11] = true;
                            spaces[S1.pts.point22][S1.pts.point21] = true;
                            spaces[S1.pts.point32][S1.pts.point31] = true;
                            spaces[S1.pts.point42][S1.pts.point41] = true;
                            int selectionShape = random.nextInt(4);
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
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
                                Pyramid.pts.point42 = Pyramid.y+1;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                            }
                        }
                        S1.moveDown();
                    } else if(currentShape.equals("S2")) {
                        move = new Move(L, S1, S2, Pyramid, currentShape, brd);
                        if(S2.y >= 15) {
                            System.out.println(S2.pts.point11);
                            System.out.println(S2.pts.point12);
                            spaces[S2.pts.point12][S2.pts.point11] = true;
                            spaces[S2.pts.point22][S2.pts.point21] = true;
                            spaces[S2.pts.point32][S2.pts.point31] = true;
                            spaces[S2.pts.point42][S2.pts.point41] = true;
                            int selectionShape = random.nextInt(4);
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
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
                                Pyramid.pts.point42 = Pyramid.y+1;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                            }
                        }
                        S2.moveDown();
                    } else if(currentShape.equals("Pyramid")) {
                        System.out.println(Pyramid.pts.point11);
                        System.out.println(Pyramid.pts.point12);
                        spaces[Pyramid.pts.point12][Pyramid.pts.point11] = true;
                        spaces[Pyramid.pts.point22][Pyramid.pts.point21] = true;
                        spaces[Pyramid.pts.point32][Pyramid.pts.point31] = true;
                        spaces[Pyramid.pts.point42][Pyramid.pts.point41] = true;
                        move = new Move(L, S1, S2, Pyramid, currentShape, brd);
                        if(Pyramid.y >= 15) {
                            int selectionShape = random.nextInt(4);
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 1) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 2) {
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
                                Pyramid.x = -1000;
                            } else if(selectionShape == 3) {
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
                                Pyramid.pts.point42 = Pyramid.y+1;
                                L.x = -1000;
                                Block.x = -1000;
                                S1.x = -1000;
                                S2.x = -1000;
                            }
                        }
                        Pyramid.moveDown();
                    }
                    checkTopStack();
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
        g = p.getGraphics();
        if(currentShape.equals("L")) {
            try {
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, 1500, 1800);
                g.setColor(Color.BLACK);
                g.fillRect(L.pts.point11*40, L.pts.point12*40, 40, 40);
                g.fillRect(L.pts.point21*40, L.pts.point22*40, 40, 40);
                g.fillRect(L.pts.point31*40, L.pts.point32*40, 40, 40);
                g.fillRect(L.pts.point41*40, L.pts.point42*40, 40, 40);
            } catch (Exception e) {}
        } else if(currentShape.equals("S1")) {
            try {
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, 1500, 1800);
                g.setColor(Color.BLACK);
                g.fillRect(S1.pts.point11*40, S1.pts.point12*40, 40, 40);
                g.fillRect(S1.pts.point21*40, S1.pts.point22*40, 40, 40);
                g.fillRect(S1.pts.point31*40, S1.pts.point32*40, 40, 40);
                g.fillRect(S1.pts.point41*40, S1.pts.point42*40, 40, 40);
            } catch (Exception e) {}
        } else if(currentShape.equals("S2")) {
            try {
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, 1500, 1800);
                g.setColor(Color.BLACK);
                g.fillRect(S2.pts.point11*40, S2.pts.point12*40, 40, 40);
                g.fillRect(S2.pts.point21*40, S2.pts.point22*40, 40, 40);
                g.fillRect(S2.pts.point31*40, S2.pts.point32*40, 40, 40);
                g.fillRect(S2.pts.point41*40, S2.pts.point42*40, 40, 40);
            } catch (Exception e) {}
        } else if(currentShape.equals("Pyramid")) {
            try {
                g.setColor(Color.YELLOW);
                g.fillRect(0, 0, 1500, 1800);
                g.setColor(Color.BLACK);
                g.fillRect(Pyramid.pts.point11*40, Pyramid.pts.point12*40, 40, 40);
                g.fillRect(Pyramid.pts.point21*40, Pyramid.pts.point22*40, 40, 40);
                g.fillRect(Pyramid.pts.point31*40, Pyramid.pts.point32*40, 40, 40);
                g.fillRect(Pyramid.pts.point41*40, Pyramid.pts.point42*40, 40, 40);
            } catch (Exception e) {}
        }
        g.setColor(Color.BLACK);
        for(int i=0; i<80; i++) {
            for(int j=0; j<25; j++) {
                if(spaces[i][j])
                    g.fillRect(j*40, i*40, 40, 40);
            }
        }
    }
    void createGUI() {
        j.setTitle("L rotateS ~");
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