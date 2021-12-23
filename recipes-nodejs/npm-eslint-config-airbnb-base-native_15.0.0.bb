SUMMARY = "NPM: eslint-config-airbnb-base"
DESCRIPTION = "Airbnb's base JS ESLint config, following our styleguide"
HOMEPAGE = "https://github.com/airbnb/javascript"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=29157425f48d84cfa6d38bd8260ece56"

DEPENDS = "npm-confusing-browser-globals-native \
           npm-object.assign-native \
           npm-object.entries-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-config-airbnb-base/-/eslint-config-airbnb-base-15.0.0.tgz"
SRC_URI[md5sum] = "f7759df97b87b69d19b09b5df8aa5ebf"
SRC_URI[sha256sum] = "4b4b1f81fef005af58c59468acbbef22b809bf4909d5b8623fb49c5152046fd2"

NPM_PKGNAME = "eslint-config-airbnb-base"

inherit npmhelper
inherit native
