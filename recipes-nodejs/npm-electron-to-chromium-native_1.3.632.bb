SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.632.tgz"
SRC_URI[md5sum] = "9f49651f978d27ded68692f76b10b585"
SRC_URI[sha256sum] = "2a44d15cc9399840438a02afa0bfb3e5dd95839e54eb1604578b5c16ee25174f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
