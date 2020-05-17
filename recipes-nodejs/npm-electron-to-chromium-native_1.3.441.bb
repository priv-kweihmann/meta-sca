SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.441.tgz"
SRC_URI[md5sum] = "654f13e60317ada4fbab902be2002457"
SRC_URI[sha256sum] = "367f689d36d250e76870167bd5e18a0645c7618fe3bc7f188ad643925676fb2b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
