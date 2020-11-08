SUMMARY = "NPM: eslint-config-airbnb-base"
DESCRIPTION = "Airbnb's base JS ESLint config, following our styleguide"
HOMEPAGE = "https://github.com/airbnb/javascript"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=29157425f48d84cfa6d38bd8260ece56"

DEPENDS = "npm-confusing-browser-globals-native \
           npm-object.assign-native \
           npm-object.entries-native"

SRC_URI = "https://registry.npmjs.org/eslint-config-airbnb-base/-/eslint-config-airbnb-base-14.2.1.tgz"
SRC_URI[md5sum] = "4aeb61f3538f05be3e17b55fce33ebdc"
SRC_URI[sha256sum] = "99f3896b9ae5dc966a77c125eeb971f9ab5f77a76de6a44bbaaea0efa4d0744a"

NPM_PKGNAME = "eslint-config-airbnb-base"

inherit npmhelper
inherit native
