SUMMARY = "NPM: @textlint/types"
DESCRIPTION = "Type definition package for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=46ad0c4fd3586dd75b2ed7a332e35acb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/types/-/types-12.1.0.tgz"
SRC_URI[md5sum] = "5b91bae14b9b2ab1f8f60fe401f51c7f"
SRC_URI[sha256sum] = "5a7cdada8ebdc0f53032ac3d52b2c51e9b6de990273207a89e12b186af77e734"

NPM_PKGNAME = "@textlint/types"

inherit npmhelper
inherit native
