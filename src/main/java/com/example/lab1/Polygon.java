package com.example.lab1;

import java.util.Locale;

public class Polygon {
    private Point [] points;
    Polygon(int nump){
        points=new Point [nump];
    };
    public void setP(int i,Point nw){
    points[i]=nw;
    }
    public void setA(Point []pts){
        points=pts;
    }

    public String toSvg(){
        String s="";
        for(Point p: points){
            s+=p.x+","+p.y+" ";
        }
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" />",s);
    }
}
