SUMMARY = "NPM: @nodelib/fs.walk"
DESCRIPTION = "A library for efficiently walking a directory recursively"
DEPENDS = "npm-fastq-native npm-nodelib-fs.scandir-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=580f1c3c6765fecfdb93bdf4e068d952"

SRC_URI = "https://registry.npmjs.org/@nodelib/fs.walk/-/fs.walk-1.2.4.tgz"
SRC_URI[md5sum] = "3712e07026bd30219781c03c9247abd5"
SRC_URI[sha256sum] = "78cad5403962fabec87b029a8109b6d614d5a695a61a844525912c4a5c933588"

NPM_PKGNAME = "@nodelib/fs.walk"

inherit npmhelper
inherit native
