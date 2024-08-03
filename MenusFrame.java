import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenusFrame extends JFrame{
    //menu bar
    private JMenuBar menuBar;
    //menu
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu ;
    private JMenu editorsViewSubMenu;
    private JMenu splitViewSubMenu;

    //menu items
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectsMenuItem;
    private JMenuItem closeAllProjectsMenuItem;

    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;

    private JMenuItem sourcMenuItem;
   

    private JMenuItem horizontalMenuItem;
    private JMenuItem verticalMenuItem;
    private JMenuItem clearMenuItem;
    
    public MenusFrame()
    {
        setTitle("Menus Frame");
        setSize(700,800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);

        //create Menu
        menuBar = new JMenuBar();

        //create Menu
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");;
        editorsViewSubMenu = new JMenu("Editors");
        splitViewSubMenu = new JMenu("Split");

        //file menu items
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectsMenuItem = new JMenuItem("Open Recent Project...");
        closeAllProjectsMenuItem = new JMenuItem("Close All Projects...");

        //edit menu items
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");

        //view menu items
        sourcMenuItem = new JMenuItem("Source");
        editorsViewSubMenu.add(sourcMenuItem);

        horizontalMenuItem = new JMenuItem("Horizontally");
        verticalMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        splitViewSubMenu.add(horizontalMenuItem);
        splitViewSubMenu.add(verticalMenuItem);
        splitViewSubMenu.add(clearMenuItem);

        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();//this creates a line separator
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectsMenuItem);
        fileMenu.add(closeAllProjectsMenuItem);

        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        //add view sub menus to the view menu
        viewMenu.add(editorsViewSubMenu);
        viewMenu.add(splitViewSubMenu);

        //add the menus to the bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);

        //add bar to the frame
       setJMenuBar(menuBar);

       //make the frame visible
       setVisible(true);












    }public static void main(String[] args) {
        new MenusFrame();
    }

}