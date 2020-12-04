SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/semver/-/semver-7.3.4.tgz"
SRC_URI[md5sum] = "f7b7b4b2c4b20c9784f34eb6c6e6c364"
SRC_URI[sha256sum] = "ca9ed38901b6f94e2a40d0302e9b9c173ab2686fb18c3c4176c326452313f2cb"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
