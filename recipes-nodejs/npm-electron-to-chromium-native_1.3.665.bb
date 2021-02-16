SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.665.tgz"
SRC_URI[md5sum] = "d8b99c83a6b293471da2a9b1d3c7fdd8"
SRC_URI[sha256sum] = "5166d8a268123ef08ed0b47ff4410840ce47db8997c681096ad2cdfc9cec6296"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
