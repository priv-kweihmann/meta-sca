SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.14.tgz"
SRC_URI[md5sum] = "70a16dd0cef4bed37da8e26a11199c45"
SRC_URI[sha256sum] = "1a7dee141b022ec0901adbba07a5c43d41557fd709b413e36208bc78afb54278"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
