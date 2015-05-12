import ScenTek.RenderablePoly;
import ScenTek.render.Vertex;
import ScenTek.geom.Poly;
import ScenTek.render.*;
import java.awt.Color;
import java.util.Random;
import ScenTek.Game;
import static org.lwjgl.glfw.GLFW.*;

public class Main extends Game{
    private RenderablePoly po;
    private Random gen;
    public static void main(String[] args){
        new Main("Hello!", true);
    }
    public Main(String name){
        this(name, false);
        
    }
    public Main(String name, boolean fullscreen) {
        super(name, fullscreen);
        run();
    }
    @Override
    public void initVars(){
        
        gen = new Random();
        Vertex[] p = new Vertex[]{
            new Vertex(0.0f, 0.0f),
            new Vertex(0.5f, 0.0f),
            new Vertex(0.5f, 0.5f),
            new Vertex(0.0f, 0.5f)
        };
        po = new RenderablePoly(Color.CYAN, p);
    }
    @Override
    public void interpretKeys(int key, int action){
        if(key == GLFW_KEY_SPACE && action == GLFW_RELEASE){
            po.toggleVisibility();
            if(po.isVisible()){
                po.setColor(new Color(gen.nextInt()));
            }
        }
        if(key == GLFW_KEY_F11 && action == GLFW_RELEASE){
            toggleFullscreen();
        }
        if(key == GLFW_KEY_ESCAPE){
            endGame();
        }
    }
    @Override
    public void update(double elapsed){
        
        po.render(Renderer.getInstance());
       
    }
}
