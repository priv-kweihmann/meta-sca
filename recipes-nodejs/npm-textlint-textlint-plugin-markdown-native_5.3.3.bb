SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-markdown-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-5.3.3.tgz"
SRC_URI[md5sum] = "e287e7ebbc793c8ff83f4fc3cb234448"
SRC_URI[sha256sum] = "63a550d803eccc06de53f1ffb775d021d36e9ae6fca0d0e2854504ee0411b1e7"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
