SUMMARY = "NPM: minimatch"
DESCRIPTION = "a glob matcher in javascript"
HOMEPAGE = "https://github.com/isaacs/minimatch#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662b24bdd69543eedfd0619202355315"

DEPENDS = "npm-brace-expansion-native"

SRC_URI = "https://registry.npmjs.org/minimatch/-/minimatch-5.0.0.tgz"
SRC_URI[md5sum] = "ea82adb449c9d07565730cc3bdf5345b"
SRC_URI[sha256sum] = "68f0161563aa3480c32b848f0fa074422caa2f3ed380d731a737911913b54720"

NPM_PKGNAME = "minimatch"

inherit npmhelper
inherit native
