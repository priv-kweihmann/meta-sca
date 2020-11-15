SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.596.tgz"
SRC_URI[md5sum] = "a7c2cddf697ac0e49c2fa3176c3ac233"
SRC_URI[sha256sum] = "8f98e67eb7f305f5d5c1466dd947d6c979068dd2862f92e41915f95097df0383"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
