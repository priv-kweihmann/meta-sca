SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-3.1.0.tgz"
SRC_URI[md5sum] = "37325b44258d6ce2d70777b78d4f14a8"
SRC_URI[sha256sum] = "9c608a022ac7dbb79db9b487921407329a7704c117695447e23a72d9e0315526"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
