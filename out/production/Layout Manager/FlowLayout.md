# Java FlowLayout
The Java FlowLayout class is used to arrange the components in a line, one after another (in a flow). It is the default layout of the applet or panel.

## Fields of FlowLayout class
+ public static final int LEFT
+ public static final int RIGHT
+ public static final int CENTER
+ public static final int LEADING
+ public static final int TRAILING

## Constructors of FlowLayout class
+ FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.

```html
    // horizontal as well as the vertical gap is 5 units.
    jFrame.setLayout(new FlowLayout());    
```

+ FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.

```html
    // setting flow layout of right alignment    
    jFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));  
```

+ FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.

```html
    // horizontal gap is 20 units and vertical gap is 25 units.  
    jFrame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 25));    
```