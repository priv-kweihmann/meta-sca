SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as recursive mkdir, copy, and remove."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-10.0.1.tgz"
SRC_URI[md5sum] = "301d50abdff3c5ec05d71d06f772c338"
SRC_URI[sha256sum] = "96deda5671c355b267d5f642d4b852460ae3e3b2c2894d950c6b1ce0efd10312"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
