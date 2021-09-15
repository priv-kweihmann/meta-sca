SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-4.0.0.tgz"
SRC_URI[md5sum] = "681b7e2bead34523b64d93e1f68f3286"
SRC_URI[sha256sum] = "b4304dbd10069e14445f72d7740291fdda9f485216d8f9f2f4bbe7545faee68a"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
