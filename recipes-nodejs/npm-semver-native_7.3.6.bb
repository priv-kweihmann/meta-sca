SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/semver/-/semver-7.3.6.tgz"
SRC_URI[md5sum] = "6685167b5b29803920b4e73c30d3c4f2"
SRC_URI[sha256sum] = "785e1ce2cad0bd1425000bb85996408c616bcc1082419a62f9b6e7058f296079"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
