# Box Layout

The Java BoxLayout class is used to arrange the components either vertically or horizontally. For this purpose, the BoxLayout class provides four constants.

## Fields of BoxLayout Class

- public static final int X_AXIS
- public static final int Y_AXIS
- public static final int LINE_AXIS
- public static final int PAGE_AXIS

## Constructor of BoxLayout class

    BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.

### BoxLayout class with Y-AXIS

    setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));   //extending an container
                                or
    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
<div align="center">
<img src="../Images/Y_AXIS.PNG" width="300"/>
</div>

### BoxLayout class with X-AXIS

    setLayout (new BoxLayout (this, BoxLayout.X_AXIS));   //extending an container
    or
    panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));

<div align="center">
<img src="../Images/X_AXIS.PNG" width="300"/>
</div>