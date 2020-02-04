
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square grass;
    private Square wall1;
    private Square wall2;
    private Square wall3;
    private Square door;
    private Square woodroof;
    private Square woodroof2;
    
    private Triangle roof1;
    private Triangle roof2;
    private Triangle roof3;
    private Triangle roof4;
    
    private Circle win1;
    private Circle bush1;
    private Circle bush2;

    private Circle[] stones = new Circle[4];
    
    private Square[] wins1 = new Square[3];
    private Square[] wins2 = new Square[4];
    private Square[] fence = new Square[18];

    private Triangle[] trees = new Triangle[7];
    private Triangle[] trees2 = new Triangle[4];

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    { 
        grass = new Square();
        grass.changeColor("#9ad04d");
        grass.moveVertical(170);
        grass.moveHorizontal(0);
        grass.changeSize(550,250);

        for(int i=0; i<7; i++){
            trees[i] = new Triangle();
            trees[i].changeColor("#418d3a");
            trees[i].changeSize(190, 100);
            trees[i].moveHorizontal((i*90));
            trees[i].moveVertical(0);
        }

        for(int i=0; i<4; i++){
            trees2[i] = new Triangle();
            trees2[i].changeColor("#356331");
            trees2[i].changeSize(200, 110);
            trees2[i].moveHorizontal(30+(i*150));
            trees2[i].moveVertical(0);
            wins2[i] = new Square();
            wins2[i].changeColor("#aaaaaa");
            wins2[i].changeSize(50, 90);
            wins2[i].moveHorizontal(108+(i*57));
            wins2[i].moveVertical(185);
            stones[i] = new Circle();
            stones[i].changeColor("#cccccc");
            stones[i].changeSize(45+(i*7), 23+(i*7));            
            stones[i].moveVertical(290+(i*27));    
        }
        
        for(int i=0; i<3; i++){
            wins1[i] = new Square();
            wins1[i].changeColor("#aaaaaa");
            wins1[i].changeSize(30, 60);
            wins1[i].moveHorizontal(300+(i*35));
            wins1[i].moveVertical(100);
            wins1[i].makeVisible();
        }

        wall1 = new Square();
        wall1.changeColor("#ffffff");
        wall1.moveVertical(140);
        wall1.moveHorizontal(100);
        wall1.changeSize(360,145);
                
        roof2 = new Triangle();
        roof2.changeColor("#946749");
        roof2.moveVertical(40);
        roof2.moveHorizontal(350);
        roof2.changeSize(100,250);
        
        roof3 = new Triangle();
        roof3.changeColor("#ffffff");
        roof3.moveVertical(50);
        roof3.moveHorizontal(350);
        roof3.changeSize(90,230);
                       
        roof1 = new Triangle();
        roof1.changeColor("#946749");
        roof1.moveVertical(100);
        roof1.moveHorizontal(400);
        roof1.changeSize(80,180);
        
        roof4 = new Triangle();
        roof4.changeColor("#ffffff");
        roof4.moveVertical(110);
        roof4.moveHorizontal(400);
        roof4.changeSize(70,155);
        
        door = new Square();
        door.changeColor("#946749");
        door.changeSize(50, 80);
        door.moveHorizontal(377);
        door.moveVertical(200);
        
        woodroof = new Square();
        woodroof.changeColor("#946749");
        woodroof.changeSize(160, 12);
        woodroof.moveHorizontal(90);
        woodroof.moveVertical(130);
        
        woodroof2 = new Square();
        woodroof2.changeColor("#946749");
        woodroof2.changeSize(113, 7);
        woodroof2.moveHorizontal(340);
        woodroof2.moveVertical(180);
            
        win1 = new Circle();
        win1.changeColor("#946749");
        win1.moveHorizontal(389);
        win1.moveVertical(145);
        win1.changeSize(25,25);        

        for(int i=0; i<18; i++){
            fence[i] = new Square();
            fence[i].changeColor("#ffffff");
            fence[i].changeSize(10, 40);
            fence[i].moveHorizontal(20+(i*20));
            fence[i].moveVertical(270);
        }
        
        stones[0].moveHorizontal(380);
        stones[1].moveHorizontal(400);
        stones[2].moveHorizontal(360);
        stones[3].moveHorizontal(295);
                
        bush1 = new Circle();
        bush1.changeColor("#356331");
        bush1.moveHorizontal(420);
        bush1.moveVertical(260);
        bush1.changeSize(300,300);        
        
        bush2 = new Circle();
        bush2.changeColor("#356331");
        bush2.moveHorizontal(-180);
        bush2.moveVertical(260);
        bush2.changeSize(300,300);               
        
        //Set visibility=============
        grass.makeVisible();
        for(int i=0; i<7; i++)
            trees[i].makeVisible();
        for(int i=0; i<4; i++)
            trees2[i].makeVisible();       
        wall1.makeVisible();
        roof2.makeVisible();
        roof3.makeVisible();
        for(int i=0; i<3; i++)
            wins1[i].makeVisible();
        roof1.makeVisible();        
        roof4.makeVisible();        
        for(int i=0; i<4; i++)
            wins2[i].makeVisible();
        door.makeVisible();
        woodroof.makeVisible();
        woodroof2.makeVisible();  
        win1.makeVisible();
        for(int i=0; i<18; i++)
            fence[i].makeVisible();        
        for(int i=0; i<4; i++)
            stones[i].makeVisible(); 
        bush1.makeVisible();
        bush2.makeVisible(); 

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(grass != null)   // only if it's painted already...
        {
            grass.changeColor("#000000");
            //window.changeColor("#FFFFFF");
            //tree.changeColor("#000000");
            //sun.changeColor("#000000");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(grass != null)   // only if it's painted already...
        {
            grass.changeColor("#ff0000");
            //window.changeColor("#000000");
            //tree.changeColor("#00ff00");
            //sun.changeColor("#ffff00");
        }
    }

}
