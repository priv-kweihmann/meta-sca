SUMMARY = "NPM: lru-cache"
DESCRIPTION = "A cache object that deletes the least-recently-used items."
HOMEPAGE = "https://github.com/isaacs/node-lru-cache#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acbb3c1bd757871a3042b2b9699697ee"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lru-cache/-/lru-cache-7.4.4.tgz"
SRC_URI[md5sum] = "25198bcbe1db7a1b49f735820485fe02"
SRC_URI[sha256sum] = "be905d9db4b943f09ec3385ad0be0aa2d2a20497ccc1f76b828800ccf9909bc1"

NPM_PKGNAME = "lru-cache"

inherit npmhelper
inherit native
