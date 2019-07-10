# Making build time dependencies visible to SCA

Since version 2.3 the OpenEmbedded build system uses one sysroot per recipe to resolve long-standing issues with configuration script auto-detection of undeclared dependencies - see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#migration-2.3-recipe-specific-sysroots.
By default SCA does look within the per recipe sysroot for components it depends on. In case of Python code the OpenEmbedded build system will not issue any errors or warnings if build time dependencies i.e. DEPENDS (see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-DEPENDS) are not available as they should. You will see a problem in runtime in case run time dependencies are missing, but that's another variable called RDEPENDS (see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-RDEPENDS). Pylint (part of the SCA tools) will complain with errors like __missing import in python, wrong usage of external function, a.s.o.__ tough in case build time dependencies i.e. DEPENDS are missing in the per recipe sysroot.

## Example

Your module **foo** does for example require **bar** as a build time dependency i.e DEPENDS see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-DEPENDS

Note: Well in Python it's not really a build time dependency, but in order for the SCA tools to find the dependencies it needs to be.

Within the bitbake recipe it should look like this

```bitbake
DEPENDS += "bar"
```

Now SCA can also access the code from module **bar** and could check if your module is using **bar** in the right way, especially it will be able to find the **import** and hence be able to find out if you use an external function the right way and so on.

## Note regarding RDEPENDS [https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-RDEPENDS] 

When you're using devtool to create your Python recipes, it typically creates by default only RDEPENDS, since run time dependencies is all Python typically cares about:

```
RDEPENDS_${PN} += "..."
```

Make sure to add the relevant build time dependencies as well. You typically don't need to add "standard" Python imports to your DEPENDS:

```bitbake
DEPENDS += "..."
```

to let bitbake include all the needed sources into the per recipe sysroot hence allowing pylint to find otherwise missing imports.
