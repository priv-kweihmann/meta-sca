SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.893.tgz"
SRC_URI[md5sum] = "8dc81e4fca1b6581eb368e6c1760c910"
SRC_URI[sha256sum] = "e4eea6e55427865b6cbcab6756e5bb815c74119f966efb58839f846a7770c902"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
