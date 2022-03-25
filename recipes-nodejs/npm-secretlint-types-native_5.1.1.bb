SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-5.1.1.tgz"
SRC_URI[md5sum] = "b5019a6fd8bcae214cb50476519fe867"
SRC_URI[sha256sum] = "8a306303b923209a469f6578b96a6255fe4ff0cdcca3035ad779c75a4bbf47e9"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
