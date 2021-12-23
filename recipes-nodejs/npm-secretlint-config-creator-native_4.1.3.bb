SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-4.1.3.tgz"
SRC_URI[md5sum] = "23c3fff358f36e3754baad6498367209"
SRC_URI[sha256sum] = "95514b3e1cbe64a544bda5176100c370c54284afa6f7260e6eb7dd798aed0f7c"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
