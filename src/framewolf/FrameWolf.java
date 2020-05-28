package framewolf;

import menus.Menu;
import renders.RenderWebCode;

public class FrameWolf {

    public static void main(String[] args) {

        //MigrateDatabase migrate = new MigrateDatabase();
        //System.out.println(migrate.generateInitialSQL().toString());
        Menu m = new Menu();
        RenderWebCode r = new RenderWebCode(m);

        System.out.println(r.generateMenu());

    }
}
