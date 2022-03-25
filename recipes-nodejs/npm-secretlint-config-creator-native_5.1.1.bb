SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-5.1.1.tgz"
SRC_URI[md5sum] = "d266de37c8c61a62bc0da422e623cb5b"
SRC_URI[sha256sum] = "bd0ce0870beec44a34cc466f51f217313fed3a057046011da751f68583d6188a"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
