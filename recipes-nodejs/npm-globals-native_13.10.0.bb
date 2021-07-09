SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.10.0.tgz"
SRC_URI[md5sum] = "7a8a277714cc809ff39abfe9b2d21a42"
SRC_URI[sha256sum] = "40dd1d3c70c4e03bf60497d26811a1abef14612d1845830031d1f754c5723490"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
