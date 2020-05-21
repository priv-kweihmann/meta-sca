SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.447.tgz"
SRC_URI[md5sum] = "d3ddb8e6b098574c8285c1c2aa0b31e2"
SRC_URI[sha256sum] = "c9d151a3b3515b9e51a91863237a50319311b3de02fd1def20ab9e4676795985"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
