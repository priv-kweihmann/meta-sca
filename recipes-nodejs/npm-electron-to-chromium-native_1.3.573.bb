SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.573.tgz"
SRC_URI[md5sum] = "996efeaf20d2e7da592587f60b32125a"
SRC_URI[sha256sum] = "c43063493c77458a314f59c4dd936a0e83f466bb509e881cafcdcb386b051759"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
