package org.example;

public class Board {
    Shape [] shapes;

    public Board() {
        this.shapes = new Shape[4];
    }
    public void addShpape (Shape shape) {
        for (int i=0; i<this.shapes.length; i++) {
            if(shapes[i]== null) {
                shapes[i]=shape;
            }else {
                System.out.println("The board already contains 4 pieces " +
                        "before adding a new piece delete one of the existing ones");
            }
        }
    }


}
