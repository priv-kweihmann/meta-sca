SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.606.tgz"
SRC_URI[md5sum] = "015361ebf2fdf32e45b9c57ff7b66e92"
SRC_URI[sha256sum] = "bdc2b9397841ee72ecc42c1aff61f1f988471e02bc91dbfc98850be13ce8527f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
