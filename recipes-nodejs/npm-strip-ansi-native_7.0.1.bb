SUMMARY = "NPM: strip-ansi"
DESCRIPTION = "Strip ANSI escape codes from a string"
HOMEPAGE = "https://github.com/chalk/strip-ansi#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-regex-native"

SRC_URI = "https://registry.npmjs.org/strip-ansi/-/strip-ansi-7.0.1.tgz"
SRC_URI[md5sum] = "5b8a5ae2a97d9a8a82ffa7abca804734"
SRC_URI[sha256sum] = "ee76f1457555c3d5ec46a4c868b893d682897dc3d8ed2f86ab2d6c1971e52e7f"

NPM_PKGNAME = "strip-ansi"

inherit npmhelper
inherit native
