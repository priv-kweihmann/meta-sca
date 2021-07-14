SUMMARY = "NPM: pupa"
DESCRIPTION = "Simple micro templating"
HOMEPAGE = "https://github.com/sindresorhus/pupa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-escape-goat-native"

SRC_URI = "https://registry.npmjs.org/pupa/-/pupa-3.0.0.tgz"
SRC_URI[md5sum] = "43db40b30bd1e206fdc3177cb40d8280"
SRC_URI[sha256sum] = "7533af6e1189328c8d0e292ec5d26ff7ad905b27739986506e59d747dcf77d5b"

NPM_PKGNAME = "pupa"

inherit npmhelper
inherit native
