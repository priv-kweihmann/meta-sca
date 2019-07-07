# Controlling your build via command line

Normally everything that is done within bitbake cannot be 
controlled by command line or environment vars.
To enable this feature you have to make bitbake use environment 
variables passed to build.

## Documentation

See [Bitbake Documentation](https://www.yoctoproject.org/docs/current/bitbake-user-manual/bitbake-user-manual.html#var-bb-BB_ENV_EXTRAWHITE)

## Usage

By example we want to globally enable/disable SCA from command line.

To enable run from shell

```sh
export BB_ENV_EXTRAWHITE="$BB_ENV_EXTRAWHITE SCA_ENABLE"
. ./oe-init-build-env
SCA_ENABLE=1 bitbake core-image-minimal
```

to disable run

```sh
export BB_ENV_EXTRAWHITE="$BB_ENV_EXTRAWHITE SCA_ENABLE"
. ./oe-init-build-env
SCA_ENABLE=0 bitbake core-image-minimal
```

## Further usage

You can easily enhance this construction to any variable for SCA documented in the [README.md](../../../README.md).
Just simply add the name of the variable to __BB_ENV_EXTRAWHITE__ and pass a environment variable of the same name with the value you want by command line

## Jenkins integration

This could be integrated into jenkins by using build parameter. For details see [jenkins documentation](https://jenkins.io/doc/book/pipeline/syntax/#parameters) or [example integration](jenkins/integration_parameter.md)