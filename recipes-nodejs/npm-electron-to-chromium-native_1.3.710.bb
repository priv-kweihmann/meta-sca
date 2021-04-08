SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.710.tgz"
SRC_URI[md5sum] = "67092d71e1581c65ed258bc839e408d8"
SRC_URI[sha256sum] = "8532b6bb5f78f1316e54893e2413b7acdcd0a17ae9d9dff75025c112c1b18614"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
