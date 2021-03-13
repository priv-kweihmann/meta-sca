SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.687.tgz"
SRC_URI[md5sum] = "c9282df850fa9a6a325218ee970226af"
SRC_URI[sha256sum] = "1f75e2d8ef54f2fafbcc793aa37cbf845b98a4d69341f76a7d5c3054f336d554"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
