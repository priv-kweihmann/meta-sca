SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-1.4.6.tgz"
SRC_URI[md5sum] = "f3607ef8d6f13932806af385689dd9ab"
SRC_URI[sha256sum] = "639a20bba53a853ac7e5b6138eb9688e07f9f955d4c702791abbedd9fdf4a60b"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
