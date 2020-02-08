package com.keerthi.hometask;
import com.keerthi.hometask.sweets.*;
import java.util.ArrayList;
public class Application<Sweet> {
    private GenComp gc;
    ArrayList<Sweet> sweets;
    public Application()
    {
        gc=new GenComp();
    }
    private void process()
    {
        int n= (int) (Math.random()*10);
        gc.generateGift(n);
    }
    public void start()
    {
        process();
    }
}
