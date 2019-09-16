package dollStore;

public class ShowShapeOfBodyMenu implements Command {
    private Menu menu;
    public ShowShapeOfBodyMenu(Menu menu){
        this.menu=menu;
    }
    @Override
    public void execute() {
        menu.shapeOfBodyMenu();
    }
}
