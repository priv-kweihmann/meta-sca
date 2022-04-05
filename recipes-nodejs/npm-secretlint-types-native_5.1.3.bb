SUMMARY = "NPM: @secretlint/types"
DESCRIPTION = "A typing package for @secretlint"
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/types/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/types/-/types-5.1.3.tgz"
SRC_URI[md5sum] = "53d0e6a83d5c99ba39537cec510b4158"
SRC_URI[sha256sum] = "a92eecd305b0f7a2b560d05075b257204326e2f6d3497ffaae5333af4ca6df15"

NPM_PKGNAME = "@secretlint/types"

inherit npmhelper
inherit native
