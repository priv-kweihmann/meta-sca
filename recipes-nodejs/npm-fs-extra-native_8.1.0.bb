SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as mkdir -p, cp -r, and rm -rf."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"

DEPENDS = "npm-graceful-fs-native npm-jsonfile-native npm-universalify-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-8.1.0.tgz"
SRC_URI[md5sum] = "509fa45d6b9992379a0bc07056e0ac53"
SRC_URI[sha256sum] = "00ec4773cc69539a5afe617a867ca846dfe8e9ecd8bd8838e2575a24b95eb158"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
