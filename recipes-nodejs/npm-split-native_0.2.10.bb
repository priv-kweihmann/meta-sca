SUMMARY = "NPM: split"
DESCRIPTION = "split a Text Stream into a Line Stream"
HOMEPAGE = "http://github.com/dominictarr/split"

DEPENDS = "npm-through-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715"

SRC_URI = "https://registry.npmjs.org/split/-/split-0.2.10.tgz"
SRC_URI[md5sum] = "0d57ccdc9348cc09c8caf908a558d6c1"
SRC_URI[sha256sum] = "dc6656046d8ab51ee0fd33020fcc2d1e01d0715d37055c4385114ef78bf3c525"

NPM_PKGNAME = "split"

inherit npmhelper
inherit native
