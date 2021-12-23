SUMMARY = "NPM: globjoin"
DESCRIPTION = "Join paths and globs."
HOMEPAGE = "https://github.com/amobiz/globjoin"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40b787b068d19ac53e17aff41f21b102"

SRC_URI = "https://registry.npmjs.org/globjoin/-/globjoin-0.1.4.tgz"
SRC_URI[md5sum] = "4b5a361b68609f9ebe20a054abe98106"
SRC_URI[sha256sum] = "f30c09697cbdd14e522e18cc91eb0d7683d491a06cf58621beb0677be5d9ff3c"

NPM_PKGNAME = "globjoin"

inherit npmhelper
inherit native
