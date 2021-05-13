SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-2.1.1.tgz"
SRC_URI[md5sum] = "679aa7dcbd48314ad806d2143ea72d9d"
SRC_URI[sha256sum] = "9629ed0b279c85b287301e238c462dd6d75ee815cc6d58219ccd392a310c9529"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
