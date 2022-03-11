SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-5.1.0.tgz"
SRC_URI[md5sum] = "600e310a8a1149e9aac0d0f82bb12fb6"
SRC_URI[sha256sum] = "abac74c8106d28b356dc17aa69b216895053fc8eda07010042758f99525fb95f"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
