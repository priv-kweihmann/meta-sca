SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-5.1.1.tgz"
SRC_URI[md5sum] = "66a781b8f01dbb956dec848a1b307e67"
SRC_URI[sha256sum] = "488f2ea7aeb2217b985127ead0a2b13c0124c5085b1cc3b5021cb8c9e2bc962b"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
