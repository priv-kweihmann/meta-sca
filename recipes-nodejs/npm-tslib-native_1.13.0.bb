SUMMARY = "NPM: tslib"
DESCRIPTION = "Runtime library for TypeScript helper functions"
HOMEPAGE = "https://www.typescriptlang.org/"

LICENSE = "BSD-0-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=f938d99cba29007eeae26d80a9a4cfa6"

SRC_URI = "https://registry.npmjs.org/tslib/-/tslib-1.13.0.tgz"
SRC_URI[md5sum] = "7d5d44c4b9cf8ffb14fd4ed71e051ecd"
SRC_URI[sha256sum] = "112833e1b1c8893896c48b7642d8d404f6dce769da77f1c3cb5b01fe23309b45"

S = "${WORKDIR}/package"

NPM_PKGNAME = "tslib"

inherit npmhelper
inherit native
