SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.647.tgz"
SRC_URI[md5sum] = "144ff650f8585615c2ac0d334782b9f4"
SRC_URI[sha256sum] = "0d6fa092a33decef820f875e3ba01c93026435779aa0f7f8fc6fd3f2a20d4bb6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
