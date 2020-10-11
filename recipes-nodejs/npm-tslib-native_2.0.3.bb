SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "0BSD"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-2.0.3.tgz"
SRC_URI[md5sum] = "d3fcdfb98fc8098b42118ad1dffa4818"
SRC_URI[sha256sum] = "93a3ed7d097ced0bd2f9ac66f8909263632e28c3c48c845c9e1d7ce20d3ac3d6"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
