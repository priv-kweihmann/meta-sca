SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-4.1.3.tgz"
SRC_URI[md5sum] = "1fdc6644c9c4f7ba73cadf11be642751"
SRC_URI[sha256sum] = "c5a65d51a8e99f26dbd2d65001ec1187e7a956f2d85e990b939ec48f59dc8da9"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
