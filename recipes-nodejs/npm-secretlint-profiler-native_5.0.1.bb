SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-5.0.1.tgz"
SRC_URI[md5sum] = "3a4cb8c8019c77bf2b83828d3548727f"
SRC_URI[sha256sum] = "4995f669a01b697d5ff5d5fbae664f24915aa277beced2d68b2a8225d0373fb8"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
