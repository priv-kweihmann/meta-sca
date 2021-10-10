SUMMARY = "NPM: p-timeout"
DESCRIPTION = "Timeout a promise after a specified amount of time"
HOMEPAGE = "https://github.com/sindresorhus/p-timeout#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/p-timeout/-/p-timeout-5.0.1.tgz"
SRC_URI[md5sum] = "41a78c19a65a2c8ba444995a7dff38e8"
SRC_URI[sha256sum] = "136cd6281af6f5437a4db3984f205e7d35c0100d8149e93132689466e4388bc4"

NPM_PKGNAME = "p-timeout"

inherit npmhelper
inherit native
