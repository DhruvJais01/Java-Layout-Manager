# Border Layout 
Border Layout has five regions-

``NORTH, SOUTH, EAST, WEST, CENTER``

## Constructors for Border Layout
### BorderLayout:
+ creates a border layout without gaps

``` 
jframe.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction
```
### BorderLayout(int hgap, int vgap): 
+ creates a border layout with the given horizontal and vertical gaps between the components.

```
jframe.setLayout(new BorderLayout(20, 15));  
```

###### The add() method of the JFrame class can work even when we do not specify the region. In such a case, only the latest component added is shown in the frame, and all the components added previously get discarded. The latest component covers the whole area. 

```
    //Since region is not specified, the gaps are of no use  
    jframe.setLayout(new BorderLayout(7, 7));  

````