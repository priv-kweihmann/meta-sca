SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-12.0.0.tgz"
SRC_URI[md5sum] = "d10b986b8a617fe7bd0cd5e530f8b84c"
SRC_URI[sha256sum] = "195c4d969a5e8b2214a99a8c9517f0fb7b1e593a90cfd25e5b09eb5be960db07"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
