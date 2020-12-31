SUMMARY = "NPM: wrap-ansi"
DESCRIPTION = "Wordwrap a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/wrap-ansi#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-styles-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/wrap-ansi/-/wrap-ansi-7.0.0.tgz"
SRC_URI[md5sum] = "85a965a6e2a0944eafcbca7e5ab07ed5"
SRC_URI[sha256sum] = "0795b3510bd2e938f6a415396de3d4f58fd76ef1f8249a07196444eaf85ca42f"

NPM_PKGNAME = "wrap-ansi"

inherit npmhelper
inherit native
