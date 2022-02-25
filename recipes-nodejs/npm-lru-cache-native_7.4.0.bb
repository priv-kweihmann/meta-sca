SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.4.0.tgz"
SRC_URI[md5sum] = "1eecdaab21b280c94b8f3d7d1f17e948"
SRC_URI[sha256sum] = "89ec64128de5b416f402af6f204875f961b1937f1f13d317c07d3d6795006ab4"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
