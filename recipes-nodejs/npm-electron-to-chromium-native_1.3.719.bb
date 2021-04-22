SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.719.tgz"
SRC_URI[md5sum] = "a626ec66290b4261d466984a97ad82ef"
SRC_URI[sha256sum] = "4c6cae8ac6937e63ec00ca709501b9497a93f85587f32f5373f148319d51b44f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
