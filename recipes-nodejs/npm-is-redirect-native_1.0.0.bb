SUMMARY = "NPM: is-redirect"
DESCRIPTION = "Check if a number is a redirect HTTP status code"
HOMEPAGE = "https://github.com/sindresorhus/is-redirect"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/is-redirect/-/is-redirect-1.0.0.tgz"
SRC_URI[md5sum] = "b747939ca75c615e83664c7a0640448e"
SRC_URI[sha256sum] = "35f3e5708d9484fc8c38d9ae365b137923b005fdd130885a2b6602c251b551be"

NPM_PKGNAME = "is-redirect"

inherit npmhelper
inherit native
