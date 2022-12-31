# Grid Layout

### Contsructors-
+ GridLayout(): creates a grid layout with one column per component in a row.

```html
jFrame.setLayout(new GridLayout());    
```

+  GridLayout(int rows, int columns): creates a grid layout with the given rows and columns but no gaps between the components.

```html
// setting grid layout of 3 rows and 3 columns    
f.setLayout(new GridLayout(3,3));    
```

 + GridLayout(int rows, int columns, int hgap, int vgap): creates a grid layout with the given rows and columns along with given horizontal and vertical gaps.

```html
/ setting the grid layout   
// a 3 * 3 grid is created with the horizontal gap 20   
// and vertical gap 25  
frameObj.setLayout(new GridLayout(3, 3, 20, 25));    
```