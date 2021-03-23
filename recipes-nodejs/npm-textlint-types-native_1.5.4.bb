SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.5.4.tgz"
SRC_URI[md5sum] = "ef96ebb597d2eca079031a6ab3acd007"
SRC_URI[sha256sum] = "541ab04c501902c704ceeaafcfe4747fb7f4abf42267944e5aa156229678703b"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
