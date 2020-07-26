SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.4.5.tgz"
SRC_URI[md5sum] = "a108e201a1afd87be162e52d974c5738"
SRC_URI[sha256sum] = "c27c1a3eefb7f18efb29d145322b3c70cc6f34ede2bf7f69529055ee977b042c"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
