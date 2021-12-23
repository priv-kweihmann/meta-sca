SUMMARY = "NPM: read-installed"
DESCRIPTION = "Read all the installed packages in a folder, and return a tree structure with all the data."
HOMEPAGE = "https://github.com/isaacs/read-installed#readme"

DEPENDS = "npm-debuglog-native npm-graceful-fs-native npm-read-package-json-native npm-readdir-scoped-modules-native npm-semver-native npm-slide-native npm-util-extend-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470"

SRC_URI = "https://registry.npmjs.org/read-installed/-/read-installed-4.0.3.tgz"
SRC_URI[md5sum] = "be2397ad2c2642a18e4722dc2a2059ce"
SRC_URI[sha256sum] = "d2a53e1f45d1df166bb64cd330ce158eca9f887d88ae0561b145d2a257b1a9f6"

NPM_PKGNAME = "read-installed"

inherit npmhelper
inherit native
