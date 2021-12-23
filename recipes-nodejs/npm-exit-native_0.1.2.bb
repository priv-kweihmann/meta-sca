SUMMARY = "NPM: exit"
DESCRIPTION = "A replacement for process.exit that ensures stdio are fully drained before exiting."
HOMEPAGE = "https://github.com/cowboy/node-exit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=159111132f87941857a4f42d60c880c8"

SRC_URI = "https://registry.npmjs.org/exit/-/exit-0.1.2.tgz"
SRC_URI[md5sum] = "a7ebd2d01676648c8ffdbb2608123cfe"
SRC_URI[sha256sum] = "485f06ca0939c28f18128926c4345162d0adcfd340c62e292bb827c2cfe82a41"

S = "${WORKDIR}/package"

NPM_PKGNAME = "exit"

inherit npmhelper
inherit native
