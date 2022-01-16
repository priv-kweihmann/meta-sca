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

SRC_URI = "https://registry.npmjs.org/fast-glob/-/fast-glob-3.2.11.tgz"
SRC_URI[md5sum] = "35ded3d6c6e212f41a0b1a3c7cf2f0fc"
SRC_URI[sha256sum] = "608f893e33abbb4fbe9cdd9b5247836c97cd74a40eb50e6a210c5bbbc3eb3adc"

NPM_PKGNAME = "fast-glob"

inherit npmhelper
inherit native
