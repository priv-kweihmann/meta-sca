SUMMARY = "NPM: fault"
DESCRIPTION = "Functional errors with formatted output"
HOMEPAGE = "https://github.com/wooorm/fault#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

DEPENDS = "npm-format-native"

SRC_URI = "https://registry.npmjs.org/fault/-/fault-2.0.1.tgz"
SRC_URI[md5sum] = "1c5b19d62a38a0f523129e1bb89879d7"
SRC_URI[sha256sum] = "1efd6a9cc6e284cbb7e3c285d15a9d424d930039f6772291457eb143795808e7"

NPM_PKGNAME = "fault"

inherit npmhelper
inherit native
