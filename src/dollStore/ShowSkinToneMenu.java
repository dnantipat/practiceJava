package dollStore;

public class ShowSkinToneMenu implements  Command{
    private Menu menu;
    public ShowSkinToneMenu(Menu menu){
        this.menu=menu;
    }

    @Override
    public void execute() {
        menu.skinToneMenu();
    }
}
