SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.749.tgz"
SRC_URI[md5sum] = "47ddf64bed8ec0187d1e9fa81aeafd1a"
SRC_URI[sha256sum] = "8229975ff77bfdaf476ad75861189721d52510b3c98172f8a080afa85a78fd38"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
