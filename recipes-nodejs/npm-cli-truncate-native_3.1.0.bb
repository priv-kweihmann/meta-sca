SUMMARY = "NPM: cli-truncate"
DESCRIPTION = "Truncate a string to a specific width in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-truncate#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/cli-truncate/-/cli-truncate-3.1.0.tgz"
SRC_URI[md5sum] = "c2d7fda41d021ba089da0c48e6e01f94"
SRC_URI[sha256sum] = "3931eb6043d9f5b7b1dba60931ff3b48d2ac25c98cec5cbb94433265e133f1e2"

NPM_PKGNAME = "cli-truncate"

inherit npmhelper
inherit native
