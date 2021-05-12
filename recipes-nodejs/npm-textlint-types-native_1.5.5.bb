SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.5.5.tgz"
SRC_URI[md5sum] = "0f7550babb09681a506f536afb0d5223"
SRC_URI[sha256sum] = "dc8fbf0a0346f30be116c3074a90aabaa46bad7cafef9d9345fca19331c844a7"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
