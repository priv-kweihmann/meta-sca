SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.576.tgz"
SRC_URI[md5sum] = "3bcd9aa79df44d04c4bf76af7a1f2886"
SRC_URI[sha256sum] = "85abf7bbb1f40facc1049ae4944e775d0c48adcba5c44e3e5967c4531a22c014"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
