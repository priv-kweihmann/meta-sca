SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.610.tgz"
SRC_URI[md5sum] = "2d78e3b8ad80b0563bc1c18355f31723"
SRC_URI[sha256sum] = "e51084a541e4269970ad427593883a3a8e8cf2f7c484077f93051b1805415960"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
