SUMMARY = "NPM: @secretlint/config-creator"
DESCRIPTION = "Config file creator for secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/config-creator/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/config-creator/-/config-creator-2.2.0.tgz"
SRC_URI[md5sum] = "d86a9bc5a1dc260434779d35c988fd05"
SRC_URI[sha256sum] = "0e1c77970fc2fbd8cfed7a1257a5f0894c0915e096ae96b511c1e32348338734"

NPM_PKGNAME = "@secretlint/config-creator"

inherit npmhelper
inherit native
