SUMMARY = "NPM: ansi-regex"
DESCRIPTION = "Regular expression for matching ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/ansi-regex#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-regex/-/ansi-regex-6.0.1.tgz"
SRC_URI[md5sum] = "b80ed484d3d7d2c4ea7400110bd97994"
SRC_URI[sha256sum] = "3486b885693287a048462cc12cb88d699b608085fcd95ab84dc3a275f2ae14a8"

NPM_PKGNAME = "ansi-regex"

inherit npmhelper
inherit native
