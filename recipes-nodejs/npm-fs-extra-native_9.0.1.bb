SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as recursive mkdir, copy, and remove."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-at-least-node-native \
           npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-9.0.1.tgz"
SRC_URI[md5sum] = "3bce3f53b9f55fa76e6295ded3d07a00"
SRC_URI[sha256sum] = "9d486baa24afa2081212e8505c8e18e0fc37009dbe61d32c9585485bbf28eb2d"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
