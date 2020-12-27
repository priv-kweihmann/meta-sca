SUMMARY = "NPM: @nodelib/fs.walk"
DESCRIPTION = "A library for efficiently walking a directory recursively"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-fastq-native \
           npm-nodelib-fs.scandir-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.walk/-/fs.walk-1.2.5.tgz"
SRC_URI[md5sum] = "0146ca72ff620f19e777fcaffc8dd17d"
SRC_URI[sha256sum] = "c6a53f66c1c0ca525360b001166af3b81294c03a710398bb1b25724877c17b66"

NPM_PKGNAME = "@nodelib/fs.walk"

inherit npmhelper
inherit native
