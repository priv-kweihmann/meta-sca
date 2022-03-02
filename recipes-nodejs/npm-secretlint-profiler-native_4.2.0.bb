SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-4.2.0.tgz"
SRC_URI[md5sum] = "b48b5b7f3726cc4067b91b9dc35ab2fb"
SRC_URI[sha256sum] = "3108b4457722dcb1083f84332ad6693f1ffb8d5c1e639df04a7b3ffcca13c4a2"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
