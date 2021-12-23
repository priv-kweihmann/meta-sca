SUMMARY = "NPM: semver"
DESCRIPTION = "The semantic version parser used by npm."
HOMEPAGE = "https://github.com/npm/node-semver#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

DEPENDS = "npm-lru-cache-native"

SRC_URI = "https://registry.npmjs.org/semver/-/semver-7.3.5.tgz"
SRC_URI[md5sum] = "603c4a08e37ddc0c10438e881f9b3fdd"
SRC_URI[sha256sum] = "af1f802439e20980a10b03c879fcc89921793f51b95252e805a8ba8079a6599e"

NPM_PKGNAME = "semver"

inherit npmhelper
inherit native
