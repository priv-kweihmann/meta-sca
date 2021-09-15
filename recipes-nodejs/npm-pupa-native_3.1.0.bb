SUMMARY = "NPM: pupa"
DESCRIPTION = "Simple micro templating"
HOMEPAGE = "https://github.com/sindresorhus/pupa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-goat-native"

SRC_URI = "https://registry.npmjs.org/pupa/-/pupa-3.1.0.tgz"
SRC_URI[md5sum] = "6cb69bea2455081bb428379a57c24707"
SRC_URI[sha256sum] = "ff4601d3c43da2b8030f22b9ef7376a0c90a859e2d64b635c56ece189f76addd"

NPM_PKGNAME = "pupa"

inherit npmhelper
inherit native
