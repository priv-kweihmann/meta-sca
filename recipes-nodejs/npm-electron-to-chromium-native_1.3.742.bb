SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.742.tgz"
SRC_URI[md5sum] = "b4c001fcdbb7d861941645e03fa7e09c"
SRC_URI[sha256sum] = "c3be26c36496020f6fd28969b166d795a3241febb84e183149b2a85f8dd6d1ee"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
