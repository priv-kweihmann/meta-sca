SUMMARY = "NPM: esrecurse"
DESCRIPTION = "ECMAScript AST recursive visitor"
HOMEPAGE = "https://github.com/estools/esrecurse"

DEPENDS = "npm-estraverse-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://README.md;beginline=149;md5=38eeb2ba26f714e95547013f8d87242c"

SRC_URI = "https://registry.npmjs.org/esrecurse/-/esrecurse-4.2.1.tgz"
SRC_URI[md5sum] = "91367c43c8b8b1441078bf2c0652bd3d"
SRC_URI[sha256sum] = "d757a917a617f6adcb6994bd9d0341a22bd12cfd5fa49880417425a2487b4d19"

NPM_PKGNAME = "esrecurse"

inherit npmhelper
inherit native
