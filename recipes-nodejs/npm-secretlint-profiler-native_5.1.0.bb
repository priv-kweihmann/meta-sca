SUMMARY = "NPM: @secretlint/profiler"
DESCRIPTION = "Profile manager for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/profiler/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@secretlint/profiler/-/profiler-5.1.0.tgz"
SRC_URI[md5sum] = "78dc40babe1c70aa5ee027bd85389373"
SRC_URI[sha256sum] = "d4cc2952205ee2bcfe889cd5d9809c6abd70a07398bd164ecabe581cd8e89238"

NPM_PKGNAME = "@secretlint/profiler"

inherit npmhelper
inherit native
