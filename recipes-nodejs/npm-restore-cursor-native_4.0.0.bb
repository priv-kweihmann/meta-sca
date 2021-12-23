SUMMARY = "NPM: restore-cursor"
DESCRIPTION = "Gracefully restore the CLI cursor on exit"
HOMEPAGE = "https://github.com/sindresorhus/restore-cursor#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-onetime-native \
           npm-signal-exit-native"

SRC_URI = "https://registry.npmjs.org/restore-cursor/-/restore-cursor-4.0.0.tgz"
SRC_URI[md5sum] = "c962cb2351f41f79e58d4e9abe2e65ba"
SRC_URI[sha256sum] = "d99ad65a7798d2ee0fa1c80d3c4b4502c11c75215180390c345dc385988af607"

NPM_PKGNAME = "restore-cursor"

inherit npmhelper
inherit native
