SUMMARY = "NPM: camelcase-keys"
DESCRIPTION = "Convert object keys to camel case"
HOMEPAGE = "https://github.com/sindresorhus/camelcase-keys#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-camelcase-native \
           npm-map-obj-native \
           npm-quick-lru-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/camelcase-keys/-/camelcase-keys-7.0.0.tgz"
SRC_URI[md5sum] = "c13c426e7fffb5aa2e9952ce83b36b1f"
SRC_URI[sha256sum] = "38f87eb933c28d9fe4012b3ceb6b2de5b3f4966301a76d4581ce40b98d380e16"

NPM_PKGNAME = "camelcase-keys"

inherit npmhelper
inherit native
