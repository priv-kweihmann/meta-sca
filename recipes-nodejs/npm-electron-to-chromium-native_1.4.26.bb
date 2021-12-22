SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.26.tgz"
SRC_URI[md5sum] = "dc61b9f4b0a35c3393bc42b3a964f24b"
SRC_URI[sha256sum] = "0e924c8c87fc47070213c11636827cc99d19fce6d2630c62d52c7d68333c42ad"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
