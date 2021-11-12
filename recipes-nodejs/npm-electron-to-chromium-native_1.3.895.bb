SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.895.tgz"
SRC_URI[md5sum] = "1bf33d199ebe6237c6eda46104eaba23"
SRC_URI[sha256sum] = "98f57435da314f4ed259f8df3859806d4e15be74df7815f4bad192e31a660cec"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
