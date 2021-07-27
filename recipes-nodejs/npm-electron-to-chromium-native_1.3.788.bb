SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.788.tgz"
SRC_URI[md5sum] = "15af5f7908154abf0190bdb1d295e071"
SRC_URI[sha256sum] = "21842fed6a1fde63c4e0061fe494640376580df212c1bf8a6c2b47205064aeab"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
