SUMMARY = "NPM: escape-string-regexp"
DESCRIPTION = "Escape RegExp special characters"
HOMEPAGE = "https://github.com/sindresorhus/escape-string-regexp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escape-string-regexp/-/escape-string-regexp-4.0.0.tgz"
SRC_URI[md5sum] = "6c4ea446a9f85d76c9b3e599a9ea25b5"
SRC_URI[sha256sum] = "4b44a14da6987a3c0585c2ff16b3800425732ff35cad710c65e72d7f8e33b11b"

NPM_PKGNAME = "escape-string-regexp"

inherit npmhelper
inherit native
