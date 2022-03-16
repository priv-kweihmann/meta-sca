SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.5.1.tgz"
SRC_URI[md5sum] = "694a4ca6d1db495976dbec37a818cbff"
SRC_URI[sha256sum] = "66b6b5f603c88aa3a387b6a2a2ccaf13171985f37e35dc261b4c55ed64fb69fd"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
