import java.awt.event.WindowEvent;

import org.lwjgl.vulkan.*;
import org.lwjgl.system.MemoryStack;

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
                        window1.setSize          (1080, 1080          );
                        window1.setBackground    (java.awt.Color.WHITE);
                        window1.addWindowListener(EventKonsument1     );
                        window1.setVisible       (true                );
        /**
         * Aligning:- matthewthorning.align-vertically --> REYNEP's ShortCut ==> "alt+q"
         */

        try(org.lwjgl.system.MemoryStack mStack               = MemoryStack.stackPush()) {
            VkApplicationInfo            amVK_ApplicationInfo = VkApplicationInfo.calloc(mStack)
                .sType             (VK10.VK_STRUCTURE_TYPE_APPLICATION_INFO                                   )
                .pNext             (0                                                                         )
                .pApplicationName  (mStack.UTF8             ("amVK_ApplicationInfo.pApplicationName not given"))
                .applicationVersion(VK10.VK_MAKE_API_VERSION(0, 0, 0, 0                                       ))
                .pEngineName       (mStack.UTF8             ("amVK_ApplicationInfo.pEngineName not given"     ))
                .engineVersion     (VK10.VK_MAKE_API_VERSION(0, 0, 0, 0                                       ))
                .apiVersion        (VK10.VK_API_VERSION_1_0                                                   );
        }
    }
};