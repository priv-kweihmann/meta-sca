SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.5.2.tgz"
SRC_URI[md5sum] = "d645c39488cc54ab7cfe7493c211bd5f"
SRC_URI[sha256sum] = "b7f565aa7a2084d2f27861488962fe9f7562d6ac4cc266b71775425ff68460bb"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
