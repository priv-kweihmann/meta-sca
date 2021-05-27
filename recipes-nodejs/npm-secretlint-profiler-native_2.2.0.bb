SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-2.2.0.tgz"
SRC_URI[md5sum] = "913fef87857ae5716355e4e51abfe9b0"
SRC_URI[sha256sum] = "2208a2142f99376a17de6a90e4e1c39804f9f57b9f40f9a0f04e56ed749c6b94"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
