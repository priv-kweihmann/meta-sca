SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-4.1.3.tgz"
SRC_URI[md5sum] = "1b4815878649544f667ba72d72505a9c"
SRC_URI[sha256sum] = "6159ff2f893d0f25133a0b1b3fcaecb5b54d4a3a4744968d3961f9e8aad1d0d8"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
