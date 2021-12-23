SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-6.1.0.tgz"
SRC_URI[md5sum] = "091485ca0219027190433a5fde3ed4bb"
SRC_URI[sha256sum] = "d28516677f6be1611b10d6aebcfa22863e61a5ed5a7293edba799c4860228b7b"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
