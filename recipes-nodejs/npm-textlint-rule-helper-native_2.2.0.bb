SUMMARY = "NPM: textlint-rule-helper"
DESCRIPTION = "A helper library for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint-rule-helper/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-textlint-types-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-helper/-/textlint-rule-helper-2.2.0.tgz"
SRC_URI[md5sum] = "32e2ea84c21d2470540d16aec4aa3731"
SRC_URI[sha256sum] = "ea7fa4e0e89f97369c31cb9bbbdd7c2e839ace5f617190d3603ad06eb3794fa3"

NPM_PKGNAME = "textlint-rule-helper"

inherit npmhelper
inherit native
