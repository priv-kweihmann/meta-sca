SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.740.tgz"
SRC_URI[md5sum] = "c85a1c1a22e88bd1aec7a8e28b1dfc14"
SRC_URI[sha256sum] = "95788a3dacf69f20a7c4731903e7b516407fae4a0205a3b35718e610434532b5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
