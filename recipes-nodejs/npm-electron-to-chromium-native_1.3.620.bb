SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.620.tgz"
SRC_URI[md5sum] = "2e514ad0c4909dd89fff4e86f9f9d52f"
SRC_URI[sha256sum] = "9e8d558066f170c4d20de32aae2e33a3b6fb1cf1f2777527540d6e1620858546"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
