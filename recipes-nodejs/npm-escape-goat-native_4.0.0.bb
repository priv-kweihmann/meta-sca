SUMMARY = "NPM: escape-goat"
DESCRIPTION = "Escape a string for use in HTML or the inverse"
HOMEPAGE = "https://github.com/sindresorhus/escape-goat#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escape-goat/-/escape-goat-4.0.0.tgz"
SRC_URI[md5sum] = "1d61677c886d30f073c9520d1ddb525d"
SRC_URI[sha256sum] = "8ef118c5604556653243a8042160a6d333acca8be8d18a5097f9fcd94c9ce705"

NPM_PKGNAME = "escape-goat"

inherit npmhelper
inherit native
