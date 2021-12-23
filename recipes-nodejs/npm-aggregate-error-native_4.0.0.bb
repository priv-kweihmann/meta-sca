SUMMARY = "NPM: aggregate-error"
DESCRIPTION = "Create an error from multiple errors"
HOMEPAGE = "https://github.com/sindresorhus/aggregate-error#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-clean-stack-native \
           npm-indent-string-native"

SRC_URI = "https://registry.npmjs.org/aggregate-error/-/aggregate-error-4.0.0.tgz"
SRC_URI[md5sum] = "5af6b287326a1429e2dde20d08ff8a4a"
SRC_URI[sha256sum] = "d1e1969d9d0907fdb9512c1bdf91e92d0d208b3733bbeae2701d0360933124be"

NPM_PKGNAME = "aggregate-error"

inherit npmhelper
inherit native
