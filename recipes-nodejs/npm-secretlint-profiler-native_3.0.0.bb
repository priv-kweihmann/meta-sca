SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-3.0.0.tgz"
SRC_URI[md5sum] = "c198c82aa17f4a1fe4e0017d0a59070a"
SRC_URI[sha256sum] = "1411761fb8328f9296c72e6033e26db162f251a9519f87aca6c9967c61333a95"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
