SUMMARY = "NPM: slide"
DESCRIPTION = "A flow control lib small enough to fit on in a slide presentation. Derived live at Oak.JS"
HOMEPAGE = "https://github.com/isaacs/slide-flow-control"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63"

SRC_URI = "https://registry.npmjs.org/slide/-/slide-1.1.6.tgz"
SRC_URI[md5sum] = "e59736a1fb5539a77cabe10cdbcd3e78"
SRC_URI[sha256sum] = "4333b89d6f3263f223ba6b87eb7890112515576ca8161822b488a5b4b8f76b18"

NPM_PKGNAME = "slide"

inherit npmhelper
inherit native
