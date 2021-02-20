SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.671.tgz"
SRC_URI[md5sum] = "67c2042454a1f34d5f8ea8041c51e04d"
SRC_URI[sha256sum] = "c209a685e2e985daae0405979776ece69e89c5c107b7f4d2669604042aa429d0"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
