SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.723.tgz"
SRC_URI[md5sum] = "5868139707cbd72f3728a032e513335d"
SRC_URI[sha256sum] = "08adc4e0d6dd422ac42470d6d369374067a5a2c47422cace49cb992a6827a0f0"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
