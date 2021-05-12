SUMMARY = "NPM: @textlint/textlint-plugin-markdown"
DESCRIPTION = "Markdown support for textlint."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-markdown"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-markdown-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-markdown/-/textlint-plugin-markdown-5.3.5.tgz"
SRC_URI[md5sum] = "a39f80364ce2c48e13074660ea495d07"
SRC_URI[sha256sum] = "12294fa35711df988d59b7010518ec2816c50da91129e402d860f66ab111e3fd"

NPM_PKGNAME = "@textlint/textlint-plugin-markdown"

inherit npmhelper
inherit native
