from graphics import circle
from graphics import rectangle
from graphics.3dgraphics import *

r=int(input("Enter the radius of circle: "))
circle.carea(r)
circle.circumference(r)

l=int(input("Enter the length of rectangle: "))
b=int(input("Enter the breadth of rectangle: "))
rectangle.rarea(l,b)
rectangle.perimeter(l,b)

r=int(input("Enter the radius of sphere: "))
sphere.sarea(r)
sphere.svol(r)

l=int(input("Enter the length of cuboid: "))
b=int(input("Enter the breadth of cuboid: "))
h=int(input("Enter the height of cuboid: "))
cuboid.tsa(l,b,h)
cuboid.lsa(l,b,h)
cuboid.cvol(l,b,h)


