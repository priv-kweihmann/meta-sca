SUMMARY = "NPM: camelcase-keys"
DESCRIPTION = "Convert object keys to camel case"
HOMEPAGE = "https://github.com/sindresorhus/camelcase-keys#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-camelcase-native \
           npm-map-obj-native \
           npm-quick-lru-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/camelcase-keys/-/camelcase-keys-7.0.1.tgz"
SRC_URI[md5sum] = "e9e217c871567f10f579d7afaddd9cf2"
SRC_URI[sha256sum] = "c4b980e69e8befab9c10016852a8ad90a7c3b71a981f79e2ad7bf5c7fddd75d6"

NPM_PKGNAME = "camelcase-keys"

inherit npmhelper
inherit native
