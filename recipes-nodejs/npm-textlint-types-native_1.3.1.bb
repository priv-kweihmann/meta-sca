SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

DEPENDS = "npm-textlint-ast-node-types-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.3.1.tgz"
SRC_URI[md5sum] = "197e7ba9e7a7f5753149a95c795b6222"
SRC_URI[sha256sum] = "14791ef0d239d17e00dcb0c0f25254cd15eb838b1b6570fbe0ffb25ebe503d48"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
