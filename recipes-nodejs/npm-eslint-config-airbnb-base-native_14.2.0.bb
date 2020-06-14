SUMMARY = "NPM: eslint-config-airbnb-base"
DESCRIPTION = "Airbnb's base JS ESLint config, following our styleguide"
HOMEPAGE = "https://github.com/airbnb/javascript"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=29157425f48d84cfa6d38bd8260ece56"

DEPENDS = "npm-confusing-browser-globals-native \
           npm-object.assign-native \
           npm-object.entries-native"

SRC_URI = "https://registry.npmjs.org/eslint-config-airbnb-base/-/eslint-config-airbnb-base-14.2.0.tgz"
SRC_URI[md5sum] = "e3b57cc0d70c21a9b7fb71cce2d53cff"
SRC_URI[sha256sum] = "279b6b59a487079a4ed2c1aebbef43f7313e7e79f4b71ad6ec2f2ff5c0b31d74"

NPM_PKGNAME = "eslint-config-airbnb-base"

inherit npmhelper
inherit native
