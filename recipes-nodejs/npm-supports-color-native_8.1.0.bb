SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-8.1.0.tgz"
SRC_URI[md5sum] = "739663e34d27ccefa2d69a04d38fb8c8"
SRC_URI[sha256sum] = "66b9556e93aabd67c1966c53fc5cf419338e0054ee858c84aafebd7ec50fe48a"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
