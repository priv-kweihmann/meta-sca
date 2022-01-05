SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.35.tgz"
SRC_URI[md5sum] = "f5fc3451f329355e54bafa906fc1b7bb"
SRC_URI[sha256sum] = "a8b5b4bae35e4332249c0775834b8a25e1aadc9b88dc65efef9d3dc8c437bc2b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
