# SDK support

A subset of the available modules can be shipped with a SDK installer.
This will take the settings for all SCA modules and create a standalone runtime script.
All settings will be hardcoded into these scripts so all the user has to do is run them to get the same results as with a YOCTO/OE build.

## How to enable

Just install `nativesdk-sca-tools` into your SDK image - e.g. `IMAGE_INSTALL:append = " nativesdk-sca-tools"` and populate the
resulting SDK with `bitbake <image> -c populate_sdk`

This will ship all configured modules (see `SCA_AVAILABLE_MODULES` for help)

## How to use in the SDK

Each module creates a `sca.<modulename>.sh` script to run the individual tool.
To run all tools just use `sca-runall`

## Differences to an OE/YOCTO build

Within the SDK there's no support for [tracing sources from binaries](conf/tracefiles.md), so all source files will be scanned.
By default the sources are found in the current working directory.

The number of used threads can be controlled by the env variable `THREADS` and defaults to 1 if not specified.

Currently you can only export the findings to stdout in a fixed format
