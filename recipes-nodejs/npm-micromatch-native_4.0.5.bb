SUMMARY = "NPM: micromatch"
DESCRIPTION = "Glob matching for javascript/node.js. A replacement and faster alternative to minimatch and multimatch."
HOMEPAGE = "https://github.com/micromatch/micromatch"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

DEPENDS = "npm-braces-native \
           npm-picomatch-native"

SRC_URI = "https://registry.npmjs.org/micromatch/-/micromatch-4.0.5.tgz"
SRC_URI[md5sum] = "62a04b4d323533baafe33d24ea459bde"
SRC_URI[sha256sum] = "20566a5baba6809278bfdf438a361b24fe66cedf569c1cd75db18218a8e5bdab"

NPM_PKGNAME = "micromatch"

inherit npmhelper
inherit native
