SUMMARY = "NPM: cli-table"
DESCRIPTION = "Pretty unicode tables for the CLI"
HOMEPAGE = "https://github.com/Automattic/cli-table"

DEPENDS = "npm-colors-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=158;md5=dbdda6492d8f693c50356f55d30cbb5e"

SRC_URI = "https://registry.npmjs.org/cli-table/-/cli-table-0.3.1.tgz"
SRC_URI[md5sum] = "f65bac50e519be109d133a954f08d41d"
SRC_URI[sha256sum] = "57e113969149c2043d7eefecc398c31ffecba6ae49f9492de0af000f0187d0b0"

NPM_PKGNAME = "cli-table"

inherit npmhelper
inherit native
