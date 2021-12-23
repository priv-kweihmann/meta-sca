SUMMARY = "NPM: vfile-message"
DESCRIPTION = "vfile utility to create a virtual message"
HOMEPAGE = "https://github.com/vfile/vfile-message#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=0bbc76ececabc0216b618cfbe4d0c0e3"

DEPENDS = "npm-types-unist-native \
           npm-unist-util-stringify-position-native"

SRC_URI = "https://registry.npmjs.org/vfile-message/-/vfile-message-3.0.2.tgz"
SRC_URI[md5sum] = "9b58d47bb9a2cc21f1d78ddedc494f5d"
SRC_URI[sha256sum] = "93129895857ae6c0ba27a0523db51fec880e73ac5bfbdd30631da387ca35a22a"

NPM_PKGNAME = "vfile-message"

inherit npmhelper
inherit native
