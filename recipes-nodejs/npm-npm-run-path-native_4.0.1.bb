SUMMARY = "NPM: npm-run-path"
DESCRIPTION = "Get your PATH prepended with locally installed binaries"
HOMEPAGE = "https://github.com/sindresorhus/npm-run-path#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-path-key-native"

SRC_URI = "https://registry.npmjs.org/npm-run-path/-/npm-run-path-4.0.1.tgz"
SRC_URI[md5sum] = "90c9ed2bc56bd39e6afa1c775d3bf6df"
SRC_URI[sha256sum] = "d2fc2934a397c337eacddb6f03e08255cd948bdd011fd473ef351cde4b8e1084"

NPM_PKGNAME = "npm-run-path"

inherit npmhelper
inherit native
