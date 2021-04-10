SUMMARY = "NPM: micromatch"
DESCRIPTION = "Glob matching for javascript/node.js. A replacement and faster alternative to minimatch and multimatch."
HOMEPAGE = "https://github.com/micromatch/micromatch"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

DEPENDS = "npm-braces-native \
           npm-picomatch-native"

SRC_URI = "https://registry.npmjs.org/micromatch/-/micromatch-4.0.3.tgz"
SRC_URI[md5sum] = "17c94f2c684b4058757ec75269befeb6"
SRC_URI[sha256sum] = "536f3e9a1cc32a05476a0f69af8d9314f393cbf163498025bae998a278b488e4"

NPM_PKGNAME = "micromatch"

inherit npmhelper
inherit native
