SUMMARY = "NPM: @nodelib/fs.walk"
DESCRIPTION = "A library for efficiently walking a directory recursively"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-fastq-native \
           npm-nodelib-fs.scandir-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.walk/-/fs.walk-1.2.7.tgz"
SRC_URI[md5sum] = "1419da9d1648749e46f0cb4446b67a6a"
SRC_URI[sha256sum] = "2a5c53197223faa9ff3f558c489da71a29b183fee5b698c8b068b6f6e67c760e"

NPM_PKGNAME = "@nodelib/fs.walk"

inherit npmhelper
inherit native
