SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-5.2.0.tgz"
SRC_URI[md5sum] = "23a1b7fcaa00a528cb63c7f8478e53b5"
SRC_URI[sha256sum] = "21aadcc8a85f1a2c73526d03ceaac20a9f9c8198086e7a0ad59d2f244fb4adac"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
