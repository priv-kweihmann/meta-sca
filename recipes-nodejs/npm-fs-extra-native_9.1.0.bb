SUMMARY = "NPM: fs-extra"
DESCRIPTION = "fs-extra contains methods that aren't included in the vanilla Node.js fs package. Such as recursive mkdir, copy, and remove."
HOMEPAGE = "https://github.com/jprichardson/node-fs-extra"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea817882455c03503f7d014a8f54f095"

DEPENDS = "npm-at-least-node-native \
           npm-graceful-fs-native \
           npm-jsonfile-native \
           npm-universalify-native"

SRC_URI = "https://registry.npmjs.org/fs-extra/-/fs-extra-9.1.0.tgz"
SRC_URI[md5sum] = "4a7f81e28106056afb24a7eae49eb5b5"
SRC_URI[sha256sum] = "3d70f8a1d1eca124c6180c8d7483cd7080c8586ff73939f9ca3086c9885fd13a"

NPM_PKGNAME = "fs-extra"

inherit npmhelper
inherit native
