SUMMARY = "NPM: fast-glob"
DESCRIPTION = "It's a very fast and efficient glob library for Node.js"
HOMEPAGE = "https://github.com/mrmlnc/fast-glob#readme"

DEPENDS = "npm-glob-parent-native npm-merge2-native npm-micromatch-native npm-nodelib-fs.stat-native npm-nodelib-fs.walk-native npm-picomatch-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.2.tgz"
SRC_URI[md5sum] = "7fada8800d19d22582d6b13a868cf466"
SRC_URI[sha256sum] = "4f43f27aa521382f26adc9952240998a7540a8a170beb46e7af0241a6f792c93"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
