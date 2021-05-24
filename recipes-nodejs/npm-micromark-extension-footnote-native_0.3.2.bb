SUMMARY = "NPM: micromark-extension-footnote"
DESCRIPTION = "micromark extension to support footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-footnote#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-footnote/-/micromark-extension-footnote-0.3.2.tgz"
SRC_URI[md5sum] = "ef72db042791bc4ba4bfed2c0834b1d0"
SRC_URI[sha256sum] = "217e389fd6eaf59b910bf1a1fa9117f3322c3f30700d14be47597056c165f4d3"

NPM_PKGNAME = "micromark-extension-footnote"

inherit npmhelper
inherit native
