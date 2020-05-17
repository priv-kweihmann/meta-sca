SUMMARY = "NPM: upper-case-first"
DESCRIPTION = "Transforms the string with the first character in upper cased"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/upper-case-first#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/upper-case-first/-/upper-case-first-2.0.1.tgz"
SRC_URI[md5sum] = "5a811f4f21089a859d5cf83c12ef6b52"
SRC_URI[sha256sum] = "beabc9e11c8c992174ff8a65195ae185fc8ed33dc8f1c512c5721c58998a1753"

NPM_PKGNAME = "upper-case-first"

inherit npmhelper
inherit native
