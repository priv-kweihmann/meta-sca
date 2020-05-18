SUMMARY = "NPM: split"
DESCRIPTION = "split a Text Stream into a Line Stream"
HOMEPAGE = "http://github.com/dominictarr/split"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=84ddd974e10adfabbf232e7efb7ed715"

DEPENDS = "npm-through-native"

SRC_URI = "https://registry.npmjs.org/split/-/split-1.0.1.tgz"
SRC_URI[md5sum] = "c77966671a05968e11fb824a46a4b7ea"
SRC_URI[sha256sum] = "c0e6494a8aa5358dee97044713f29de136604fba9959e82a47fbc4bed09d0ab4"

NPM_PKGNAME = "split"

inherit npmhelper
inherit native
