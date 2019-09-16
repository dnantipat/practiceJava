package dollStore;

public class DollFactory {
    public static Doll createDollBody(String type) {
        if(type.equals("1"))
            return new NormalDoll();
        else if(type.equals("3"))
            return new FatDoll();
        else if(type.equals("2"))
            return new ThinDoll();
        else
            return new NormalDoll();
    }
    public static Doll createDollColor(String type,Doll doll) {
        if(type.equals("1"))
            return new BrownSkin(doll);
        else if(type.equals("2"))
            return new CreamSkin(doll);
        else if(type.equals("3"))
            return new WhiteSkin(doll);
        else
            return doll;
    }
    public static Doll createDollOptional(String type,Doll doll) {
        if(type.equals("1"))
            return new Shirt(doll,"Red");
        else if(type.equals("2"))
            return new Shirt(doll,"Yellow");
        else if(type.equals("3"))
            return new Shirt(doll,"Blue");
        else if(type.equals("4"))
            return new Shirt(doll,"Black");
        else if(type.equals("5"))
            return new Shirt(doll,"Pink");
        else if(type.equals("6"))
            return new Hat(doll);
        else if(type.equals("7"))
            return new Glasses(doll);
        else if(type.equals("8"))
            return new Necklace(doll);
        else
            return doll;
    }
}
