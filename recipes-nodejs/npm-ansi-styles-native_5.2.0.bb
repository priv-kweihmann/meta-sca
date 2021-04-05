SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-5.2.0.tgz"
SRC_URI[md5sum] = "9a94aa4a6c4105b68ca60d51d246bbd8"
SRC_URI[sha256sum] = "4ddd9360421279bb2c2c4ba91bc41a5515663223432d09158f9e3805f9d4a05f"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
