package dollStore;

public class ShowOptionalMenu implements Command{
    private Menu menu;
    public ShowOptionalMenu(Menu menu){
        this.menu=menu;
    }

    @Override
    public void execute() {
        menu.optionalMenu();
    }
}
