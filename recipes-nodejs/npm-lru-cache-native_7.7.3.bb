SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.7.3.tgz"
SRC_URI[md5sum] = "b3503844c91c180e9ae103694a3c2247"
SRC_URI[sha256sum] = "b425216c683c7598e7a434cae747bcaff8c1f094dbcb5dd185a7ea1b1fa26e97"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
