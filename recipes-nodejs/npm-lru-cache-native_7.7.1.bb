SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.7.1.tgz"
SRC_URI[md5sum] = "be97e51c2da46a7a341ed429e177d333"
SRC_URI[sha256sum] = "2516f0ec139dada450214587695c8f1c772bfeadafe4f214239d065ab2068a71"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
