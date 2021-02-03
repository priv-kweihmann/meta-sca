SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.652.tgz"
SRC_URI[md5sum] = "f4913c08e1a00652f873d18122825209"
SRC_URI[sha256sum] = "8c3c9c2579a9d8755ca629b1f902bcec4ed93929b352805a13653868ced0d2fd"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
