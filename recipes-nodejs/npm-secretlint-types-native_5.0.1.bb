SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-5.0.1.tgz"
SRC_URI[md5sum] = "af3d96f7a7f8633f28a173678e6aaf75"
SRC_URI[sha256sum] = "e78de691dd32c4616096b815b473f7169505c239a13acc6b7ce8d197df0643c9"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
