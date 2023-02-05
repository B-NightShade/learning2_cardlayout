import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class View extends JFrame{
    CardLayout cardLayout;
    Container container;

    //each button acts as a tab to a new frame
    JButton add, view, upload;

    View(){
        cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(cardLayout);
        setSize(400,400);

        //next we need a panel for each action/tab
        JPanel homePanel = new JPanel();
        JLabel labelhome = new JLabel("home");
        homePanel.add(labelhome);

        JPanel addPanel = new JPanel();
        JLabel labelAdd = new JLabel("add");
        addPanel.add(labelAdd);

        JPanel viewPanel = new JPanel();
        JLabel labelview = new JLabel("view");
        viewPanel.add(labelview);

        JPanel uploadPanel = new JPanel();
        JLabel labelUpload = new JLabel("upload");
        uploadPanel.add(labelUpload);

        //add the panels on the mainframe
        mainPanel.add(homePanel);
        mainPanel.add(addPanel);
        mainPanel.add(viewPanel);
        mainPanel.add(uploadPanel);

        //create a panel for the buttons
        JPanel buttonsPanel = new JPanel();
        add = new JButton("add");
        view = new JButton("view");
        upload = new JButton("upload");

        //add the panels we want on the first "card"/view
        getContentPane().add(BorderLayout.NORTH, mainPanel);
        getContentPane().add(BorderLayout.SOUTH, buttonsPanel);
        setVisible(true);
    }
}
