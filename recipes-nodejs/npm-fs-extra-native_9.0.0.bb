SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as mkdir -p, cp -r, and rm -rf."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-at-least-node-native \
           npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-9.0.0.tgz"
SRC_URI[md5sum] = "76722af3a7869650b1532a5d6b8e1af0"
SRC_URI[sha256sum] = "a6d8af0b30e3df51a3d4617d5d44008217f085c47aa5b73bc498f4435f11f6d1"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
