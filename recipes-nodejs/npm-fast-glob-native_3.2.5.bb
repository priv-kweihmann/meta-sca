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

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.5.tgz"
SRC_URI[md5sum] = "52920f8c9332c1fac1a4312034085c18"
SRC_URI[sha256sum] = "26f7e9fb9cee775654e56da122982c4d2a8909e55d7e03db8edc2311f6fb048e"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
