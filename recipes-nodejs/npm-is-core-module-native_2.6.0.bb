SUMMARY = "NPM: is-core-module"
DESCRIPTION = "Is this specifier a node.js core module?"
HOMEPAGE = "https://github.com/inspect-js/is-core-module"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2"

DEPENDS = "npm-has-native"

SRC_URI = "https://registry.npmjs.org/is-core-module/-/is-core-module-2.6.0.tgz"
SRC_URI[md5sum] = "b365bf2a2aa4c1f6b5c4129f5f235833"
SRC_URI[sha256sum] = "183c3c42a8215c9de9a2a7275561353a5890d256a1f23a9192ad85a4dce0badf"

NPM_PKGNAME = "is-core-module"

inherit npmhelper
inherit native
