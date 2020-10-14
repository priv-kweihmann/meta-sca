SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.579.tgz"
SRC_URI[md5sum] = "895b0ebf5be52e4324328c9fc5986b7b"
SRC_URI[sha256sum] = "1cc23fd644872b11da647af35b36815f8e58b16732d46aa7278cc3ffaa2856d8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
