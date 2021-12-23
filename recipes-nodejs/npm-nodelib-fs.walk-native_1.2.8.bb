SUMMARY = "NPM: @nodelib/fs.walk"
DESCRIPTION = "A library for efficiently walking a directory recursively"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

DEPENDS = "npm-fastq-native \
           npm-nodelib-fs.scandir-native"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.walk/-/fs.walk-1.2.8.tgz"
SRC_URI[md5sum] = "c5d178aeb76a1653bf62415b8ac99364"
SRC_URI[sha256sum] = "cbf9621f69b822ce97f71e842fea8e7bf9c7e986f01285689ede282092727d3d"

NPM_PKGNAME = "@nodelib/fs.walk"

inherit npmhelper
inherit native
