SUMMARY = "NPM: has-flag"
DESCRIPTION = "Check if argv has a specific flag"
HOMEPAGE = "https://github.com/sindresorhus/has-flag#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-flag/-/has-flag-5.0.0.tgz"
SRC_URI[md5sum] = "9b1271f3e54a427197d5ceeeb52745ad"
SRC_URI[sha256sum] = "1dcc41a2cfeb5070c4a5de39f84bc102ccec06396600ed9fb4758edc2458975b"

NPM_PKGNAME = "has-flag"

inherit npmhelper
inherit native
