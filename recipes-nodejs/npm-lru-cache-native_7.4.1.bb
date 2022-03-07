SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.4.1.tgz"
SRC_URI[md5sum] = "85cf3107c7b16eb84fa5ec1a7b7e0f0d"
SRC_URI[sha256sum] = "1a211283b114bcea80ed698cedc87bfea2180d6ed1ea4568fc3f9c71028c092c"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
