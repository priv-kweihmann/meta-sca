SUMMARY = "NPM: escape-goat"
DESCRIPTION = "Escape a string for use in HTML or the inverse"
HOMEPAGE = "https://github.com/sindresorhus/escape-goat#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escape-goat/-/escape-goat-3.0.0.tgz"
SRC_URI[md5sum] = "0baa3ad402ed04303d623ae6809a8354"
SRC_URI[sha256sum] = "ab66ffc911348a680aa1c1668412f6865251d57992097946ee79d27283d59c3c"

NPM_PKGNAME = "escape-goat"

inherit npmhelper
inherit native
