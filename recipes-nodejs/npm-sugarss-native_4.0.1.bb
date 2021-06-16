SUMMARY = "NPM: sugarss"
DESCRIPTION = "Indent-based CSS syntax for PostCSS"
HOMEPAGE = "https://github.com/postcss/sugarss#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4134d402e7331fd1e7d9f294aa26def4"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/sugarss/-/sugarss-4.0.1.tgz"
SRC_URI[md5sum] = "4c1b58e0d1ae2e1aca6efd9cb38c8716"
SRC_URI[sha256sum] = "9f3995ac262aba8183c375424e8549e22a15a857342348ae36d2027e53a0a884"

NPM_PKGNAME = "sugarss"

inherit npmhelper
inherit native
