SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.762.tgz"
SRC_URI[md5sum] = "6efcaeb4ed348d8a4fc97fdd7d7568b1"
SRC_URI[sha256sum] = "8b7eefbc6e59468fa907272f63a35f83dded8decb9101f069496a3d760c5229f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
