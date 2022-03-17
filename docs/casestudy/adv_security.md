# Case study: advanced security and hardening

## Environment/background

A guy, let's call him Dave, is working on an embedded software for an already well sold product.
He developed quit a good functionality and covered it all up with any kind of test, so it's safe to assume that functionality can always be proven.
There's no intention to heavily change design or APIs in the product.

As security and hardening are more and more a factor when doing business, he wants to have an easy way of identifying the potential in the code base where additional hardening and security measures could be applied.
He's not up to reach any kind of certification as the business doesn't require such a thing.

The code base consists of mostly C/C++ code with a little shell.
The overall usage of FOSS-tools is about 60% of all shipped packages.

He already has established a process to deal with CVEs.

Currently he's only interested in obtaining all the possibilities, without fixing anything so far.
Mainly to get a brief estimation what it would cost to harden things.

## Objectives

* Identify possible hardening inside all recipes, not matter if they are FOSS or closed source tools
* Identify possible security issues in recipes and the final images shipped to customer
* Identify possible components that need some refactoring, as of low maintainability or potential insecure functions, a.s.o.
* Identify all possible way to harden the used kernel

## What's needed

* [meta-sca layer](https://github.com/priv-kweihmann/meta-sca)
* Some time to go through the findings

## Setup

### General setup

Just insert

```bitbake
INHERIT += "sca"
```

into your conf/local.conf-file.

### Kernel hardening

For hardening the kernel it's advised to use the [kconfighard](../conf/module/kconfighard.md) module, which gives advise what KConfig options increase hardening of the kernel.

Module is activated by adding/setting

```bitbake
SCA_AVAILABLE_MODULES = "kconfighard"
```

in the conf/local.conf-file.

### Hardening of recipes

As Dave is using C/C++ code it's recommended to use at first the hardening options that GCC provides.
These will check if some recommended options are used in every recipe. This heavily increases hardening in all binaries.

As we are using bitbake, it's also recommended to use the bitbake-hardening checks.

To active add/set

```bitbake
SCA_AVAILABLE_MODULES = "gcc bitbake"
SCA_BITBAKE_HARDENING = "\
                        debug_tweaks \
                        insane_skip \
                        security_flags \
                        "
SCA_GCC_HARDENING = "1"
```

in the conf/local.conf-file.

### Identifying security issue in the resulting image

For this particular purpose the following tools are quite useful

* [lynis](../conf/module/lynis.md)
* [tiger](../conf/module/tiger.md)
* [upc](../conf/module/upc.md)

They will run a multitude of tests on the resulting image and will give advise what should be further checked on.

```bitbake
SCA_AVAILABLE_MODULES = "lynis tiger upc"
```

in the conf/local.conf-file.

### Identifying components that might need a refactoring

A component might need some refactoring, if one or more points of the following are true

* there have been multiple code blocks copied
* user defined code can be executed by this component
* component seems to confusing due to structure or simply due to amount of code
* it not very clear if insecure function are used

#### Getting code duplications

For this purpose the [tlv](../conf/module/tlv.md) module exists.
It does identify code blocks across the code base which are exactly or nearly the same.

Those findings could be easily refactored by combining them into common functions.

To active add/set

```bitbake
SCA_AVAILABLE_MODULES = "tlv"
```

in the conf/local.conf-file.

#### Hardening if user defined code is executed

In this case it might be worth a look if your code does have a larger weakness for [ROP](https://en.wikipedia.org/wiki/Return-oriented_programming).
Mostly it can't be fully avoided, but the chances of being exploited by that technique could be mitigated.

The [ropgadget](../conf/module/ropgadget.md) module does scan your code for such pattern.
As there are a large number of occurrences the global loglevel need to be turned to "info" to see all findings.

To active add/set

```bitbake
SCA_AVAILABLE_MODULES = "ropgadget"
SCA_WARNING_LEVEL = "info"
```

in the conf/local.conf-file.

To fix it, try to write the code pattern in a different style so the compiler doesn't translate it into a exploitable pattern.
This might need some time and should be done by an experienced developer.

#### Usage of metrics

Metrics have proven to be quite a good indicator of improvable code.
I would recommend to watch for [Halstead complexity metrics](https://en.wikipedia.org/wiki/Halstead_complexity_measures), as they give you information not only about the complexity of statements but about the likeliness of bugs, resp. the estimated number of bugs within a code fragment.

Furthermore I would recommend to usage Maintainability index as an indicator. This metric is a value between 0 and 100, where 0 is worst and 100 is best.
It gives you an indicator how maintainable code is - A value above 80 should be considered as good

Add the following to your conf/local.conf-file

```bitbake
SCA_AVAILABLE_MODULES = "multimetric"
SCA_MULTIMETRIC_WARN_halstead_bugprop_gt = "0.05"
SCA_MULTIMETRIC_WARN_maintainability_index_lt = "80.0"
```


#### Usage of insecure functions

This is clearly a task for classic static analyzer tools.
I would recommend here

* [cppcheck](../conf/module/cppcheck.md)
* [rats](../conf/module/rats.md)
* [shellcheck](../conf/module/shellcheck.md)

To active add/set

```bitbake
SCA_AVAILABLE_MODULES = "cppcheck rats shellcheck"
```

in the conf/local.conf-file.

## Full config

The full applied configuration may look like this

```bitbake
SCA_AVAILABLE_MODULES = "\
                        gcc \
                        bitbake \
                        ropgadget \
                        tlv \
                        multimetric \
                        cppcheck \
                        rats \
                        shellcheck \
                        lynis \
                        tiger \
                        upc \
                        "
SCA_BITBAKE_HARDENING = "\
                        debug_tweaks \
                        insane_skip \
                        security_flags \
                        "
SCA_GCC_HARDENING = "1"
SCA_WARNING_LEVEL = "info"
SCA_MULTIMETRIC_WARN_halstead_bugprop_gt = "0.05"
SCA_MULTIMETRIC_WARN_maintainability_index_lt = "80.0"
```

## Analysis

After letting the build run overnight it's time for him to a have a look into the results.
He maybe will be surprised where hardening, security and refactoring potential can be found in the software.

With all the information given, it's an easy task to estimate the efforts for hardening and securing the software.
