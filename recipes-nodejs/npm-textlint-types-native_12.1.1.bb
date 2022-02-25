SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-12.1.1.tgz"
SRC_URI[md5sum] = "f441dee99c9811ec8e07379d2dd1417b"
SRC_URI[sha256sum] = "d931980a3495500f400970d1e842a35077056ddc4f4f07808dd2a25b36e4f471"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
