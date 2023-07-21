import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorChooser {
    public static void main(String[] args) 
    {
        final JFrame frm = new JFrame("JColorChooser Demo");
        JButton btnf = new JButton("Choose Color");
        btnf.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent a)
            {
                Color newCol = JColorChooser.showDialog(
                     frm,
                     "Choose Background Color",
                     frm.getBackground());
                if(newCol != null)
                {
                    frm.getContentPane().setBackground(newCol);
                }
            }
        });
        
        Container pane = frm.getContentPane();
        pane.setLayout(new FlowLayout());
        pane.add(btnf);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(350, 250);
        frm.setVisible(true);
    }
}