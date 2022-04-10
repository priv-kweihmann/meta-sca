SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.8.1.tgz"
SRC_URI[md5sum] = "3e5febcca5fe3624e60c5b26017eeffa"
SRC_URI[sha256sum] = "b6cdbc6a9e7299dd244fabded811740b31c96622ea048df76d3d11bd3dd855d2"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
