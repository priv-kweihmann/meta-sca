SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.591.tgz"
SRC_URI[md5sum] = "bba3f37bb77691396862c83f05e15105"
SRC_URI[sha256sum] = "7153b1d309d881b323a8825eba3030bc70ca2b36c490c616f2a8fd52e4751b8b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
