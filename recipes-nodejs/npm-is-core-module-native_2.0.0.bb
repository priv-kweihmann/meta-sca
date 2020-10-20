SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.0.0.tgz"
SRC_URI[md5sum] = "a4b1f41997eeffd914d53860b0d26c90"
SRC_URI[sha256sum] = "cf08cc54a83bf2969f9aaf9bcc2225f90db8d5415111665a36deec5b786af3a3"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native
