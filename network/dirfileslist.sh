#!/bin/bash
echo "Enter the directory path"
read dir
if [ -d "$dir" ];then
    echo "files in directory '$dir':"
    find "$dir" -type f
else
    echo "'$dir' is not a directory"
fi

#output
@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
Enter the directory path
/workspaces/try12/example.txt
@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
Enter the directory path
/workspaces/try12/new
files in directory '/workspaces/try12/new':
/workspaces/try12/new/test.py
/workspaces/try12/new/graphics/subgraphics/cuboid.py
/workspaces/try12/new/graphics/subgraphics/sphere.py
/workspaces/try12/new/graphics/subgraphics/__init__.py
/workspaces/try12/new/graphics/circle.py
/workspaces/try12/new/graphics/rectangle.py
/workspaces/try12/new/graphics/__init__.py


@Rap-L ➜ /workspaces/try12 (s2) $ ./arthim.sh
Enter the directory path
/workspaces/try12/example.txt
'/workspaces/try12/example.txt' is not a directory
@Rap-L ➜ /workspaces/try12 (s2) $ 
