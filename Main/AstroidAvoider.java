public class AstroidAvoider {

    Game game;
    
    public AstroidAvoider(){
    game = new Game(1000, 800, "Astroid Avoider");
        game.getScreenFactory().showScreen(new ScreenFix(game.getScreenFactory()));
    }
    
    
    public static void main(String[] args) {
        new AstroidAvoider();
    }
}
