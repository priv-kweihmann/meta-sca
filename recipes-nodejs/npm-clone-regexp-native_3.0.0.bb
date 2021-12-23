SUMMARY = "NPM: clone-regexp"
DESCRIPTION = "Clone and modify a RegExp instance"
HOMEPAGE = "https://github.com/sindresorhus/clone-regexp#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-is-regexp-native"

SRC_URI = "https://registry.npmjs.org/clone-regexp/-/clone-regexp-3.0.0.tgz"
SRC_URI[md5sum] = "03b5d638d610892bf92ce2b44175a44f"
SRC_URI[sha256sum] = "6241373c32f8cd489d1558e0444b9478926b87a2f1c5939ae6082cb9d55526ba"

NPM_PKGNAME = "clone-regexp"

inherit npmhelper
inherit native
