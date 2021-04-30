SUMMARY = "NPM: hast-util-whitespace"
DESCRIPTION = "hast utility to check if a node is inter-element whitespace"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-whitespace#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/hast-util-whitespace/-/hast-util-whitespace-2.0.0.tgz"
SRC_URI[md5sum] = "ab04ff05164e6a7537c689e2d005c7b2"
SRC_URI[sha256sum] = "a0ab51de1ca80ca56d90101d78a6909ca6f576d7b495c966c3edc1a592f16cc4"

NPM_PKGNAME = "hast-util-whitespace"

inherit npmhelper
inherit native
