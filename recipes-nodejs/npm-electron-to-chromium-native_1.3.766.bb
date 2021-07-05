SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.766.tgz"
SRC_URI[md5sum] = "f089dd6da8a5d9279e90e85b7c4670e5"
SRC_URI[sha256sum] = "3bd43f0095edf53f6cabbaf6329edbfe5cb1a67c7eeec5fcfb7166534fa0f600"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
