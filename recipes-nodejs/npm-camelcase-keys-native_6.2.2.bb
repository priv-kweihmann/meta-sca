SUMMARY = "NPM: camelcase-keys"
DESCRIPTION = "Convert object keys to camel case"
HOMEPAGE = "https://github.com/sindresorhus/camelcase-keys#readme"

DEPENDS = "npm-camelcase-native npm-map-obj-native npm-quick-lru-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/camelcase-keys/-/camelcase-keys-6.2.2.tgz"
SRC_URI[md5sum] = "f8ed4deaffc22f845ec607d613592415"
SRC_URI[sha256sum] = "47f9eafaec844f9740198e9d35b3892bfe5628354b14f91af7993d4fb4b20e2e"

NPM_PKGNAME = "camelcase-keys"

inherit npmhelper
inherit native
