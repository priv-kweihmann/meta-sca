SUMMARY = "NPM: hast-util-whitespace"
DESCRIPTION = "hast utility to check if a node is inter-element whitespace"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-whitespace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/hast-util-whitespace/-/hast-util-whitespace-1.0.4.tgz"
SRC_URI[md5sum] = "2e664e858c1dc6187381f91a66e9eb92"
SRC_URI[sha256sum] = "dc4eefe224180bdc3c93b98705c5124eac1d5725302ec6f83237da814e6b5441"

NPM_PKGNAME = "hast-util-whitespace"

inherit npmhelper
inherit native
