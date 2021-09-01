SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.826.tgz"
SRC_URI[md5sum] = "aa745584affd8a8f1c17f7900df0ab07"
SRC_URI[sha256sum] = "75a14b34975a049c1bd37768fc256dc206aa72b03e4d862ebcfb8a09da94ef96"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
