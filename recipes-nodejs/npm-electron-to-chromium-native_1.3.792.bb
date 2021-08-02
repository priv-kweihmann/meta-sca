SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.792.tgz"
SRC_URI[md5sum] = "b33b93f319bb19a5db62648874a4a81b"
SRC_URI[sha256sum] = "3f7950917ae92f647a71d1b3e425452b2833fcdb8fe5b12a8b283ecfc3c9c8ae"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
