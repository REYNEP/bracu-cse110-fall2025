import java.awt.event.WindowEvent;
import org.lwjgl.vulkan.VkInstance;

public class entryPoint {
    public static void main(String[] argumentVec) 
    {
        java.awt.event.WindowListener EventKonsument1 = new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        /**
         * AWT Provides it's own EventConsumers(win32 key/mouse/HCI events) + TheMainLoop
         */

        java.awt.Frame  window1 = new java.awt.Frame("White AWT Window");
                        window1.setSize(1080, 1080);
                        window1.setBackground(java.awt.Color.WHITE);
                        window1.addWindowListener(EventKonsument1);
                        window1.setVisible(true);

        VkInstance instance;
    }
};