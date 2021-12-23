SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as recursive mkdir, copy, and remove."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-10.0.0.tgz"
SRC_URI[md5sum] = "b16ff716a40a7bc1349520f8ca273a9f"
SRC_URI[sha256sum] = "c3faf6a68f2fbb86328e5b1e5554259da82e252f919c73f03abbcd8271e2857e"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
