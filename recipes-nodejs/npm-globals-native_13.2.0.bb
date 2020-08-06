SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.2.0.tgz"
SRC_URI[md5sum] = "18289954290eacbc6250f637849eb88f"
SRC_URI[sha256sum] = "bba08ba331784d9eb7d5411225f381dba4e0cc28f8aac8c2232f1e3dcbfc030d"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
