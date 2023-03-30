import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;


public class FlowLayoutFrame extends JFrame
{
    private JButton leftButton;
    private JButton centerJButton;
    private JButton rightJButton;
    private FlowLayout layout;
    private Container container;
    public FlowLayoutFrame()
    {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftButton = new JButton("Left");
        add( leftButton);

        leftButton.addActionListener(

                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event){

                        layout.setAlignment(FlowLayout.LEFT);

                        layout.layoutContainer(container);
                    }
                }
        );

        centerJButton = new JButton("Center");
        add( centerJButton);
        centerJButton.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);

                        layout.layoutContainer(container);
                    }
                }
        );

        rightJButton = new JButton ( "Right");
        add(rightJButton);

        rightJButton.addActionListener(
                new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent event) {

                        layout.setAlignment(FlowLayout.RIGHT);

                        layout.layoutContainer(container);

                    }
                }
        );
    }
}