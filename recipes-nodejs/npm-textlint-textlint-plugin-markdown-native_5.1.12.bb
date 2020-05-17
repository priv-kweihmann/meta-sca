SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"

DEPENDS = "npm-textlint-markdown-to-ast-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-5.1.12.tgz"
SRC_URI[md5sum] = "d9e6cad006f344328fff010b0b9f7386"
SRC_URI[sha256sum] = "b7addcf777f66ecf50c51ed0c48dc2460170d387a9f2058a2dcc16e85b62099b"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
