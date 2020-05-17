SUMMARY = "NPM: textlint-rule-helper"
DESCRIPTION = "Helper for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint-rule-helper/"

DEPENDS = "npm-structured-source-native npm-textlint-ast-node-types-native npm-textlint-types-native npm-unist-util-visit-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-rule-helper/-/textlint-rule-helper-2.1.1.tgz"
SRC_URI[md5sum] = "4d1094895e8bebe4b758303551a61c3e"
SRC_URI[sha256sum] = "b2818a3ac2ee95656485680b307b8b8b5406d140fb6fa347820c1f3aed20b998"

NPM_PKGNAME = "textlint-rule-helper"

inherit npmhelper
inherit native
