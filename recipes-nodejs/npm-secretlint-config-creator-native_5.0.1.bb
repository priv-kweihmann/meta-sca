SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-5.0.1.tgz"
SRC_URI[md5sum] = "a5f7f6b772428aafa0dde967d456c235"
SRC_URI[sha256sum] = "0808a2b19fde2f340084d5c64831dc146c986f8c273e73511cbf21a3ccd96de8"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
