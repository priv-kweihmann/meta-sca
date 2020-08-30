SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-7.2.0.tgz"
SRC_URI[md5sum] = "da58ae58b985905e1445bc447625dc1b"
SRC_URI[sha256sum] = "f16acafd1634624e60c24a5538004c4e168c82607f10dbe28395e9df3e7d5e4a"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
