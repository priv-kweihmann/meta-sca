SUMMARY = "NPM: unist-util-visit"
DESCRIPTION = "unist utility to visit nodes"
HOMEPAGE = "https://github.com/syntax-tree/unist-util-visit#readme"

DEPENDS = "npm-types-unist-native npm-unist-util-is-native npm-unist-util-visit-parents-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/unist-util-visit/-/unist-util-visit-2.0.2.tgz"
SRC_URI[md5sum] = "500847a53f3a867af2ea2dca6087a57f"
SRC_URI[sha256sum] = "d0ec63d420d2622ccf02e4116d2f7e746c5ace7e457799c7a0d502749d91cff4"

NPM_PKGNAME = "unist-util-visit"

inherit npmhelper
inherit native
