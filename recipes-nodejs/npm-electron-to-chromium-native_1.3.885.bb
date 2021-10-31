SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.885.tgz"
SRC_URI[md5sum] = "618b710914198e182488001443a3dadc"
SRC_URI[sha256sum] = "bf43228ab23171e3a87d6a6839f5cb10a4c14eff0d8feb62063e08ee28ee6503"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
