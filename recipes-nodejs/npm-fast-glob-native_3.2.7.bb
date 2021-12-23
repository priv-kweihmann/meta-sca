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

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.7.tgz"
SRC_URI[md5sum] = "eab98043f4ef8602b6ed25ee07188c3f"
SRC_URI[sha256sum] = "7de48a4e17364df3b284030a41c56acde47f57242c9a17f04a0d38a9a28ae7a0"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
