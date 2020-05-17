SUMMARY = "NPM: @nodelib/fs.scandir"
DESCRIPTION = "List files and directories inside the specified directory"
DEPENDS = "npm-nodelib-fs.stat-native npm-run-parallel-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.scandir/-/fs.scandir-2.1.3.tgz"
SRC_URI[md5sum] = "87d655de2cb2a3ae616c253d603fb093"
SRC_URI[sha256sum] = "132a3a8a187a70df7e185a987bb1315a395d60aa6f0858fed6bd9807c3d85fbb"

NPM_PKGNAME = "@nodelib/fs.scandir"

inherit npmhelper
inherit native
