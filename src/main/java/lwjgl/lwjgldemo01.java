package lwjgl;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
public class lwjgldemo01 {
        public static void main(String[] args) {
            // 初始化 GLFW
            if (!GLFW.glfwInit()) {
                throw new IllegalStateException("glfwInit() failed");
            }

            // 创建窗口
            long window = GLFW.glfwCreateWindow(800, 600, "Hello LWJGL", 0, 0);
            if (window == 0) {
                throw new IllegalStateException("glfwCreateWindow() failed");
            }

            // 设置当前上下文
            GLFW.glfwMakeContextCurrent(window);

            // 初始化 OpenGL
            GL.createCapabilities();
            GL11.glClearColor(0.3f, 0.7f, 0.9f, 1.0f);

            // 主循环
            while (!GLFW.glfwWindowShouldClose(window)) {
                GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

                // ... 实现绘制代码

                GLFW.glfwSwapBuffers(window); // 交换缓冲区
                GLFW.glfwPollEvents(); // 获取窗口事件
            }

            // 关闭并释放资源
            GLFW.glfwDestroyWindow(window);
            GLFW.glfwTerminate();
        }
}
