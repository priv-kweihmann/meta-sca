SUMMARY = "NPM: textlint-util-to-string"
DESCRIPTION = "textlint util convert Paragraph Node to text with SourceMap."
HOMEPAGE = "https://github.com/textlint/textlint-util-to-string"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-rehype-parse-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-types-structured-source-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/textlint-util-to-string/-/textlint-util-to-string-3.1.1.tgz"
SRC_URI[md5sum] = "ebd539ba23bbb86aa62173e2fa8792ff"
SRC_URI[sha256sum] = "931aba23fb139829fb51a76b10a33cc8acae21c9afddeffbb376df6344ade710"

NPM_PKGNAME = "textlint-util-to-string"

inherit npmhelper
inherit native
