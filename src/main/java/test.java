import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Project name(项目名称)：Swing滑块组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/2
 * Time(创建时间)： 20:25
 * Version(版本): 1.0
 * Description(描述)： 滑块（JSlider）是一个允许用户在有限区间内通过移动滑块来选择值的组件。
 * JSIider类的常用构造方法
 * 构造方法	说明
 * JSlider()	创建一个范围在 0~100 且初始值为 50 的水平滑块
 * JSlider(BoundedRangeModel brm)	使用指定的 BoundedRangeModel 创建一个水平滑块
 * JSlider(int orientation)	使用指定的方向创建一个滑块，范围在 0~100 且初始值为 50
 * JSlider(int min,int max)	使用指定的最小值和最大值来创建一个水平滑块，初始值等于最小值加上最大值的平均值
 * JSlider(int min,int max,int value)	用指定的最小值、最大值和初始值创建一个水平滑块
 * <p>
 * 滑块可以显示主刻度标记以及主刻度之间的次刻度标记。刻度标记之间的值的个数由 setMajorTickSpacing() 方法
 * 和 setMinorTickSpacing() 方法来控制。刻度标记的绘制由 setPaintTicks() 方法控制。
 * 滑块也可以在固定时间间隔（或在任意位置）沿滑块刻度打印文本标签，标签的绘制由 setLabelTable() 方法和 setPaintLabels() 方法控制。
 * <p>
 * JSIider类常用方法
 * 方法名称	说明
 * createStandardLabels(int increment)	创建一个数字文本标签的 Hashtable，从滑块最小值处开始增加，并使用指定的增量
 * getLabelTable()	返回哪些标签在哪些刻度绘制的字典
 * getMaj orTickSpacing()	返回主刻度标记的间隔
 * getMaximum()	从 BoundedRangeModel 返回滑块所支持的最大值
 * getMinimum()	从 BoundedRangeModel 返回滑块所支持的最小值
 * getMinorTickSpacing()	返回次刻度标记的间隔
 * getSnapToTicks()	如果滑块（及其所表示的值）解析为最靠近用户放置滑块处的刻度标记的值，则返回为 true
 * getValue()	从 BoundedRangeModel 返回滑块的当前值
 * setLabelTable(Dictionary labels)	用于指定将在给定值处绘制哪个标签
 * setMaj orTickSpacing(int n)	此方法设置主刻度标记的间隔
 * setMaximum(int maximum)	将滑块的最大值设置为 maximum
 * setMinimum(int minimum)	将滑块的最小值设置为 minimum
 * setMinorTickSpacing(int n)	设置次刻度标记的间隔
 * setOrientation(int orientation)	将滑块的方向设置为 SwingConstants.VERTICAL 或 SwingConstants.HORIZONTAL
 * setPaintLabels(boolean b)	确定是否在滑块上绘制标签
 * setPaintTicks(boolean b)	确定是否在滑块上绘制刻度标记
 * setPaintTrack(boolean b)	确定是否在滑块上绘制滑道
 * setSnapToTicks(boolean b)	指定为 true，则滑块（及其所表示的值）解析为最靠近用户放置滑块处的刻度标记的值
 * setValue(int n)	将滑块的当前值设置为 n
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame("滑块测试");
        jFrame.setSize(720, 480);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel container = new JPanel();
        container.setLayout(null);
        //Container container = jFrame.getContentPane();
        JSlider slider = new JSlider(0, 100);
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSize(450, 150);
        slider.setLocation(720 / 2 - 450 / 2, 10);
        Font font = new Font("宋体", Font.BOLD, 20);
        JLabel label = new JLabel("当前数值：" + slider.getValue());
        label.setLocation(720 / 2 - 200 / 2, 100);
        label.setSize(200, 150);
        label.setFont(font);
        slider.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                System.out.println(slider.getValue());
                label.setText("当前数值：" + slider.getValue());
                //container.add(label);
            }
        });
        container.add(slider);
        container.add(label);
        jFrame.add(container);
        jFrame.setVisible(true);
    }
}
