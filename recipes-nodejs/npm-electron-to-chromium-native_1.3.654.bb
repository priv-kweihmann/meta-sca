SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.654.tgz"
SRC_URI[md5sum] = "bd99e95b3af8a1766440542afee73cbd"
SRC_URI[sha256sum] = "dc20f0487ac6c30a5efea6a231a3011a1bde008dc9e43c9f80b1bb2077a391c5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
