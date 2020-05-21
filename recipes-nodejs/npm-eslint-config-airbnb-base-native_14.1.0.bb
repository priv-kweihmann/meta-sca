SUMMARY = "NPM: eslint-config-airbnb-base"
DESCRIPTION = "Airbnb's base JS ESLint config, following our styleguide"
HOMEPAGE = "https://github.com/airbnb/javascript"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=29157425f48d84cfa6d38bd8260ece56"

DEPENDS = "npm-confusing-browser-globals-native \
           npm-object.assign-native \
           npm-object.entries-native"

SRC_URI = "https://registry.npmjs.org/eslint-config-airbnb-base/-/eslint-config-airbnb-base-14.1.0.tgz"
SRC_URI[md5sum] = "ba5fe8fff1b2fcd2a6b0107fc93b5418"
SRC_URI[sha256sum] = "30e5e811aba8667eb37317e44be3d1e67edbf9e853c3cdf916e4553af553140b"

NPM_PKGNAME = "eslint-config-airbnb-base"

inherit npmhelper
inherit native
