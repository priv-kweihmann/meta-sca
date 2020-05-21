SUMMARY = "NPM: remove-trailing-separator"
DESCRIPTION = "Removes separators from the end of the string."
HOMEPAGE = "https://github.com/darsain/remove-trailing-separator#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://license;md5=294c1c7712f9be26cef730b5ad95a6a5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/remove-trailing-separator/-/remove-trailing-separator-1.1.0.tgz"
SRC_URI[md5sum] = "b22754e30e8983a5be8c5469d4ee5f8d"
SRC_URI[sha256sum] = "4e1340d198749dbcf0986dde8b657e0470f395d2c9be1da90a7c169dbeae6321"

NPM_PKGNAME = "remove-trailing-separator"

inherit npmhelper
inherit native
