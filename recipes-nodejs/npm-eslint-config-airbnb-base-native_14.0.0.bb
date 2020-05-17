SUMMARY = "NPM: eslint-config-airbnb-base"
DESCRIPTION = "Airbnb's base JS ESLint config, following our styleguide"
HOMEPAGE = "https://github.com/airbnb/javascript"

DEPENDS = "npm-confusing-browser-globals-native npm-object.assign-native npm-object.entries-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=29157425f48d84cfa6d38bd8260ece56"

SRC_URI = "https://registry.npmjs.org/eslint-config-airbnb-base/-/eslint-config-airbnb-base-14.0.0.tgz"
SRC_URI[md5sum] = "0276d170046a0ee0461a9f244bd2dd67"
SRC_URI[sha256sum] = "a3ff089fe5522ecf8ac46f3b7c19c98938931a6e9bcd1b81e5ea927d92966743"

NPM_PKGNAME = "eslint-config-airbnb-base"

inherit npmhelper
inherit native
