SUMMARY = "NPM: yocto-queue"
DESCRIPTION = "Tiny queue data structure"
HOMEPAGE = "https://github.com/sindresorhus/yocto-queue#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/yocto-queue/-/yocto-queue-1.0.0.tgz"
SRC_URI[md5sum] = "4a28b1a4c6046bb50a889725090ccd67"
SRC_URI[sha256sum] = "4bdebff9d1c18d94be01ea73b9acf96b249c271f3e3cd395be0d3c9a399c9fc9"

NPM_PKGNAME = "yocto-queue"

inherit npmhelper
inherit native
