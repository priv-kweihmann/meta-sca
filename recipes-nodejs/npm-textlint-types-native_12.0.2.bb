SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-12.0.2.tgz"
SRC_URI[md5sum] = "a55d2a4659fe954aba63b3871cce0607"
SRC_URI[sha256sum] = "46f6ec5131e81e8c8b6228cd82e72f8c405158fbe960c9c5e8375870b2590e00"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
