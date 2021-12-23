SUMMARY = "NPM: log-symbols"
DESCRIPTION = "Colored symbols for various log levels. Example: `✔︎ Success`"
HOMEPAGE = "https://github.com/sindresorhus/log-symbols#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-chalk-native \
           npm-is-unicode-supported-native"

SRC_URI = "https://registry.npmjs.org/log-symbols/-/log-symbols-5.1.0.tgz"
SRC_URI[md5sum] = "6e697ed939cb74db8beae80b7aff944e"
SRC_URI[sha256sum] = "0c4d6f6343b6770e5ed44da381280e737db79196b8fb6dfdb7732e2dbb5fc728"

NPM_PKGNAME = "log-symbols"

inherit npmhelper
inherit native
