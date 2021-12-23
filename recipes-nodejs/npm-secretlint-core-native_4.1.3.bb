SUMMARY = "NPM: @secretlint/core"
DESCRIPTION = "Core library for @secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/core/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-profiler-native \
           npm-secretlint-types-native \
           npm-structured-source-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/core/-/core-4.1.3.tgz"
SRC_URI[md5sum] = "dc0bd3a72260e66398c41cab09161c64"
SRC_URI[sha256sum] = "f026e78b7f1326a43ca871abfc46083fd9a59b98813296cd7c5fee29633c1167"

NPM_PKGNAME = "@secretlint/core"

inherit npmhelper
inherit native
