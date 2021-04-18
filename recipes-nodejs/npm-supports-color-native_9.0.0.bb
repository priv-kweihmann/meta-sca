SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.0.0.tgz"
SRC_URI[md5sum] = "7190d51fb26b7d1a12aaab49610ee772"
SRC_URI[sha256sum] = "5e6e4e6d3bc919884c66d480ab2e336dc2e663d224ba1880a37b5a6c83b949b2"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
