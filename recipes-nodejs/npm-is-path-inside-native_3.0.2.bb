SUMMARY = "NPM: is-path-inside"
DESCRIPTION = "Check if a path is inside another path"
HOMEPAGE = "https://github.com/sindresorhus/is-path-inside#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-path-inside/-/is-path-inside-3.0.2.tgz"
SRC_URI[md5sum] = "a03e75350a69e36dc685102625b96431"
SRC_URI[sha256sum] = "ec7083e8b60c9cfeea2cdc5d168d66cad4d9619e1c5dda9102b57498cee26acc"

NPM_PKGNAME = "is-path-inside"

inherit npmhelper
inherit native
