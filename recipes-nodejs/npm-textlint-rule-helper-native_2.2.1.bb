SUMMARY = "NPM: textlint-rule-helper"
DESCRIPTION = "A helper library for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint-rule-helper/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-structured-source-native \
           npm-unist-util-visit-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-helper/-/textlint-rule-helper-2.2.1.tgz"
SRC_URI[md5sum] = "cf1e714bb9b91ceb832b8d94f2202c2a"
SRC_URI[sha256sum] = "7fe9db090ad4be5ed444f093752fdcb5f5ae684e1f9406f7a90ab002f3602475"

NPM_PKGNAME = "textlint-rule-helper"

inherit npmhelper
inherit native
