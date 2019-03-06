#!/bin/sh
bitbake busybox -c clean
bitbake core-image-minimal -c clean
bitbake core-image-minimal