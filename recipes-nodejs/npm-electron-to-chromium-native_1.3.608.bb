SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.608.tgz"
SRC_URI[md5sum] = "482ada21c9873f8f5d2800525f2def85"
SRC_URI[sha256sum] = "013b1c102fcfe02614561b4e138f210bcb2ccde76c732c41c6be5b3470e85082"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
