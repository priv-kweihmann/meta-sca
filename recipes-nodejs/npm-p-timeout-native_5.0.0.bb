SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-5.0.0.tgz"
SRC_URI[md5sum] = "518b86357b25747493d3d7183ded923f"
SRC_URI[sha256sum] = "219267833be5123e209724921d217f3e36dfbf9771a3d312141ac18bd0a82130"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
