SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-markdown-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-5.3.1.tgz"
SRC_URI[md5sum] = "e73f1630ce7f48e079cc15bbd48628b9"
SRC_URI[sha256sum] = "d2cebd586e02e0b570d1c1b3f5f26b60457f367b8f734fac4086eb61b88f514c"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
