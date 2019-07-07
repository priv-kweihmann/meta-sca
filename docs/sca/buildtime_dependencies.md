# Making build time dependencies visible to SCA

By default SCA does look within the recipe workspace for other 
modules your current module depends on.
With this being set SCA tools should get all the needed information for also catching errors like __missing import in python, wrong usage of external function, a.s.o.__. Without it only the code from recipe itself could be checked.

## Example

Your module **foo** does for example require **bar** for building.
Within the bitbake recipe it would look like this

```bitbake
DEPENDS += "bar"
```

Now SCA can also access the code from module **bar** and could check if your module is using **bar** in the right way.

## Note regarding RDEPENDS

When you're using devtool for creating your recipes, it's advised to replace all 

```
RDEPENDS_${PN} += "..."
```

with 

```bitbake
DEPENDS += "..."
```

to let bitbake include all the needed sources into the workspace