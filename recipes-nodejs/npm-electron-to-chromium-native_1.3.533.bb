SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.533.tgz"
SRC_URI[md5sum] = "42297b52d4613fe167b3f4769be43742"
SRC_URI[sha256sum] = "eed00185c2b0da25d9db69f8885dd228e08472fc2ec3c9dbb727420d6ba2105b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
