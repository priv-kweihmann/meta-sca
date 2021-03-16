SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=156;md5=aa31fb35a3f5b0db35713bcff4bf8cc3"

DEPENDS = "npm-colors-native"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.6.tgz"
SRC_URI[md5sum] = "34e7c8f82b823bd4c0b045fd244d7120"
SRC_URI[sha256sum] = "165140e051a74bf24087273cae658e5570d51e18ec0fc23db3ff625cf30257b7"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
