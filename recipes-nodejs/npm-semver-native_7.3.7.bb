SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/semver/-/semver-7.3.7.tgz"
SRC_URI[md5sum] = "54c0055e73fc68d03f60cce25cf8aeb8"
SRC_URI[sha256sum] = "8fe282da5069b85601b28de1a335092a27810eb3ed71526d0c355ab64069b774"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
