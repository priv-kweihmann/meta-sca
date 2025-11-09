# Making build time dependencies visible to SCA

Since version 2.3 the OpenEmbedded build system uses one sysroot per recipe to resolve long-standing issues with configuration script auto-detection of undeclared dependencies - see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#migration-2.3-recipe-specific-sysroots.
By default SCA does look within the per recipe sysroot for components it depends on. In case of Python code the OpenEmbedded build system will not issue any errors or warnings if build time dependencies i.e. DEPENDS (see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-DEPENDS) are not available as they should. You will see a problem in runtime in case runtime dependencies are missing, but that's another variable called RDEPENDS (see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-RDEPENDS). Pylint (part of the SCA tools) will complain with errors like __missing import in python, wrong usage of external function, a.s.o.__ tough in case build time dependencies i.e. DEPENDS are missing in the per recipe sysroot.

## Example

Your module **foo** does for example require **bar** as a build time dependency i.e DEPENDS see https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-DEPENDS

Note: Well in Python it's not really a build time dependency, but in order for the SCA tools to find the dependencies it needs to be.

Within the bitbake recipe it should look like this

```bitbake
DEPENDS += "bar"
```

Now SCA can also access the code from module **bar** and could check if your module is using **bar** in the right way, especially it will be able to find the **import** and hence be able to find out if you use an external function the right way and so on.

## Note regarding RDEPENDS [https://www.yoctoproject.org/docs/latest/mega-manual/mega-manual.html#var-RDEPENDS]

When you're using devtool to create your Python recipes, it typically creates by default only RDEPENDS, since runtime dependencies is all Python typically cares about:

```bitbake
RDEPENDS:${PN} += "..."
```

Make sure to add the relevant build time dependencies as well. You typically don't need to add "standard" Python imports to your DEPENDS:

```bitbake
DEPENDS += "..."
```

to let bitbake include all the needed sources into the per recipe sysroot hence allowing pylint to find otherwise missing imports.

## Note regarding DEPENDS

In case you make the mistake in your recipe to write ```DEPENDS = "bar"``` instead of ```DEPENDS += "bar"``` you will see ```ModuleNotFoundError: No module named 'setuptools'``` errors like this:

```shell
ERROR: python3-tcpclientserver-1.0.0+gitAUTOINC+a00d04e69c-r0 do_configure: Function failed: do_configure (log file is located at /home/student/projects/resy-playground/build/container-x86-64/tmp/work/core2-64-resy-linux-musl/python3-tcpclientserver/1.0.0+gitAUTOINC+a00d04e69c-r0/temp/log.do_configure.2393)
ERROR: Logfile of failure stored in: /home/student/projects/resy-playground/build/container-x86-64/tmp/work/core2-64-resy-linux-musl/python3-tcpclientserver/1.0.0+gitAUTOINC+a00d04e69c-r0/temp/log.do_configure.2393
Log data follows:
| DEBUG: Executing shell function do_configure
| Traceback (most recent call last):
|   File "setup.py", line 1, in <module>
|     from setuptools import setup
| ModuleNotFoundError: No module named 'setuptools'
| WARNING: exit code 1 from a shell command.
| ERROR: Function failed: do_configure (log file is located at /home/student/projects/resy-playground/build/container-x86-64/tmp/work/core2-64-resy-linux-musl/python3-tcpclientserver/1.0.0+gitAUTOINC+a00d04e69c-r0/temp/log.do_configure.2393)
ERROR: Task (/home/student/projects/resy-playground/sources/openembedded-core/../meta-desire/recipes-desire/python-iot/python3-tcpclientserver_git.bb:do_configure) failed with exit code '1'
NOTE: Tasks Summary: Attempted 831 tasks of which 830 didn't need to be rerun and 1 failed.
```
