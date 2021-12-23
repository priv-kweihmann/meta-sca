SUMMARY = "NPM: is-regexp"
DESCRIPTION = "Check if a value is a regular expression"
HOMEPAGE = "https://github.com/sindresorhus/is-regexp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-regexp/-/is-regexp-3.1.0.tgz"
SRC_URI[md5sum] = "351dca117f5fdcfed709e14518cc7d8f"
SRC_URI[sha256sum] = "c38cc61c49d0dc355eac484776639b2c8f39c5978eaa21d74c895bce88dddb8d"

NPM_PKGNAME = "is-regexp"

inherit npmhelper
inherit native
