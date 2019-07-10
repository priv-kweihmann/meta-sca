# Use on all recipes in your workspace

Edit the file conf/__local.conf__ and add the following line
```sh
INHERIT += "sca"
```
this will run static code analysis on __all__ the recipes available and used in your workspace.
It might be a good idea to do this if you like to wait for a very long time on your build - maybe nightly builds or similar

# Use on particular recipes in your workspace

Edit the recipe-file by adding the following line
```bitbake
inherit sca
```
Now the power of static code analysis will be applied to exactly this image