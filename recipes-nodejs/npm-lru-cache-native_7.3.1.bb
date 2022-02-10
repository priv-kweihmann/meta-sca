SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.3.1.tgz"
SRC_URI[md5sum] = "e48bd45c0f89604ac0f013fd8d3d4e52"
SRC_URI[sha256sum] = "a1b2406313b550fe3cfb35c5de89de572d368a3dca1433af25b9da3e4fbec917"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
