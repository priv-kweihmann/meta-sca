SUMMARY = "NPM: dot-prop"
DESCRIPTION = "Get, set, or delete a property from a nested object using a dot path"
HOMEPAGE = "https://github.com/sindresorhus/dot-prop#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-is-obj-native"

SRC_URI = "https://registry.npmjs.org/dot-prop/-/dot-prop-6.0.1.tgz"
SRC_URI[md5sum] = "3d2878960ff06a0265997223a73529f0"
SRC_URI[sha256sum] = "8877d6eb650804546dc309434945ee0fcfdc9155e49ed38d6080d0ccd9ab8953"

NPM_PKGNAME = "dot-prop"

inherit npmhelper
inherit native
