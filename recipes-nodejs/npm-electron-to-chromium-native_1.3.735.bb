SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.735.tgz"
SRC_URI[md5sum] = "3ccdc6ef9fc7762a5f455542702cdfec"
SRC_URI[sha256sum] = "800666904a39ff24f0bac45e01b6a9599a2268d9d4dc2136c65eb14799630117"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
