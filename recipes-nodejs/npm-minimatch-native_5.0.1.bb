SUMMARY = "NPM: minimatch"
DESCRIPTION = "a glob matcher in javascript"
HOMEPAGE = "https://github.com/isaacs/minimatch#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=662b24bdd69543eedfd0619202355315"

DEPENDS = "npm-brace-expansion-native"

SRC_URI = "https://registry.npmjs.org/minimatch/-/minimatch-5.0.1.tgz"
SRC_URI[md5sum] = "9149dac465a83f8dec2929a20879e864"
SRC_URI[sha256sum] = "e1d59a9b96aa036de26b4f6282144072e9d607b1e93f9f819aacaf976af3506a"

NPM_PKGNAME = "minimatch"

inherit npmhelper
inherit native
