SUMMARY = "NPM: fast-glob"
DESCRIPTION = "It's a very fast and efficient glob library for Node.js"
HOMEPAGE = "https://github.com/mrmlnc/fast-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-glob-parent-native \
           npm-merge2-native \
           npm-micromatch-native \
           npm-nodelib-fs.stat-native \
           npm-nodelib-fs.walk-native"

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.9.tgz"
SRC_URI[md5sum] = "0d0ee535837320931a6e95e26de0d516"
SRC_URI[sha256sum] = "9fb677f59165b0af47891905114b54cf76462217cbe9daf9c1ed6bcd0c2754a5"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
