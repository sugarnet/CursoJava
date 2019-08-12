/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class ListRectangle {
    private List<Rectangle> list = new ArrayList<Rectangle>();

    public List<Rectangle> getList() {
        return list;
    }

    public void setList(List<Rectangle> list) {
        this.list = list;
    }
    
    public void setRectangle(Rectangle rectangle) {
        this.list.add(rectangle);
    }
}
