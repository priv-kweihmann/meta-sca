SUMMARY = "NPM: has-yarn"
DESCRIPTION = "Check if a project is using Yarn"
HOMEPAGE = "https://github.com/sindresorhus/has-yarn#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/has-yarn/-/has-yarn-3.0.0.tgz"
SRC_URI[md5sum] = "de689f1ef012f1d286fd28cf1856bd72"
SRC_URI[sha256sum] = "495f77b9a212068b9146663ee934192b2a947fdab525fdb8313823181a6f4103"

NPM_PKGNAME = "has-yarn"

inherit npmhelper
inherit native
