SUMMARY = "NPM: @nodelib/fs.scandir"
DESCRIPTION = "List files and directories inside the specified directory"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-nodelib-fs.stat-native \
           npm-run-parallel-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.scandir/-/fs.scandir-2.1.4.tgz"
SRC_URI[md5sum] = "07fcce273343223ba99c3bcb386bc452"
SRC_URI[sha256sum] = "082bd57607938e3ce84f95bc084804abf2c01bfcf1e0a1e8944e765833350abd"

NPM_PKGNAME = "@nodelib/fs.scandir"

inherit npmhelper
inherit native
