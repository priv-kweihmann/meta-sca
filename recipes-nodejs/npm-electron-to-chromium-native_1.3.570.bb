SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.570.tgz"
SRC_URI[md5sum] = "e7367d3af6817a65076d585bf39fcc8d"
SRC_URI[sha256sum] = "48978fd5ff04cdff6f46d93a2e36425a1075dae0378ac4d63b91f15b0e562e58"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
