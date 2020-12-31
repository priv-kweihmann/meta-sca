SUMMARY = "NPM: @nodelib/fs.walk"
DESCRIPTION = "A library for efficiently walking a directory recursively"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-fastq-native \
           npm-nodelib-fs.scandir-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.walk/-/fs.walk-1.2.6.tgz"
SRC_URI[md5sum] = "369c0b672dd0a5ae4c559d1ed81bfb0d"
SRC_URI[sha256sum] = "1cd8bfc24c4fe6e86e185acb15fa62e0eae96933ce6270880a9fff3a3b35413d"

NPM_PKGNAME = "@nodelib/fs.walk"

inherit npmhelper
inherit native
