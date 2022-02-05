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

SRC_URI = "https://registry.npmjs.org/camelcase-keys/-/camelcase-keys-7.0.2.tgz"
SRC_URI[md5sum] = "00500d3bc882237b79e5e35d2fcc7c0a"
SRC_URI[sha256sum] = "ea312ffde79f26dd69be43ac9543760eac23978186319379f70793be3dbc5c5d"

NPM_PKGNAME = "camelcase-keys"

inherit npmhelper
inherit native
