SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as recursive mkdir, copy, and remove."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-10.1.0.tgz"
SRC_URI[md5sum] = "22465e0d5f48db0dbf9ba9f7785fae7f"
SRC_URI[sha256sum] = "50aa67852e866bb06b35c23f83fd07fc21b06c21ac96283956d0480922971fea"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
