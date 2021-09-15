SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.839.tgz"
SRC_URI[md5sum] = "57e6f131dad49a7f8f180045a28cf27d"
SRC_URI[sha256sum] = "906eb88397c271bb095a55855b457054e5dceb50714d48eff6658fa2de44957b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
