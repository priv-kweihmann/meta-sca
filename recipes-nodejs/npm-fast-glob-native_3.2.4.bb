SUMMARY = "NPM: fast-glob"
DESCRIPTION = "It's a very fast and efficient glob library for Node.js"
HOMEPAGE = "https://github.com/mrmlnc/fast-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-glob-parent-native \
           npm-merge2-native \
           npm-micromatch-native \
           npm-nodelib-fs.stat-native \
           npm-nodelib-fs.walk-native \
           npm-picomatch-native"

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.4.tgz"
SRC_URI[md5sum] = "5fb4ed812866593704566a0fb888b2a8"
SRC_URI[sha256sum] = "acee77a13f64ff49e26540f2f9f20ab965197033e24be350663efc060bdd2f77"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
