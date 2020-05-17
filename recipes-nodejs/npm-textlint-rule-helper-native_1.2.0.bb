SUMMARY = "NPM: textlint-rule-helper"
DESCRIPTION = "Helper for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint-rule-helper/"

DEPENDS = "npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-rule-helper/-/textlint-rule-helper-1.2.0.tgz"
SRC_URI[md5sum] = "04bf03c2056701eb1b65aec649422be6"
SRC_URI[sha256sum] = "d825bca07f0d765b7f4e7d9e725d24338ccbf19e2ba13a99e0e0bcde3eee4223"

NPM_PKGNAME = "textlint-rule-helper"

inherit npmhelper
inherit native
