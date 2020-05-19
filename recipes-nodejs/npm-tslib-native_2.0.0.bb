SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.0.0.tgz"
SRC_URI[md5sum] = "0d0bc21d5533469f8614b3070f378ca4"
SRC_URI[sha256sum] = "d1ef0684f678af7f7c2b95783fcd05bb8122d8b38cc39dd934caf2c5d3f976b6"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
