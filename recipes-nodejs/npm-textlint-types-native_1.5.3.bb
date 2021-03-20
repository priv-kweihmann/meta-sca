SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.5.3.tgz"
SRC_URI[md5sum] = "83edfa6c33eeeefacb80c2983a9becd8"
SRC_URI[sha256sum] = "7a646e6ca218681d9537af3f13c15eab9ded20422fdca661cd02e6343a6a226c"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
