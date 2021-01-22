SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.5.1.tgz"
SRC_URI[md5sum] = "f6ef8a8518d600c1f8350c54e9028b24"
SRC_URI[sha256sum] = "60ce68e6a0a54a56e32f81031e52568b9295a284403d80be0cc7dd443c876fb4"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
