SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.4.tgz"
SRC_URI[md5sum] = "a01d6786a27d6513d60cb049529249fc"
SRC_URI[sha256sum] = "f21587dacdcc96c4b6c1dd0e1609de8713d08ec08cfa20a8d6d9c3a0fb3aac34"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
