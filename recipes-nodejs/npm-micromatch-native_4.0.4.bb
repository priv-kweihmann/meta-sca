SUMMARY = "NPM: micromatch"
DESCRIPTION = "Glob matching for javascript/node.js. A replacement and faster alternative to minimatch and multimatch."
HOMEPAGE = "https://github.com/micromatch/micromatch"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f64900f8f30e53054962c9f1fc3205b"

DEPENDS = "npm-braces-native \
           npm-picomatch-native"

SRC_URI = "https://registry.npmjs.org/micromatch/-/micromatch-4.0.4.tgz"
SRC_URI[md5sum] = "52ddc23b8b7151fe6ee65af0ae8823c4"
SRC_URI[sha256sum] = "19c5a16c7828ca394e7befb243245dc44160de59ce9e376906fccd9336a8c306"

NPM_PKGNAME = "micromatch"

inherit npmhelper
inherit native
