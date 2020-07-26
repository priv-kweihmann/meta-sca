SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.509.tgz"
SRC_URI[md5sum] = "ce4b31e446383d211d96981bacb47cb0"
SRC_URI[sha256sum] = "a91a65da59efb51348956d63ea63ebc768555ebc14b5a7b3ade83f4bc36050d6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
