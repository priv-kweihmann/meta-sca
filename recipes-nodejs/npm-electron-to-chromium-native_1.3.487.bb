SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.487.tgz"
SRC_URI[md5sum] = "d4754b2f242724abbe24a4dc6c1dd15d"
SRC_URI[sha256sum] = "0373567e1aa91e239a2c4958a047e351112affae792adaef2e7329733d25705f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
