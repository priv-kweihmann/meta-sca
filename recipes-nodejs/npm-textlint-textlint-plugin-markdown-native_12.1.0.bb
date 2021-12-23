SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-markdown-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-12.1.0.tgz"
SRC_URI[md5sum] = "8713f8627393f00f6193d6face7847f9"
SRC_URI[sha256sum] = "a55b81aa06b5386efa472ecf6d8e6b39331150ec63fb79774130af94979feac7"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
