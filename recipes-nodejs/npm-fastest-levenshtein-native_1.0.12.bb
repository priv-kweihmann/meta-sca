SUMMARY = "NPM: fastest-levenshtein"
DESCRIPTION = "Fastest Levenshtein distance implementation in JS."
HOMEPAGE = "https://github.com/ka-weihe/fastest-levenshtein#README"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=580cd8f671adc43261d96f8262b5b4c9"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fastest-levenshtein/-/fastest-levenshtein-1.0.12.tgz"
SRC_URI[md5sum] = "e4866d8364d708cad4a9bb625e54d9ed"
SRC_URI[sha256sum] = "f68d80e0ab095ee2ab3c589b27e0f64a5669314655b0d80bfb72a7ca0bea2bfe"

NPM_PKGNAME = "fastest-levenshtein"

inherit npmhelper
inherit native
