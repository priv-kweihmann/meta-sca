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

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.10.tgz"
SRC_URI[md5sum] = "13be2d71da1ea9f6c5f387983ee478cf"
SRC_URI[sha256sum] = "50189f38546ac5c946f2a5b218fc4c1276c435ae35fbc43ffda9c57965f2ad82"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
