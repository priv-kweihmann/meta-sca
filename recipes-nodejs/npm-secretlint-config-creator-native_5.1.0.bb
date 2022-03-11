SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-5.1.0.tgz"
SRC_URI[md5sum] = "1e58e3f1a56ad35f0eb718b4ef56f42a"
SRC_URI[sha256sum] = "0ddb2b92f0d8d7889f6fc2940009bfcb59021aade9bfc0d4eca0ecd43281f7c6"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
