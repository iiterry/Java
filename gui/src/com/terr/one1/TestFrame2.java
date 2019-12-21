package com.terr.one1;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.red);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.BLUE);
    }
}

class MyFrame extends Frame{
    static int id = 0;//可能存在多个窗口,需要一个计数器
    public MyFrame(int x, int y, int w, int h,Color color){
        super("MyFrame+"+(++id));
        setBounds(x,y,w,h);
        setResizable(true);
        setBackground(color);
        setVisible(true);
    }
}
