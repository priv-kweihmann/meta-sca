SUMMARY = "NPM: escape-string-regexp"
DESCRIPTION = "Escape RegExp special characters"
HOMEPAGE = "https://github.com/sindresorhus/escape-string-regexp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escape-string-regexp/-/escape-string-regexp-5.0.0.tgz"
SRC_URI[md5sum] = "99fff4044f5046db36d30137f06222b9"
SRC_URI[sha256sum] = "c8b662afe8aa2b852ecc27d766e584a502f8351fbbd890611f2509bf083d28e6"

NPM_PKGNAME = "escape-string-regexp"

inherit npmhelper
inherit native
