class Car{
    String model,color;

    public void setColor(String c){
        color = c;
    }

    public void setModel(String name){
        model = name;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }
}

class Maruti extends Car{
    public void compareColor(Maruti m){
        if(color.equals(m.color)){
            System.out.println("Same Color");
        }else{
            System.out.println("Different Color");
        }
    }

    public void compareModel(Maruti m){
        if(model.equals(m.model)){
            System.out.println("Same Model");
        }else{
            System.out.println("Different Model");
        }
    }
}

public class CompareFeatures {
    public static void main(String[] args){
        Maruti m1 = new Maruti();
        Maruti m2 = new Maruti();

        m1.setColor("red");
        m1.setModel("nano");

        m2.setColor("red");
        m2.setModel("wagonr");

        m1.compareColor(m2);
        m2.compareModel(m1);
    }
}
