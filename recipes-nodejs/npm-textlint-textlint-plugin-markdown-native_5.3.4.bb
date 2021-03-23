SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-markdown-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-5.3.4.tgz"
SRC_URI[md5sum] = "9a9f8c8b9f53cc62fa46a68cb8c7477e"
SRC_URI[sha256sum] = "24c0546df89a1920138528bb6a1a202c667a23fd6458bf2f1e5929f4ca4d31ca"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
