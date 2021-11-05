SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.889.tgz"
SRC_URI[md5sum] = "55d0c270ba48fd0e48c1e031e7059c94"
SRC_URI[sha256sum] = "a4a1bde0e6e957fa34cc18d9d2caf087b7919d499ed29bc9e2b797a71c9af8b5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
