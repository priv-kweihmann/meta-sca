SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-4.2.0.tgz"
SRC_URI[md5sum] = "55a79c9bb9d5ca657389c35cd89c3224"
SRC_URI[sha256sum] = "1e310fad2cccd66c419b111ad7f6bd528b67420603095fc63027433160ebada4"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
