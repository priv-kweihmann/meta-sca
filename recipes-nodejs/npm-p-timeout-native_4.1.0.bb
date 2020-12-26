SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-4.1.0.tgz"
SRC_URI[md5sum] = "4f30b8a039409719ccb6d76cfed9993c"
SRC_URI[sha256sum] = "7f7f3179ad4eb3b1fee47b46cc7a689b37c06ef1803cfe53fec9bac0218d9dcc"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
