SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.674.tgz"
SRC_URI[md5sum] = "673c8a4708eb019607aa030804467b82"
SRC_URI[sha256sum] = "e3af4db78a19be610deb1f5a0593693005b925391d8f6dfea21003439acd68f6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
