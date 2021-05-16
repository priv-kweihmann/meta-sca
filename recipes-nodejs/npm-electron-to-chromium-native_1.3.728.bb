SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.728.tgz"
SRC_URI[md5sum] = "93af44620475dfe618852347029ca246"
SRC_URI[sha256sum] = "ebaf58352354ce1b79d63d0c5099af027f57fd9ff16e218b9291fc1100a8f3b2"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
