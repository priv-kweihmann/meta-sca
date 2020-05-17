SUMMARY = "NPM: micromatch"
DESCRIPTION = "Glob matching for javascript/node.js. A replacement and faster alternative to minimatch and multimatch."
HOMEPAGE = "https://github.com/micromatch/micromatch"

DEPENDS = "npm-braces-native npm-picomatch-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

SRC_URI = "https://registry.npmjs.org/micromatch/-/micromatch-4.0.2.tgz"
SRC_URI[md5sum] = "2d80393d223d4305329529c7e4f906e0"
SRC_URI[sha256sum] = "4d0949fd1af03eb6693f5d9907332d5df5697ed5b86603a9a4e168adb5a27431"

NPM_PKGNAME = "micromatch"

inherit npmhelper
inherit native
