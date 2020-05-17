SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/semver/-/semver-7.3.2.tgz"
SRC_URI[md5sum] = "9cd2b5d616d41e5bedcd2d7121b5ec47"
SRC_URI[sha256sum] = "a16a584af6fd9984d2d9e9c2adcd6adaf1ebfadf6a94a46ceee540e84ee91989"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
