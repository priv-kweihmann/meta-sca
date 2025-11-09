# Getting started

This shall be a quick dive into the possibilities of this layer.
For in-depth configuration please see the other documents in this folder.

## What do I need

* Linux machine (I would recommend using a Debian or Ubuntu release)
* Some required tooling.
  On Ubuntu run

    ```shell
    sudo apt-get install build-essential chrpath diffstat gawk gcc-multilib git-core libsdl1.2-dev python3 socat texinfo unzip wget xterm
    ```

* At least 50GB of free disk space

    ```shell
    mkdir -p /mnt/mydisk/workspace
    cd /mnt/mydisk/workspace
    ```

    You could adjust the path to your specific needs

* [openembedded-core](https://github.com/openembedded/openembedded-core) release cloned locally

    ```shell
    git clone https://github.com/openembedded/openembedded-core
    ```

* [bitbake](https://github.com/openembedded/bitbake) release cloned locally

    ```shell
    git clone https://github.com/openembedded/bitbake
    ```

* [meta-yocto](https://git.yoctoproject.org/meta-yocto) release cloned locally

    ```shell
    git clone hhttps://git.yoctoproject.org/meta-yocto
    ```

* This layer locally cloned

    ```shell
    git clone https://github.com/priv-kweihmann/meta-sca.git meta-sca
    ```

* configuration setup

    ```shell
    cd /mnt/mydisk/workspace/openembedded-core
    . ./oe-init-build-env
    ```

* add the needed layers

    ```shell
    bitbake-layers add-layer /mnt/mydisk/workspace/meta-yocto/meta-poky
    bitbake-layers add-layer /mnt/mydisk/workspace/meta-yocto/meta-yocto-bsp
    bitbake-layers add-layer /mnt/mydisk/workspace/meta-sca
    ```

* configuration for meta-sca layer

    ```shell
    /mnt/mydisk/workspace/meta-sca/scripts/configure /mnt/mydisk/workspace/meta-sca
    ```

    try to answer the questions from the tool. If you don't know (or maybe don't care) just press [Enter] to use the default

* append the output of the configure-script to __local.conf__. The path of the __local.conf__ in this example is **/mnt/mydisk/workspace/poky/build/local.conf**

## Choosing what to check

Now it's time to decide what to check on

### Checking on ALL recipes

* just add 'INHERIT += "sca"' to your __local.conf__

    ```shell
    echo 'INHERIT += "sca"' >> /mnt/mydisk/workspace/openembedded-core/build/local.conf
    ```

### Checking on ALL recipes but spare some layer

* just add 'INHERIT += "sca"' to your __local.conf__

    ```shell
    echo 'INHERIT += "sca"' >> /mnt/mydisk/workspace/openembedded-core/build/local.conf
    ```

* additionally add the names of all layer to **SCA_SPARE_LAYER**.
  E.g. to disable SCA for all layer shipped with openembedded-core

    ```shell
    echo 'SCA_SPARE_LAYER = "core yocto yoctobsp"' >> /mnt/mydisk/workspace/openembedded-core/build/local.conf
    ```

### Checking on selected recipe only

* add 'inherit sca' to the recipe you want

    ```bitbake
    inherit sca
    ```

### Checking on multiple recipes based on conditions

* this special case is [documented here](https://github.com/priv-kweihmann/meta-buildutils#auto-inherit)
  * note that this requires an additional layer to be setup

## Build time

* run a build

    ```shell
    bitbake core-image-minimal
    ```

    Replace __core-image-minimal__ with any image/recipe you want

## Analyzing the results

As soon as the build is done - you might be interested in the results.
Therefore we use a small python script to print all findings to console

```shell
/mnt/mydisk/workspace/meta-sca/scripts/results2console /mnt/mydisk/workspace/openembedded-core/build/tmp/deploy/images/*/sca
```

an excerpt of the output could look like this

```shell
flawfinder@busybox: applets/applet_tables.c:212:1 - [warning] - [flawfinder.flawfinder.char] - Statically-sized arrays can be improperly restricted, leading to potential overflows or other issues (CWE-119!/CWE-120).  Perform bounds checking, use functions that limit length, or ensure that the size is larger than the maximum possible length
```

### Output format details

| used tool  | @ | recipe  | : | file path               | : | line | : | column | - | severity  | - | error ID                     | - |                                                                                                                                                                                                                                                 message |
|------------|---|---------|---|-------------------------|---|------|---|--------|---|-----------|---|------------------------------|---|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| flawfinder | @ | busybox | : | applets/applet_tables.c | : | 212  | : | 1      | - | [warning] | - | [flawfinder.flawfinder.char] | - | Statically-sized arrays can be improperly restricted, leading to potential overflows or other issues (CWE-119!/CWE-120).  Perform bounds checking, use functions that limit length, or ensure that the size is larger than the maximum possible length. |

## Fixing the finding(s)

There are multiple ways of fixing findings. For example

* patch file(s)
* or issue(s) in upstream
* or ignoring an issue

The strategy depends on your work environment and the origin of the recipe (resp. its sources)

### Patch file(s)

I recommend the usage of 'devtool' for creating patches. See [detailed documentation](https://wiki.yoctoproject.org/wiki/TipsAndTricks/Patching_the_source_for_a_recipe).
Be aware that on every update of the underlying recipe sources, your patch file(s) might have to be 'refreshed'.
So this way is only recommended when the original sources are (more or less) under your control.

### Create an upstream issue

Find out which bugtracker is used for this component (check if the recipe does have a 'BUGTRACKER' entry) and create an issue there.
This way might have the longest turnaround time but will create the least effort maintaining in future

### Ignore the issues

Possible options are described at [severity transformation](conf/sevtransform.md) or [suppression](conf/suppression.md).
Use this strategy only if you're sure that this finding doesn't cause ANY side effects!
